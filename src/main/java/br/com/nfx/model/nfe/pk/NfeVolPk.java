/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeVolPk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="N_NUMVOL")
/*    */   private String nNumVol;
/*    */ 
/*    */   public NfeVolPk()
/*    */   {
/*    */   }
/*    */ 
/*    */   public NfeVolPk(Long customerTrxId, String nNumVol)
/*    */   {
/* 24 */     this.customerTrxId = customerTrxId;
/* 25 */     this.nNumVol = nNumVol;
/*    */   }
/*    */ 
/*    */   public Long getCustomerTrxId() {
/* 29 */     return this.customerTrxId;
/*    */   }
/*    */ 
/*    */   public void setCustomerTrxId(Long customerTrxId) {
/* 33 */     this.customerTrxId = customerTrxId;
/*    */   }
/*    */ 
/*    */   public String getnNumVol() {
/* 37 */     return this.nNumVol;
/*    */   }
/*    */ 
/*    */   public void setsNvol(String nNumVol) {
/* 41 */     this.nNumVol = nNumVol;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeVolPk
 * JD-Core Version:    0.6.0
 */