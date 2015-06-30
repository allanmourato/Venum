package br.com.venum.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vender {
	
	@Id
	@GeneratedValue
	private long id;
	private String produto;
	private String descricao;
	private BigDecimal valor;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataAnuncio;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] imagemUm;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] imagemDois;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] imagemTres;
	
	@Lob
	@Column(columnDefinition="mediumblob")
	private byte[] imagemQuatro;
	
	
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Calendar getDataAnuncio() {
		return dataAnuncio;
	}
	public void setDataAnuncio(Calendar dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
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
	public byte[] getImagemTres() {
		return imagemTres;
	}
	public void setImagemTres(byte[] imagemTres) {
		this.imagemTres = imagemTres;
	}
	public byte[] getImagemQuatro() {
		return imagemQuatro;
	}
	public void setImagemQuatro(byte[] imagemQuatro) {
		this.imagemQuatro = imagemQuatro;
	}
	
	
	
	
	
	

}
