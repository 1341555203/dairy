package cn.qdsoft.yzm.modules.service.Impl;

import cn.qdsoft.yzm.modules.article.ArticleMapper;
import cn.qdsoft.yzm.modules.dto.ArticleDto;
import cn.qdsoft.yzm.modules.entity.Article;
import cn.qdsoft.yzm.modules.entity.User;
import cn.qdsoft.yzm.modules.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mtf81 on 2016/10/25.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public Article findById(int id) {
		return articleMapper.selectByPrimaryKey(id);
	}

	public List<Article> findByCategory(ArticleDto articleDto) {
		return articleMapper.selectByCategory(articleDto);
	}

	@Override
	public List<Article> findByUser(User user) {
		return articleMapper.selectByUser(user);
	}

	@Override
	public int countArticles(User user) {
		return articleMapper.countRows(user);
	}

	@Override
	public int saveArticle(Article article) {
		return articleMapper.insertSelective(article);
	}

	@Override
	public int delById(int id) {
		return articleMapper.deleteByPrimaryKey(id);
	}
}
