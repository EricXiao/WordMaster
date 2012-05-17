package com.wordmaster.view;

public class WordMasterRemote {
	
	private WordMasterRemote(){
		
	}
	
	private static WordMasterRemote instance = new WordMasterRemote();
	
	public static WordMasterRemote getInstance(){
		return instance;
	}
	
	public String hello(){
		return "hello world";
	}

}
