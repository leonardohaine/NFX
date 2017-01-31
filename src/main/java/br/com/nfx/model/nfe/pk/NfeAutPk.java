/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeAutPk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="S_CNPJ")
/*    */   private String sCnpj;
/*    */ 
/*    */   @Column(name="S_CPF")
/*    */   private String sCpf;
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
/*    */   public String getsCnpj() {
/* 33 */     return this.sCnpj;
/*    */   }
/*    */ 
/*    */   public void setsCnpj(String sCnpj) {
/* 37 */     this.sCnpj = sCnpj;
/*    */   }
/*    */ 
/*    */   public String getsCpf() {
/* 41 */     return this.sCpf;
/*    */   }
/*    */ 
/*    */   public void setsCpf(String sCpf) {
/* 45 */     this.sCpf = sCpf;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeAutPk
 * JD-Core Version:    0.6.0
 */