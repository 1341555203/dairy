package cn.qdsoft.yzm.modules.service;

import cn.qdsoft.yzm.modules.dto.ArticleDto;
import cn.qdsoft.yzm.modules.entity.Article;
import cn.qdsoft.yzm.modules.entity.User;

import java.util.List;

/**
 * Created by mtf81 on 2016/10/25.
 */
public interface ArticleService {
	Article findById(int id);
	List<Article> findByCategory(ArticleDto articleDto);
	List<Article> findByUser(User user);
	int countArticles(User user);
	int saveArticle(Article article);
	int delById(int id);
}
