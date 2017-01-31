/*    */ package br.com.nfx.model.nfe;
/*    */ 

/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_cana_deducao")
/*    */ @NamedQuery(name="NfeCanaDeducao.findByTrxId", query="from NfeCanaDeducao cd where cd.customerTrxId = :customerTrxId ")
/*    */ public class NfeCanaDeducao extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Id
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="S_CANA_XDED")
/*    */   private String sCanaXded;
/*    */ 
/*    */   @Column(name="N_CANA_VDED")
/*    */   private BigDecimal nCanaVded;
/*    */ 
/*    */   public Long getCustomerTrxId()
/*    */   {
/* 31 */     return this.customerTrxId;
/*    */   }
/*    */ 
/*    */   public void setCustomerTrxId(Long customerTrxId) {
/* 35 */     this.customerTrxId = customerTrxId;
/*    */   }
/*    */ 
/*    */   public String getsCanaXded() {
/* 39 */     return this.sCanaXded;
/*    */   }
/*    */ 
/*    */   public void setsCanaXded(String sCanaXded) {
/* 43 */     this.sCanaXded = sCanaXded;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnCanaVded() {
/* 47 */     return this.nCanaVded;
/*    */   }
/*    */ 
/*    */   public void setnCanaVded(BigDecimal nCanaVded) {
/* 51 */     this.nCanaVded = nCanaVded;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeCanaDeducao
 * JD-Core Version:    0.6.0
 */