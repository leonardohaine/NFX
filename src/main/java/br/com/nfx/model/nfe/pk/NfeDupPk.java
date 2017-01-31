/*    */ package br.com.nfx.model.nfe.pk;
/*    */ import java.io.Serializable;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;

/*    */ import org.apache.commons.lang3.math.NumberUtils;

/*    */ 
/*    */ import com.google.common.collect.ComparisonChain;

import br.com.nfx.util.EntityBase;

/*    */ 
/*    */ @Embeddable
/*    */ public class NfeDupPk extends EntityBase
/*    */   implements Serializable, Comparable<NfeDupPk>
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @Column(name="CUSTOMER_TRX_ID")
/*    */   private Long customerTrxId;
/*    */ 
/*    */   @Column(name="S_NFAT")
/*    */   private String sNfat;
/*    */ 
/*    */   @Column(name="S_NDUP")
/*    */   private String sNdup;
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
/*    */   public String getsNfat() {
/* 35 */     return this.sNfat;
/*    */   }
/*    */ 
/*    */   public void setsNfat(String sNfat) {
/* 39 */     this.sNfat = sNfat;
/*    */   }
/*    */ 
/*    */   public String getsNdup() {
/* 43 */     return this.sNdup;
/*    */   }
/*    */ 
/*    */   public void setsNdup(String sNdup) {
/* 47 */     this.sNdup = sNdup;
/*    */   }
/*    */ 
/*    */   public boolean canSnfatAndSndupNumber() {
/* 51 */     return (NumberUtils.isNumber(this.sNfat)) && (NumberUtils.isNumber(this.sNdup));
/*    */   }
/*    */ 
/*    */   public int compareTo(NfeDupPk that)
/*    */   {
/* 56 */     int thisNumeroFatura = Integer.parseInt(this.sNfat);
/* 57 */     int thisNumeroDuplicata = Integer.parseInt(this.sNdup);
/*    */ 
/* 59 */     int thatNumeroFatura = Integer.parseInt(that.sNfat);
/* 60 */     int thatNumeroDuplicata = Integer.parseInt(that.sNdup);
/*    */ 
/* 62 */     return ComparisonChain.start().compare(thisNumeroFatura, thatNumeroFatura).compare(thisNumeroDuplicata, thatNumeroDuplicata).result();
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.pk.NfeDupPk
 * JD-Core Version:    0.6.0
 */