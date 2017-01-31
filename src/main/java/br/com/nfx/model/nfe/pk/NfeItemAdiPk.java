/*    */ package br.com.nfx.model.nfe.pk;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Embeddable
/*    */ public class NfeItemAdiPk extends EntityBase
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
/*    */   @Column(name="S_NDI")
/*    */   private String sNdi;
/*    */ 
/*    */   @Column(name="N_NADICAO")
/*    */   private Integer nNadicao;
/*    */ 
/*    */   public Long getCustomerTrxId()
/*    */   {
/* 27 */     return this.customerTrxId;
/*    */   }
/*    */ 
/*    */   public void setCustomerTrxId(Long customerTrxId) {
/* 31 */     this.customerTrxId = customerTrxId;
/*    */   }
/*    */ 
/*    */   public Long getnNitem() {
/* 35 */     return this.nNitem;
/*    */   }
/*    */ 
/*    */   public void setnNitem(Long nNitem) {
/* 39 */     this.nNitem = nNitem;
/*    */   }
/*    */ 
/*    */   public Integer getnNadicao() {
/* 43 */     return this.nNadicao;
/*    */   }
/*    */ 
/*    */   public void setnNadicao(Integer nNadicao) {
/* 47 */     this.nNadicao = nNadicao;
/*    */   }
/*    */ 
/*    */   public String getsNdi() {
/* 51 */     return this.sNdi;
/*    */   }
/*    */ 
/*    */   public void setsNdi(String sNdi) {
/* 55 */     this.sNdi = sNdi;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeItemAdiPk
 * JD-Core Version:    0.6.0
 */