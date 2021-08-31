package com.bithumb.api.quiz.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

// 참여자
@Document(collection = "users")
@Getter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public class User implements Serializable { // 직렬화: 컴퓨터가 읽을 수 있게끔 parsing하는 것

    @Id
    private final String userid;

    private final String alias;
}
