package com.craftsmanship.adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.inject.Inject;

import com.craftsmanship.domain.Dvd;
import com.craftsmanship.domain.IRepositoryDvd;

/**
 * Read some file
 * 
 * @author anpar
 *
 */
public class ReadFileAdapter implements IRepositoryDvd {

	@Inject
	private Path path;
	
	public ReadFileAdapter() {
		super();
	}

	public ReadFileAdapter(Path path) {
		super();
		this.path = path;
	}

	public List<Dvd> getAll() {
		File file = path.toFile();
		List<Dvd> dvds = new ArrayList<>();
		try {

			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				if (nextLine != null) {
					String[] dvdLine = nextLine.split(";");
					LocalDateTime localDateTime = LocalDateTime.parse(dvdLine[1]);
					dvds.add(new Dvd(dvdLine[0], localDateTime));
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return dvds;
	}

}
