/*    */ package br.com.nfx.model.nfe;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeAutPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_aut")
/*    */ @NamedQuery(name="NfeAut.findByTrxId", query="from NfeAut a where a.nfeAutPk.customerTrxId = :customerTrxId ")
/*    */ public class NfeAut extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeAutPk nfeAutPk;
/*    */ 
/*    */   public NfeAutPk getNfeAutPk()
/*    */   {
/* 24 */     return this.nfeAutPk;
/*    */   }
/*    */ 
/*    */   public void setNfeAutPk(NfeAutPk nfeAutPk) {
/* 28 */     this.nfeAutPk = nfeAutPk;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeAut
 * JD-Core Version:    0.6.0
 */