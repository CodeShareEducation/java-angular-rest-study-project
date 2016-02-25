package br.com.codeshare.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.codeshare.core.dao.ProdutoDao;
import br.com.codeshare.core.model.Produto;

@Stateless
public class ProdutoDaoImp implements ProdutoDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Produto inserirProduto(Produto produto) {
		em.persist(produto);
		return produto;
	}

	@Override
	public Produto atualizarProduto(Produto produto) {
		return em.merge(produto);
	}

	@Override
	public void deletarProduto(Produto produto) {
		produto = em.merge(produto);
		em.remove(produto);
	}

	@Override
	public Produto buscarProduto(Long id) {
		return em.find(Produto.class, id);
	}

	@Override
	public List<Produto> listarProdutos() {
		TypedQuery<Produto> query = em.createQuery("Select p from Produto p", Produto.class);
		return query.getResultList();
	}

}
