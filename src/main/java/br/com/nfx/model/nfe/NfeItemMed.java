/*    */ package br.com.nfx.model.nfe;
/*    */ 


/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemMedPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_item_med")
/*    */ @NamedQuery(name="NfeItemMed.findByTrxId", query="select im from NfeItemMed im where im.nfeItemMedPk.customerTrxId = :customerTrxId ")
/*    */ public class NfeItemMed extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeItemMedPk nfeItemMedPk;
/*    */ 
/*    */   @Column(name="N_QLOTE")
/*    */   private Integer nQlote;
/*    */ 
/*    */   @Column(name="N_DFAB")
/*    */   private Date nDfab;
/*    */ 
/*    */   @Column(name="N_DVAL")
/*    */   private Date nDval;
/*    */ 
/*    */   @Column(name="N_VPMC")
/*    */   private BigDecimal nVpmc;
/*    */ 
/*    */   public NfeItemMedPk getNfeItemMedPk()
/*    */   {
/* 38 */     return this.nfeItemMedPk;
/*    */   }
/*    */ 
/*    */   public void setNfeItemMedPk(NfeItemMedPk nfeItemMedPk) {
/* 42 */     this.nfeItemMedPk = nfeItemMedPk;
/*    */   }
/*    */ 
/*    */   public Integer getnQlote() {
/* 46 */     return this.nQlote;
/*    */   }
/*    */ 
/*    */   public void setnQlote(Integer nQlote) {
/* 50 */     this.nQlote = nQlote;
/*    */   }
/*    */ 
/*    */   public Date getnDfab() {
/* 54 */     return this.nDfab;
/*    */   }
/*    */ 
/*    */   public void setnDfab(Date nDfab) {
/* 58 */     this.nDfab = nDfab;
/*    */   }
/*    */ 
/*    */   public Date getnDval() {
/* 62 */     return this.nDval;
/*    */   }
/*    */ 
/*    */   public void setnDval(Date nDval) {
/* 66 */     this.nDval = nDval;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnVpmc() {
/* 70 */     return this.nVpmc;
/*    */   }
/*    */ 
/*    */   public void setnVpmc(BigDecimal nVpmc) {
/* 74 */     this.nVpmc = nVpmc;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemMed
 * JD-Core Version:    0.6.0
 */