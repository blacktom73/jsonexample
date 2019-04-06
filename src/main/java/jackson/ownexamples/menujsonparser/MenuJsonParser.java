package main.java.jackson.ownexamples.menujsonparser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class MenuJsonParser {

	public static void main(String[] args) {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get("menu.json"));
			ObjectMapper mapper = new ObjectMapper();
			MenuRootDto menuDto = mapper.readValue(jsonData, MenuRootDto.class);
			System.out.println(menuDto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
