/*     */ package br.com.nfx.model.nfe;
/*     */ import java.io.Serializable;

/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeRefPk;
import br.com.nfx.util.EntityBase;

/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name="nfe_ref")
/*     */ @NamedQuery(name="NfeRef.findByTrxId", query="select r from NfeRef r where r.nfeRefPk.customerTrxId = :customerTrxId ")
/*     */ public class NfeRef extends EntityBase
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */ 
/*     */   @EmbeddedId
/*     */   private NfeRefPk nfeRefPk;
/*     */ 
/*     */   @Column(name="N_CUF")
/*     */   private Integer nCuf;
/*     */ 
/*     */   @Column(name="N_AAMM")
/*     */   private Integer nAamm;
/*     */ 
/*     */   @Column(name="S_CNPJ")
/*     */   private String sCnpj;
/*     */ 
/*     */   @Column(name="N_MOD")
/*     */   private String nMod;
/*     */ 
/*     */   @Column(name="N_SERIE")
/*     */   private Integer nSerie;
/*     */ 
/*     */   @Column(name="N_PR_CUF")
/*     */   private Integer nPrCuf;
/*     */ 
/*     */   @Column(name="N_PR_AAMM")
/*     */   private Integer nPrAamm;
/*     */ 
/*     */   @Column(name="S_PR_CNPJ")
/*     */   private String sPrCnpj;
/*     */ 
/*     */   @Column(name="S_PR_CPF")
/*     */   private String sPrCpf;
/*     */ 
/*     */   @Column(name="S_PR_IE")
/*     */   private String sPrIe;
/*     */ 
/*     */   @Column(name="N_PR_MOD")
/*     */   private Integer nPrMod;
/*     */ 
/*     */   @Column(name="N_PR_SERIE")
/*     */   private Integer nPrSerie;
/*     */ 
/*     */   @Column(name="N_CTE_REFCTE")
/*     */   private String nCteRefcte;
/*     */ 
/*     */   @Column(name="S_CF_MOD")
/*     */   private String sCfMod;
/*     */ 
/*     */   @Column(name="N_CF_NCOO")
/*     */   private Integer nCfNcoo;
/*     */ 
/*     */   public NfeRefPk getNfeRefPk()
/*     */   {
/*  69 */     return this.nfeRefPk;
/*     */   }
/*     */ 
/*     */   public void setNfeRefPk(NfeRefPk nfeRefPk) {
/*  73 */     this.nfeRefPk = nfeRefPk;
/*     */   }
/*     */ 
/*     */   public Integer getnCuf() {
/*  77 */     return this.nCuf;
/*     */   }
/*     */ 
/*     */   public void setnCuf(Integer nCuf) {
/*  81 */     this.nCuf = nCuf;
/*     */   }
/*     */ 
/*     */   public Integer getnAamm() {
/*  85 */     return this.nAamm;
/*     */   }
/*     */ 
/*     */   public void setnAamm(Integer nAamm) {
/*  89 */     this.nAamm = nAamm;
/*     */   }
/*     */ 
/*     */   public String getsCnpj() {
/*  93 */     return this.sCnpj;
/*     */   }
/*     */ 
/*     */   public void setsCnpj(String sCnpj) {
/*  97 */     this.sCnpj = sCnpj;
/*     */   }
/*     */ 
/*     */   public String getnMod() {
/* 101 */     return this.nMod;
/*     */   }
/*     */ 
/*     */   public void setnMod(String nMod) {
/* 105 */     this.nMod = nMod;
/*     */   }
/*     */ 
/*     */   public Integer getnSerie() {
/* 109 */     return this.nSerie;
/*     */   }
/*     */ 
/*     */   public void setnSerie(Integer nSerie) {
/* 113 */     this.nSerie = nSerie;
/*     */   }
/*     */ 
/*     */   public Integer getnPrCuf() {
/* 117 */     return this.nPrCuf;
/*     */   }
/*     */ 
/*     */   public void setnPrCuf(Integer nPrCuf) {
/* 121 */     this.nPrCuf = nPrCuf;
/*     */   }
/*     */ 
/*     */   public Integer getnPrAamm() {
/* 125 */     return this.nPrAamm;
/*     */   }
/*     */ 
/*     */   public void setnPrAamm(Integer nPrAamm) {
/* 129 */     this.nPrAamm = nPrAamm;
/*     */   }
/*     */ 
/*     */   public String getsPrCnpj() {
/* 133 */     return this.sPrCnpj;
/*     */   }
/*     */ 
/*     */   public void setsPrCnpj(String sPrCnpj) {
/* 137 */     this.sPrCnpj = sPrCnpj;
/*     */   }
/*     */ 
/*     */   public String getsPrCpf() {
/* 141 */     return this.sPrCpf;
/*     */   }
/*     */ 
/*     */   public void setsPrCpf(String sPrCpf) {
/* 145 */     this.sPrCpf = sPrCpf;
/*     */   }
/*     */ 
/*     */   public String getsPrIe() {
/* 149 */     return this.sPrIe;
/*     */   }
/*     */ 
/*     */   public void setsPrIe(String sPrIe) {
/* 153 */     this.sPrIe = sPrIe;
/*     */   }
/*     */ 
/*     */   public Integer getnPrMod() {
/* 157 */     return this.nPrMod;
/*     */   }
/*     */ 
/*     */   public void setnPrMod(Integer nPrMod) {
/* 161 */     this.nPrMod = nPrMod;
/*     */   }
/*     */ 
/*     */   public Integer getnPrSerie() {
/* 165 */     return this.nPrSerie;
/*     */   }
/*     */ 
/*     */   public void setnPrSerie(Integer nPrSerie) {
/* 169 */     this.nPrSerie = nPrSerie;
/*     */   }
/*     */ 
/*     */   public String getnCteRefcte() {
/* 173 */     return this.nCteRefcte;
/*     */   }
/*     */ 
/*     */   public void setnCteRefcte(String nCteRefcte) {
/* 177 */     this.nCteRefcte = nCteRefcte;
/*     */   }
/*     */ 
/*     */   public String getsCfMod() {
/* 181 */     return this.sCfMod;
/*     */   }
/*     */ 
/*     */   public void setsCfMod(String sCfMod) {
/* 185 */     this.sCfMod = sCfMod;
/*     */   }
/*     */ 
/*     */   public Integer getnCfNcoo() {
/* 189 */     return this.nCfNcoo;
/*     */   }
/*     */ 
/*     */   public void setnCfNcoo(Integer nCfNcoo) {
/* 193 */     this.nCfNcoo = nCfNcoo;
/*     */   }
/*     */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeRef
 * JD-Core Version:    0.6.0
 */