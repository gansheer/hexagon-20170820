package com.craftsmanship.app;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.craftsmanship.adapter.ReadFileAdapter;
import com.craftsmanship.domain.IRepositoryDvd;
import com.craftsmanship.domain.ISearchDvd;
import com.craftsmanship.domain.SearchDvdService;

@Configuration
public class AppConfig {
	@Bean
	public Path path() {
		return Paths.get("src/main/resources/dvd.txt");
	}
	
	@Bean
    public IRepositoryDvd iRepositoryDvd() {
        return new  ReadFileAdapter();
    }
	
	@Bean
	public ISearchDvd iSearchDvd() {
		return new SearchDvdService();
	}
}
