package com.wiki.eldenring.repository;

import com.wiki.eldenring.model.Ambiente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Ambiente,String> {
    Ambiente findByNome(String nome);
    Ambiente deleteByNome(String nome);
}
