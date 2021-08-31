package com.bithumb.api.quiz.service;


import com.bithumb.api.quiz.domain.Quiz;
import reactor.core.publisher.Mono;

public interface QuizService {
    Mono<Quiz> createQuiz(); // Mono로 감싸는 이유: message queue에서 메세지 응답이 바로 없을 때 딜레이 되니까, 비동기 상태랑 non blocking 상태를 명시해주기 위해서
}
