package com.multiplex.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.Model.Shows;
import com.multiplex.Repository.ShowsDao;

@Service
public class ShowsService implements IShowsService{
	
	@Autowired
	ShowsDao dao;

	@Override
	public Shows addShows(Shows show) {
		// TODO Auto-generated method stub
		Shows ob=dao.save(show);
		return ob;
	}

	@Override
	public List<Shows> findByShowId(Long showId) {
		// TODO Auto-generated method stub
		return null;
	}
}
