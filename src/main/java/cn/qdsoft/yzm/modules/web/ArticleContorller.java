package cn.qdsoft.yzm.modules.web;

import cn.qdsoft.yzm.modules.dto.ArticleDto;
import cn.qdsoft.yzm.modules.entity.Article;
import cn.qdsoft.yzm.modules.entity.Category;
import cn.qdsoft.yzm.modules.entity.User;
import cn.qdsoft.yzm.modules.service.ArticleService;
import cn.qdsoft.yzm.modules.service.CateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by mtf81 on 2016/10/25.
 */
@Controller
@RequestMapping("/article")
public class ArticleContorller {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CateGoryService cateGoryService;
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public String ArticleDetail(Model model,@PathVariable int id, HttpSession httpSession){
		Article article=articleService.findById(id);
		User currentUser=(User)httpSession.getAttribute("user");
		if(article==null||currentUser==null){
			article=new Article();
			article.setTitle("404");
			article.setContent("文章不存在");
		}else{
			Category category = cateGoryService.findById(article.getcId());
			model.addAttribute("category",category);
		}
		model.addAttribute("article",article);
		return "article/detail";
	}
	@RequestMapping(value ="/list",method = RequestMethod.GET)
	public String list(Model model,HttpSession httpSession){
		User currentUser=(User)httpSession.getAttribute("user");
		List<Article> articles=articleService.findByUser(currentUser);
		int count=articles.size();
		model.addAttribute("count",count);
		model.addAttribute("articles",articles);
		return "article/list";
	}
	@RequestMapping(value = "/new",method = RequestMethod.GET)
	public String newArticle(Model model){
		List<Category> categories=cateGoryService.list();
		model.addAttribute("categories",categories);
		return "article/new";
	}
	@RequestMapping(value = "/new",method = RequestMethod.POST)
	public String newArtileSubmit(ArticleDto articleDto,HttpSession httpSession){
		User currentUser=(User)httpSession.getAttribute("user");
		Article article=new Article();
		article.setcId(articleDto.getcId());
		article.setTitle(articleDto.getTitle());
		article.setContent(articleDto.getContent());
		article.setuId(currentUser.getId());
		int a=articleService.saveArticle(article);
		System.out.println(a);
		return "redirect:/article/list";
	}
	@RequestMapping(value = "/{id}/del",method = RequestMethod.GET)
	public String delArticle(@PathVariable int id){
		int result=articleService.delById(id);
		return "redirect:/article/list";
	}
}
