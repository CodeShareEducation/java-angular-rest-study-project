package br.com.codeshare.core.dao;

import java.util.List;

import javax.ejb.Local;

import br.com.codeshare.core.model.Categoria;

@Local
public interface CategoriaDao {

	/**
	 * CREATE - Inseri uma nova categoria.
	 * @param categoria
	 * @return Categoria inserida
	 */
	public Categoria inserirCategoria(Categoria categoria);
	
	/**
	 * UPDATE - Atualiza uma categoria.
	 * @param categoria
	 * @return Categoria atualizada
	 */
	public Categoria atualizarCategoria(Categoria categoria);
	
	/**
	 * DELETE - Deleta uma categoria.
	 * @param categoria
	 */
	public void deletarCategoria(Categoria categoria);
	
	/**
	 * READ - Busca categoria através do <b>id</b> informado.
	 * @param id
	 * @return Categoria selecionada
	 */
	public Categoria buscarCategoria(Long id);
	
	/**
	 * READ ALL- Lista todas as categorias cadastradas.
	 * @return Lista todas as categorias do banco
	 */
	public List<Categoria> listarCategorias();
	
}
