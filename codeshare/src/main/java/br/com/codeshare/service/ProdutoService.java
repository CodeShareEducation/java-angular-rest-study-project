package br.com.codeshare.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.codeshare.core.dao.ProdutoDao;
import br.com.codeshare.core.model.Produto;

@Path("/produto")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoService {

	@Inject
	private ProdutoDao dao;

	@GET
	public List<Produto> readAllProdutos() {
		return dao.listarProdutos();
	}

	@GET
	@Path("/{id}")
	public Produto readProduto(@PathParam("id") Long id) {
		return dao.buscarProduto(id);
	}
	
	@POST
	public Produto insertProduto(Produto produto){
		return dao.inserirProduto(produto);
	}
	
	@PUT
	public Produto updateProduto(Produto produto){
		return dao.atualizarProduto(produto);
	}
	
	@DELETE
	public void deleteProduto(Produto produto){
		dao.deletarProduto(produto);
	}

	
}
