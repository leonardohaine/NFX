/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeRefPk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="N_REFNFE")
/*    */   private String nRefnfe;
/*    */ 
/*    */   @Column(name="N_NNF")
/*    */   private Integer nNnf;
/*    */ 
/*    */   @Column(name="N_PR_NNF")
/*    */   private Integer nPrNnf;
/*    */ 
/*    */   @Column(name="N_CF_NECF")
/*    */   private Integer nCfNecf;
/*    */ 
/*    */   public Long getCustomerTrxId()
/*    */   {
/* 30 */     return this.customerTrxId;
/*    */   }
/*    */ 
/*    */   public void setCustomerTrxId(Long customerTrxId) {
/* 34 */     this.customerTrxId = customerTrxId;
/*    */   }
/*    */ 
/*    */   public String getnRefnfe() {
/* 38 */     return this.nRefnfe;
/*    */   }
/*    */ 
/*    */   public void setnRefnfe(String nRefnfe) {
/* 42 */     this.nRefnfe = nRefnfe;
/*    */   }
/*    */ 
/*    */   public Integer getnNnf() {
/* 46 */     return this.nNnf;
/*    */   }
/*    */ 
/*    */   public void setnNnf(Integer nNnf) {
/* 50 */     this.nNnf = nNnf;
/*    */   }
/*    */ 
/*    */   public Integer getnPrNnf() {
/* 54 */     return this.nPrNnf;
/*    */   }
/*    */ 
/*    */   public void setnPrNnf(Integer nPrNnf) {
/* 58 */     this.nPrNnf = nPrNnf;
/*    */   }
/*    */ 
/*    */   public Integer getnCfNecf() {
/* 62 */     return this.nCfNecf;
/*    */   }
/*    */ 
/*    */   public void setnCfNecf(Integer nCfNecf) {
/* 66 */     this.nCfNecf = nCfNecf;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeRefPk
 * JD-Core Version:    0.6.0
 */