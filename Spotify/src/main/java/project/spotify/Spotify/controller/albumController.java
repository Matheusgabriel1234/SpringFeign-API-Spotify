package project.spotify.Spotify.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import project.spotify.Spotify.client.Album;
import project.spotify.Spotify.client.AlbumClient;
import project.spotify.Spotify.client.AuthSpotifyClient;
import project.spotify.Spotify.client.LoginRequest;

@RestController
@RequestMapping("spotify/api")
public class albumController {
	
	private final AuthSpotifyClient auth;
	private final AlbumClient album;

	
	
	

public albumController(AuthSpotifyClient auth, AlbumClient album) {
		
		this.auth = auth;
		this.album = album;
	}


   @GetMapping("/albums")
	public ResponseEntity<List<Album>> getAlbums() {
	   var request = new LoginRequest("client_credentials","6a1dd1a3d03d4c7a9cd737d35c2a95c9","cd4362654df14d05a2c548c69f78634b");
		var token = auth.login(request).getAcessToken();
		var response  = album.getRealeases("Bearer " + token);
	    
		
		return ResponseEntity.ok(response.getAlbum().getItems());
	 	
	
   }
	
	
	
  
	
	
   
   
}
