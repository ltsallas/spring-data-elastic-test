package com.example.repositories;

import com.example.domain.ParentEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ChildRepository extends ElasticsearchRepository<ParentEntity.ChildEntity,String> {

}
