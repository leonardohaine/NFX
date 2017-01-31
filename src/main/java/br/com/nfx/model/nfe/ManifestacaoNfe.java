/*     */ package br.com.nfx.model.nfe;
/*     */ 

/*     */ import java.io.Serializable;
/*     */ import java.util.Date;

/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Transient;

import br.com.nfx.util.EntityBase;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="nfe_manifestacao")
/*     */ @NamedQuery(name="ManifestacaoNfe.findByTrxIdRef", query="select c from ManifestacaoNfe c where c.customerTrxIdRef = :customerTrxIdRef ")
/*     */ public class ManifestacaoNfe extends EntityBase
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
/*     */   private Integer versao;
/*     */ 
/*     */   @Column(name="S_CHAVE")
/*     */   private String chave;
/*     */ 
/*     */   @Column(name="S_CNPJ")
/*     */   private String cnpj;
/*     */ 
/*     */   @Column(name="S_IE")
/*     */   private String ie;
/*     */ 
/*     */   @Column(name="S_CODMANIFESTACAO")
/*     */   private String codManifestacao;
/*     */ 
/*     */   @Column(name="S_XJUST")
/*     */   private String justificativa;
/*     */ 
/*     */   @Column(name="D_HORAENV")
/*     */   private Date dataHoraEnv;
/*     */ 
/*     */   @Transient
/*     */   private String docNum;
/*     */ 
/*     */   public Long getCustomerTrxId()
/*     */   {
/*  57 */     return this.customerTrxId;
/*     */   }
/*     */ 
/*     */   public void setCustomerTrxId(Long customerTrxId) {
/*  61 */     this.customerTrxId = customerTrxId;
/*     */   }
/*     */ 
/*     */   public Long getCustomerTrxIdRef() {
/*  65 */     return this.customerTrxIdRef;
/*     */   }
/*     */ 
/*     */   public void setCustomerTrxIdRef(Long customerTrxIdRef) {
/*  69 */     this.customerTrxIdRef = customerTrxIdRef;
/*     */   }
/*     */ 
/*     */   public Long getTransactionId() {
/*  73 */     return this.transactionId;
/*     */   }
/*     */ 
/*     */   public void setTransactionId(Long transactionId) {
/*  77 */     this.transactionId = transactionId;
/*     */   }
/*     */ 
/*     */   public Integer getVersao() {
/*  81 */     return this.versao;
/*     */   }
/*     */ 
/*     */   public void setVersao(Integer versao) {
/*  85 */     this.versao = versao;
/*     */   }
/*     */ 
/*     */   public String getChave() {
/*  89 */     return this.chave;
/*     */   }
/*     */ 
/*     */   public void setChave(String chave) {
/*  93 */     this.chave = chave;
/*     */   }
/*     */ 
/*     */   public String getCnpj() {
/*  97 */     return this.cnpj;
/*     */   }
/*     */ 
/*     */   public void setCnpj(String cnpj) {
/* 101 */     this.cnpj = cnpj;
/*     */   }
/*     */ 
/*     */   public String getIe() {
/* 105 */     return this.ie;
/*     */   }
/*     */ 
/*     */   public void setIe(String ie) {
/* 109 */     this.ie = ie;
/*     */   }
/*     */ 
/*     */   public String getCodManifestacao() {
/* 113 */     return this.codManifestacao;
/*     */   }
/*     */ 
/*     */   public void setCodManifestacao(String codManifestacao) {
/* 117 */     this.codManifestacao = codManifestacao;
/*     */   }
/*     */ 
/*     */   public String getJustificativa() {
/* 121 */     return this.justificativa;
/*     */   }
/*     */ 
/*     */   public void setJustificativa(String justificativa) {
/* 125 */     this.justificativa = justificativa;
/*     */   }
/*     */ 
/*     */   public Date getDataHoraEnv() {
/* 129 */     return this.dataHoraEnv;
/*     */   }
/*     */ 
/*     */   public void setDataHoraEnv(Date dataHoraEnv) {
/* 133 */     this.dataHoraEnv = dataHoraEnv;
/*     */   }
/*     */ 
/*     */   public static long getSerialversionuid() {
/* 137 */     return 1L;
/*     */   }
/*     */ 
/*     */   public String getDocNum() {
/* 141 */     if (this.customerTrxId != null) {
/* 142 */       this.docNum = this.customerTrxId.toString();
/*     */     }
/* 144 */     return this.docNum;
/*     */   }
/*     */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.ManifestacaoNfe
 * JD-Core Version:    0.6.0
 */