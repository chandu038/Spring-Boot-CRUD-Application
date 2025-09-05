package com.chandu.quizz.app.service;
import com.chandu.quizz.app.model.Question;
import com.chandu.quizz.app.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServivce {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategoryIgnoreCase(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Successfully entered";
    }

    public String deleteQuestion(Question question) {
        questionDao.delete(question);
        return "Deleted Succesfully";
    }
}
