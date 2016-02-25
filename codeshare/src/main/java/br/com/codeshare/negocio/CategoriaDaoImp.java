package br.com.codeshare.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.codeshare.core.dao.CategoriaDao;
import br.com.codeshare.core.model.Categoria;

@Stateless
public class CategoriaDaoImp implements CategoriaDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Categoria inserirCategoria(Categoria categoria) {
		em.persist(categoria);
		return categoria;
	}

	@Override
	public Categoria atualizarCategoria(Categoria categoria) {
		return em.merge(categoria);
	}

	@Override
	public void deletarCategoria(Categoria categoria) {
		categoria = em.merge(categoria);
		em.remove(categoria);
	}

	@Override
	public Categoria buscarCategoria(Long id) {
		return em.find(Categoria.class, id);
	}

	@Override
	public List<Categoria> listarCategorias() {
		TypedQuery<Categoria> query = em.createQuery("Select c from Categoria c", Categoria.class);
		return query.getResultList();
	}

}
