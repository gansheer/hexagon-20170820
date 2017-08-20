package com.craftsmanship.adapter;

import java.util.List;

import com.craftsmanship.domain.Dvd;
import com.craftsmanship.domain.ISearchDvd;
import com.craftsmanship.domain.SearchDvdService;

/**
 * @author anpar
 *
 */
public class SearchAdapter implements ISearchDvd {

	private SearchDvdService service;

	public SearchAdapter(SearchDvdService searchDvdService) {
		this.service = searchDvdService;
	}

	public List<Dvd> findByTitle(String title) {
		return service.findByTitle(title);

	}

}
