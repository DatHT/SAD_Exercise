package com.cathl.icook.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cathl.icook.dao.CategoryDAO;
import com.cathl.icook.dao.NewsDAO;
import com.cathl.icook.entity.News;
@Service
@Transactional
public class NewsServiceImpl implements NewsService {

	@Autowired
	NewsDAO newsDAO;
	
	@Override
	public List<News> getNewsByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return newsDAO.getNewsByCategory(categoryId);
	}

	@Override
	public News getNewsById(int newsId) {
		// TODO Auto-generated method stub
		return newsDAO.getNewsById(newsId);
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return newsDAO.getAllNews();
	}

}
