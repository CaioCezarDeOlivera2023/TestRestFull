package com.test.backend.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.backend.model.Produto;
import com.test.backend.repository.ProdutoRepository;

@Service
public class ProdutoService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos(){
        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterPorId(Integer id){
        return produtoRepository.obterPorId(id);
    }

    public Produto adicionar(Produto produto){
        return produtoRepository.adicionar(produto);
    }

    public void deletar(Integer id){
        produtoRepository.deletar(id);
    }

    public Produto atualizar(Integer id, Produto produto){
        produto.setId(id);
        return produtoRepository.atualizar(produto);

    }

	
	
}
