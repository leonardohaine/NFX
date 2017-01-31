/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeItemVeicPk extends EntityBase
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
/*    */   public Long getCustomerTrxId()
/*    */   {
/* 21 */     return this.customerTrxId;
/*    */   }
/*    */ 
/*    */   public void setCustomerTrxId(Long customerTrxId) {
/* 25 */     this.customerTrxId = customerTrxId;
/*    */   }
/*    */ 
/*    */   public Long getnNitem() {
/* 29 */     return this.nNitem;
/*    */   }
/*    */ 
/*    */   public void setnNitem(Long nNitem) {
/* 33 */     this.nNitem = nNitem;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeItemVeicPk
 * JD-Core Version:    0.6.0
 */