package com.test.backend.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import com.test.backend.model.Produto;
import com.test.backend.model.exception.ResourceNotFoundException;

@Repository
@RestController
public class ProdutoRepository_old {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	private Integer ultimoId =0;
	
	/**
	 * Metodo que ira retornar todos os produtos
	 * 
	 * @return Retorna todos os produtos
	 */
	public List<Produto> obterTodos(){
		return produtos;
	}
	
	/**
	 * Metodo que busca por Id.
	 * @param passa o Id a ser requisitado
	 * @return Retorna o Id.
	 */
	public Optional<Produto> obterPorId(Integer id){
        return produtos
        .stream()
        .filter(produto -> produto.getId()==id)
        .findFirst();
   }

   /**
    * Metodo para adioconar um produto
    * @param Produto a ser adicionado
    * @return Retorna o produto cadastrado
    */
   public Produto adicionar(Produto produto){
        ultimoId++;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
   }

   /**
    * Metodo que deleta um produto por id
    * @param id deletado
    */
   public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId()==id);
   }

   /**
    * Metodo que atualiza um produto
    * @param dados do produto a ser atualizado
    * @return Retorna o produto atualizado
    */
   public Produto atualizar(Produto produto){
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());
        if(produtoEncontrado.isEmpty()){
            throw new ResourceNotFoundException("Produto não encontrado");
        }
        deletar(produto.getId());

        produtos.add(produto);
     
        return produto; 
   }
	
}
