package cn.qdsoft.yzm.modules.service.Impl;

import cn.qdsoft.yzm.modules.dao.UserMapper;
import cn.qdsoft.yzm.modules.dto.UserDto;
import cn.qdsoft.yzm.modules.entity.User;
import cn.qdsoft.yzm.modules.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/19.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectByLoginNamePassword(UserDto userDto) {
        return userMapper.selectByLoginNamePassword(userDto);
    }
    @Override
    public void register(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
