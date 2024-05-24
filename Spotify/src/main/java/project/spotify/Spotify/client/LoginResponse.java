package project.spotify.Spotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;

import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LoginResponse {
private String acessToken;

public LoginResponse() {
	
}

 

public LoginResponse(String acessToken) {

	this.acessToken = acessToken;
}



public String getAcessToken() {
	return acessToken;
}

public void setAcessToken(String acessToken) {
	this.acessToken = acessToken;
}



}
