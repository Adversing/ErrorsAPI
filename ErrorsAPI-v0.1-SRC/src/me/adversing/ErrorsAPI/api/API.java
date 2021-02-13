package me.adversing.ErrorsAPI.api;

import java.awt.Color;

import lombok.Getter;

public class API {
	
	@Getter String author = "Adversing";
	@Getter String version = "0.1";
	@Getter String github = "https://www.github.com/Adversing";
	
	static Color cc;
	
	/**
	* This method is used for creating custom error messages by stimply implementing the java.awt.Color class. 
	* @author Adversing
	* @param color the message's color (java.awt.Color)
	* @param error_message the String of the error you want to display (java.lang.String)
	* 
	* @return A formatted message, with a fancy color implementation!
	*/
	public static String createMessage(Color color, String error_message) {
		color = cc;
		return color + error_message;
	}
	
	/**
	* @return The author of the API.
	*/
	public String getAuthor() {
		return author;
	}
	
	/**
	* @return The API version.
	*/
	public String getVersion() {
		return version;
	}
	
	public String getWebsite() {
		return github;
	}
}
