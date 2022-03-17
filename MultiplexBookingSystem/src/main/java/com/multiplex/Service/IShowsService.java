package com.multiplex.Service;


import java.util.List;

import com.multiplex.Model.Shows;

public interface IShowsService {
	
	public Shows addShows(Shows show);

	public List<Shows> findByShowId(Long showId);
	

}
