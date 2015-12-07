package com.cathl.icook.service;

import java.io.Serializable;
import java.util.List;

import com.cathl.icook.entity.*;

public interface CategoryService {
	public List<Category> getCategory();
	public Serializable createNewCatelog(TblCategory newCatelog);
}
