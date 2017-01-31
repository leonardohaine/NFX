/*     */ package br.com.nfx.model.nfe;
/*     */ 

/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;

/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;

import br.com.nfx.util.EntityBase;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="nfe_inutilizacao")
/*     */ @NamedQuery(name="InutilizacaoNfe.findByTrxIdRef", query="select i from InutilizacaoNfe i where i.customerTrxIdRef = :customerTrxIdRef ")
/*     */ public class InutilizacaoNfe extends EntityBase
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */ 
/*     */   @Id
/*     */   @Column(name="CUSTOMER_TRX_ID")
/*     */   private Long customerTrxId;
/*     */ 
/*     */   @Column(name="CUSTOMER_TRX_ID_REF")
/*     */   private Long customerTrxIdRef;
/*     */ 
/*     */   @Column(name="TRANSACTION_ID")
/*     */   private Long transactionId;
/*     */ 
/*     */   @Column(name="N_VERSAO")
/*     */   private BigDecimal versao;
/*     */ 
/*     */   @Column(name="S_CNPJ")
/*     */   private String cnpj;
/*     */ 
/*     */   @Column(name="N_TPAMB")
/*     */   private String tpAmb;
/*     */ 
/*     */   @Column(name="N_NFINI")
/*     */   private String nNFIni;
/*     */ 
/*     */   @Column(name="N_NFFIN")
/*     */   private String nNFFin;
/*     */ 
/*     */   @Column(name="N_SERIE")
/*     */   private String serie;
/*     */ 
/*     */   @Column(name="S_XJUST")
/*     */   private String xJustificativa;
/*     */ 
/*     */   @Column(name="N_ANO")
/*     */   private String ano;
/*     */ 
/*     */   @Column(name="S_IE")
/*     */   private String ie;
/*     */ 
/*     */   @Column(name="N_MOD")
/*     */   private String mod;
/*     */ 
/*     */   public Long getCustomerTrxId()
/*     */   {
/*  61 */     return this.customerTrxId;
/*     */   }
/*     */ 
/*     */   public void setCustomerTrxId(Long customerTrxId) {
/*  65 */     this.customerTrxId = customerTrxId;
/*     */   }
/*     */ 
/*     */   public Long getTransactionId() {
/*  69 */     return this.transactionId;
/*     */   }
/*     */ 
/*     */   public void setTransactionId(Long transactionId) {
/*  73 */     this.transactionId = transactionId;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVersao() {
/*  77 */     return this.versao;
/*     */   }
/*     */ 
/*     */   public void setVersao(BigDecimal versao) {
/*  81 */     this.versao = versao;
/*     */   }
/*     */ 
/*     */   public String getCnpj() {
/*  85 */     return this.cnpj;
/*     */   }
/*     */ 
/*     */   public void setCnpj(String cnpj) {
/*  89 */     this.cnpj = cnpj;
/*     */   }
/*     */ 
/*     */   public String getTpAmb() {
/*  93 */     return this.tpAmb;
/*     */   }
/*     */ 
/*     */   public void setTpAmb(String tpAmb) {
/*  97 */     this.tpAmb = tpAmb;
/*     */   }
/*     */ 
/*     */   public String getnNFIni() {
/* 101 */     return this.nNFIni;
/*     */   }
/*     */ 
/*     */   public void setnNFIni(String nNFIni) {
/* 105 */     this.nNFIni = nNFIni;
/*     */   }
/*     */ 
/*     */   public String getnNFFin() {
/* 109 */     return this.nNFFin;
/*     */   }
/*     */ 
/*     */   public void setnNFFin(String nNFFin) {
/* 113 */     this.nNFFin = nNFFin;
/*     */   }
/*     */ 
/*     */   public String getSerie() {
/* 117 */     return this.serie;
/*     */   }
/*     */ 
/*     */   public void setSerie(String serie) {
/* 121 */     this.serie = serie;
/*     */   }
/*     */ 
/*     */   public String getxJustificativa() {
/* 125 */     return this.xJustificativa;
/*     */   }
/*     */ 
/*     */   public void setxJustificativa(String xJustificativa) {
/* 129 */     this.xJustificativa = xJustificativa;
/*     */   }
/*     */ 
/*     */   public String getAno() {
/* 133 */     return this.ano;
/*     */   }
/*     */ 
/*     */   public void setAno(String ano) {
/* 137 */     this.ano = ano;
/*     */   }
/*     */ 
/*     */   public String getIe() {
/* 141 */     return this.ie;
/*     */   }
/*     */ 
/*     */   public void setIe(String ie) {
/* 145 */     this.ie = ie;
/*     */   }
/*     */ 
/*     */   public String getMod() {
/* 149 */     return this.mod;
/*     */   }
/*     */ 
/*     */   public void setMod(String mod) {
/* 153 */     this.mod = mod;
/*     */   }
/*     */ 
/*     */   public Long getCustomerTrxIdRef() {
/* 157 */     return this.customerTrxIdRef;
/*     */   }
/*     */ 
/*     */   public void setCustomerTrxIdRef(Long customerTrxIdRef) {
/* 161 */     this.customerTrxIdRef = customerTrxIdRef;
/*     */   }
/*     */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.InutilizacaoNfe
 * JD-Core Version:    0.6.0
 */