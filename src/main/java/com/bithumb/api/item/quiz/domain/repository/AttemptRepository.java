package com.bithumb.api.item.quiz.domain.repository;

import com.bithumb.api.item.quiz.domain.Attempt;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface AttemptRepository extends ReactiveMongoRepository<Attempt, Long> {
    Flux<Attempt> findTop5ByUserAliasOrderByIdDesc(String userAlias);
}
