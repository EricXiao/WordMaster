package com.wordmaster.view;

import java.util.List;

import com.wordmaster.po.WordItem;
import com.wordmaster.po.WordType;
import com.wordmaster.service.WordMasterService;

public class WordMasterRemote {
	
	private WordMasterService service = new WordMasterService();
	
	private WordMasterRemote(){
		
	}
	
	private static WordMasterRemote instance = new WordMasterRemote();
	
	public static WordMasterRemote getInstance(){
		return instance;
	}
	
	public String hello(){
		return "hello world";
	}
	
	public List<WordType> getWordTypes(){
		return service.getAllWordTypes();
	}
	
	public String addNewType(String code, String description){
		service.saveWordType(code, description);
		return "success";
	}
	
	public String saveWord(WordItem item){
		service.saveWordItem(item);
		return "success";
	}

}
