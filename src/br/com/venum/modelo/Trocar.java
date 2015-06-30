package br.com.venum.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Trocar {
	
	
	@Id
	@GeneratedValue
	private long id;
	private String produto;
	private String descricao;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] imagemUm;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] imagemDois;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] imagemtres;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] imagemQuatro;
	
	private String interesse;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getInteresse() {
		return interesse;
	}
	public void setInteresse(String interesse) {
		this.interesse = interesse;
	}
	public byte[] getImagemUm() {
		return imagemUm;
	}
	public void setImagemUm(byte[] imagemUm) {
		this.imagemUm = imagemUm;
	}
	public byte[] getImagemDois() {
		return imagemDois;
	}
	public void setImagemDois(byte[] imagemDois) {
		this.imagemDois = imagemDois;
	}
	public byte[] getImagemtres() {
		return imagemtres;
	}
	public void setImagemtres(byte[] imagemtres) {
		this.imagemtres = imagemtres;
	}
	public byte[] getImagemQuatro() {
		return imagemQuatro;
	}
	public void setImagemQuatro(byte[] imagemQuatro) {
		this.imagemQuatro = imagemQuatro;
	}
	
	
	
	

}
