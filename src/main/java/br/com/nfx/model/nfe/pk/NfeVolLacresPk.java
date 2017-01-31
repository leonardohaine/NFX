/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeVolLacresPk extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID", updatable=false, insertable=false)
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="N_NUMVOL", updatable=false, insertable=false)
/*    */   private String nNumVol;
/*    */ 
/*    */   @Column(name="S_NLACRE", updatable=false, insertable=false)
/*    */   private String sNlacre;
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
/*    */   public String getnNumVol() {
/* 33 */     return this.nNumVol;
/*    */   }
/*    */ 
/*    */   public void setnNumVol(String nNumVol) {
/* 37 */     this.nNumVol = nNumVol;
/*    */   }
/*    */ 
/*    */   public String getsNlacre() {
/* 41 */     return this.sNlacre;
/*    */   }
/*    */ 
/*    */   public void setsNlacre(String sNlacre) {
/* 45 */     this.sNlacre = sNlacre;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeVolLacresPk
 * JD-Core Version:    0.6.0
 */