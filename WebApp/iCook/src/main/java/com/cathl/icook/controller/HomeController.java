package com.cathl.icook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cathl.icook.entity.Category;
import com.cathl.icook.entity.News;
import com.cathl.icook.service.CategoryService;
import com.cathl.icook.service.NewsService;
import com.cathl.icook.service.UserService;
import com.opensymphony.module.sitemesh.html.tokenizer.Parser.ReusableToken;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private NewsService newService;
	
	@Autowired
	private CategoryService categoryService;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView userPage() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
		boolean result = userService.checkLogin(username, password);
		if (result) {
			return "index";
		} else return "error";
		
	}
	
	@RequestMapping(value = "/getNews", method = RequestMethod.GET)
	@ResponseBody
	public News getNews(@RequestParam("categoryId") int id) {
		News news = newService.getNewsById(id);
		return news;
	}
	
	@RequestMapping(value = "/getAllCategories", method = RequestMethod.GET)
	public String getCategories(Model model) {
		 List<Category> categories = categoryService.getCategory();
		if (categories != null) {
			model.addAttribute("CATEGORY", categories);
		}
		return "category";
	}
	
	
	@RequestMapping(value = "/getAllNews", method = RequestMethod.GET)
	public String getNews(Model model) {
		List<News> list = newService.getAllNews();
		model.addAttribute("ALLNEWS", list);
		return "managepost";
	}
	
	@RequestMapping(value = "/createNew", method = RequestMethod.GET)
	public String createNew(Model model) {
		
		return "createpost";
	}
	
}
