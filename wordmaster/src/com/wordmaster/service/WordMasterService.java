package com.wordmaster.service;

import java.util.List;
import java.util.Set;

import com.wordmaster.po.WordExample;
import com.wordmaster.po.WordItem;
import com.wordmaster.po.WordType;
import com.wordmaster.repository.WordMasterRepository;
import com.wordmaster.repository.WordMasterRepositoryImpl;

public class WordMasterService {

	private WordMasterRepository repository = new WordMasterRepositoryImpl();
	
	public List<WordType> getAllWordTypes(){
		List<WordType> allTypes = repository.findAllWordTypes();
		allTypes.add(new WordType("OT", "Other"));
		return allTypes;
	}

	public void saveWordType(String code, String description) {
		WordType wordType = new WordType(code, description);
		repository.saveAndCommit(wordType);
	}
	
	public void saveWordItem(WordItem item){
		repository.saveWordItem(item);
	}
	
	public WordType findWordTypeByCode(String code){
		return repository.findWordTypeByCode(code);
	}
}
