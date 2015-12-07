package com.cathl.icook.dao;

import java.io.Serializable;
import java.util.List;

import com.cathl.icook.entity.*;
public interface CategoryDAO {
	public List<Category> getCategory();
	public Serializable createNewCatelog(TblCategory newCatelog);
}
