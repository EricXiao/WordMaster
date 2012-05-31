package com.wordmaster.view;

import java.util.List;

import com.wordmaster.po.WordExample;
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
	
	public String saveWord(WordItem item, List<String> examples){
		String code = item.getType().getCode();
		WordType wordType = service.findWordTypeByCode(code);
		if(wordType == null){
			throw new NullPointerException("wordType is null");
		}
		item.setType(wordType);
		if(examples.size()>0){
			for (String example : examples) {
				WordExample newExample = new WordExample();
				newExample.setExample(example);
				item.addToExamples(newExample);
			}
		}
		service.saveWordItem(item);
		return "success";
	}

}
