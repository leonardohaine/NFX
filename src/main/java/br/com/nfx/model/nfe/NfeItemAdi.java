/*    */ package br.com.nfx.model.nfe;
/*    */ 


/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;

/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.NamedQuery;
/*    */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemAdiPk;
import br.com.nfx.util.EntityBase;
/*    */ 
/*    */ @Entity
/*    */ @Table(name="nfe_item_adi")
/*    */ @NamedQuery(name="NfeItemAdi.findByTrxId", query="select d from NfeItemAdi d where d.nfeItemAdiPk.customerTrxId = :customerTrxId ")
/*    */ public class NfeItemAdi extends EntityBase
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */ 
/*    */   @EmbeddedId
/*    */   private NfeItemAdiPk nfeItemAdiPk;
/*    */ 
/*    */   @Column(name="N_NSEQADIC")
/*    */   private Integer nNseqadic;
/*    */ 
/*    */   @Column(name="S_CFABRICANTE")
/*    */   private String sCfabricante;
/*    */ 
/*    */   @Column(name="N_VDESCDI")
/*    */   private BigDecimal nVdescdi;
/*    */ 
/*    */   @Column(name="N_NDRAW")
/*    */   private BigDecimal nNdraw;
/*    */ 
/*    */   public NfeItemAdiPk getNfeItemAdiPk()
/*    */   {
/* 38 */     return this.nfeItemAdiPk;
/*    */   }
/*    */ 
/*    */   public void setNfeItemAdiPk(NfeItemAdiPk nfeItemAdiPk) {
/* 42 */     this.nfeItemAdiPk = nfeItemAdiPk;
/*    */   }
/*    */ 
/*    */   public Integer getnNseqadic() {
/* 46 */     return this.nNseqadic;
/*    */   }
/*    */ 
/*    */   public void setnNseqadic(Integer nNseqadic) {
/* 50 */     this.nNseqadic = nNseqadic;
/*    */   }
/*    */ 
/*    */   public String getsCfabricante() {
/* 54 */     return this.sCfabricante;
/*    */   }
/*    */ 
/*    */   public void setsCfabricante(String sCfabricante) {
/* 58 */     this.sCfabricante = sCfabricante;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnVdescdi() {
/* 62 */     return this.nVdescdi;
/*    */   }
/*    */ 
/*    */   public void setnVdescdi(BigDecimal nVdescdi) {
/* 66 */     this.nVdescdi = nVdescdi;
/*    */   }
/*    */ 
/*    */   public BigDecimal getnNdraw() {
/* 70 */     return this.nNdraw;
/*    */   }
/*    */ 
/*    */   public void setnNdraw(BigDecimal nNdraw) {
/* 74 */     this.nNdraw = nNdraw;
/*    */   }
/*    */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemAdi
 * JD-Core Version:    0.6.0
 */