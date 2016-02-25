package br.com.codeshare.core.dao;

import java.util.List;

import javax.ejb.Local;

import br.com.codeshare.core.model.Produto;

@Local
public interface ProdutoDao {

	/**
	 * CREATE - Inseri um nova produto.
	 * @param produto
	 * @return Produto inserido
	 */
	public Produto inserirProduto(Produto produto);
	
	/**
	 * UPDATE - Atualiza um produto.
	 * @param produto
	 * @return Produto atualizado
	 */
	public Produto atualizarProduto(Produto produto);
	
	/**
	 * DELETE - Deleta um produto.
	 * @param produto
	 */
	public void deletarProduto(Produto produto);
	
	/**
	 * READ - Busca produto através do <b>id</b> informado.
	 * @param id
	 * @return Produto selecionada
	 */
	public Produto buscarProduto(Long id);
	
	/**
	 * READ ALL- Lista todos os produtos cadastrados.
	 * @return Lista todos os produtos do banco
	 */
	public List<Produto> listarProdutos();
	
}
