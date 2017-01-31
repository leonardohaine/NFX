/*      */ package br.com.nfx.model.nfe;
/*      */ 

/*      */ import java.io.Serializable;
/*      */ import java.math.BigDecimal;

/*      */ import javax.persistence.Column;
/*      */ import javax.persistence.EmbeddedId;
/*      */ import javax.persistence.Entity;
/*      */ import javax.persistence.NamedQuery;
/*      */ import javax.persistence.Table;

import br.com.nfx.model.nfe.pk.NfeItemPk;
import br.com.nfx.util.EntityBase;
/*      */ 
/*      */ @Entity
/*      */ @Table(name="nfe_item")
/*      */ @NamedQuery(name="NfeItem.findByTrxId", query="select d from NfeItem d where d.nfeItemPk.customerTrxId = :customerTrxId ")
/*      */ public class NfeItem extends EntityBase
/*      */   implements Serializable
/*      */ {
/*      */   private static final long serialVersionUID = 1L;
/*      */ 
/*      */   @EmbeddedId
/*      */   private NfeItemPk nfeItemPk;
/*      */ 
/*      */   @Column(name="S_CPROD")
/*      */   private String sCprod;
/*      */ 
/*      */   @Column(name="S_CEAN")
/*      */   private String sCean;
/*      */ 
/*      */   @Column(name="S_XPROD")
/*      */   private String sXprod;
/*      */ 
/*      */   @Column(name="S_NCM")
/*      */   private String sNcm;
/*      */ 
/*      */   @Column(name="N_CEST")
/*      */   private BigDecimal nCest;
/*      */ 
/*      */   @Column(name="S_EXTIPI")
/*      */   private String sExtipi;
/*      */ 
/*      */   @Column(name="N_CFOP")
/*      */   private Integer nCfop;
/*      */ 
/*      */   @Column(name="S_UCOM")
/*      */   private String sUcom;
/*      */ 
/*      */   @Column(name="N_QCOM")
/*      */   private BigDecimal nQcom;
/*      */ 
/*      */   @Column(name="N_VUNCOM")
/*      */   private BigDecimal nVuncom;
/*      */ 
/*      */   @Column(name="N_VPROD")
/*      */   private BigDecimal nVprod;
/*      */ 
/*      */   @Column(name="S_CEANTRIB")
/*      */   private String sCeantrib;
/*      */ 
/*      */   @Column(name="S_UTRIB")
/*      */   private String sUtrib;
/*      */ 
/*      */   @Column(name="N_QTRIB")
/*      */   private BigDecimal nQtrib;
/*      */ 
/*      */   @Column(name="N_VUNTRIB")
/*      */   private BigDecimal nVuntrib;
/*      */ 
/*      */   @Column(name="N_VFRETE")
/*      */   private BigDecimal nVfrete;
/*      */ 
/*      */   @Column(name="N_VSEG")
/*      */   private BigDecimal nVseg;
/*      */ 
/*      */   @Column(name="N_VDESC")
/*      */   private BigDecimal nVdesc;
/*      */ 
/*      */   @Column(name="N_VOUTRO")
/*      */   private BigDecimal nVoutro;
/*      */ 
/*      */   @Column(name="N_INDTOT")
/*      */   private Integer nIndtot;
/*      */ 
/*      */   @Column(name="S_B2B_XPED")
/*      */   private String sB2bXped;
/*      */ 
/*      */   @Column(name="N_B2B_NITEMPED")
/*      */   private Integer nB2bNitemped;
/*      */ 
/*      */   @Column(name="S_NFCI")
/*      */   private String sNfci;
/*      */ 
/*      */   @Column(name="N_ICMS_ORIG")
/*      */   private Integer nIcmsOrig;
/*      */ 
/*      */   @Column(name="N_ICMS_CST")
/*      */   private Integer nIcmsCst;
/*      */ 
/*      */   @Column(name="N_ICMS_MODBC")
/*      */   private Integer nIcmsModbc;
/*      */ 
/*      */   @Column(name="N_ICMS_VBC")
/*      */   private BigDecimal nIcmsVbc;
/*      */ 
/*      */   @Column(name="N_ICMS_PICMS")
/*      */   private BigDecimal nIcmsPicms;
/*      */ 
/*      */   @Column(name="N_ICMS_VICMS")
/*      */   private BigDecimal nIcmsVicms;
/*      */ 
/*      */   @Column(name="N_ICMS_VICMSDESON")
/*      */   private BigDecimal nIcmsVicmsdeson;
/*      */ 
/*      */   @Column(name="N_ICMS_VICMSOP")
/*      */   private BigDecimal nIcmsVicmsop;
/*      */ 
/*      */   @Column(name="N_ICMS_PDIF")
/*      */   private BigDecimal nIcmsPdif;
/*      */ 
/*      */   @Column(name="N_ICMS_VICMSDIF")
/*      */   private BigDecimal nIcmsVicmsdif;
/*      */ 
/*      */   @Column(name="N_ICMS_MODBCST")
/*      */   private Integer nIcmsModbcst;
/*      */ 
/*      */   @Column(name="N_ICMS_PMVAST")
/*      */   private BigDecimal nIcmsPmvast;
/*      */ 
/*      */   @Column(name="N_ICMS_PREDBCST")
/*      */   private BigDecimal nIcmsPredbcst;
/*      */ 
/*      */   @Column(name="N_ICMS_VBCST")
/*      */   private BigDecimal nIcmsVbcst;
/*      */ 
/*      */   @Column(name="N_ICMS_PICMSST")
/*      */   private BigDecimal nIcmsPicmsst;
/*      */ 
/*      */   @Column(name="N_ICMS_VICMSST")
/*      */   private BigDecimal nIcmsVicmsst;
/*      */ 
/*      */   @Column(name="N_ICMS_PREDBC")
/*      */   private BigDecimal nIcmsPredbc;
/*      */ 
/*      */   @Column(name="S_ICMS_MOTDESICMS")
/*      */   private String sIcmsMotdesicms;
/*      */ 
/*      */   @Column(name="N_ICMS_VBCSTRET")
/*      */   private BigDecimal nIcmsVbcstret;
/*      */ 
/*      */   @Column(name="N_ICMS_VICMSSTRET")
/*      */   private BigDecimal nIcmsVicmsstret;
/*      */ 
/*      */   @Column(name="N_ICMSPART_ORIG")
/*      */   private Integer nIcmspartOrig;
/*      */ 
/*      */   @Column(name="N_ICMSPART_CST")
/*      */   private Integer nIcmspartCst;
/*      */ 
/*      */   @Column(name="N_ICMSPART_MODBC")
/*      */   private Integer nIcmspartModbc;
/*      */ 
/*      */   @Column(name="N_ICMSPART_VBC")
/*      */   private BigDecimal nIcmspartVbc;
/*      */ 
/*      */   @Column(name="N_ICMSPART_PREDBC")
/*      */   private BigDecimal nIcmspartPredbc;
/*      */ 
/*      */   @Column(name="N_ICMSPART_PICMS")
/*      */   private BigDecimal nIcmspartPicms;
/*      */ 
/*      */   @Column(name="N_ICMSPART_VICMS")
/*      */   private BigDecimal nIcmspartVicms;
/*      */ 
/*      */   @Column(name="N_ICMSPART_MODBCST")
/*      */   private Integer nIcmspartModbcst;
/*      */ 
/*      */   @Column(name="N_ICMSPART_PMVAST")
/*      */   private BigDecimal nIcmspartPmvast;
/*      */ 
/*      */   @Column(name="N_ICMSPART_PREDBCST")
/*      */   private BigDecimal nIcmspartPredbcst;
/*      */ 
/*      */   @Column(name="N_ICMSPART_VBCST")
/*      */   private BigDecimal nIcmspartVbcst;
/*      */ 
/*      */   @Column(name="N_ICMSPART_PICMSST")
/*      */   private BigDecimal nIcmspartPicmsst;
/*      */ 
/*      */   @Column(name="N_ICMSPART_VICMSST")
/*      */   private BigDecimal nIcmspartVicmsst;
/*      */ 
/*      */   @Column(name="N_ICMSPART_PBCOP")
/*      */   private BigDecimal nIcmspartPbcop;
/*      */ 
/*      */   @Column(name="S_ICMSPART_UFST")
/*      */   private String sIcmspartUfst;
/*      */ 
/*      */   @Column(name="N_ICMSST_ORIG")
/*      */   private Integer nIcmsstOrig;
/*      */ 
/*      */   @Column(name="N_ICMSST_CST")
/*      */   private Integer nIcmsstCst;
/*      */ 
/*      */   @Column(name="N_ICMSST_VBCSTRET")
/*      */   private BigDecimal nIcmsstVbcstret;
/*      */ 
/*      */   @Column(name="N_ICMSST_VICMSSTRET")
/*      */   private BigDecimal nIcmsstVicmsstret;
/*      */ 
/*      */   @Column(name="N_ICMSST_VBCSTDEST")
/*      */   private BigDecimal nIcmsstVbcstdest;
/*      */ 
/*      */   @Column(name="N_ICMSST_VICMSSTDEST")
/*      */   private BigDecimal nIcmsstVicmsstdest;
/*      */ 
/*      */   @Column(name="N_ICMSSN_ORIG")
/*      */   private Integer nIcmssnOrig;
/*      */ 
/*      */   @Column(name="N_ICMSSN_CSOSN")
/*      */   private Integer nIcmssnCsosn;
/*      */ 
/*      */   @Column(name="N_ICMSSN_PCREDSN")
/*      */   private BigDecimal nIcmssnPcredsn;
/*      */ 
/*      */   @Column(name="N_ICMSSN_VCREDICMSSN")
/*      */   private BigDecimal nIcmssnVcredicmssn;
/*      */ 
/*      */   @Column(name="N_ICMSSN_MODBCST")
/*      */   private Integer nIcmssnModbcst;
/*      */ 
/*      */   @Column(name="N_ICMSSN_PMVAST")
/*      */   private BigDecimal nIcmssnPmvast;
/*      */ 
/*      */   @Column(name="N_ICMSSN_PREDBCST")
/*      */   private BigDecimal nIcmssnPredbcst;
/*      */ 
/*      */   @Column(name="N_ICMSSN_VBCST")
/*      */   private BigDecimal nIcmssnVbcst;
/*      */ 
/*      */   @Column(name="N_ICMSSN_PICMSST")
/*      */   private BigDecimal nIcmssnPicmsst;
/*      */ 
/*      */   @Column(name="N_ICMSSN_VICMSST")
/*      */   private BigDecimal nIcmssnVicmsst;
/*      */ 
/*      */   @Column(name="N_ICMSSN_VBCSTRET")
/*      */   private BigDecimal nIcmssnVbcstret;
/*      */ 
/*      */   @Column(name="N_ICMSSN_VICMSSTRET")
/*      */   private BigDecimal nIcmssnVicmsstret;
/*      */ 
/*      */   @Column(name="N_ICMSSN_MODBC")
/*      */   private Integer nIcmssnModbc;
/*      */ 
/*      */   @Column(name="N_ICMSSN_VBC")
/*      */   private BigDecimal nIcmssnVbc;
/*      */ 
/*      */   @Column(name="N_ICMSSN_PREDBC")
/*      */   private BigDecimal nIcmssnPredbc;
/*      */ 
/*      */   @Column(name="N_ICMSSN_PICMS")
/*      */   private BigDecimal nIcmssnPicms;
/*      */ 
/*      */   @Column(name="N_ICMSSN_VICMS")
/*      */   private BigDecimal nIcmssnVicms;
/*      */ 
/*      */   @Column(name="N_ICMS_VBCUFDEST")
/*      */   private BigDecimal nIcmsVbcufdest;
/*      */ 
/*      */   @Column(name="N_ICMS_PFCPUFDEST")
/*      */   private BigDecimal nIcmsPfcpufdest;
/*      */ 
/*      */   @Column(name="N_ICMS_PICMSUFDEST")
/*      */   private BigDecimal nIcmspIcmsufdest;
/*      */ 
/*      */   @Column(name="N_ICMCS_PICMSINTER")
/*      */   private BigDecimal nIcmcspIcmsinter;
/*      */ 
/*      */   @Column(name="N_ICMCS_PICMSINTERPART")
/*      */   private BigDecimal nIcmcspIcmsinterpart;
/*      */ 
/*      */   @Column(name="N_ICMCS_VFCPUFDEST")
/*      */   private BigDecimal nIcmcspVfcpufdest;
/*      */ 
/*      */   @Column(name="N_ICMCS_VICMSUFDEST")
/*      */   private BigDecimal nIcmcsVicmsufdest;
/*      */ 
/*      */   @Column(name="N_ICMCS_VICMSUFREMET")
/*      */   private BigDecimal nIcmcsVicmsufremet;
/*      */ 
/*      */   @Column(name="S_IPI_CIENQ")
/*      */   private String sIpiCienq;
/*      */ 
/*      */   @Column(name="S_IPI_CNPJPROD")
/*      */   private String sIpiCnpjprod;
/*      */ 
/*      */   @Column(name="S_IPI_CSELO")
/*      */   private String sIpiCselo;
/*      */ 
/*      */   @Column(name="N_IPI_QSELO")
/*      */   private Long nIpiQselo;
/*      */ 
/*      */   @Column(name="S_IPI_CENQ")
/*      */   private String sIpiCenq;
/*      */ 
/*      */   @Column(name="S_IPITRIB_CST")
/*      */   private String sIpitribCst;
/*      */ 
/*      */   @Column(name="N_IPITRIB_VBC")
/*      */   private BigDecimal nIpitribVbc;
/*      */ 
/*      */   @Column(name="N_IPITRIB_PIPI")
/*      */   private BigDecimal nIpitribPipi;
/*      */ 
/*      */   @Column(name="N_IPITRIB_QUNID")
/*      */   private BigDecimal nIpitribQunid;
/*      */ 
/*      */   @Column(name="N_IPITRIB_VUNID")
/*      */   private BigDecimal nIpitribVunid;
/*      */ 
/*      */   @Column(name="N_IPITRIB_VIPI")
/*      */   private BigDecimal nIpitribVipi;
/*      */ 
/*      */   @Column(name="S_IPINT_CST")
/*      */   private String sIpintCst;
/*      */ 
/*      */   @Column(name="N_II_VBC")
/*      */   private BigDecimal nIiVbc;
/*      */ 
/*      */   @Column(name="N_II_VDESPADU")
/*      */   private BigDecimal nIiVdespadu;
/*      */ 
/*      */   @Column(name="N_II_VII")
/*      */   private BigDecimal nIiVii;
/*      */ 
/*      */   @Column(name="N_II_VIOF")
/*      */   private BigDecimal nIiViof;
/*      */ 
/*      */   @Column(name="N_PISALIQ_CST")
/*      */   private Integer nPisaliqCst;
/*      */ 
/*      */   @Column(name="N_PISALIQ_VBC")
/*      */   private BigDecimal nPisaliqVbc;
/*      */ 
/*      */   @Column(name="N_PISALIQ_PPIS")
/*      */   private BigDecimal nPisaliqPpis;
/*      */ 
/*      */   @Column(name="N_PISALIQ_VPIS")
/*      */   private BigDecimal nPisaliqVpis;
/*      */ 
/*      */   @Column(name="N_PISQTDE_CST")
/*      */   private Integer nPisqtdeCst;
/*      */ 
/*      */   @Column(name="N_PISQTDE_QBCPROD")
/*      */   private BigDecimal nPisqtdeQbcprod;
/*      */ 
/*      */   @Column(name="N_PISQTDE_VALIQPROD")
/*      */   private BigDecimal nPisqtdeValiqprod;
/*      */ 
/*      */   @Column(name="N_PISQTDE_VPIS")
/*      */   private BigDecimal nPisqtdeVpis;
/*      */ 
/*      */   @Column(name="N_PISNT_CST")
/*      */   private Integer nPisntCst;
/*      */ 
/*      */   @Column(name="N_PISOUTR_CST")
/*      */   private Integer nPisoutrCst;
/*      */ 
/*      */   @Column(name="N_PISOUTR_VBC")
/*      */   private BigDecimal nPisoutrVbc;
/*      */ 
/*      */   @Column(name="N_PISOUTR_PPIS")
/*      */   private BigDecimal nPisoutrPpis;
/*      */ 
/*      */   @Column(name="N_PISOUTR_QBCPROD")
/*      */   private BigDecimal nPisoutrQbcprod;
/*      */ 
/*      */   @Column(name="N_PISOUTR_VALIQPROD")
/*      */   private BigDecimal nPisoutrValiqprod;
/*      */ 
/*      */   @Column(name="N_PISOUTR_VPIS")
/*      */   private BigDecimal nPisoutrVpis;
/*      */ 
/*      */   @Column(name="N_PISST_VBC")
/*      */   private BigDecimal nPisstVbc;
/*      */ 
/*      */   @Column(name="N_PISST_PPIS")
/*      */   private BigDecimal nPisstPpis;
/*      */ 
/*      */   @Column(name="N_PISST_QBCPROD")
/*      */   private BigDecimal nPisstQbcprod;
/*      */ 
/*      */   @Column(name="N_PISST_VALIQPROD")
/*      */   private BigDecimal nPisstValiqprod;
/*      */ 
/*      */   @Column(name="N_PISST_VPIS")
/*      */   private BigDecimal nPisstVpis;
/*      */ 
/*      */   @Column(name="N_COFINSALIQ_CST")
/*      */   private BigDecimal nCofinsaliqCst;
/*      */ 
/*      */   @Column(name="N_COFINSALIQ_VBC")
/*      */   private BigDecimal nCofinsaliqVbc;
/*      */ 
/*      */   @Column(name="N_COFINSALIQ_PCOFINS")
/*      */   private BigDecimal nCofinsaliqPconfins;
/*      */ 
/*      */   @Column(name="N_COFINSALIQ_VCOFINS")
/*      */   private BigDecimal nCofinsaliqVconfins;
/*      */ 
/*      */   @Column(name="N_COFINSQTDE_CST")
/*      */   private Integer nCofinsqtdeCst;
/*      */ 
/*      */   @Column(name="N_COFINSQTDE_QBCPROD")
/*      */   private BigDecimal nCofinsqtdeQbcprod;
/*      */ 
/*      */   @Column(name="N_COFINSQTDE_VALIQPROD")
/*      */   private BigDecimal nCofinsqtdeValiqprod;
/*      */ 
/*      */   @Column(name="N_COFINSQTDE_VCOFINS")
/*      */   private BigDecimal nCofinsqtdeVcofins;
/*      */ 
/*      */   @Column(name="N_COFINSNT_CST")
/*      */   private Integer nCofinsntCst;
/*      */ 
/*      */   @Column(name="N_COFINSOUTR_CST")
/*      */   private Integer nCofinsoutrCst;
/*      */ 
/*      */   @Column(name="N_COFINSOUTR_VBC")
/*      */   private BigDecimal nCofinsoutrVbc;
/*      */ 
/*      */   @Column(name="N_COFINSOUTR_PCOFINS")
/*      */   private BigDecimal nCofinsoutrPcofins;
/*      */ 
/*      */   @Column(name="N_COFINSOUTR_QBCPROD")
/*      */   private BigDecimal nCofinsoutrQbcprod;
/*      */ 
/*      */   @Column(name="N_COFINSOUTR_VALIQPROD")
/*      */   private BigDecimal nCofinsoutrValiqprod;
/*      */ 
/*      */   @Column(name="N_COFINSOUTR_VCOFINS")
/*      */   private BigDecimal nCofinsoutrVcofins;
/*      */ 
/*      */   @Column(name="N_COFINSST_VBC")
/*      */   private BigDecimal nCofinsstVbc;
/*      */ 
/*      */   @Column(name="N_COFINSST_PCOFINS")
/*      */   private BigDecimal nCofinsstPcofins;
/*      */ 
/*      */   @Column(name="N_COFINSST_QBCPROD")
/*      */   private BigDecimal nCofinsstQbcprod;
/*      */ 
/*      */   @Column(name="N_COFINSST_VALIQPROD")
/*      */   private BigDecimal nCofinsstValiqprod;
/*      */ 
/*      */   @Column(name="N_COFINSST_VCOFINS")
/*      */   private BigDecimal nCofinsstVcofins;
/*      */ 
/*      */   @Column(name="N_ISSQN_VBC")
/*      */   private BigDecimal nIssqnVbc;
/*      */ 
/*      */   @Column(name="N_ISSQN_VALIQ")
/*      */   private BigDecimal nIssqnValiq;
/*      */ 
/*      */   @Column(name="N_ISSQN_VISSQN")
/*      */   private BigDecimal nIssqnVissqn;
/*      */ 
/*      */   @Column(name="N_ISSQN_CMUNFG")
/*      */   private Integer nIssqnCmunfg;
/*      */ 
/*      */   @Column(name="N_ISSQN_CLISTSERV")
/*      */   private Integer nIssqnClistserv;
/*      */ 
/*      */   @Column(name="S_ISSQN_CLISTSERV")
/*      */   private String sIssqnClistserv;
/*      */ 
/*      */   @Column(name="S_ISSQN_CSITTRIB")
/*      */   private String sIssqnCsittrib;
/*      */ 
/*      */   @Column(name="N_ISSQN_VDEDUCAO")
/*      */   private BigDecimal nIssqnVDeducao;
/*      */ 
/*      */   @Column(name="N_ISSQN_VOUTRO")
/*      */   private BigDecimal nIssqnVOutro;
/*      */ 
/*      */   @Column(name="N_ISSQN_VDESCINCOND")
/*      */   private BigDecimal nIssqnVDescIncond;
/*      */ 
/*      */   @Column(name="N_ISSQN_VDESCCOND")
/*      */   private BigDecimal nIssqnVDescCond;
/*      */ 
/*      */   @Column(name="N_ISSQN_VISSRET")
/*      */   private BigDecimal nIssqnVIssRet;
/*      */ 
/*      */   @Column(name="N_ISSQN_INDISS")
/*      */   private Integer nIssqnIndIss;
/*      */ 
/*      */   @Column(name="S_ISSQN_CSERVICO")
/*      */   private String sIssqnCServico;
/*      */ 
/*      */   @Column(name="N_ISSQN_CMUN")
/*      */   private Integer nIssqnCMun;
/*      */ 
/*      */   @Column(name="N_ISSQN_CPAIS")
/*      */   private Integer nIssqnCPais;
/*      */ 
/*      */   @Column(name="S_ISSQN_NPROCESSO")
/*      */   private String sIssqnNProcesso;
/*      */ 
/*      */   @Column(name="N_ISSQN_INDINCENTIVO")
/*      */   private BigDecimal nIssqnIndIncentivo;
/*      */ 
/*      */   @Column(name="S_INFADPROD")
/*      */   private String sInfadprod;
/*      */ 
/*      */   @Column(name="N_VTOTTRIB")
/*      */   private BigDecimal nVtottrib;
/*      */ 
/*      */   @Column(name="N_NRECOPI")
/*      */   private BigDecimal nNrecopi;
/*      */ 
/*      */   @Column(name="N_TDEV_PDEVOL")
/*      */   private BigDecimal nTdevpdevol;
/*      */ 
/*      */   @Column(name="N_TDEV_VIPIDEVOL")
/*      */   private BigDecimal nTdevvipidevol;
/*      */ 
/*      */   public NfeItemPk getNfeItemPk()
/*      */   {
/*  532 */     return this.nfeItemPk;
/*      */   }
/*      */ 
/*      */   public void setNfeItemPk(NfeItemPk nfeItemPk) {
/*  536 */     this.nfeItemPk = nfeItemPk;
/*      */   }
/*      */ 
/*      */   public String getsCprod() {
/*  540 */     return this.sCprod;
/*      */   }
/*      */ 
/*      */   public void setsCprod(String sCprod) {
/*  544 */     this.sCprod = sCprod;
/*      */   }
/*      */ 
/*      */   public String getsCean() {
/*  548 */     return this.sCean;
/*      */   }
/*      */ 
/*      */   public void setsCean(String sCean) {
/*  552 */     this.sCean = sCean;
/*      */   }
/*      */ 
/*      */   public String getsXprod() {
/*  556 */     return this.sXprod;
/*      */   }
/*      */ 
/*      */   public void setsXprod(String sXprod) {
/*  560 */     this.sXprod = sXprod;
/*      */   }
/*      */ 
/*      */   public String getsNcm() {
/*  564 */     return this.sNcm;
/*      */   }
/*      */ 
/*      */   public void setsNcm(String sNcm) {
/*  568 */     this.sNcm = sNcm;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCest() {
/*  572 */     return this.nCest;
/*      */   }
/*      */ 
/*      */   public void setnCest(BigDecimal nCest) {
/*  576 */     this.nCest = nCest;
/*      */   }
/*      */ 
/*      */   public String getsExtipi() {
/*  580 */     return this.sExtipi;
/*      */   }
/*      */ 
/*      */   public void setsExtipi(String sExtipi) {
/*  584 */     this.sExtipi = sExtipi;
/*      */   }
/*      */ 
/*      */   public Integer getnCfop() {
/*  588 */     return this.nCfop;
/*      */   }
/*      */ 
/*      */   public void setnCfop(Integer nCfop) {
/*  592 */     this.nCfop = nCfop;
/*      */   }
/*      */ 
/*      */   public String getsUcom() {
/*  596 */     return this.sUcom;
/*      */   }
/*      */ 
/*      */   public void setsUcom(String sUcom) {
/*  600 */     this.sUcom = sUcom;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnQcom() {
/*  604 */     return this.nQcom;
/*      */   }
/*      */ 
/*      */   public void setnQcom(BigDecimal nQcom) {
/*  608 */     this.nQcom = nQcom;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnVuncom() {
/*  612 */     return this.nVuncom;
/*      */   }
/*      */ 
/*      */   public void setnVuncom(BigDecimal nVuncom) {
/*  616 */     this.nVuncom = nVuncom;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnVprod() {
/*  620 */     return this.nVprod;
/*      */   }
/*      */ 
/*      */   public void setnVprod(BigDecimal nVprod) {
/*  624 */     this.nVprod = nVprod;
/*      */   }
/*      */ 
/*      */   public String getsCeantrib() {
/*  628 */     return this.sCeantrib;
/*      */   }
/*      */ 
/*      */   public void setsCeantrib(String sCeantrib) {
/*  632 */     this.sCeantrib = sCeantrib;
/*      */   }
/*      */ 
/*      */   public String getsUtrib() {
/*  636 */     return this.sUtrib;
/*      */   }
/*      */ 
/*      */   public void setsUtrib(String sUtrib) {
/*  640 */     this.sUtrib = sUtrib;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnQtrib() {
/*  644 */     return this.nQtrib;
/*      */   }
/*      */ 
/*      */   public void setnQtrib(BigDecimal nQtrib) {
/*  648 */     this.nQtrib = nQtrib;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnVuntrib() {
/*  652 */     return this.nVuntrib;
/*      */   }
/*      */ 
/*      */   public void setnVuntrib(BigDecimal nVuntrib) {
/*  656 */     this.nVuntrib = nVuntrib;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnVfrete() {
/*  660 */     return this.nVfrete;
/*      */   }
/*      */ 
/*      */   public void setnVfrete(BigDecimal nVfrete) {
/*  664 */     this.nVfrete = nVfrete;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnVseg() {
/*  668 */     return this.nVseg;
/*      */   }
/*      */ 
/*      */   public void setnVseg(BigDecimal nVseg) {
/*  672 */     this.nVseg = nVseg;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnVdesc() {
/*  676 */     return this.nVdesc;
/*      */   }
/*      */ 
/*      */   public void setnVdesc(BigDecimal nVdesc) {
/*  680 */     this.nVdesc = nVdesc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnVoutro() {
/*  684 */     return this.nVoutro;
/*      */   }
/*      */ 
/*      */   public void setnVoutro(BigDecimal nVoutro) {
/*  688 */     this.nVoutro = nVoutro;
/*      */   }
/*      */ 
/*      */   public Integer getnIndtot() {
/*  692 */     return this.nIndtot;
/*      */   }
/*      */ 
/*      */   public void setnIndtot(Integer nIndtot) {
/*  696 */     this.nIndtot = nIndtot;
/*      */   }
/*      */ 
/*      */   public String getsB2bXped() {
/*  700 */     return this.sB2bXped;
/*      */   }
/*      */ 
/*      */   public void setsB2bXped(String sB2bXped) {
/*  704 */     this.sB2bXped = sB2bXped;
/*      */   }
/*      */ 
/*      */   public Integer getnB2bNitemped() {
/*  708 */     return this.nB2bNitemped;
/*      */   }
/*      */ 
/*      */   public void setnB2bNitemped(Integer nB2bNitemped) {
/*  712 */     this.nB2bNitemped = nB2bNitemped;
/*      */   }
/*      */ 
/*      */   public String getsNfci() {
/*  716 */     return this.sNfci;
/*      */   }
/*      */ 
/*      */   public void setsNfci(String sNfci) {
/*  720 */     this.sNfci = sNfci;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmsOrig() {
/*  724 */     return this.nIcmsOrig;
/*      */   }
/*      */ 
/*      */   public void setnIcmsOrig(Integer nIcmsOrig) {
/*  728 */     this.nIcmsOrig = nIcmsOrig;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmsCst() {
/*  732 */     return this.nIcmsCst;
/*      */   }
/*      */ 
/*      */   public void setnIcmsCst(Integer nIcmsCst) {
/*  736 */     this.nIcmsCst = nIcmsCst;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmsModbc() {
/*  740 */     return this.nIcmsModbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmsModbc(Integer nIcmsModbc) {
/*  744 */     this.nIcmsModbc = nIcmsModbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVbc() {
/*  748 */     return this.nIcmsVbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVbc(BigDecimal nIcmsVbc) {
/*  752 */     this.nIcmsVbc = nIcmsVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsPicms() {
/*  756 */     return this.nIcmsPicms;
/*      */   }
/*      */ 
/*      */   public void setnIcmsPicms(BigDecimal nIcmsPicms) {
/*  760 */     this.nIcmsPicms = nIcmsPicms;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVicms() {
/*  764 */     return this.nIcmsVicms;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVicms(BigDecimal nIcmsVicms) {
/*  768 */     this.nIcmsVicms = nIcmsVicms;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmsModbcst() {
/*  772 */     return this.nIcmsModbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmsModbcst(Integer nIcmsModbcst) {
/*  776 */     this.nIcmsModbcst = nIcmsModbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsPmvast() {
/*  780 */     return this.nIcmsPmvast;
/*      */   }
/*      */ 
/*      */   public void setnIcmsPmvast(BigDecimal nIcmsPmvast) {
/*  784 */     this.nIcmsPmvast = nIcmsPmvast;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsPredbcst() {
/*  788 */     return this.nIcmsPredbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmsPredbcst(BigDecimal nIcmsPredbcst) {
/*  792 */     this.nIcmsPredbcst = nIcmsPredbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVbcst() {
/*  796 */     return this.nIcmsVbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVbcst(BigDecimal nIcmsVbcst) {
/*  800 */     this.nIcmsVbcst = nIcmsVbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsPicmsst() {
/*  804 */     return this.nIcmsPicmsst;
/*      */   }
/*      */ 
/*      */   public void setnIcmsPicmsst(BigDecimal nIcmsPicmsst) {
/*  808 */     this.nIcmsPicmsst = nIcmsPicmsst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVicmsst() {
/*  812 */     return this.nIcmsVicmsst;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVicmsst(BigDecimal nIcmsVicmsst) {
/*  816 */     this.nIcmsVicmsst = nIcmsVicmsst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsPredbc() {
/*  820 */     return this.nIcmsPredbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmsPredbc(BigDecimal nIcmsPredbc) {
/*  824 */     this.nIcmsPredbc = nIcmsPredbc;
/*      */   }
/*      */ 
/*      */   public String getsIcmsMotdesicms() {
/*  828 */     return this.sIcmsMotdesicms;
/*      */   }
/*      */ 
/*      */   public void setsIcmsMotdesicms(String sIcmsMotdesicms) {
/*  832 */     this.sIcmsMotdesicms = sIcmsMotdesicms;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVbcstret() {
/*  836 */     return this.nIcmsVbcstret;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVbcstret(BigDecimal nIcmsVbcstret) {
/*  840 */     this.nIcmsVbcstret = nIcmsVbcstret;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmspartOrig() {
/*  844 */     return this.nIcmspartOrig;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartOrig(Integer nIcmspartOrig) {
/*  848 */     this.nIcmspartOrig = nIcmspartOrig;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmspartCst() {
/*  852 */     return this.nIcmspartCst;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartCst(Integer nIcmspartCst) {
/*  856 */     this.nIcmspartCst = nIcmspartCst;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmspartModbc() {
/*  860 */     return this.nIcmspartModbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartModbc(Integer nIcmspartModbc) {
/*  864 */     this.nIcmspartModbc = nIcmspartModbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartVbc() {
/*  868 */     return this.nIcmspartVbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartVbc(BigDecimal nIcmspartVbc) {
/*  872 */     this.nIcmspartVbc = nIcmspartVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartPredbc() {
/*  876 */     return this.nIcmspartPredbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartPredbc(BigDecimal nIcmspartPredbc) {
/*  880 */     this.nIcmspartPredbc = nIcmspartPredbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartPicms() {
/*  884 */     return this.nIcmspartPicms;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartPicms(BigDecimal nIcmspartPicms) {
/*  888 */     this.nIcmspartPicms = nIcmspartPicms;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartVicms() {
/*  892 */     return this.nIcmspartVicms;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartVicms(BigDecimal nIcmspartVicms) {
/*  896 */     this.nIcmspartVicms = nIcmspartVicms;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmspartModbcst() {
/*  900 */     return this.nIcmspartModbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartModbcst(Integer nIcmspartModbcst) {
/*  904 */     this.nIcmspartModbcst = nIcmspartModbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartPmvast() {
/*  908 */     return this.nIcmspartPmvast;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartPmvast(BigDecimal nIcmspartPmvast) {
/*  912 */     this.nIcmspartPmvast = nIcmspartPmvast;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartPredbcst() {
/*  916 */     return this.nIcmspartPredbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartPredbcst(BigDecimal nIcmspartPredbcst) {
/*  920 */     this.nIcmspartPredbcst = nIcmspartPredbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartVbcst() {
/*  924 */     return this.nIcmspartVbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartVbcst(BigDecimal nIcmspartVbcst) {
/*  928 */     this.nIcmspartVbcst = nIcmspartVbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartPicmsst() {
/*  932 */     return this.nIcmspartPicmsst;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartPicmsst(BigDecimal nIcmspartPicmsst) {
/*  936 */     this.nIcmspartPicmsst = nIcmspartPicmsst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartVicmsst() {
/*  940 */     return this.nIcmspartVicmsst;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartVicmsst(BigDecimal nIcmspartVicmsst) {
/*  944 */     this.nIcmspartVicmsst = nIcmspartVicmsst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmspartPbcop() {
/*  948 */     return this.nIcmspartPbcop;
/*      */   }
/*      */ 
/*      */   public void setnIcmspartPbcop(BigDecimal nIcmspartPbcop) {
/*  952 */     this.nIcmspartPbcop = nIcmspartPbcop;
/*      */   }
/*      */ 
/*      */   public String getsIcmspartUfst() {
/*  956 */     return this.sIcmspartUfst;
/*      */   }
/*      */ 
/*      */   public void setsIcmspartUfst(String sIcmspartUfst) {
/*  960 */     this.sIcmspartUfst = sIcmspartUfst;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmsstOrig() {
/*  964 */     return this.nIcmsstOrig;
/*      */   }
/*      */ 
/*      */   public void setnIcmsstOrig(Integer nIcmsstOrig) {
/*  968 */     this.nIcmsstOrig = nIcmsstOrig;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmsstCst() {
/*  972 */     return this.nIcmsstCst;
/*      */   }
/*      */ 
/*      */   public void setnIcmsstCst(Integer nIcmsstCst) {
/*  976 */     this.nIcmsstCst = nIcmsstCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsstVbcstret() {
/*  980 */     return this.nIcmsstVbcstret;
/*      */   }
/*      */ 
/*      */   public void setnIcmsstVbcstret(BigDecimal nIcmsstVbcstret) {
/*  984 */     this.nIcmsstVbcstret = nIcmsstVbcstret;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsstVicmsstret() {
/*  988 */     return this.nIcmsstVicmsstret;
/*      */   }
/*      */ 
/*      */   public void setnIcmsstVicmsstret(BigDecimal nIcmsstVicmsstret) {
/*  992 */     this.nIcmsstVicmsstret = nIcmsstVicmsstret;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsstVbcstdest() {
/*  996 */     return this.nIcmsstVbcstdest;
/*      */   }
/*      */ 
/*      */   public void setnIcmsstVbcstdest(BigDecimal nIcmsstVbcstdest) {
/* 1000 */     this.nIcmsstVbcstdest = nIcmsstVbcstdest;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsstVicmsstdest() {
/* 1004 */     return this.nIcmsstVicmsstdest;
/*      */   }
/*      */ 
/*      */   public void setnIcmsstVicmsstdest(BigDecimal nIcmsstVicmsstdest) {
/* 1008 */     this.nIcmsstVicmsstdest = nIcmsstVicmsstdest;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmssnOrig() {
/* 1012 */     return this.nIcmssnOrig;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnOrig(Integer nIcmssnOrig) {
/* 1016 */     this.nIcmssnOrig = nIcmssnOrig;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmssnCsosn() {
/* 1020 */     return this.nIcmssnCsosn;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnCsosn(Integer nIcmssnCsosn) {
/* 1024 */     this.nIcmssnCsosn = nIcmssnCsosn;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnPcredsn() {
/* 1028 */     return this.nIcmssnPcredsn;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnPcredsn(BigDecimal nIcmssnPcredsn) {
/* 1032 */     this.nIcmssnPcredsn = nIcmssnPcredsn;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnVcredicmssn() {
/* 1036 */     return this.nIcmssnVcredicmssn;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnVcredicmssn(BigDecimal nIcmssnVcredicmssn) {
/* 1040 */     this.nIcmssnVcredicmssn = nIcmssnVcredicmssn;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmssnModbcst() {
/* 1044 */     return this.nIcmssnModbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnModbcst(Integer nIcmssnModbcst) {
/* 1048 */     this.nIcmssnModbcst = nIcmssnModbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnPmvast() {
/* 1052 */     return this.nIcmssnPmvast;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnPmvast(BigDecimal nIcmssnPmvast) {
/* 1056 */     this.nIcmssnPmvast = nIcmssnPmvast;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnPredbcst() {
/* 1060 */     return this.nIcmssnPredbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnPredbcst(BigDecimal nIcmssnPredbcst) {
/* 1064 */     this.nIcmssnPredbcst = nIcmssnPredbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnVbcst() {
/* 1068 */     return this.nIcmssnVbcst;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnVbcst(BigDecimal nIcmssnVbcst) {
/* 1072 */     this.nIcmssnVbcst = nIcmssnVbcst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnPicmsst() {
/* 1076 */     return this.nIcmssnPicmsst;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnPicmsst(BigDecimal nIcmssnPicmsst) {
/* 1080 */     this.nIcmssnPicmsst = nIcmssnPicmsst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnVicmsst() {
/* 1084 */     return this.nIcmssnVicmsst;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnVicmsst(BigDecimal nIcmssnVicmsst) {
/* 1088 */     this.nIcmssnVicmsst = nIcmssnVicmsst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnVbcstret() {
/* 1092 */     return this.nIcmssnVbcstret;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnVbcstret(BigDecimal nIcmssnVbcstret) {
/* 1096 */     this.nIcmssnVbcstret = nIcmssnVbcstret;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnVicmsstret() {
/* 1100 */     return this.nIcmssnVicmsstret;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnVicmsstret(BigDecimal nIcmssnVicmsstret) {
/* 1104 */     this.nIcmssnVicmsstret = nIcmssnVicmsstret;
/*      */   }
/*      */ 
/*      */   public Integer getnIcmssnModbc() {
/* 1108 */     return this.nIcmssnModbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnModbc(Integer nIcmssnModbc) {
/* 1112 */     this.nIcmssnModbc = nIcmssnModbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnVbc() {
/* 1116 */     return this.nIcmssnVbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnVbc(BigDecimal nIcmssnVbc) {
/* 1120 */     this.nIcmssnVbc = nIcmssnVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnPredbc() {
/* 1124 */     return this.nIcmssnPredbc;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnPredbc(BigDecimal nIcmssnPredbc) {
/* 1128 */     this.nIcmssnPredbc = nIcmssnPredbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnPicms() {
/* 1132 */     return this.nIcmssnPicms;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnPicms(BigDecimal nIcmssnPicms) {
/* 1136 */     this.nIcmssnPicms = nIcmssnPicms;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmssnVicms() {
/* 1140 */     return this.nIcmssnVicms;
/*      */   }
/*      */ 
/*      */   public void setnIcmssnVicms(BigDecimal nIcmssnVicms) {
/* 1144 */     this.nIcmssnVicms = nIcmssnVicms;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVbcufdest()
/*      */   {
/* 1150 */     return this.nIcmsVbcufdest;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVbcufdest(BigDecimal nIcmsVbcufdest) {
/* 1154 */     this.nIcmsVbcufdest = nIcmsVbcufdest;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsPfcpufdest() {
/* 1158 */     return this.nIcmsPfcpufdest;
/*      */   }
/*      */   public void setnIcmsPfcpufdest(BigDecimal nIcmsPfcpufdest) {
/* 1161 */     this.nIcmsPfcpufdest = nIcmsPfcpufdest;
/*      */   }
/*      */   public BigDecimal getnIcmspIcmsufdest() {
/* 1164 */     return this.nIcmspIcmsufdest;
/*      */   }
/*      */ 
/*      */   public void setnIcmspIcmsufdest(BigDecimal nIcmspIcmsufdest) {
/* 1168 */     this.nIcmspIcmsufdest = nIcmspIcmsufdest;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmcspIcmsinter() {
/* 1172 */     return this.nIcmcspIcmsinter;
/*      */   }
/*      */ 
/*      */   public void setnIcmcspIcmsinter(BigDecimal nIcmcspIcmsinter) {
/* 1176 */     this.nIcmcspIcmsinter = nIcmcspIcmsinter;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmcspIcmsinterpart() {
/* 1180 */     return this.nIcmcspIcmsinterpart;
/*      */   }
/*      */ 
/*      */   public void setnIcmcspIcmsinterpart(BigDecimal nIcmcspIcmsinterpart) {
/* 1184 */     this.nIcmcspIcmsinterpart = nIcmcspIcmsinterpart;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmcspVfcpufdest() {
/* 1188 */     return this.nIcmcspVfcpufdest;
/*      */   }
/*      */   public void setnIcmcspVfcpufdest(BigDecimal nIcmcspVfcpufdest) {
/* 1191 */     this.nIcmcspVfcpufdest = nIcmcspVfcpufdest;
/*      */   }
/*      */   public BigDecimal getnIcmcsVicmsufdest() {
/* 1194 */     return this.nIcmcsVicmsufdest;
/*      */   }
/*      */ 
/*      */   public void setnIcmcsVicmsufdest(BigDecimal nIcmcsVicmsufdest) {
/* 1198 */     this.nIcmcsVicmsufdest = nIcmcsVicmsufdest;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmcsVicmsufremet() {
/* 1202 */     return this.nIcmcsVicmsufremet;
/*      */   }
/*      */ 
/*      */   public void setnIcmcsVicmsufremet(BigDecimal nIcmcsVicmsufremet) {
/* 1206 */     this.nIcmcsVicmsufremet = nIcmcsVicmsufremet;
/*      */   }
/*      */ 
/*      */   public String getsIpiCienq() {
/* 1210 */     return this.sIpiCienq;
/*      */   }
/*      */ 
/*      */   public void setsIpiCienq(String sIpiCienq) {
/* 1214 */     this.sIpiCienq = sIpiCienq;
/*      */   }
/*      */ 
/*      */   public String getsIpiCnpjprod() {
/* 1218 */     return this.sIpiCnpjprod;
/*      */   }
/*      */ 
/*      */   public void setsIpiCnpjprod(String sIpiCnpjprod) {
/* 1222 */     this.sIpiCnpjprod = sIpiCnpjprod;
/*      */   }
/*      */ 
/*      */   public String getsIpiCselo() {
/* 1226 */     return this.sIpiCselo;
/*      */   }
/*      */ 
/*      */   public void setsIpiCselo(String sIpiCselo) {
/* 1230 */     this.sIpiCselo = sIpiCselo;
/*      */   }
/*      */ 
/*      */   public Long getnIpiQselo() {
/* 1234 */     return this.nIpiQselo;
/*      */   }
/*      */ 
/*      */   public void setnIpiQselo(Long nIpiQselo) {
/* 1238 */     this.nIpiQselo = nIpiQselo;
/*      */   }
/*      */ 
/*      */   public String getsIpiCenq() {
/* 1242 */     return this.sIpiCenq;
/*      */   }
/*      */ 
/*      */   public void setsIpiCenq(String sIpiCenq) {
/* 1246 */     this.sIpiCenq = sIpiCenq;
/*      */   }
/*      */ 
/*      */   public String getsIpitribCst() {
/* 1250 */     return this.sIpitribCst;
/*      */   }
/*      */ 
/*      */   public void setsIpitribCst(String sIpitribCst) {
/* 1254 */     this.sIpitribCst = sIpitribCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIpitribVbc() {
/* 1258 */     return this.nIpitribVbc;
/*      */   }
/*      */ 
/*      */   public void setnIpitribVbc(BigDecimal nIpitribVbc) {
/* 1262 */     this.nIpitribVbc = nIpitribVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIpitribPipi() {
/* 1266 */     return this.nIpitribPipi;
/*      */   }
/*      */ 
/*      */   public void setnIpitribPipi(BigDecimal nIpitribPipi) {
/* 1270 */     this.nIpitribPipi = nIpitribPipi;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIpitribQunid() {
/* 1274 */     return this.nIpitribQunid;
/*      */   }
/*      */ 
/*      */   public void setnIpitribQunid(BigDecimal nIpitribQunid) {
/* 1278 */     this.nIpitribQunid = nIpitribQunid;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIpitribVunid() {
/* 1282 */     return this.nIpitribVunid;
/*      */   }
/*      */ 
/*      */   public void setnIpitribVunid(BigDecimal nIpitribVunid) {
/* 1286 */     this.nIpitribVunid = nIpitribVunid;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIpitribVipi() {
/* 1290 */     return this.nIpitribVipi;
/*      */   }
/*      */ 
/*      */   public void setnIpitribVipi(BigDecimal nIpitribVipi) {
/* 1294 */     this.nIpitribVipi = nIpitribVipi;
/*      */   }
/*      */ 
/*      */   public String getsIpintCst() {
/* 1298 */     return this.sIpintCst;
/*      */   }
/*      */ 
/*      */   public void setsIpintCst(String sIpintCst) {
/* 1302 */     this.sIpintCst = sIpintCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIiVbc() {
/* 1306 */     return this.nIiVbc;
/*      */   }
/*      */ 
/*      */   public void setnIiVbc(BigDecimal nIiVbc) {
/* 1310 */     this.nIiVbc = nIiVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIiVdespadu() {
/* 1314 */     return this.nIiVdespadu;
/*      */   }
/*      */ 
/*      */   public void setnIiVdespadu(BigDecimal nIiVdespadu) {
/* 1318 */     this.nIiVdespadu = nIiVdespadu;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIiVii() {
/* 1322 */     return this.nIiVii;
/*      */   }
/*      */ 
/*      */   public void setnIiVii(BigDecimal nIiVii) {
/* 1326 */     this.nIiVii = nIiVii;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIiViof() {
/* 1330 */     return this.nIiViof;
/*      */   }
/*      */ 
/*      */   public void setnIiViof(BigDecimal nIiViof) {
/* 1334 */     this.nIiViof = nIiViof;
/*      */   }
/*      */ 
/*      */   public Integer getnPisaliqCst() {
/* 1338 */     return this.nPisaliqCst;
/*      */   }
/*      */ 
/*      */   public void setnPisaliqCst(Integer nPisaliqCst) {
/* 1342 */     this.nPisaliqCst = nPisaliqCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisaliqVbc() {
/* 1346 */     return this.nPisaliqVbc;
/*      */   }
/*      */ 
/*      */   public void setnPisaliqVbc(BigDecimal nPisaliqVbc) {
/* 1350 */     this.nPisaliqVbc = nPisaliqVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisaliqPpis() {
/* 1354 */     return this.nPisaliqPpis;
/*      */   }
/*      */ 
/*      */   public void setnPisaliqPpis(BigDecimal nPisaliqPpis) {
/* 1358 */     this.nPisaliqPpis = nPisaliqPpis;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisaliqVpis() {
/* 1362 */     return this.nPisaliqVpis;
/*      */   }
/*      */ 
/*      */   public void setnPisaliqVpis(BigDecimal nPisaliqVpis) {
/* 1366 */     this.nPisaliqVpis = nPisaliqVpis;
/*      */   }
/*      */ 
/*      */   public Integer getnPisqtdeCst() {
/* 1370 */     return this.nPisqtdeCst;
/*      */   }
/*      */ 
/*      */   public void setnPisqtdeCst(Integer nPisqtdeCst) {
/* 1374 */     this.nPisqtdeCst = nPisqtdeCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisqtdeQbcprod() {
/* 1378 */     return this.nPisqtdeQbcprod;
/*      */   }
/*      */ 
/*      */   public void setnPisqtdeQbcprod(BigDecimal nPisqtdeQbcprod) {
/* 1382 */     this.nPisqtdeQbcprod = nPisqtdeQbcprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisqtdeValiqprod() {
/* 1386 */     return this.nPisqtdeValiqprod;
/*      */   }
/*      */ 
/*      */   public void setnPisqtdeValiqprod(BigDecimal nPisqtdeValiqprod) {
/* 1390 */     this.nPisqtdeValiqprod = nPisqtdeValiqprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisqtdeVpis() {
/* 1394 */     return this.nPisqtdeVpis;
/*      */   }
/*      */ 
/*      */   public void setnPisqtdeVpis(BigDecimal nPisqtdeVpis) {
/* 1398 */     this.nPisqtdeVpis = nPisqtdeVpis;
/*      */   }
/*      */ 
/*      */   public Integer getnPisntCst() {
/* 1402 */     return this.nPisntCst;
/*      */   }
/*      */ 
/*      */   public void setnPisntCst(Integer nPisntCst) {
/* 1406 */     this.nPisntCst = nPisntCst;
/*      */   }
/*      */ 
/*      */   public Integer getnPisoutrCst() {
/* 1410 */     return this.nPisoutrCst;
/*      */   }
/*      */ 
/*      */   public void setnPisoutrCst(Integer nPisoutrCst) {
/* 1414 */     this.nPisoutrCst = nPisoutrCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisoutrVbc() {
/* 1418 */     return this.nPisoutrVbc;
/*      */   }
/*      */ 
/*      */   public void setnPisoutrVbc(BigDecimal nPisoutrVbc) {
/* 1422 */     this.nPisoutrVbc = nPisoutrVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisoutrPpis() {
/* 1426 */     return this.nPisoutrPpis;
/*      */   }
/*      */ 
/*      */   public void setnPisoutrPpis(BigDecimal nPisoutrPpis) {
/* 1430 */     this.nPisoutrPpis = nPisoutrPpis;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisoutrQbcprod() {
/* 1434 */     return this.nPisoutrQbcprod;
/*      */   }
/*      */ 
/*      */   public void setnPisoutrQbcprod(BigDecimal nPisoutrQbcprod) {
/* 1438 */     this.nPisoutrQbcprod = nPisoutrQbcprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisoutrValiqprod() {
/* 1442 */     return this.nPisoutrValiqprod;
/*      */   }
/*      */ 
/*      */   public void setnPisoutrValiqprod(BigDecimal nPisoutrValiqprod) {
/* 1446 */     this.nPisoutrValiqprod = nPisoutrValiqprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisoutrVpis() {
/* 1450 */     return this.nPisoutrVpis;
/*      */   }
/*      */ 
/*      */   public void setnPisoutrVpis(BigDecimal nPisoutrVpis) {
/* 1454 */     this.nPisoutrVpis = nPisoutrVpis;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisstVbc() {
/* 1458 */     return this.nPisstVbc;
/*      */   }
/*      */ 
/*      */   public void setnPisstVbc(BigDecimal nPisstVbc) {
/* 1462 */     this.nPisstVbc = nPisstVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisstPpis() {
/* 1466 */     return this.nPisstPpis;
/*      */   }
/*      */ 
/*      */   public void setnPisstPpis(BigDecimal nPisstPpis) {
/* 1470 */     this.nPisstPpis = nPisstPpis;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisstQbcprod() {
/* 1474 */     return this.nPisstQbcprod;
/*      */   }
/*      */ 
/*      */   public void setnPisstQbcprod(BigDecimal nPisstQbcprod) {
/* 1478 */     this.nPisstQbcprod = nPisstQbcprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisstValiqprod() {
/* 1482 */     return this.nPisstValiqprod;
/*      */   }
/*      */ 
/*      */   public void setnPisstValiqprod(BigDecimal nPisstValiqprod) {
/* 1486 */     this.nPisstValiqprod = nPisstValiqprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnPisstVpis() {
/* 1490 */     return this.nPisstVpis;
/*      */   }
/*      */ 
/*      */   public void setnPisstVpis(BigDecimal nPisstVpis) {
/* 1494 */     this.nPisstVpis = nPisstVpis;
/*      */   }
/*      */ 
/*      */   public Integer getnCofinsqtdeCst() {
/* 1498 */     return this.nCofinsqtdeCst;
/*      */   }
/*      */ 
/*      */   public void setnCofinsqtdeCst(Integer nCofinsqtdeCst) {
/* 1502 */     this.nCofinsqtdeCst = nCofinsqtdeCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsqtdeQbcprod() {
/* 1506 */     return this.nCofinsqtdeQbcprod;
/*      */   }
/*      */ 
/*      */   public void setnCofinsqtdeQbcprod(BigDecimal nCofinsqtdeQbcprod) {
/* 1510 */     this.nCofinsqtdeQbcprod = nCofinsqtdeQbcprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsqtdeValiqprod() {
/* 1514 */     return this.nCofinsqtdeValiqprod;
/*      */   }
/*      */ 
/*      */   public void setnCofinsqtdeValiqprod(BigDecimal nCofinsqtdeValiqprod) {
/* 1518 */     this.nCofinsqtdeValiqprod = nCofinsqtdeValiqprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsqtdeVcofins() {
/* 1522 */     return this.nCofinsqtdeVcofins;
/*      */   }
/*      */ 
/*      */   public void setnCofinsqtdeVcofins(BigDecimal nCofinsqtdeVcofins) {
/* 1526 */     this.nCofinsqtdeVcofins = nCofinsqtdeVcofins;
/*      */   }
/*      */ 
/*      */   public Integer getnCofinsntCst() {
/* 1530 */     return this.nCofinsntCst;
/*      */   }
/*      */ 
/*      */   public void setnCofinsntCst(Integer nCofinsntCst) {
/* 1534 */     this.nCofinsntCst = nCofinsntCst;
/*      */   }
/*      */ 
/*      */   public Integer getnCofinsoutrCst() {
/* 1538 */     return this.nCofinsoutrCst;
/*      */   }
/*      */ 
/*      */   public void setnCofinsoutrCst(Integer nCofinsoutrCst) {
/* 1542 */     this.nCofinsoutrCst = nCofinsoutrCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsoutrVbc() {
/* 1546 */     return this.nCofinsoutrVbc;
/*      */   }
/*      */ 
/*      */   public void setnCofinsoutrVbc(BigDecimal nCofinsoutrVbc) {
/* 1550 */     this.nCofinsoutrVbc = nCofinsoutrVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsoutrPcofins() {
/* 1554 */     return this.nCofinsoutrPcofins;
/*      */   }
/*      */ 
/*      */   public void setnCofinsoutrPcofins(BigDecimal nCofinsoutrPcofins) {
/* 1558 */     this.nCofinsoutrPcofins = nCofinsoutrPcofins;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsoutrQbcprod() {
/* 1562 */     return this.nCofinsoutrQbcprod;
/*      */   }
/*      */ 
/*      */   public void setnCofinsoutrQbcprod(BigDecimal nCofinsoutrQbcprod) {
/* 1566 */     this.nCofinsoutrQbcprod = nCofinsoutrQbcprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsoutrValiqprod() {
/* 1570 */     return this.nCofinsoutrValiqprod;
/*      */   }
/*      */ 
/*      */   public void setnCofinsoutrValiqprod(BigDecimal nCofinsoutrValiqprod) {
/* 1574 */     this.nCofinsoutrValiqprod = nCofinsoutrValiqprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsoutrVcofins() {
/* 1578 */     return this.nCofinsoutrVcofins;
/*      */   }
/*      */ 
/*      */   public void setnCofinsoutrVcofins(BigDecimal nCofinsoutrVcofins) {
/* 1582 */     this.nCofinsoutrVcofins = nCofinsoutrVcofins;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsstVbc() {
/* 1586 */     return this.nCofinsstVbc;
/*      */   }
/*      */ 
/*      */   public void setnCofinsstVbc(BigDecimal nCofinsstVbc) {
/* 1590 */     this.nCofinsstVbc = nCofinsstVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsstPcofins() {
/* 1594 */     return this.nCofinsstPcofins;
/*      */   }
/*      */ 
/*      */   public void setnCofinsstPcofins(BigDecimal nCofinsstPcofins) {
/* 1598 */     this.nCofinsstPcofins = nCofinsstPcofins;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsstQbcprod() {
/* 1602 */     return this.nCofinsstQbcprod;
/*      */   }
/*      */ 
/*      */   public void setnCofinsstQbcprod(BigDecimal nCofinsstQbcprod) {
/* 1606 */     this.nCofinsstQbcprod = nCofinsstQbcprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsstValiqprod() {
/* 1610 */     return this.nCofinsstValiqprod;
/*      */   }
/*      */ 
/*      */   public void setnCofinsstValiqprod(BigDecimal nCofinsstValiqprod) {
/* 1614 */     this.nCofinsstValiqprod = nCofinsstValiqprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsstVcofins() {
/* 1618 */     return this.nCofinsstVcofins;
/*      */   }
/*      */ 
/*      */   public void setnCofinsstVcofins(BigDecimal nCofinsstVcofins) {
/* 1622 */     this.nCofinsstVcofins = nCofinsstVcofins;
/*      */   }
/*      */ 
/*      */   public String getsInfadprod() {
/* 1626 */     return this.sInfadprod;
/*      */   }
/*      */ 
/*      */   public void setsInfadprod(String sInfadprod) {
/* 1630 */     this.sInfadprod = sInfadprod;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVicmsstret() {
/* 1634 */     return this.nIcmsVicmsstret;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVicmsstret(BigDecimal nIcmsVicmsstret) {
/* 1638 */     this.nIcmsVicmsstret = nIcmsVicmsstret;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnVbc() {
/* 1642 */     return this.nIssqnVbc;
/*      */   }
/*      */ 
/*      */   public void setnIssqnVbc(BigDecimal nIssqnVbc) {
/* 1646 */     this.nIssqnVbc = nIssqnVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnValiq() {
/* 1650 */     return this.nIssqnValiq;
/*      */   }
/*      */ 
/*      */   public void setnIssqnValiq(BigDecimal nIssqnValiq) {
/* 1654 */     this.nIssqnValiq = nIssqnValiq;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnVissqn() {
/* 1658 */     return this.nIssqnVissqn;
/*      */   }
/*      */ 
/*      */   public void setnIssqnVissqn(BigDecimal nIssqnVissqn) {
/* 1662 */     this.nIssqnVissqn = nIssqnVissqn;
/*      */   }
/*      */ 
/*      */   public Integer getnIssqnCmunfg() {
/* 1666 */     return this.nIssqnCmunfg;
/*      */   }
/*      */ 
/*      */   public void setnIssqnCmunfg(Integer nIssqnCmunfg) {
/* 1670 */     this.nIssqnCmunfg = nIssqnCmunfg;
/*      */   }
/*      */ 
/*      */   public Integer getnIssqnClistserv() {
/* 1674 */     return this.nIssqnClistserv;
/*      */   }
/*      */ 
/*      */   public void setnIssqnClistserv(Integer nIssqnClistserv) {
/* 1678 */     this.nIssqnClistserv = nIssqnClistserv;
/*      */   }
/*      */ 
/*      */   public String getsIssqnClistserv() {
/* 1682 */     return this.sIssqnClistserv;
/*      */   }
/*      */ 
/*      */   public void setsIssqnClistserv(String sIssqnClistserv) {
/* 1686 */     this.sIssqnClistserv = sIssqnClistserv;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsaliqCst() {
/* 1690 */     return this.nCofinsaliqCst;
/*      */   }
/*      */ 
/*      */   public void setnCofinsaliqCst(BigDecimal nCofinsaliqCst) {
/* 1694 */     this.nCofinsaliqCst = nCofinsaliqCst;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsaliqVbc() {
/* 1698 */     return this.nCofinsaliqVbc;
/*      */   }
/*      */ 
/*      */   public void setnCofinsaliqVbc(BigDecimal nCofinsaliqVbc) {
/* 1702 */     this.nCofinsaliqVbc = nCofinsaliqVbc;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsaliqPconfins() {
/* 1706 */     return this.nCofinsaliqPconfins;
/*      */   }
/*      */ 
/*      */   public void setnCofinsaliqPconfins(BigDecimal nCofinsaliqPconfins) {
/* 1710 */     this.nCofinsaliqPconfins = nCofinsaliqPconfins;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnCofinsaliqVconfins() {
/* 1714 */     return this.nCofinsaliqVconfins;
/*      */   }
/*      */ 
/*      */   public void setnCofinsaliqVconfins(BigDecimal nCofinsaliqVconfins) {
/* 1718 */     this.nCofinsaliqVconfins = nCofinsaliqVconfins;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnVtottrib() {
/* 1722 */     return this.nVtottrib;
/*      */   }
/*      */ 
/*      */   public void setnVtottrib(BigDecimal nVtottrib) {
/* 1726 */     this.nVtottrib = nVtottrib;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVicmsdeson() {
/* 1730 */     return this.nIcmsVicmsdeson;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVicmsdeson(BigDecimal nIcmsVicmsdeson) {
/* 1734 */     this.nIcmsVicmsdeson = nIcmsVicmsdeson;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVicmsop() {
/* 1738 */     return this.nIcmsVicmsop;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVicmsop(BigDecimal nIcmsVicmsop) {
/* 1742 */     this.nIcmsVicmsop = nIcmsVicmsop;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsPdif() {
/* 1746 */     return this.nIcmsPdif;
/*      */   }
/*      */ 
/*      */   public void setnIcmsPdif(BigDecimal nIcmsPdif) {
/* 1750 */     this.nIcmsPdif = nIcmsPdif;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIcmsVicmsdif() {
/* 1754 */     return this.nIcmsVicmsdif;
/*      */   }
/*      */ 
/*      */   public void setnIcmsVicmsdif(BigDecimal nIcmsVicmsdif) {
/* 1758 */     this.nIcmsVicmsdif = nIcmsVicmsdif;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnNrecopi() {
/* 1762 */     return this.nNrecopi;
/*      */   }
/*      */ 
/*      */   public void setnNrecopi(BigDecimal nNrecopi) {
/* 1766 */     this.nNrecopi = nNrecopi;
/*      */   }
/*      */ 
/*      */   public String getsIssqnCsittrib()
/*      */   {
/* 1771 */     return this.sIssqnCsittrib;
/*      */   }
/*      */ 
/*      */   public void setsIssqnCsittrib(String sIssqnCsittrib)
/*      */   {
/* 1776 */     this.sIssqnCsittrib = sIssqnCsittrib;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnVDeducao()
/*      */   {
/* 1782 */     return this.nIssqnVDeducao;
/*      */   }
/*      */ 
/*      */   public void setnIssqnVDeducao(BigDecimal nIssqnVDeducao) {
/* 1786 */     this.nIssqnVDeducao = nIssqnVDeducao;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnVOutro() {
/* 1790 */     return this.nIssqnVOutro;
/*      */   }
/*      */ 
/*      */   public void setnIssqnVOutro(BigDecimal nIssqnVOutro) {
/* 1794 */     this.nIssqnVOutro = nIssqnVOutro;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnVDescIncond() {
/* 1798 */     return this.nIssqnVDescIncond;
/*      */   }
/*      */ 
/*      */   public void setnIssqnVDescIncond(BigDecimal nIssqnVDescIncond) {
/* 1802 */     this.nIssqnVDescIncond = nIssqnVDescIncond;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnVDescCond() {
/* 1806 */     return this.nIssqnVDescCond;
/*      */   }
/*      */ 
/*      */   public void setnIssqnVDescCond(BigDecimal nIssqnVDescCond) {
/* 1810 */     this.nIssqnVDescCond = nIssqnVDescCond;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnVIssRet() {
/* 1814 */     return this.nIssqnVIssRet;
/*      */   }
/*      */ 
/*      */   public void setnIssqnVIssRet(BigDecimal nIssqnVIssRet) {
/* 1818 */     this.nIssqnVIssRet = nIssqnVIssRet;
/*      */   }
/*      */ 
/*      */   public Integer getnIssqnIndIss() {
/* 1822 */     return this.nIssqnIndIss;
/*      */   }
/*      */ 
/*      */   public void setnIssqnIndIss(Integer nIssqnIndIss) {
/* 1826 */     this.nIssqnIndIss = nIssqnIndIss;
/*      */   }
/*      */ 
/*      */   public String getsIssqnCServico() {
/* 1830 */     return this.sIssqnCServico;
/*      */   }
/*      */ 
/*      */   public void setsIssqnCServico(String sIssqnCServico) {
/* 1834 */     this.sIssqnCServico = sIssqnCServico;
/*      */   }
/*      */ 
/*      */   public Integer getnIssqnCMun() {
/* 1838 */     return this.nIssqnCMun;
/*      */   }
/*      */ 
/*      */   public void setnIssqnCMun(Integer nIssqnCMun) {
/* 1842 */     this.nIssqnCMun = nIssqnCMun;
/*      */   }
/*      */ 
/*      */   public Integer getnIssqnCPais() {
/* 1846 */     return this.nIssqnCPais;
/*      */   }
/*      */ 
/*      */   public void setnIssqnCPais(Integer nIssqnCPais) {
/* 1850 */     this.nIssqnCPais = nIssqnCPais;
/*      */   }
/*      */ 
/*      */   public String getsIssqnNProcesso() {
/* 1854 */     return this.sIssqnNProcesso;
/*      */   }
/*      */ 
/*      */   public void setsIssqnNProcesso(String sIssqnNProcesso) {
/* 1858 */     this.sIssqnNProcesso = sIssqnNProcesso;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnIssqnIndIncentivo() {
/* 1862 */     return this.nIssqnIndIncentivo;
/*      */   }
/*      */ 
/*      */   public void setnIssqnIndIncentivo(BigDecimal nIssqnIndIncentivo) {
/* 1866 */     this.nIssqnIndIncentivo = nIssqnIndIncentivo;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnTdevpdevol()
/*      */   {
/* 1871 */     return this.nTdevpdevol;
/*      */   }
/*      */ 
/*      */   public void setnTdevpdevol(BigDecimal nTdevpdevol) {
/* 1875 */     this.nTdevpdevol = nTdevpdevol;
/*      */   }
/*      */ 
/*      */   public BigDecimal getnTdevvipidevol() {
/* 1879 */     return this.nTdevvipidevol;
/*      */   }
/*      */ 
/*      */   public void setnTdevvipidevol(BigDecimal nTdevvipidevol) {
/* 1883 */     this.nTdevvipidevol = nTdevvipidevol;
/*      */   }
/*      */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.entity.nfe.NfeItem
 * JD-Core Version:    0.6.0
 */