package com.test.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.backend.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer>{

}
