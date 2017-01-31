/*    */ package br.com.nfx.model.nfe;
/*    */ 

/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeVolLacresPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_vol_lacres")
/*    */ @NamedQuery(name="NfeVolLacres.findByTrxId", query="select vl from NfeVolLacres vl where vl.nfeVolLacresPk.customerTrxId = :customerTrxId ")
/*    */ public class NfeVolLacres extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeVolLacresPk nfeVolLacresPk;
/*    */ 
/*    */   @Column(name="S_NVOL")
/*    */   private String sNvol;
/*    */ 
/*    */   public NfeVolLacresPk getNfeVolLacresPk()
/*    */   {
/* 27 */     return this.nfeVolLacresPk;
/*    */   }
/*    */ 
/*    */   public void setNfeVolLacresPk(NfeVolLacresPk nfeVolLacresPk) {
/* 31 */     this.nfeVolLacresPk = nfeVolLacresPk;
/*    */   }
/*    */ 
/*    */   public String getsNvol() {
/* 35 */     return this.sNvol;
/*    */   }
/*    */ 
/*    */   public void setsNvol(String sNvol) {
/* 39 */     this.sNvol = sNvol;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeVolLacres
 * JD-Core Version:    0.6.0
 */