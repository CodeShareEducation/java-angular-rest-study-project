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

import br.com.codeshare.core.dao.CategoriaDao;
import br.com.codeshare.core.model.Categoria;

@Path("/categoria")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class CategoriaService {

	@Inject
	private CategoriaDao dao;

	@GET
	public List<Categoria> readAllCategorias() {
		return dao.listarCategorias();
	}

	@GET
	@Path("/{id}")
	public Categoria readCategoria(@PathParam("id") Long id) {
		return dao.buscarCategoria(id);
	}
	
	@POST
	public Categoria insertCategoria(Categoria categoria){
		return dao.inserirCategoria(categoria);
	}
	
	@PUT
	public Categoria updateCategoria(Categoria categoria){
		return dao.atualizarCategoria(categoria);
	}
	
	@DELETE
	public void deleteCategoria(Categoria categoria){
		dao.deletarCategoria(categoria);
	}

	
}
