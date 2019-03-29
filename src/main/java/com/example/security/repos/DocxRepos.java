package com.example.security.repos;

import com.example.security.domain.DocxContext;
import org.springframework.data.repository.CrudRepository;

public interface DocxRepos extends CrudRepository<DocxContext, Long> {
}
