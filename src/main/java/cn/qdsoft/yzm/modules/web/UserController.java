package cn.qdsoft.yzm.modules.web;

import cn.qdsoft.yzm.modules.dto.UserDto;
import cn.qdsoft.yzm.modules.entity.User;
import cn.qdsoft.yzm.modules.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/10/19.
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginInit(){
        return "user/login";
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "user/home";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@Valid UserDto userDto, Errors errors, ModelMap modelMap){
        String errorMessages="";
        if(errors.hasErrors()){
            List<ObjectError> objectErrorList=errors.getAllErrors();
            for(ObjectError objectError:objectErrorList){
                errorMessages+=objectError.getDefaultMessage()+"<br>";
            }
            modelMap.put("errorMessages",errorMessages);
            return "user/login";
        }

        User user=userService.selectByLoginNamePassword(userDto);
        if(user==null){
            errorMessages="用户名或密码错误";
            modelMap.put("errorMessages",errorMessages);
            return "user/login";
        }else{
            modelMap.put("user",user);

        }
        return "redirect:/article/list";

    }
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String Initregister(ModelMap modelMap){
        modelMap.clear();
        modelMap.put("user",new User());
        return "user/register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@Valid User user,Errors errors,ModelMap modelMap){

        if(errors.hasErrors()){
            return "user/register";
        }
        user.setDelFlag("0");
        user.setUpdateBy(1);
        user.setUpdateDate(new Date());
        user.setCreateBy(1);
        user.setCreateDate(new Date());
        userService.register(user);
        return "redirect:/user/login";
    }
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String Initupdate(HttpSession httpSession, ModelMap modelMap){
        User currentUser=(User)httpSession.getAttribute("user");
        modelMap.put("user",currentUser  );
        System.out.println(currentUser.getLoginName());
        return "user/update";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(@Valid  User user,Errors errors){
        if(errors.hasErrors()){
            return "user/update";
        }
        userService.update(user);
        return "redirect:/article/list";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "redirect:/user/login";
    }
}
