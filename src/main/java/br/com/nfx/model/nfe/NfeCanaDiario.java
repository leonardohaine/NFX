/*    */ package br.com.nfx.model.nfe;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_cana_diario")
/*    */ @NamedQuery(name="NfeCanaDiario.findByTrxId", query="select cd from NfeCanaDiario cd where cd.customerTrxId = :customerTrxId ")
/*    */ public class NfeCanaDiario extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Id
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="N_CANA_DIA")
/*    */   private Integer nCanaDia;
/*    */ 
/*    */   @Column(name="N_CANA_QTDE")
/*    */   private Long nCanaQtde;
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
/*    */   public Integer getnCanaDia() {
/* 38 */     return this.nCanaDia;
/*    */   }
/*    */ 
/*    */   public void setnCanaDia(Integer nCanaDia) {
/* 42 */     this.nCanaDia = nCanaDia;
/*    */   }
/*    */ 
/*    */   public Long getnCanaQtde() {
/* 46 */     return this.nCanaQtde;
/*    */   }
/*    */ 
/*    */   public void setnCanaQtde(Long nCanaQtde) {
/* 50 */     this.nCanaQtde = nCanaQtde;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeCanaDiario
 * JD-Core Version:    0.6.0
 */