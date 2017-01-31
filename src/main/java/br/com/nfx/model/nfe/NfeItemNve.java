/*    */ package br.com.nfx.model.nfe;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemNvePk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_item_nve")
/*    */ @NamedQuery(name="NfeItemNve.findByTrxId", query="select d from NfeItemNve d where d.nfeItemNvePk.customerTrxId = :customerTrxId ")
/*    */ public class NfeItemNve extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeItemNvePk nfeItemNvePk;
/*    */ 
/*    */   public NfeItemNvePk getNfeItemNvePk()
/*    */   {
/* 24 */     return this.nfeItemNvePk;
/*    */   }
/*    */ 
/*    */   public void setNfeItemNvePk(NfeItemNvePk nfeItemNvePk) {
/* 28 */     this.nfeItemNvePk = nfeItemNvePk;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemNve
 * JD-Core Version:    0.6.0
 */