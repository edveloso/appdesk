package br.edu.infnet.appdesk.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usuario")
public class Usuario {

	@Id @GeneratedValue
	private Integer codigo;
	
	private String nome;
	
	private String email;
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY )
	private Set<DetalheConta> detalheContas;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Set<DetalheConta> getDetalheContas() {
		return detalheContas;
	}

	public void setDetalheContas(Set<DetalheConta> detalheContas) {
		this.detalheContas = detalheContas;
	}
	
}
