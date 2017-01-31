/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeItemCampPk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="S_OC_XCAMPO")
/*    */   private String sOcxcampo;
/*    */ 
/*    */   @Column(name="S_OF_XCAMPO")
/*    */   private String sOfxcampo;
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
/*    */   public String getsOcxcampo() {
/* 32 */     return this.sOcxcampo;
/*    */   }
/*    */ 
/*    */   public void setsOcxcampo(String sOcxcampo) {
/* 36 */     this.sOcxcampo = sOcxcampo;
/*    */   }
/*    */ 
/*    */   public String getsOfxcampo() {
/* 40 */     return this.sOfxcampo;
/*    */   }
/*    */ 
/*    */   public void setsOfxcampo(String sOfxcampo) {
/* 44 */     this.sOfxcampo = sOfxcampo;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeItemCampPk
 * JD-Core Version:    0.6.0
 */