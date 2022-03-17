package com.multiplex.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiplex.Controller.exceptions.ShowNotFoundException;
import com.multiplex.Model.Shows;
import com.multiplex.Service.IShowsService;


@RestController
public class ShowsController {
	
	@Autowired
	IShowsService showService;
	
	@GetMapping("")
	public List<Shows> getShowByShowsId(@PathVariable ("ShowId") Long ShowId) throws ShowNotFoundException{
		return showService.findByShowId(ShowId);
	}
	
	@PostMapping("")
	public ResponseEntity<Shows> createShows(@Validated @RequestBody Shows shows){
		Shows ob=showService.addShows(shows);
		return new ResponseEntity<Shows>(ob, HttpStatus.OK);
	}
}
