package com.chandu.quizz.app.dao;

import com.chandu.quizz.app.model.Quizz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizzDao extends JpaRepository<Quizz,Integer> {
}
