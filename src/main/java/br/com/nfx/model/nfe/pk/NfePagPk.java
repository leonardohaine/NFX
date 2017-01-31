/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfePagPk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="N_NITEM_PAG")
/*    */   private Long nNitemPag;
/*    */ 
/*    */   public Long getCustomerTrxId()
/*    */   {
/* 22 */     return this.customerTrxId;
/*    */   }
/*    */ 
/*    */   public void setCustomerTrxId(Long customerTrxId) {
/* 26 */     this.customerTrxId = customerTrxId;
/*    */   }
/*    */ 
/*    */   public Long getnNitemPag() {
/* 30 */     return this.nNitemPag;
/*    */   }
/*    */ 
/*    */   public void setnNitemPag(Long nNitemPag) {
/* 34 */     this.nNitemPag = nNitemPag;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfePagPk
 * JD-Core Version:    0.6.0
 */