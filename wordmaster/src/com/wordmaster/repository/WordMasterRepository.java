package com.wordmaster.repository;

import java.util.List;

import com.wordmaster.po.WordItem;
import com.wordmaster.po.WordType;

public interface WordMasterRepository {
	
	public List<WordType> findAllWordTypes();
	public void saveAndCommit(Object wordType);
	public void saveWordItem(WordItem wordItem);
	public WordType findWordTypeByCode(String code);
}
