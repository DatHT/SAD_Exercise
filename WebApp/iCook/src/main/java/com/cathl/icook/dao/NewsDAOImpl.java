package com.cathl.icook.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cathl.icook.entity.News;
import com.cathl.icook.util.HibernateUtil;
@Repository
public class NewsDAOImpl implements NewsDAO {

	@Autowired
	HibernateUtil hibernateUltil;	
	
	@Override
	public List<News> getNewsByCategory(int categoryId) {
		String query = " WHERE categoryId = " + categoryId;
		return hibernateUltil.fetchAllByQuery(query, News.class);
	}

	@Override
	public News getNewsById(int newsId) {
		// TODO Auto-generated method stub
		return hibernateUltil.fetchById(newsId, News.class);
	}

}
