package cn.qdsoft.yzm.modules.web;

import cn.qdsoft.yzm.common.Exception.MyException;
import cn.qdsoft.yzm.modules.dto.ArticleDto;
import cn.qdsoft.yzm.modules.entity.Article;
import cn.qdsoft.yzm.modules.entity.Category;
import cn.qdsoft.yzm.modules.entity.User;
import cn.qdsoft.yzm.modules.service.ArticleService;
import cn.qdsoft.yzm.modules.service.CateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by mtf81 on 2016/10/24.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CateGoryService cateGoryService;
	@Autowired
	private ArticleService articleService;
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String list(Model model){
		int row=cateGoryService.getCount();
		List<Category> categories=cateGoryService.list();
		model.addAttribute("count",row);
		model.addAttribute("categrories",categories);
		return "category/list";
	}
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public String listByCategory(Model model,@PathVariable int id,HttpSession httpSession){
		Category category=cateGoryService.findById(id);
		User currentUser=(User)httpSession.getAttribute("user");
		if(category!=null&&currentUser!=null) {
			ArticleDto articleDto = new ArticleDto();
			articleDto.setcId(category.getId());
			articleDto.setuId(currentUser.getId());

			List<Article> articles=articleService.findByCategory(articleDto);

			int row = cateGoryService.countArticles(articleDto);
			model.addAttribute("category",category);
			model.addAttribute("count", row);
			model.addAttribute("articles",articles);
		}else{
			return "redirect:/user/login";
		}
		return "category/listByCategory";
	}
}
