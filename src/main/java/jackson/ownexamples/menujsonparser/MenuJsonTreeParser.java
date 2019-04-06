package main.java.jackson.ownexamples.menujsonparser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;


public class MenuJsonTreeParser {

	public static void main(String[] args) {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get("menu.json"));
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNode = mapper.readTree(jsonData);
			System.out.println(rootNode);
			JsonNode menuItem = rootNode.path("menu").path("popup");
			System.out.println("MenuItem: " + menuItem);

			Iterator<JsonNode> popUpDtos = menuItem.elements();
			while (popUpDtos.hasNext()) {
				JsonNode next = popUpDtos.next();
				Iterator<JsonNode> menuItemDto = next.elements();
				while (menuItemDto.hasNext()) {
					JsonNode nextMenuItem = menuItemDto.next();
					System.out.println("entry: " + nextMenuItem.path("onclick"));

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
