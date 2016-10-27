package cn.qdsoft.yzm.modules.service;


import cn.qdsoft.yzm.modules.dto.UserDto;
import cn.qdsoft.yzm.modules.entity.User;

/**
 * Created by Administrator on 2016/10/19.
 */
public interface UserService {
    User selectByLoginNamePassword(UserDto userDto);
    void register(User user);

    void update(User user);
}
