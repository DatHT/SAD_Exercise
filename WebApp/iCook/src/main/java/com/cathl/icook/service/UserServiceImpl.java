package com.cathl.icook.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cathl.icook.dao.UserDAO;
import com.cathl.icook.entity.TblUser;
@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Override
	public boolean checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		return true;
	}


}
