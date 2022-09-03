package com.wiki.eldenring.repository;

import com.wiki.eldenring.model.AmbienteMacro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<AmbienteMacro,String> {
    AmbienteMacro findByNome(String nome);
    AmbienteMacro deleteByNome(String nome);
}
