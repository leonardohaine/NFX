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

import br.com.nfx.model.nfe.pk.NfeDupPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_dup")
/*    */ @NamedQuery(name="NfeDup.findByTrxId", query="select d from NfeDup d where d.nfeDupPk.customerTrxId = :customerTrxId order by d.nfeDupPk.sNfat, d.nfeDupPk.sNdup")
/*    */ public class NfeDup extends EntityBase
/*    */   implements Serializable, Comparable<NfeDup>
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeDupPk nfeDupPk;
/*    */ 
/*    */   @Column(name="D_DVENC")
/*    */   private Date dDvenc;
/*    */ 
/*    */   @Column(name="N_VDUP")
/*    */   private BigDecimal nVdup;
/*    */ 
/*    */   public NfeDupPk getNfeDupPk()
/*    */   {
/* 32 */     return this.nfeDupPk;
/*    */   }
/*    */ 
/*    */   public void setNfeDupPk(NfeDupPk nfeDupPk) {
/* 36 */     this.nfeDupPk = nfeDupPk;
/*    */   }
/*    */ 
/*    */   public Date getdDvenc() {
/* 40 */     return this.dDvenc;
/*    */   }
/*    */ 
/*    */   public void setdDvenc(Date dDvenc) {
/* 44 */     this.dDvenc = dDvenc;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnVdup() {
/* 48 */     return this.nVdup;
/*    */   }
/*    */ 
/*    */   public void setnVdup(BigDecimal nVdup) {
/* 52 */     this.nVdup = nVdup;
/*    */   }
/*    */ 
/*    */   public int compareTo(NfeDup that)
/*    */   {
/* 57 */     return this.nfeDupPk.compareTo(that.getNfeDupPk());
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeDup
 * JD-Core Version:    0.6.0
 */