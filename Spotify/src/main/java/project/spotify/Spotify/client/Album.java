package project.spotify.Spotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Album {
private String id;
private String name;
private String realeaseDate;



public Album(String id, String name, String realeaseDate) {
	
	this.id = id;
	this.name = name;
	this.realeaseDate = realeaseDate;
}

public Album() {
	
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRealeaseDate() {
	return realeaseDate;
}

public void setRealeaseDate(String realeaseDate) {
	this.realeaseDate = realeaseDate;
}




}
