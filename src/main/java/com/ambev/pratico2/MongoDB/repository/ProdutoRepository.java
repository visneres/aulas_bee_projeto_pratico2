package com.ambev.pratico2.MongoDB.repository;

import com.ambev.pratico2.MongoDB.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProdutoRepository extends MongoRepository<Produto, String>{

}
