package com.craftsmanship.domain;

import java.util.List;

/**
 * Entry point API
 * 
 * @author anpar
 *
 */
public interface ISearchDvd {

	List<Dvd> findByTitle(String title);
}
