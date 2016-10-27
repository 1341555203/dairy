package cn.qdsoft.yzm.modules.article;

import cn.qdsoft.yzm.common.persistence.annotation.MyBatisDao;
import cn.qdsoft.yzm.modules.dto.ArticleDto;
import cn.qdsoft.yzm.modules.entity.Article;
import cn.qdsoft.yzm.modules.entity.Category;
import cn.qdsoft.yzm.modules.entity.User;

import java.util.List;

@MyBatisDao
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> selectByCategory(ArticleDto articleDto);

    List<Article> selectByUser(User user);

	int countRows(User uer);
}