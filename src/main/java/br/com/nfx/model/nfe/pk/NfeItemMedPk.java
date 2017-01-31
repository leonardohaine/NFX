/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeItemMedPk extends EntityBase
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
/*    */   @Column(name="S_NLOTE")
/*    */   private String sNlote;
/*    */ 
/*    */   public Long getCustomerTrxId()
/*    */   {
/* 24 */     return this.customerTrxId;
/*    */   }
/*    */ 
/*    */   public void setCustomerTrxId(Long customerTrxId) {
/* 28 */     this.customerTrxId = customerTrxId;
/*    */   }
/*    */ 
/*    */   public Long getnNitem() {
/* 32 */     return this.nNitem;
/*    */   }
/*    */ 
/*    */   public void setnNitem(Long nNitem) {
/* 36 */     this.nNitem = nNitem;
/*    */   }
/*    */ 
/*    */   public String getsNlote() {
/* 40 */     return this.sNlote;
/*    */   }
/*    */ 
/*    */   public void setsNlote(String sNlote) {
/* 44 */     this.sNlote = sNlote;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeItemMedPk
 * JD-Core Version:    0.6.0
 */