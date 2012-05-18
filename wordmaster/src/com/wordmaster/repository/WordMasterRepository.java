package com.wordmaster.repository;

import java.util.List;

import com.wordmaster.po.WordType;

public interface WordMasterRepository {
	
	public List<WordType> findAllWordTypes();
	public void save(Object wordType);

}
