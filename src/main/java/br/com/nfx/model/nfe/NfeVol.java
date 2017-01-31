/*     */ package br.com.nfx.model.nfe;
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;

/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeVolPk;
import br.com.nfx.util.EntityBase;

/*     */ 

/*     */ 
/*     */ @Entity
/*     */ @Table(name="nfe_vol")
/*     */ @NamedQuery(name="NfeVol.findByTrxId", query="select v from NfeVol v where v.nfeVolPk.customerTrxId = :customerTrxId ")
/*     */ public class NfeVol extends EntityBase
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */ 
/*     */   @EmbeddedId
/*     */   protected NfeVolPk nfeVolPk;
/*     */ 
/*     */   @Column(name="CUSTOMER_TRX_ID", updatable=false, insertable=false)
/*     */   private Long customerTrxId;
/*     */ 
/*     */   @Column(name="N_QVOL")
/*     */   private Long nQvol;
/*     */ 
/*     */   @Column(name="S_ESP")
/*     */   private String sEsp;
/*     */ 
/*     */   @Column(name="S_MARCA")
/*     */   private String sMarca;
/*     */ 
/*     */   @Column(name="S_NVOL", updatable=false, insertable=false)
/*     */   private String sNvol;
/*     */ 
/*     */   @Column(name="N_PESOL")
/*     */   private BigDecimal nPesol;
/*     */ 
/*     */   @Column(name="N_PESOB")
/*     */   private BigDecimal nPesob;
/*     */ 
/*     */   public NfeVolPk getNfeVolPk()
/*     */   {
/*  46 */     return this.nfeVolPk;
/*     */   }
/*     */ 
/*     */   public void setNfeVolPk(NfeVolPk nfeVolPk) {
/*  50 */     this.nfeVolPk = nfeVolPk;
/*     */   }
/*     */ 
/*     */   public Long getCustomerTrxId() {
/*  54 */     return this.customerTrxId;
/*     */   }
/*     */ 
/*     */   public void setCustomerTrxId(Long customerTrxId) {
/*  58 */     this.customerTrxId = customerTrxId;
/*     */   }
/*     */ 
/*     */   public Long getnQvol() {
/*  62 */     return this.nQvol;
/*     */   }
/*     */ 
/*     */   public void setnQvol(Long nQvol) {
/*  66 */     this.nQvol = nQvol;
/*     */   }
/*     */ 
/*     */   public String getsEsp() {
/*  70 */     return this.sEsp;
/*     */   }
/*     */ 
/*     */   public void setsEsp(String sEsp) {
/*  74 */     this.sEsp = sEsp;
/*     */   }
/*     */ 
/*     */   public String getsMarca() {
/*  78 */     return this.sMarca;
/*     */   }
/*     */ 
/*     */   public void setsMarca(String sMarca) {
/*  82 */     this.sMarca = sMarca;
/*     */   }
/*     */ 
/*     */   public String getsNvol() {
/*  86 */     return this.sNvol;
/*     */   }
/*     */ 
/*     */   public void setsNvol(String sNvol) {
/*  90 */     this.sNvol = sNvol;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnPesol() {
/*  94 */     return this.nPesol;
/*     */   }
/*     */ 
/*     */   public void setnPesol(BigDecimal nPesol) {
/*  98 */     this.nPesol = nPesol;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnPesob() {
/* 102 */     return this.nPesob;
/*     */   }
/*     */ 
/*     */   public void setnPesob(BigDecimal nPesob) {
/* 106 */     this.nPesob = nPesob;
/*     */   }
/*     */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeVol
 * JD-Core Version:    0.6.0
 */