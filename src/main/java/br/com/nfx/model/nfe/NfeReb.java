/*    */ package br.com.nfx.model.nfe;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeRebPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_reb")
/*    */ @NamedQuery(name="NfeReb.findByTrxId", query="select r from NfeReb r where r.nfeRebPk.customerTrxId = :customerTrxId ")
/*    */ public class NfeReb extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeRebPk nfeRebPk;
/*    */ 
/*    */   @Column(name="S_UF")
/*    */   private String sUf;
/*    */ 
/*    */   @Column(name="S_RNTC")
/*    */   private String sRntc;
/*    */ 
/*    */   public NfeRebPk getNfeRebPk()
/*    */   {
/* 30 */     return this.nfeRebPk;
/*    */   }
/*    */ 
/*    */   public void setNfeRebPk(NfeRebPk nfeRebPk) {
/* 34 */     this.nfeRebPk = nfeRebPk;
/*    */   }
/*    */ 
/*    */   public String getsUf() {
/* 38 */     return this.sUf;
/*    */   }
/*    */ 
/*    */   public void setsUf(String sUf) {
/* 42 */     this.sUf = sUf;
/*    */   }
/*    */ 
/*    */   public String getsRntc() {
/* 46 */     return this.sRntc;
/*    */   }
/*    */ 
/*    */   public void setsRntc(String sRntc) {
/* 50 */     this.sRntc = sRntc;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeReb
 * JD-Core Version:    0.6.0
 */