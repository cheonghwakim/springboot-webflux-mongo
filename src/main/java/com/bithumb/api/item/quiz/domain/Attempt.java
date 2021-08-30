package com.bithumb.api.item.quiz.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

// 참여자의 성적
@Document(collection = "attempts")
@Getter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public class Attempt implements Serializable {
    @Id
    private int id;
    private final User user;
    private final Quiz quiz;
    private final int resultAttempt;
    private final boolean correct;
}
