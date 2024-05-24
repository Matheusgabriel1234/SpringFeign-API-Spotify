package project.spotify.Spotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumResponse {
private AlbumRapper album;





public AlbumResponse(AlbumRapper album) {
	
	this.album = album;
}

public AlbumResponse() {
	
}


public AlbumRapper getAlbum() {
	return album;
}

public void setAlbum(AlbumRapper album) {
	this.album = album;
}


}
