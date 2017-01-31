/*    */ package br.com.nfx.model.nfe;
/*    */ 


/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemCampPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_campo")
/*    */ @NamedQuery(name="NfeItemCamp.findByTrxId", query="select ic from NfeItemCamp ic where ic.nfeItemCampPk.customerTrxId = :customerTrxId ")
/*    */ public class NfeItemCamp extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeItemCampPk nfeItemCampPk;
/*    */ 
/*    */   @Column(name="S_OC_XTEXTO")
/*    */   private String sOcxtexto;
/*    */ 
/*    */   @Column(name="S_OF_XTEXTO")
/*    */   private String sOfxtexto;
/*    */ 
/*    */   public NfeItemCampPk getNfeItemCampPk()
/*    */   {
/* 30 */     return this.nfeItemCampPk;
/*    */   }
/*    */ 
/*    */   public void setNfeItemCampPk(NfeItemCampPk nfeItemCampPk) {
/* 34 */     this.nfeItemCampPk = nfeItemCampPk;
/*    */   }
/*    */ 
/*    */   public String getsOcxtexto() {
/* 38 */     return this.sOcxtexto;
/*    */   }
/*    */ 
/*    */   public void setsOcxtexto(String sOcxtexto) {
/* 42 */     this.sOcxtexto = sOcxtexto;
/*    */   }
/*    */ 
/*    */   public String getsOfxtexto() {
/* 46 */     return this.sOfxtexto;
/*    */   }
/*    */ 
/*    */   public void setsOfxtexto(String sOfxtexto) {
/* 50 */     this.sOfxtexto = sOfxtexto;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemCamp
 * JD-Core Version:    0.6.0
 */