package com.micronsol.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micronsol.spring.datajpa.model.Tutorial;

public interface TutorialRepositary extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
	
}
 