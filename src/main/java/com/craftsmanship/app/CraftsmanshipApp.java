package com.craftsmanship.app;

import java.nio.file.Paths;
import java.util.List;

import com.craftsmanship.adapter.ReadFileAdapter;
import com.craftsmanship.adapter.SearchAdapter;
import com.craftsmanship.domain.Dvd;
import com.craftsmanship.domain.SearchDvdService;

public class CraftsmanshipApp {

	public static void main(String[] args) {
		ReadFileAdapter readFileAdapter = new ReadFileAdapter(Paths.get("src/main/resources/dvd.txt"));
		SearchDvdService searchDvdService = new SearchDvdService(readFileAdapter);
		SearchAdapter searchAdapter = new SearchAdapter(searchDvdService);
		
		List<Dvd> dvdsResult = searchAdapter.findByTitle("x-men");
		for (Dvd dvd : dvdsResult) {
			System.out.println(dvd.toString());
		}

	}
}
