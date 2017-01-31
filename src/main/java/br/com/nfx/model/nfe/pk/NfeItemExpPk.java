/*    */ package br.com.nfx.model.nfe.pk;
/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;

/*    */ 

/*    */ 
/*    */ @Embeddable
/*    */ public class NfeItemExpPk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="N_NITEM")
/*    */   private Long nNitem;
/*    */ 
/*    */   @Column(name="N_SEQ")
/*    */   private Long nSeq;
/*    */ 
/*    */   public Long getCustomerTrxId()
/*    */   {
/* 25 */     return this.customerTrxId;
/*    */   }
/*    */ 
/*    */   public void setCustomerTrxId(Long customerTrxId) {
/* 29 */     this.customerTrxId = customerTrxId;
/*    */   }
/*    */ 
/*    */   public Long getnNitem() {
/* 33 */     return this.nNitem;
/*    */   }
/*    */ 
/*    */   public void setnNitem(Long nNitem) {
/* 37 */     this.nNitem = nNitem;
/*    */   }
/*    */ 
/*    */   public Long getnSeq() {
/* 41 */     return this.nSeq;
/*    */   }
/*    */ 
/*    */   public void setnSeq(Long nSeq) {
/* 45 */     this.nSeq = nSeq;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeItemExpPk
 * JD-Core Version:    0.6.0
 */