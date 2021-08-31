package com.bithumb.api.quiz.service;

import com.bithumb.api.quiz.domain.Quiz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class QuizServiceImplTest {

    private QuizServiceImpl quizService;

    @Mock
    GeneratorServiceImpl generatorService;  // 얘가 repository 역할 함

    @BeforeEach
    void setUp() {
        quizService = new QuizServiceImpl(generatorService);
    }

    @DisplayName("50 * 30 = 1500")
    @Test
    void createQuiz() {
        given(generatorService.randomFactor()).willReturn(50, 30); // 조건절 같은 느낌
        Mono<Quiz> quiz = quizService.createQuiz();
        Quiz q = quiz.block();
        assertThat(q.getFactorA(), is(50));
        assertThat(q.getFactorB(), is(30));
        assertThat(q.getResult(), is(1500));
    }
}