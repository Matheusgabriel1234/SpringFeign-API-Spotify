package project.spotify.Spotify.client;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumRapper {
private List<Album> items;


public AlbumRapper(List<Album> items) {
this.items = items;
}

public AlbumRapper() {
	
}



public List<Album> getItems() {
	return items;
}

public void setItems(List<Album> items) {
	this.items = items;
}




}
