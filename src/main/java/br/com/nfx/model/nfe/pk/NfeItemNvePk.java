/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeItemNvePk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="N_NITEM")
/*    */   private Integer nNitem;
/*    */ 
/*    */   @Column(name="S_NVE")
/*    */   private String sNve;
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
/*    */   public Integer getnNitem() {
/* 33 */     return this.nNitem;
/*    */   }
/*    */ 
/*    */   public void setnNitem(Integer nNitem) {
/* 37 */     this.nNitem = nNitem;
/*    */   }
/*    */ 
/*    */   public String getsNve() {
/* 41 */     return this.sNve;
/*    */   }
/*    */ 
/*    */   public void setsNve(String sNve) {
/* 45 */     this.sNve = sNve;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeItemNvePk
 * JD-Core Version:    0.6.0
 */