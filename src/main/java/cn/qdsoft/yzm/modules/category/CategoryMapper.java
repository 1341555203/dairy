package cn.qdsoft.yzm.modules.category;

import cn.qdsoft.yzm.common.persistence.annotation.MyBatisDao;
import cn.qdsoft.yzm.modules.dto.ArticleDto;
import cn.qdsoft.yzm.modules.entity.Article;
import cn.qdsoft.yzm.modules.entity.Category;
import cn.qdsoft.yzm.modules.entity.User;

import java.util.List;

@MyBatisDao
public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    int countRow();

    List<Category> selectAll();

    int countArticles(ArticleDto articleDto);

}