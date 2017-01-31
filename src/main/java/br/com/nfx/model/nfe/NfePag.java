/*    */ package br.com.nfx.model.nfe;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfePagPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_pag")
/*    */ @NamedQuery(name="NfePag.findByTrxId", query="from NfePag a where a.nfePagPk.customerTrxId = :customerTrxId ")
/*    */ public class NfePag extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfePagPk nfePagPk;
/*    */ 
/*    */   @Column(name="S_TPAG")
/*    */   private String sTpag;
/*    */ 
/*    */   @Column(name="N_VPAG")
/*    */   private BigDecimal nVpag;
/*    */ 
/*    */   @Column(name="N_TPINTEGRA")
/*    */   private BigDecimal nTpintegra;
/*    */ 
/*    */   @Column(name="S_CNPJ")
/*    */   private String sCnpj;
/*    */ 
/*    */   @Column(name="S_TBAND")
/*    */   private String sTband;
/*    */ 
/*    */   @Column(name="S_CAUT")
/*    */   private String sCaut;
/*    */ 
/*    */   public NfePagPk getNfePagPk()
/*    */   {
/* 44 */     return this.nfePagPk;
/*    */   }
/*    */ 
/*    */   public void setNfePagPk(NfePagPk nfePagPk) {
/* 48 */     this.nfePagPk = nfePagPk;
/*    */   }
/*    */ 
/*    */   public String getsTpag() {
/* 52 */     return this.sTpag;
/*    */   }
/*    */ 
/*    */   public void setsTpag(String sTpag) {
/* 56 */     this.sTpag = sTpag;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnVpag() {
/* 60 */     return this.nVpag;
/*    */   }
/*    */ 
/*    */   public void setnVpag(BigDecimal nVpag) {
/* 64 */     this.nVpag = nVpag;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnTpintegra() {
/* 68 */     return this.nTpintegra;
/*    */   }
/*    */ 
/*    */   public void setnTpintegra(BigDecimal nTpintegra) {
/* 72 */     this.nTpintegra = nTpintegra;
/*    */   }
/*    */ 
/*    */   public String getsCnpj() {
/* 76 */     return this.sCnpj;
/*    */   }
/*    */ 
/*    */   public void setsCnpj(String sCnpj) {
/* 80 */     this.sCnpj = sCnpj;
/*    */   }
/*    */ 
/*    */   public String getsTband() {
/* 84 */     return this.sTband;
/*    */   }
/*    */ 
/*    */   public void setsTband(String sTband) {
/* 88 */     this.sTband = sTband;
/*    */   }
/*    */ 
/*    */   public String getsCaut() {
/* 92 */     return this.sCaut;
/*    */   }
/*    */ 
/*    */   public void setsCaut(String sCaut) {
/* 96 */     this.sCaut = sCaut;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfePag
 * JD-Core Version:    0.6.0
 */