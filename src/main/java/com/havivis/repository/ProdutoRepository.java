package com.havivis.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.havivis.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
