package cn.qdsoft.yzm.modules.service.Impl;

import cn.qdsoft.yzm.modules.category.CategoryMapper;
import cn.qdsoft.yzm.modules.dto.ArticleDto;
import cn.qdsoft.yzm.modules.entity.Article;
import cn.qdsoft.yzm.modules.entity.Category;
import cn.qdsoft.yzm.modules.service.CateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mtf81 on 2016/10/24.
 */
@Service
public class CategoryServiceImpl implements CateGoryService {
	@Autowired
	private CategoryMapper categoryMapper;

	public int getCount() {
		return categoryMapper.countRow();
	}

	@Override
	public List<Category> list() {

		return categoryMapper.selectAll();
	}

	@Override
	public int countArticles(ArticleDto articleDto) {
		return categoryMapper.countArticles(articleDto);
	}

	@Override
	public Category findById(int id) {
		return categoryMapper.selectByPrimaryKey(id);
	}

}
