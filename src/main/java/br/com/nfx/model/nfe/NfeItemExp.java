/*    */ package br.com.nfx.model.nfe;
/*    */ 


/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemExpPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_item_exp")
/*    */ @NamedQuery(name="NfeItemExp.findByTrxId", query="from NfeItemExp a where a.nfeItemExpPk.customerTrxId = :customerTrxId ")
/*    */ public class NfeItemExp extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeItemExpPk nfeItemExpPk;
/*    */ 
/*    */   @Column(name="N_NDRAW")
/*    */   private BigDecimal nNdraw;
/*    */ 
/*    */   @Column(name="N_NRE")
/*    */   private BigDecimal nNre;
/*    */ 
/*    */   @Column(name="S_CHNFE")
/*    */   private String sChnfe;
/*    */ 
/*    */   @Column(name="N_QEXPORT")
/*    */   private BigDecimal nQexport;
/*    */ 
/*    */   public NfeItemExpPk getNfeItemExpPk()
/*    */   {
/* 38 */     return this.nfeItemExpPk;
/*    */   }
/*    */ 
/*    */   public void setNfeItemExpPk(NfeItemExpPk nfeItemExpPk) {
/* 42 */     this.nfeItemExpPk = nfeItemExpPk;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnNdraw() {
/* 46 */     return this.nNdraw;
/*    */   }
/*    */ 
/*    */   public void setnNdraw(BigDecimal nNdraw) {
/* 50 */     this.nNdraw = nNdraw;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnNre() {
/* 54 */     return this.nNre;
/*    */   }
/*    */ 
/*    */   public void setnNre(BigDecimal nNre) {
/* 58 */     this.nNre = nNre;
/*    */   }
/*    */ 
/*    */   public String getsChnfe() {
/* 62 */     return this.sChnfe;
/*    */   }
/*    */ 
/*    */   public void setsChnfe(String sChnfe) {
/* 66 */     this.sChnfe = sChnfe;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnQexport() {
/* 70 */     return this.nQexport;
/*    */   }
/*    */ 
/*    */   public void setnQexport(BigDecimal nQexport) {
/* 74 */     this.nQexport = nQexport;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemExp
 * JD-Core Version:    0.6.0
 */