package com.chandu.quizz.app.controller;

import com.chandu.quizz.app.QuestionWrapper;
import com.chandu.quizz.app.Response;
import com.chandu.quizz.app.model.Question;
import com.chandu.quizz.app.service.QuizzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizzController {
    @Autowired
    QuizzService quizzService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return quizzService.createQuizz(category,numQ,title);
    }
    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizzQuestions(@PathVariable Integer id) {
        return quizzService.getQuizzQuestions(id);
    }
    @PostMapping("submit")
    public ResponseEntity<Integer>submitQuizz(@PathVariable Integer id, @RequestBody List<Response> responses ){
        return quizzService.calculateResult(id,responses);
    }

}
