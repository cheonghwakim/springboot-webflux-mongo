package com.bithumb.api.quiz.controller;

import com.bithumb.api.quiz.domain.Quiz;
import com.bithumb.api.quiz.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quizzes")
public class QuizController {

    private final QuizService quizService;

    @GetMapping("/random")
    public ResponseEntity<Mono<Quiz> getQuiz() {
        return ResponseEntity.ok(quizService.createQuiz());
    }
}
