package cn.qdsoft.yzm.modules.dao;


import cn.qdsoft.yzm.common.persistence.annotation.MyBatisDao;
import cn.qdsoft.yzm.modules.dto.UserDto;
import cn.qdsoft.yzm.modules.entity.User;

@MyBatisDao
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByLoginNamePassword(UserDto userDto);
}