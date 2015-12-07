package com.cathl.icook.controller;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.hibernate.mapping.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cathl.icook.dto.CategoryDTO;
import com.cathl.icook.dto.NewUser;
import com.cathl.icook.dto.NewsDTO;
import com.cathl.icook.entity.Category;
import com.cathl.icook.entity.Food;
import com.cathl.icook.entity.News;
import com.cathl.icook.entity.TblCategory;
import com.cathl.icook.entity.TblFood;
import com.cathl.icook.entity.TblFoodDetail;
import com.cathl.icook.entity.TblUser;
import com.cathl.icook.service.CategoryService;
import com.cathl.icook.service.CategoryServiceImpl;
import com.cathl.icook.service.FoodDetailSevices;
import com.cathl.icook.service.FoodService;
import com.cathl.icook.service.NewsService;
import com.cathl.icook.service.UserService;

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
	public String login(@ModelAttribute("user") NewUser user) {
		boolean result = userService.checkLogin(user);
		if (result) {
			return "index";
		}else return "error";
		
	}
	
	@RequestMapping(value = "/getNews", method = RequestMethod.GET)
	public String getNews(@RequestParam("categoryId") int id, Model model) {
		News news = newService.getNewsById(id);
		if (news != null) {
			model.addAttribute("NEWS", news);
		}
		return "news";
		
	}
	
	@RequestMapping(value = "/getAllCategories", method = RequestMethod.POST)
	public String getCategories(Model model) {
		 List<Category> categories = categoryService.getCategory();
		if (categories != null) {
			model.addAttribute("CATEGORY", categories);
		}
		return "category";
		
	}

	
}
