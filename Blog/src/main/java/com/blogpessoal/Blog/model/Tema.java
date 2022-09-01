package com.blogpessoal.Blog.model;

import java.util.List;

public class Tema {

	private Long id;
	
	private String descricao;
	
	private List <postagem> postagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<postagem> postagem) {
		this.postagem = postagem;
	}
	
	
}
