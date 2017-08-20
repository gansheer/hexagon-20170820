package com.craftsmanship.app;

import java.util.List;

import com.craftsmanship.adapter.ReadInternetAdapter;
import com.craftsmanship.domain.Dvd;
import com.craftsmanship.domain.IRepositoryDvd;
import com.craftsmanship.domain.ISearchDvd;
import com.craftsmanship.domain.SearchDvdService;

public class CraftsmanshipApp {

	public static void main(String[] args) {
		IRepositoryDvd readFileAdapter = new ReadInternetAdapter();
		ISearchDvd searchDvdService = new SearchDvdService(readFileAdapter);

		List<Dvd> dvdsResult = searchDvdService.findByTitle("x-men");
		for (Dvd dvd : dvdsResult) {
			System.out.println(dvd.toString());
		}

	}
}
