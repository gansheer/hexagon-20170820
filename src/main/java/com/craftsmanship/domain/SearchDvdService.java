package com.craftsmanship.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

public class SearchDvdService implements ISearchDvd{
	@Inject
	private IRepositoryDvd repositoryDvd;

	public SearchDvdService() {
	}

	public SearchDvdService(IRepositoryDvd repositoryDvd) {
		super();
		this.repositoryDvd = repositoryDvd;
	}

	public List<Dvd> findByTitle(String title) {
		List<Dvd> dvds = repositoryDvd.getAll();
		List<Dvd> results = new ArrayList<Dvd>();
		if (dvds != null) {
			results = dvds.stream().filter(dvd -> dvd.getTitle().contains(title)).collect(Collectors.toList());
		}
		return results;
	}

}
