/*     */ package br.com.nfx.model.nfe;
/*     */ 


/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;

/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemCombPk;
import br.com.nfx.util.EntityBase;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="nfe_item_comb")
/*     */ @NamedQuery(name="NfeItemComb.findByTrxId", query="select ic from NfeItemComb ic where ic.nfeItemCombPk.customerTrxId = :customerTrxId ")
/*     */ public class NfeItemComb extends EntityBase
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */ 
/*     */   @EmbeddedId
/*     */   private NfeItemCombPk nfeItemCombPk;
/*     */ 
/*     */   @Column(name="N_PMIXGN")
/*     */   private BigDecimal nPmixgn;
/*     */ 
/*     */   @Column(name="N_CODIF")
/*     */   private BigDecimal nCodif;
/*     */ 
/*     */   @Column(name="N_QTEMP")
/*     */   private BigDecimal nQtemp;
/*     */ 
/*     */   @Column(name="S_UFCONS")
/*     */   private String sUfcons;
/*     */ 
/*     */   @Column(name="N_QBCPROD")
/*     */   private BigDecimal nQbcprod;
/*     */ 
/*     */   @Column(name="N_VALIQPROD")
/*     */   private BigDecimal nValiqprod;
/*     */ 
/*     */   @Column(name="N_VCIDE")
/*     */   private BigDecimal nVcide;
/*     */ 
/*     */   @Column(name="N_BICO")
/*     */   private BigDecimal nBico;
/*     */ 
/*     */   @Column(name="N_BOMBA")
/*     */   private BigDecimal nBomba;
/*     */ 
/*     */   @Column(name="N_TANQUE")
/*     */   private BigDecimal nTanque;
/*     */ 
/*     */   @Column(name="N_VENCINI")
/*     */   private BigDecimal nVencini;
/*     */ 
/*     */   @Column(name="N_VENCFIN")
/*     */   private BigDecimal nVencfin;
/*     */ 
/*     */   public NfeItemCombPk getNfeItemCombPk()
/*     */   {
/*  61 */     return this.nfeItemCombPk;
/*     */   }
/*     */ 
/*     */   public void setNfeItemCombPk(NfeItemCombPk nfeItemCombPk) {
/*  65 */     this.nfeItemCombPk = nfeItemCombPk;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnCodif() {
/*  69 */     return this.nCodif;
/*     */   }
/*     */ 
/*     */   public void setnCodif(BigDecimal nCodif) {
/*  73 */     this.nCodif = nCodif;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnQtemp() {
/*  77 */     return this.nQtemp;
/*     */   }
/*     */ 
/*     */   public void setnQtemp(BigDecimal nQtemp) {
/*  81 */     this.nQtemp = nQtemp;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnQbcprod() {
/*  85 */     return this.nQbcprod;
/*     */   }
/*     */ 
/*     */   public void setnQbcprod(BigDecimal nQbcprod) {
/*  89 */     this.nQbcprod = nQbcprod;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnValiqprod() {
/*  93 */     return this.nValiqprod;
/*     */   }
/*     */ 
/*     */   public void setnValiqprod(BigDecimal nValiqprod) {
/*  97 */     this.nValiqprod = nValiqprod;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnVcide() {
/* 101 */     return this.nVcide;
/*     */   }
/*     */ 
/*     */   public void setnVcide(BigDecimal nVcide) {
/* 105 */     this.nVcide = nVcide;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnPmixgn() {
/* 109 */     return this.nPmixgn;
/*     */   }
/*     */ 
/*     */   public void setnPmixgn(BigDecimal nPmixgn) {
/* 113 */     this.nPmixgn = nPmixgn;
/*     */   }
/*     */ 
/*     */   public String getsUfcons() {
/* 117 */     return this.sUfcons;
/*     */   }
/*     */ 
/*     */   public void setsUfcons(String sUfcons) {
/* 121 */     this.sUfcons = sUfcons;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnBico() {
/* 125 */     return this.nBico;
/*     */   }
/*     */ 
/*     */   public void setnBico(BigDecimal nBico) {
/* 129 */     this.nBico = nBico;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnBomba() {
/* 133 */     return this.nBomba;
/*     */   }
/*     */ 
/*     */   public void setnBomba(BigDecimal nBomba) {
/* 137 */     this.nBomba = nBomba;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnTanque() {
/* 141 */     return this.nTanque;
/*     */   }
/*     */ 
/*     */   public void setnTanque(BigDecimal nTanque) {
/* 145 */     this.nTanque = nTanque;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnVencini() {
/* 149 */     return this.nVencini;
/*     */   }
/*     */ 
/*     */   public void setnVencini(BigDecimal nVencini) {
/* 153 */     this.nVencini = nVencini;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnVencfin() {
/* 157 */     return this.nVencfin;
/*     */   }
/*     */ 
/*     */   public void setnVencfin(BigDecimal nVencfin) {
/* 161 */     this.nVencfin = nVencfin;
/*     */   }
/*     */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemComb
 * JD-Core Version:    0.6.0
 */