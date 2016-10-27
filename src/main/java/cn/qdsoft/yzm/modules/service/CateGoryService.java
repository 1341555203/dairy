package cn.qdsoft.yzm.modules.service;

import cn.qdsoft.yzm.modules.dto.ArticleDto;
import cn.qdsoft.yzm.modules.entity.Article;
import cn.qdsoft.yzm.modules.entity.Category;

import java.util.List;

/**
 * Created by mtf81 on 2016/10/24.
 */
public interface CateGoryService {
	int getCount();
	List<Category> list();
	int countArticles(ArticleDto articleDto);
	Category findById(int id);
}
