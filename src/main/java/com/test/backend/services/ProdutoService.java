package com.test.backend.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.backend.model.Produto;
import com.test.backend.repository.ProdutoRepository_old;

@Service
public class ProdutoService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private ProdutoRepository_old produtoRepository;

	/**
	 * Metodo que ira retornar todos os produtos
	 * 
	 * @return Retorna todos os produtos
	 */
	public List<Produto> obterTodos() {
		return produtoRepository.obterTodos();
	}

	/**
	 * Metodo que busca por Id.
	 * 
	 * @param passa o Id a ser requisitado
	 * @return Retorna o Id.
	 */
	public Optional<Produto> obterPorId(Integer id) {
		return produtoRepository.obterPorId(id);
	}

	/**
	 * Metodo para adioconar um produto
	 * 
	 * @param Produto a ser adicionado
	 * @return Retorna o produto cadastrado
	 */
	public Produto adicionar(Produto produto) {
		return produtoRepository.adicionar(produto);
	}

	/**
	 * Metodo que deleta um produto por id
	 * 
	 * @param id deletado
	 */
	public void deletar(Integer id) {
		produtoRepository.deletar(id);
	}

	/**
	 * Metodo que atualiza um produto
	 * 
	 * @param dados do produto a ser atualizado
	 * @return Retorna o produto atualizado
	 */

	public Produto atualizar(Integer id, Produto produto) {
		produto.setId(id);
		return produtoRepository.atualizar(produto);

	}

}
