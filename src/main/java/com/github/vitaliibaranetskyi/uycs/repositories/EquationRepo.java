package com.github.vitaliibaranetskyi.uycs.repositories;

import org.springframework.data.repository.CrudRepository;
import com.github.vitaliibaranetskyi.uycs.models.Equation;
import com.github.vitaliibaranetskyi.uycs.models.User;

import java.util.List;

public interface EquationRepo extends CrudRepository<Equation, Integer> {

    /*
    https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
     */
    Equation findById(Long id);
    List<Equation> findByUser(User user);
}