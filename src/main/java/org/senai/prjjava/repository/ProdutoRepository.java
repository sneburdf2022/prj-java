package org.senai.prjjava.repository;

import java.util.Optional;

import org.senai.prjjava.entity.Produto;
import org.springframework.data.repository.CrudRepository;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public interface ProdutoRepository extends CrudRepository<Produto, Id> {

    Optional<Produto> findById(Integer id);

}
