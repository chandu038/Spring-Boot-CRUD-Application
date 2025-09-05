package com.chandu.quizz.app.controller;

import com.chandu.quizz.app.model.Question;
import com.chandu.quizz.app.service.QuestionServivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionServivce questionServivce;
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
       return questionServivce.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionServivce.getQuestionsByCategory(category);
    }
    @PostMapping("add")
    public String addQuestion( @RequestBody  Question question){
        return questionServivce.addQuestion(question);
    }
    @PostMapping("delete")
    public String deleteQuestion(@RequestBody Question question){
        return questionServivce.deleteQuestion(question);
    }

}