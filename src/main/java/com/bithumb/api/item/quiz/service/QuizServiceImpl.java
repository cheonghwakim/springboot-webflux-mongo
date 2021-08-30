package com.bithumb.api.item.quiz.service;

import com.bithumb.api.item.quiz.domain.Quiz;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
    private final GeneratorService generatorService; // final 걸어야 생성자가 만들어짐

    @Override
    public Quiz createQuiz() {
        return new Quiz(
                generatorService.randomFactor(),
                generatorService.randomFactor()
        );
    }
}
