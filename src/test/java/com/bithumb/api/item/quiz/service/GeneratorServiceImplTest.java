package com.bithumb.api.item.quiz.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GeneratorServiceImplTest {

    @Mock                                   // 목업 테스트 (가짜 객체로)
    GeneratorServiceImpl generatorService;  // 테스트 할 때는 Impl로 객체 생성

    @BeforeEach
    void setUp() {
        generatorService = new GeneratorServiceImpl();
    }

    @DisplayName("랜덤 값 발생 알고리즘 테스트")
    @Test
    void randomFactor() {
        List<Integer> randoms = IntStream.range(0, 1000)
                .map(i -> generatorService.randomFactor())
                .boxed()
                .collect(Collectors.toList());

        assertThat(randoms).containsOnlyElementsOf(IntStream.range(11, 100)
                .boxed()
                .collect(Collectors.toList()));
    }
}