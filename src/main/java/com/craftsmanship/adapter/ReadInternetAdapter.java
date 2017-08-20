package com.craftsmanship.adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import com.craftsmanship.domain.Dvd;
import com.craftsmanship.domain.IRepositoryDvd;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class ReadInternetAdapter implements IRepositoryDvd {

	@Override
	public List<Dvd> getAll() {
		// https://www.themoviedb.org/search?language=fr-FR&query=x-men
		// https://raw.githubusercontent.com/ProgrammeVitam/vitam/master_0.20.x/sources/worker/worker-core/src/test/resources/extractSedaActionHandler/addUnit/_Unit_ANCESTOR.json#

		// Tu donne une personne et une date de naissance Trouver dans les dvd
		Path path = Paths.get("src/main/resources/readinternet.json");
		File file = path.toFile();
		Gson gson = new Gson();
		List<Dvd> dvds = new ArrayList<>();
		
		try {
			JsonReader newJsonReader = gson.newJsonReader(new FileReader(file));
			Dvd fromJson = gson.fromJson(newJsonReader, Dvd.class);
			dvds.add(fromJson);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return dvds;
	}

}
