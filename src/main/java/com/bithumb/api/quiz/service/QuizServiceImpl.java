package com.bithumb.api.quiz.service;

import com.bithumb.api.quiz.domain.Quiz;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
    private final GeneratorService generatorService; // final 걸어야 생성자가 만들어짐

    @Override
    public Mono<Quiz> createQuiz() {
        int factorA = generatorService.randomFactor();
        int factorB = generatorService.randomFactor();
        Quiz quiz = new Quiz(factorA, factorB);
        return Mono.just(quiz);     // 답변이 조금 늦더라도 queue 방식으로 async 방식으로
    }
}
