package com.example.movie.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.database.model.WebSeries;
import com.example.movie.database.repository.WebSeriesRepository;

@Service
public class WebSeriesServiceImpl implements WebSeriesService{
	
	@Autowired
	WebSeriesRepository webSeriesRepository ;

	@Override
	public List<WebSeries> getWebSeries() {
		
		List<WebSeries> listofseries = webSeriesRepository.findAll();
		
//		for(int i = 0; i < listofseries.size(); i++) {
//            
//			System.out.println(listofseries.get(i).getId());
//        }
		
		return webSeriesRepository.findAll();
	}

}
