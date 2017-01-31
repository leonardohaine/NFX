/*     */ package br.com.nfx.model.nfe;
/*     */ 
/*     */ import java.io.Serializable;

/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.NamedQuery;
/*     */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemVeicPk;
import br.com.nfx.util.EntityBase;
/*     */ 
/*     */ @Entity
/*     */ @Table(name="nfe_item_veic")
/*     */ @NamedQuery(name="NfeItemVeic.findByTrxId", query="select v from NfeItemVeic v where v.nfeItemVeicPk.customerTrxId = :customerTrxId ")
/*     */ public class NfeItemVeic extends EntityBase
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */ 
/*     */   @EmbeddedId
/*     */   private NfeItemVeicPk nfeItemVeicPk;
/*     */ 
/*     */   @Column(name="N_TPOP")
/*     */   private Integer nTpop;
/*     */ 
/*     */   @Column(name="S_CHASSI")
/*     */   private String sChassi;
/*     */ 
/*     */   @Column(name="S_CCOR")
/*     */   private String sCcor;
/*     */ 
/*     */   @Column(name="S_XCOR")
/*     */   private String sXcor;
/*     */ 
/*     */   @Column(name="S_POT")
/*     */   private String sPot;
/*     */ 
/*     */   @Column(name="S_CILIN")
/*     */   private String sCilin;
/*     */ 
/*     */   @Column(name="S_PESOL")
/*     */   private String sPesol;
/*     */ 
/*     */   @Column(name="S_PESOB")
/*     */   private String sPesob;
/*     */ 
/*     */   @Column(name="S_NSERIE")
/*     */   private String sNserie;
/*     */ 
/*     */   @Column(name="S_TPCOMB")
/*     */   private String sTpcomb;
/*     */ 
/*     */   @Column(name="S_NMOTOR")
/*     */   private String sNmotor;
/*     */ 
/*     */   @Column(name="S_CMT")
/*     */   private String sCmt;
/*     */ 
/*     */   @Column(name="S_DIST")
/*     */   private String sDist;
/*     */ 
/*     */   @Column(name="N_ANOMOD")
/*     */   private Integer nAnomod;
/*     */ 
/*     */   @Column(name="N_ANOFAB")
/*     */   private Integer nAnofab;
/*     */ 
/*     */   @Column(name="S_TPPINT")
/*     */   private String sTppint;
/*     */ 
/*     */   @Column(name="N_TPVEIC")
/*     */   private Integer nTpveic;
/*     */ 
/*     */   @Column(name="N_ESPVEIC")
/*     */   private Integer nEspveic;
/*     */ 
/*     */   @Column(name="S_VIN")
/*     */   private String sVin;
/*     */ 
/*     */   @Column(name="N_CONDVEIC")
/*     */   private Integer nCondveic;
/*     */ 
/*     */   @Column(name="N_CMOD")
/*     */   private Integer nCmod;
/*     */ 
/*     */   @Column(name="N_CCORDENATRAN")
/*     */   private Integer nCcordenatran;
/*     */ 
/*     */   @Column(name="N_LOTA")
/*     */   private Integer nLota;
/*     */ 
/*     */   @Column(name="N_TPREST")
/*     */   private Integer nTprest;
/*     */ 
/*     */   public NfeItemVeicPk getNfeItemVeicPk()
/*     */   {
/*  96 */     return this.nfeItemVeicPk;
/*     */   }
/*     */ 
/*     */   public void setNfeItemVeicPk(NfeItemVeicPk nfeItemVeicPk) {
/* 100 */     this.nfeItemVeicPk = nfeItemVeicPk;
/*     */   }
/*     */ 
/*     */   public Integer getnTpop() {
/* 104 */     return this.nTpop;
/*     */   }
/*     */ 
/*     */   public void setnTpop(Integer nTpop) {
/* 108 */     this.nTpop = nTpop;
/*     */   }
/*     */ 
/*     */   public String getsChassi() {
/* 112 */     return this.sChassi;
/*     */   }
/*     */ 
/*     */   public void setsChassi(String sChassi) {
/* 116 */     this.sChassi = sChassi;
/*     */   }
/*     */ 
/*     */   public String getsCcor() {
/* 120 */     return this.sCcor;
/*     */   }
/*     */ 
/*     */   public void setsCcor(String sCcor) {
/* 124 */     this.sCcor = sCcor;
/*     */   }
/*     */ 
/*     */   public String getsXcor() {
/* 128 */     return this.sXcor;
/*     */   }
/*     */ 
/*     */   public void setsXcor(String sXcor) {
/* 132 */     this.sXcor = sXcor;
/*     */   }
/*     */ 
/*     */   public String getsPot() {
/* 136 */     return this.sPot;
/*     */   }
/*     */ 
/*     */   public void setsPot(String sPot) {
/* 140 */     this.sPot = sPot;
/*     */   }
/*     */ 
/*     */   public String getsCilin() {
/* 144 */     return this.sCilin;
/*     */   }
/*     */ 
/*     */   public void setsCilin(String sCilin) {
/* 148 */     this.sCilin = sCilin;
/*     */   }
/*     */ 
/*     */   public String getsPesol() {
/* 152 */     return this.sPesol;
/*     */   }
/*     */ 
/*     */   public void setsPesol(String sPesol) {
/* 156 */     this.sPesol = sPesol;
/*     */   }
/*     */ 
/*     */   public String getsPesob() {
/* 160 */     return this.sPesob;
/*     */   }
/*     */ 
/*     */   public void setsPesob(String sPesob) {
/* 164 */     this.sPesob = sPesob;
/*     */   }
/*     */ 
/*     */   public String getsNserie() {
/* 168 */     return this.sNserie;
/*     */   }
/*     */ 
/*     */   public void setsNserie(String sNserie) {
/* 172 */     this.sNserie = sNserie;
/*     */   }
/*     */ 
/*     */   public String getsTpcomb() {
/* 176 */     return this.sTpcomb;
/*     */   }
/*     */ 
/*     */   public void setsTpcomb(String sTpcomb) {
/* 180 */     this.sTpcomb = sTpcomb;
/*     */   }
/*     */ 
/*     */   public String getsNmotor() {
/* 184 */     return this.sNmotor;
/*     */   }
/*     */ 
/*     */   public void setsNmotor(String sNmotor) {
/* 188 */     this.sNmotor = sNmotor;
/*     */   }
/*     */ 
/*     */   public String getsCmt() {
/* 192 */     return this.sCmt;
/*     */   }
/*     */ 
/*     */   public void setsCmt(String sCmt) {
/* 196 */     this.sCmt = sCmt;
/*     */   }
/*     */ 
/*     */   public String getsDist() {
/* 200 */     return this.sDist;
/*     */   }
/*     */ 
/*     */   public void setsDist(String sDist) {
/* 204 */     this.sDist = sDist;
/*     */   }
/*     */ 
/*     */   public Integer getnAnomod() {
/* 208 */     return this.nAnomod;
/*     */   }
/*     */ 
/*     */   public void setnAnomod(Integer nAnomod) {
/* 212 */     this.nAnomod = nAnomod;
/*     */   }
/*     */ 
/*     */   public Integer getnAnofab() {
/* 216 */     return this.nAnofab;
/*     */   }
/*     */ 
/*     */   public void setnAnofab(Integer nAnofab) {
/* 220 */     this.nAnofab = nAnofab;
/*     */   }
/*     */ 
/*     */   public String getsTppint() {
/* 224 */     return this.sTppint;
/*     */   }
/*     */ 
/*     */   public void setsTppint(String sTppint) {
/* 228 */     this.sTppint = sTppint;
/*     */   }
/*     */ 
/*     */   public Integer getnTpveic() {
/* 232 */     return this.nTpveic;
/*     */   }
/*     */ 
/*     */   public void setnTpveic(Integer nTpveic) {
/* 236 */     this.nTpveic = nTpveic;
/*     */   }
/*     */ 
/*     */   public Integer getnEspveic() {
/* 240 */     return this.nEspveic;
/*     */   }
/*     */ 
/*     */   public void setnEspveic(Integer nEspveic) {
/* 244 */     this.nEspveic = nEspveic;
/*     */   }
/*     */ 
/*     */   public String getsVin() {
/* 248 */     return this.sVin;
/*     */   }
/*     */ 
/*     */   public void setsVin(String sVin) {
/* 252 */     this.sVin = sVin;
/*     */   }
/*     */ 
/*     */   public Integer getnCondveic() {
/* 256 */     return this.nCondveic;
/*     */   }
/*     */ 
/*     */   public void setnCondveic(Integer nCondveic) {
/* 260 */     this.nCondveic = nCondveic;
/*     */   }
/*     */ 
/*     */   public Integer getnCmod() {
/* 264 */     return this.nCmod;
/*     */   }
/*     */ 
/*     */   public void setnCmod(Integer nCmod) {
/* 268 */     this.nCmod = nCmod;
/*     */   }
/*     */ 
/*     */   public Integer getnCcordenatran() {
/* 272 */     return this.nCcordenatran;
/*     */   }
/*     */ 
/*     */   public void setnCcordenatran(Integer nCcordenatran) {
/* 276 */     this.nCcordenatran = nCcordenatran;
/*     */   }
/*     */ 
/*     */   public Integer getnLota() {
/* 280 */     return this.nLota;
/*     */   }
/*     */ 
/*     */   public void setnLota(Integer nLota) {
/* 284 */     this.nLota = nLota;
/*     */   }
/*     */ 
/*     */   public Integer getnTprest() {
/* 288 */     return this.nTprest;
/*     */   }
/*     */ 
/*     */   public void setnTprest(Integer nTprest) {
/* 292 */     this.nTprest = nTprest;
/*     */   }
/*     */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItemVeic
 * JD-Core Version:    0.6.0
 */