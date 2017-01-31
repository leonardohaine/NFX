/*    */ package br.com.nfx.model.nfe;
/*    */ 


/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemArmaPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_item_arma")
/*    */ @NamedQuery(name="NfeItemArma.findByTrxId", query="select ia from NfeItemArma ia where ia.nfeItemArmaPk.customerTrxId = :customerTrxId ")
/*    */ public class NfeItemArma extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeItemArmaPk nfeItemArmaPk;
/*    */ 
/*    */   @Column(name="N_TPARMA")
/*    */   private Long nTparma;
/*    */ 
/*    */   @Column(name="S_NCANO")
/*    */   private String sNcano;
/*    */ 
/*    */   @Column(name="S_DESCR")
/*    */   private String sDescr;
/*    */ 
/*    */   public NfeItemArmaPk getNfeItemArmaPk()
/*    */   {
/* 33 */     return this.nfeItemArmaPk;
/*    */   }
/*    */ 
/*    */   public void setNfeItemArmaPk(NfeItemArmaPk nfeItemArmaPk) {
/* 37 */     this.nfeItemArmaPk = nfeItemArmaPk;
/*    */   }
/*    */ 
/*    */   public Long getnTparma() {
/* 41 */     return this.nTparma;
/*    */   }
/*    */ 
/*    */   public void setnTparma(Long nTparma) {
/* 45 */     this.nTparma = nTparma;
/*    */   }
/*    */ 
/*    */   public String getsNcano() {
/* 49 */     return this.sNcano;
/*    */   }
/*    */ 
/*    */   public void setsNcano(String sNcano) {
/* 53 */     this.sNcano = sNcano;
/*    */   }
/*    */ 
/*    */   public String getsDescr() {
/* 57 */     return this.sDescr;
/*    */   }
/*    */ 
/*    */   public void setsDescr(String sDescr) {
/* 61 */     this.sDescr = sDescr;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemArma
 * JD-Core Version:    0.6.0
 */