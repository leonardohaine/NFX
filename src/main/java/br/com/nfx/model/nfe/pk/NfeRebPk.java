/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeRebPk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="S_PLACA")
/*    */   private String sPlaca;
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
/*    */   public String getsPlaca() {
/* 29 */     return this.sPlaca;
/*    */   }
/*    */ 
/*    */   public void setsPlaca(String sPlaca) {
/* 33 */     this.sPlaca = sPlaca;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeRebPk
 * JD-Core Version:    0.6.0
 */