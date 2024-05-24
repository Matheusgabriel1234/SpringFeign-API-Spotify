package project.spotify.Spotify.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
		name = "AlbumClient",
		url = "https://api.spotify.com")
public interface AlbumClient {
	
	@GetMapping(value = "/v1/browse/new-releases")
	AlbumResponse getRealeases(@RequestHeader("Authorization")String authorization); 

}
