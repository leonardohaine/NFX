/*     */ package br.com.nfx.model.nfe;
/*     */ 

/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;

/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemDIPk;
import br.com.nfx.util.EntityBase;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="nfe_item_di")
/*     */ @NamedQuery(name="NfeItemDI.findByTrxId", query="select d from NfeItemDI d where d.nfeItemDIPk.customerTrxId = :customerTrxId ")
/*     */ public class NfeItemDI extends EntityBase
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */ 
/*     */   @EmbeddedId
/*     */   private NfeItemDIPk nfeItemDIPk;
/*     */ 
/*     */   @Column(name="D_DDI")
/*     */   private Date dDdi;
/*     */ 
/*     */   @Column(name="S_XLOCDESEMB")
/*     */   private String sXlocdesemb;
/*     */ 
/*     */   @Column(name="S_UFDESEMB")
/*     */   private String sUfdesemb;
/*     */ 
/*     */   @Column(name="D_DDESEMB")
/*     */   private Date dDdesemb;
/*     */ 
/*     */   @Column(name="N_TPVIATRANSP")
/*     */   private Integer nTpviatransp;
/*     */ 
/*     */   @Column(name="N_VAFRMM")
/*     */   private BigDecimal nVafrmm;
/*     */ 
/*     */   @Column(name="N_TPINTERMEDIO")
/*     */   private Integer nTpintermedio;
/*     */ 
/*     */   @Column(name="S_CNPJ")
/*     */   private String sCnpj;
/*     */ 
/*     */   @Column(name="S_UFTERCEIRO")
/*     */   private String sUfterceiro;
/*     */ 
/*     */   @Column(name="S_CEXPORTADOR")
/*     */   private String sCexportador;
/*     */ 
/*     */   public NfeItemDIPk getNfeItemDIPk()
/*     */   {
/*  56 */     return this.nfeItemDIPk;
/*     */   }
/*     */ 
/*     */   public void setNfeItemDIPk(NfeItemDIPk nfeItemDIPk) {
/*  60 */     this.nfeItemDIPk = nfeItemDIPk;
/*     */   }
/*     */ 
/*     */   public String getsXlocdesemb() {
/*  64 */     return this.sXlocdesemb;
/*     */   }
/*     */ 
/*     */   public void setsXlocdesemb(String sXlocdesemb) {
/*  68 */     this.sXlocdesemb = sXlocdesemb;
/*     */   }
/*     */ 
/*     */   public String getsUfdesemb() {
/*  72 */     return this.sUfdesemb;
/*     */   }
/*     */ 
/*     */   public void setsUfdesemb(String sUfdesemb) {
/*  76 */     this.sUfdesemb = sUfdesemb;
/*     */   }
/*     */ 
/*     */   public String getsCexportador() {
/*  80 */     return this.sCexportador;
/*     */   }
/*     */ 
/*     */   public void setsCexportador(String sCexportador) {
/*  84 */     this.sCexportador = sCexportador;
/*     */   }
/*     */ 
/*     */   public Date getdDdi() {
/*  88 */     return this.dDdi;
/*     */   }
/*     */ 
/*     */   public void setdDdi(Date dDdi) {
/*  92 */     this.dDdi = dDdi;
/*     */   }
/*     */ 
/*     */   public Date getdDdesemb() {
/*  96 */     return this.dDdesemb;
/*     */   }
/*     */ 
/*     */   public void setdDdesemb(Date dDdesemb) {
/* 100 */     this.dDdesemb = dDdesemb;
/*     */   }
/*     */ 
/*     */   public Integer getnTpviatransp() {
/* 104 */     return this.nTpviatransp;
/*     */   }
/*     */ 
/*     */   public void setnTpviatransp(Integer nTpviatransp) {
/* 108 */     this.nTpviatransp = nTpviatransp;
/*     */   }
/*     */ 
/*     */   public BigDecimal getnVafrmm() {
/* 112 */     return this.nVafrmm;
/*     */   }
/*     */ 
/*     */   public void setnVafrmm(BigDecimal nVafrmm) {
/* 116 */     this.nVafrmm = nVafrmm;
/*     */   }
/*     */ 
/*     */   public Integer getnTpintermedio() {
/* 120 */     return this.nTpintermedio;
/*     */   }
/*     */ 
/*     */   public void setnTpintermedio(Integer nTpintermedio) {
/* 124 */     this.nTpintermedio = nTpintermedio;
/*     */   }
/*     */ 
/*     */   public String getsCnpj() {
/* 128 */     return this.sCnpj;
/*     */   }
/*     */ 
/*     */   public void setsCnpj(String sCnpj) {
/* 132 */     this.sCnpj = sCnpj;
/*     */   }
/*     */ 
/*     */   public String getsUfterceiro() {
/* 136 */     return this.sUfterceiro;
/*     */   }
/*     */ 
/*     */   public void setsUfterceiro(String sUfterceiro) {
/* 140 */     this.sUfterceiro = sUfterceiro;
/*     */   }
/*     */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemDI
 * JD-Core Version:    0.6.0
 */