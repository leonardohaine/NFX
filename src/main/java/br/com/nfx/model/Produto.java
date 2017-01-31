package br.com.nfx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="produto")
public class Produto {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="nome")
	@Size(min = 2 , max = 50)
	private String nome;
	@Column(name="descricao")
	@Size(min = 2 , max = 120)
	private String descri;
	@Column(name="codigo_produto")
	@Size(min = 2 , max = 60)
	private String codigo;
	@Column(name="codigo_ean")
	@Size(min = 2 , max = 14)
	private String ean;
	@Column(name="ean_tributavel")
	@Size(min = 2 , max = 14)
	private String eanTrib;
	@Column(name="excecao_ipi")
	@Size(min = 2 , max = 3)
	private String exTipi;
	@Column(name="genero")
	@Size(min = 2 , max = 120)
	private String genero;
	@Column(name="ncm")
	@Size( max = 8)
	private String ncm;
	@Column(name="cest")
	@Size(min = 7 , max = 7)
	private String cest;
	@Column(name="unidade_com")
	@Size( max = 12)
	private String unidCom;
	@Column(name="quantidade_trib")
	private Long qtdTrib;
	private Integer qtdCom;
	@Column(name="valor_unid_trib")
	private Double vlrUnidTrib;
	@Column(name="ipi_cst")
	private Integer ipiCST;
	@Column(name="icms_cst")
	private Integer icmsCST;
	@Column(name="pis_cst")
	private Integer pisCST;
	@Column(name="coffins_cst")
	private Integer coffinsCST;
	@Column(name = "vlr_unid_com")
	private Double vlrUnidCom;
	private Integer unidTrib;
	private Double aliqIPI;
	private Double aliqICMS;
	private Integer CFOP;
	private Integer aliqPis;
	private Integer aliqCoffins;
	
	
	
	
	
	
	
	public Integer getAliqCoffins() {
		return aliqCoffins;
	}
	
	public void setAliqCoffins(Integer aliqCoffins) {
		this.aliqCoffins = aliqCoffins;
	}
	
	
	public Integer getAliqPis() {
		return aliqPis;
	}
	
	public void setAliqPis(Integer aliqPis) {
		this.aliqPis = aliqPis;
	}
	
	
	public Integer getQtdCom() {
		return qtdCom;
	}
	
	public void setQtdCom(Integer qtdCom) {
		this.qtdCom = qtdCom;
	}
	
	public Double getAliqICMS() {
		return aliqICMS;
	}
	public void setAliqICMS(Double aliqICMS) {
		this.aliqICMS = aliqICMS;
	}
	public Integer getCFOP() {
		return CFOP;
	}
	public void setCFOP(Integer cFOP) {
		CFOP = cFOP;
	}
	public Double getAliqIPI() {
		return aliqIPI;
	}
	public void setAliqIPI(Double aliqIPI) {
		this.aliqIPI = aliqIPI;
	}
	
	
	
	public Integer getUnidTrib() {
		return unidTrib;
	}
	public void setUnidTrib(Integer unidTrib) {
		this.unidTrib = unidTrib;
	}
	
	
	
	public Double getVlrUnidCom() {
		return vlrUnidCom;
	}
	public void setVlrUnidCom(Double vlrUnidCom) {
		this.vlrUnidCom = vlrUnidCom;
	}
	
	
	


	public Produto(){
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescri() {
		return descri;
	}



	public void setDescri(String descri) {
		this.descri = descri;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getEan() {
		return ean;
	}



	public void setEan(String ean) {
		this.ean = ean;
	}



	public String getEanTrib() {
		return eanTrib;
	}



	public void setEanTrib(String eanTrib) {
		this.eanTrib = eanTrib;
	}



	public String getExTipi() {
		return exTipi;
	}



	public void setExTipi(String exTipi) {
		this.exTipi = exTipi;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getNcm() {
		return ncm;
	}



	public void setNcm(String ncm) {
		this.ncm = ncm;
	}



	public String getCest() {
		return cest;
	}



	public void setCest(String cest) {
		this.cest = cest;
	}



	public String getUnidCom() {
		return unidCom;
	}



	public void setUnidCom(String unidCom) {
		this.unidCom = unidCom;
	}



	public Long getQtdTrib() {
		return qtdTrib;
	}



	public void setQtdTrib(Long qtdTrib) {
		this.qtdTrib = qtdTrib;
	}



	public Double getVlrUnidTrib() {
		return vlrUnidTrib;
	}



	public void setVlrUnidTrib(Double vlrUnidTrib) {
		this.vlrUnidTrib = vlrUnidTrib;
	}



	public Integer getIpiCST() {
		return ipiCST;
	}



	public void setIpiCST(Integer ipiCST) {
		this.ipiCST = ipiCST;
	}



	public Integer getIcmsCST() {
		return icmsCST;
	}



	public void setIcmsCST(Integer icmsCST) {
		this.icmsCST = icmsCST;
	}



	public Integer getPisCST() {
		return pisCST;
	}



	public void setPisCST(Integer pisCST) {
		this.pisCST = pisCST;
	}

	public Integer getCoffinsCST() {
		return coffinsCST;
	}



	public void setCoffinsCST(Integer coffinsCST) {
		this.coffinsCST = coffinsCST;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cest == null) ? 0 : cest.hashCode());
		result = prime * result + ((ean == null) ? 0 : ean.hashCode());
		result = prime * result + ((eanTrib == null) ? 0 : eanTrib.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((icmsCST == null) ? 0 : icmsCST.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (cest == null) {
			if (other.cest != null)
				return false;
		} else if (!cest.equals(other.cest))
			return false;
		if (ean == null) {
			if (other.ean != null)
				return false;
		} else if (!ean.equals(other.ean))
			return false;
		if (eanTrib == null) {
			if (other.eanTrib != null)
				return false;
		} else if (!eanTrib.equals(other.eanTrib))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (icmsCST == null) {
			if (other.icmsCST != null)
				return false;
		} else if (!icmsCST.equals(other.icmsCST))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descri=" + descri + ", codigo=" + codigo + ", ean=" + ean
				+ ", eanTrib=" + eanTrib + ", exTipi=" + exTipi + ", genero=" + genero + ", ncm=" + ncm + ", cest="
				+ cest + ", unidCom=" + unidCom + ", qtdTrib=" + qtdTrib + ", vlrUnidTrib=" + vlrUnidTrib + ", ipiCST="
				+ ipiCST + ", icmsCST=" + icmsCST + ", pisCST=" + pisCST + "]";
	}
	
	
	
	
	
}
