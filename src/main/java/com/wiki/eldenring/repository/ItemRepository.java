package com.wiki.eldenring.repository;

import com.wiki.eldenring.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item,String> {
    Item findByNome(String nome);
    Item deleteByNome(String nome);
}
