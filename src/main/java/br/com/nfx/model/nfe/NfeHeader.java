package br.com.nfx.model.nfe;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.nfx.util.EntityBase;

@Entity
@Table(name="nfe_header")
@NamedQuery(name="NfeHeader.findByTrxId", query="select h from NfeHeader h where h.customerTrxId = :customerTrxId order by h.sEmitCnpj, h.nSerie, h.nNnf")
@Named
public class NfeHeader extends EntityBase
  implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name="CUSTOMER_TRX_ID")
  private Long customerTrxId;

  @Column(name="TRANSACTION_ID")
  private Long transactionId;

  @Column(name="N_VERSAO")
  private BigDecimal nVersao;

  @Column(name="S_ID")
  private String sId;

  @Column(name="N_CUF")
  private Integer nCuf;

  @Column(name="N_CNF")
  private Integer nCnf;

  @Column(name="S_NATOP")
  private String sNatop;

  @Column(name="N_INDPAG")
  private Integer nIndpag;

  @Column(name="S_MOD")
  private String sMod;

  @Column(name="N_SERIE")
  private Integer nSerie;

  @Column(name="N_NNF")
  private Integer nNnf;

  @Column(name="D_DEMI")
  private Timestamp dDemi;

  @Column(name="D_SAIENT")
  private Timestamp dSaient;

  @Column(name="N_TPNF")
  private Integer nTpnf;

  @Column(name="N_IDDEST")
  private Integer nIddest;

  @Column(name="N_CMUNFG")
  private Integer nCmunfg;

  @Column(name="N_TPIMP")
  private Integer nTpimp;

  @Column(name="N_TPEMIS")
  private Integer nTpemis;

  @Column(name="N_CDV")
  private Integer nCdv;

  @Column(name="N_TPAMB")
  private Integer nTpamb;

  @Column(name="N_FINNFE")
  private Integer nFinnfe;

  @Column(name="N_INDFINAL")
  private Integer nIndfinal;

  @Column(name="N_INDPRES")
  private Integer nIndpres;

  @Column(name="N_PROCEMI")
  private Integer nProcemi;

  @Column(name="S_VERPROC")
  private String sVerproc;

  @Column(name="D_DHCONT")
  private Timestamp dDhcont;

  @Column(name="S_XJUST")
  private String sXjust;

  @Column(name="S_EMIT_CNPJ")
  private String sEmitCnpj;

  @Column(name="S_EMIT_CPF")
  private String sEmitCpf;

  @Column(name="S_EMIT_XNOME")
  private String sEmitXnome;

  @Column(name="S_EMIT_XFANT")
  private String sEmitXfant;

  @Column(name="S_EMIT_LGR")
  private String sEmitLgr;

  @Column(name="S_EMIT_NRO")
  private String sEmitNro;

  @Column(name="S_EMIT_XCPL")
  private String sEmitXcpl;

  @Column(name="S_EMIT_XBAIRRO")
  private String sEmitXbairro;

  @Column(name="N_EMIT_CMUN")
  private Integer nEmitCmun;

  @Column(name="S_EMIT_XMUN")
  private String sEmitXmun;

  @Column(name="S_EMIT_UF")
  private String sEmitUf;

  @Column(name="N_EMIT_CEP")
  private String nEmitCep;

  @Column(name="N_EMIT_CPAIS")
  private Integer nEmitCpais;

  @Column(name="S_EMIT_XPAIS")
  private String sEmitXpais;

  @Column(name="N_EMIT_FONE")
  private Long nEmitFone;

  @Column(name="S_EMIT_FONE")
  private String sEmitFone;

  @Column(name="S_EMIT_IE")
  private String sEmitIe;

  @Column(name="S_EMIT_IEST")
  private String sEmitIest;

  @Column(name="S_EMIT_IM")
  private String sEmitIm;

  @Column(name="S_EMIT_CNAE")
  private String sEmitCnae;

  @Column(name="S_EMIT_CRT")
  private Integer sEmitCrt;

  @Column(name="S_DEST_CNPJ")
  private String sDestCnpj;

  @Column(name="S_DEST_CPF")
  private String sDestCpf;

  @Column(name="S_DEST_IDESTRANGEIRO")
  private String sDestIdestrangeiro;

  @Column(name="S_DEST_XNOME")
  private String sDestXnome;

  @Column(name="S_DEST_XLGR")
  private String sDestXlgr;

  @Column(name="S_DEST_NRO")
  private String sDestNro;

  @Column(name="S_DEST_XCPL")
  private String sDestXcpl;

  @Column(name="S_DEST_XBAIRRO")
  private String sDestXbairro;

  @Column(name="S_DEST_CMUN")
  private Integer sDestCmun;

  @Column(name="S_DEST_XMUN")
  private String sDestXmun;

  @Column(name="S_DEST_UF")
  private String sDestUf;

  @Column(name="S_DEST_CEP")
  private String sDestCep;

  @Column(name="S_DEST_CPAIS")
  private Integer sDestCpais;

  @Column(name="S_DEST_XPAIS")
  private String sDestXpais;

  @Column(name="S_DEST_FONE")
  private Long sDestFone;

  @Column(name="N_DEST_FONE")
  private String nDestFone;

  @Column(name="N_DEST_INDIEDEST")
  private Integer nDestIndiedest;

  @Column(name="S_DEST_IE")
  private String sDestIe;

  @Column(name="S_DEST_IM")
  private String sDestIm;

  @Column(name="S_DEST_ISUF")
  private String sDestIsuf;

  @Column(name="S_DEST_EMAIL")
  private String sDestEmail;

  @Column(name="S_LRET_CNPJ")
  private String sLretCnpj;

  @Column(name="S_LRET_CPF")
  private String sLretCpf;

  @Column(name="S_LRET_XLGR")
  private String sLretXlgr;

  @Column(name="S_LRET_NRO")
  private String sLretNro;

  @Column(name="S_LRET_XCPL")
  private String sLretXcpl;

  @Column(name="S_LRET_XBAIRRO")
  private String sLretXbairro;

  @Column(name="S_LRET_CMUN")
  private Integer sLretCmun;

  @Column(name="S_LRET_XMUN")
  private String sLretXmun;

  @Column(name="S_LRET_UF")
  private String sLretUf;

  @Column(name="S_LENT_CNPJ")
  private String sLentCnpj;

  @Column(name="S_LENT_CPF")
  private String sLentCpf;

  @Column(name="S_LENT_XLGR")
  private String sLentXlgr;

  @Column(name="S_LENT_NRO")
  private String sLentNro;

  @Column(name="S_LENT_XCPL")
  private String sLentXcpl;

  @Column(name="S_LENT_XBAIRRO")
  private String sLentXbairro;

  @Column(name="S_LENT_CMUN")
  private Integer sLentCmun;

  @Column(name="S_LENT_XMUN")
  private String sLentXmun;

  @Column(name="S_LENT_UF")
  private String sLentUf;

  @Column(name="N_TOT_ICMS_VBC")
  private BigDecimal nTotIcmsVbc;

  @Column(name="N_TOT_ICMS_VICMS")
  private BigDecimal nTotIcmsVicms;

  @Column(name="N_TOT_ICMS_VICMSDESON")
  private BigDecimal nTotIcmsVicmsdeson;

  @Column(name="N_TOT_ICMS_VFCPUFDEST")
  private BigDecimal nTotIcmsVfcpufdest;

  @Column(name="N_TOT_ICMS_VICMSUFDEST")
  private BigDecimal nTotIcmsVicmsufdest;

  @Column(name="N_TOT_ICMS_VICMSUFREMET")
  private BigDecimal nTotIcmsVicmsufremet;

  @Column(name="N_TOT_ICMS_VBCST")
  private BigDecimal nTotIcmsVbcst;

  @Column(name="N_TOT_ICMS_VST")
  private BigDecimal nTotIcmsVst;

  @Column(name="N_TOT_ICMS_VPROD")
  private BigDecimal nTotIcmsVprod;

  @Column(name="N_TOT_ICMS_VFRETE")
  private BigDecimal nTotIcmsVfrete;

  @Column(name="N_TOT_ICMS_VSEG")
  private BigDecimal nTotIcmsVseg;

  @Column(name="N_TOT_ICMS_VDESC")
  private BigDecimal nTotIcmsVdesc;

  @Column(name="N_TOT_ICMS_VII")
  private BigDecimal nTotIcmsVii;

  @Column(name="N_TOT_ICMS_VIPI")
  private BigDecimal nTotIcmsVipi;

  @Column(name="N_TOT_ICMS_VPIS")
  private BigDecimal nTotIcmsVpis;

  @Column(name="N_TOT_ICMS_VCOFINS")
  private BigDecimal nTotIcmsVcofins;

  @Column(name="N_TOT_ICMS_VOUTRO")
  private BigDecimal nTotIcmsVoutro;

  @Column(name="N_TOT_ICMS_VNF")
  private BigDecimal nTotIcmsVnf;

  @Column(name="N_TOT_TOTTRIB")
  private BigDecimal nTotTottrib;

  @Column(name="N_TOT_ISSQN_VSERV")
  private BigDecimal nTotIssqnVserv;

  @Column(name="N_TOT_ISSQN_VBC")
  private BigDecimal nTotIssqnVbc;

  @Column(name="N_TOT_ISSQN_VISS")
  private BigDecimal nTotIssqnViss;

  @Column(name="N_TOT_ISSQN_VPIS")
  private BigDecimal nTotIssqnVpis;

  @Column(name="N_TOT_ISSQN_VCOFINS")
  private BigDecimal nTotIssqnVcofins;

  @Column(name="D_TOT_ISSQN_DCOMPET")
  private Date dTotIssqnDcompet;

  @Column(name="N_TOT_ISSQN_VDEDUCAO")
  private BigDecimal nTotIssqnVdeducao;

  @Column(name="N_TOT_ISSQN_VOUTRO")
  private BigDecimal nTotIssqnVoutro;

  @Column(name="N_TOT_ISSQN_VDESCINCOND")
  private BigDecimal nTotIssqnVdescincond;

  @Column(name="N_TOT_ISSQN_VDESCCOND")
  private BigDecimal nTotIssqnVdesccond;

  @Column(name="N_TOT_ISSQN_VISSRET")
  private BigDecimal nTotIssqnVissret;

  @Column(name="N_TOT_ISSQN_CREGTRIB")
  private BigDecimal nTotIssqnCregtrib;

  @Column(name="N_TOT_RET_VRETPIS")
  private BigDecimal nTotRetVretpis;

  @Column(name="N_TOT_RET_VRETCOFINS")
  private BigDecimal nTotRetVretcofins;

  @Column(name="N_TOT_RET_VRETCSLL")
  private BigDecimal nTotRetVretcsll;

  @Column(name="N_TOT_RET_VBCIRRF")
  private BigDecimal nTotRetVbcirrf;

  @Column(name="N_TOT_RET_VIRRF")
  private BigDecimal nTotRetVirrf;

  @Column(name="N_TOT_RET_VBCRETPREV")
  private BigDecimal nTotRetVbcretprev;

  @Column(name="N_TOT_RET_VRETPREV")
  private BigDecimal nTotRetVretprev;

  @Column(name="N_TRANSP_MODFRETE")
  private Integer nTranspModfrete;

  @Column(name="S_TRANSP_CNPJ")
  private String sTranspCnpj;

  @Column(name="S_TRANSP_CPF")
  private String sTranspCpf;

  @Column(name="S_TRANSP_XNOME")
  private String sTranspXnome;

  @Column(name="S_TRANSP_IE")
  private String sTranspIe;

  @Column(name="S_TRANSP_XENDER")
  private String sTranspXender;

  @Column(name="S_TRANSP_XMUN")
  private String sTranspXmun;

  @Column(name="S_TRANSP_UF")
  private String sTranspUf;

  @Column(name="N_TRANSP_VSERV")
  private BigDecimal nTranspVserv;

  @Column(name="N_TRANSP_VBCRET")
  private BigDecimal nTranspVbcret;

  @Column(name="N_TRANSP_PICMSRET")
  private BigDecimal nTranspPicmsret;

  @Column(name="N_TRANSP_VICMSRET")
  private BigDecimal nTranspVicmsret;

  @Column(name="N_TRANSP_CFOP")
  private Integer nTranspCfop;

  @Column(name="N_TRANSP_CMUNFG")
  private Integer nTranspCmunfg;

  @Column(name="S_TRANSP_PLACA")
  private String sTranspPlaca;

  @Column(name="S_TRANSP_PLACA_UF")
  private String sTranspPlacaUf;

  @Column(name="S_TRANSP_RNTC")
  private String sTranspRntc;

  @Column(name="S_TRANSP_VAGAO")
  private String sTranspVagao;

  @Column(name="S_TRANSP_BALSA")
  private String sTranspBalsa;

  @Column(name="S_COBR_FAT_NFAT")
  private String sCobrFatNfat;

  @Column(name="N_COBR_FAT_VORIG")
  private BigDecimal nCobrFatVorig;

  @Column(name="N_COBR_FAT_VDESC")
  private BigDecimal nCobrFatVdesc;

  @Column(name="N_COBR_FAT_VLIQ")
  private BigDecimal nCobrFatVliq;

  @Column(name="S_INFADFISCO")
  private String sInfadfisco;

  @Column(name="S_INFCPL")
  private String sInfcpl;

  @Column(name="S_NPROC")
  private String sNproc;

  @Column(name="N_INDPROC")
  private BigDecimal nIndproc;

  @Column(name="S_UFSAIDAPAIS")
  private String sUfsaidapais;

  @Column(name="S_XLOCEXPORTA")
  private String sXlocexporta;

  @Column(name="S_XLOCDESPACHO")
  private String sXlocdespacho;

  @Column(name="S_XNEMP")
  private String sXnemp;

  @Column(name="S_XPED")
  private String sXped;

  @Column(name="S_XCONT")
  private String sXcont;

  @Column(name="S_CANA_SAFRA")
  private String sCanaSafra;

  @Column(name="S_CANA_REF")
  private String sCanaRef;

  @Column(name="N_CANA_QTOTMES")
  private BigDecimal nCanaQtotmes;

  @Column(name="N_CANA_QTOTANT")
  private BigDecimal nCanaQtotant;

  @Column(name="N_CANA_QTOTGER")
  private BigDecimal nCanaQtotger;

  @Column(name="N_CANA_VFOR")
  private BigDecimal nCanaVfor;

  @Column(name="N_CANA_VTOTDED")
  private BigDecimal nCanaVtotded;

  @Column(name="N_CANA_VLIQFOR")
  private BigDecimal nCanaVliqfor;

  @Column(name="S_PRINTER_DS_IMPRESSORA")
  private String sPrinterDsImpressora;

  @Column(name="S_PRINTER_ORDEM_EMBARQUE")
  private String sPrinterOrdemEmbarque;

  @Column(name="S_PRINTER_USUARIO_EMITENTE")
  private String sPrinterUsuarioEmitente;

  @Transient
  private List<NfeCanaDeducao> nfeCanaDeducaoCollection;

  @Transient
  private List<NfeCanaDiario> nfeCanaDiarioCollection;

  @Transient
  private List<NfeDup> nfeDupCollection;

  @Transient
  private List<NfeReb> nfeRebCollection;

  @Transient
  private List<NfeRef> nfeRefCollection;

  @Transient
  private List<NfeVol> nfeVolCollection;

  @Transient
  private List<NfeVolLacres> nfeVolLacresCollection;

  @Transient
  private List<NfeItem> nfeItemCollection;

  @Transient
  private List<NfeItemDI> nfeItemDICollection;

  @Transient
  private List<NfeItemAdi> nfeItemAdiCollection;

  @Transient
  private List<NfeItemComb> nfeItemCombCollection;

  @Transient
  private List<NfeItemCamp> nfeItemCampCollection;

  @Transient
  private List<NfeItemVeic> nfeItemVeicCollection;

  @Transient
  private List<NfeItemMed> nfeItemMedCollection;

  @Transient
  private List<NfeAut> nfeAutCollection;

  @Transient
  private List<NfePag> nfePagCollection;

  @Transient
  private List<NfeItemExp> nfeItemExpCollection;

  @Transient
  private List<NfeItemNve> nfeItemNveCollection;

  public Long getCustomerTrxId()
  {
/*  572 */     return this.customerTrxId;
  }

  public void setCustomerTrxId(Long customerTrxId) {
/*  576 */     this.customerTrxId = customerTrxId;
  }

  public Long getTransactionId() {
/*  580 */     return this.transactionId;
  }

  public void setTransactionId(Long transactionId) {
     this.transactionId = transactionId;
  }

  public BigDecimal getnVersao() {
     return this.nVersao;
  }

  public void setnVersao(BigDecimal nVersao) {
     this.nVersao = nVersao;
  }

  public String getsId() {
     return this.sId;
  }

  public void setsId(String sId) {
     this.sId = sId;
  }

  public Integer getnCuf() {
     return this.nCuf;
  }

  public void setnCuf(Integer nCuf) {
     this.nCuf = nCuf;
  }

  public Integer getnCnf() {
     return this.nCnf;
  }

  public void setnCnf(Integer nCnf) {
     this.nCnf = nCnf;
  }

  public String getsNatop() {
     return this.sNatop;
  }

  public void setsNatop(String sNatop) {
     this.sNatop = sNatop;
  }

  public Integer getnIndpag() {
     return this.nIndpag;
  }

  public void setnIndpag(Integer nIndpag) {
     this.nIndpag = nIndpag;
  }

  public String getsMod() {
     return this.sMod;
  }

  public void setsMod(String sMod) {
     this.sMod = sMod;
  }

  public Integer getnSerie() {
     return this.nSerie;
  }

  public void setnSerie(Integer nSerie) {
     this.nSerie = nSerie;
  }

  public Integer getnNnf() {
     return this.nNnf;
  }

  public void setnNnf(Integer nNnf) {
     this.nNnf = nNnf;
  }

  public Timestamp getdDemi() {
     return this.dDemi;
  }

  public void setdDemi(Timestamp dDemi) {
     this.dDemi = dDemi;
  }

  public Timestamp getdSaient() {
     return this.dSaient;
  }

  public void setdSaient(Timestamp dSaient) {
     this.dSaient = dSaient;
  }

  public Integer getnTpnf() {
	  //if(nTpnf == null){
		  nTpnf = 1;
	 // }
	  System.out.println(nTpnf);
     return this.nTpnf;
  }

  public void setnTpnf(Integer nTpnf) {
     this.nTpnf = nTpnf;
  }

  public Integer getnCmunfg() {
     return this.nCmunfg;
  }

  public List<NfeItemNve> getNfeItemNveCollection() {
     return this.nfeItemNveCollection;
  }

  public void setNfeItemNveCollection(List<NfeItemNve> nfeItemNveCollection) {
     this.nfeItemNveCollection = nfeItemNveCollection;
  }

  public void setnCmunfg(Integer nCmunfg) {
     this.nCmunfg = nCmunfg;
  }

  public Integer getnTpimp() {
/*  700 */     return this.nTpimp;
  }

  public void setnTpimp(Integer nTpimp) {
/*  704 */     this.nTpimp = nTpimp;
  }

  public Integer getnTpemis() {
/*  708 */     return this.nTpemis;
  }

  public void setnTpemis(Integer nTpemis) {
/*  712 */     this.nTpemis = nTpemis;
  }

  public Integer getnCdv() {
/*  716 */     return this.nCdv;
  }

  public void setnCdv(Integer nCdv) {
/*  720 */     this.nCdv = nCdv;
  }

  public Integer getnTpamb() {
/*  724 */     return this.nTpamb;
  }

  public void setnTpamb(Integer nTpamb) {
/*  728 */     this.nTpamb = nTpamb;
  }

  public Integer getnFinnfe() {
/*  732 */     return this.nFinnfe;
  }

  public void setnFinnfe(Integer nFinnfe) {
/*  736 */     this.nFinnfe = nFinnfe;
  }

  public Integer getnProcemi() {
/*  740 */     return this.nProcemi;
  }

  public void setnProcemi(Integer nProcemi) {
/*  744 */     this.nProcemi = nProcemi;
  }

  public String getsVerproc() {
/*  748 */     return this.sVerproc;
  }

  public void setsVerproc(String sVerproc) {
/*  752 */     this.sVerproc = sVerproc;
  }

  public Timestamp getdDhcont() {
/*  756 */     return this.dDhcont;
  }

  public void setdDhcont(Timestamp dDhcont) {
/*  760 */     this.dDhcont = dDhcont;
  }

  public String getsXjust() {
/*  764 */     return this.sXjust;
  }

  public void setsXjust(String sXjust) {
/*  768 */     this.sXjust = sXjust;
  }

  public String getsEmitCnpj() {
/*  772 */     return this.sEmitCnpj;
  }

  public void setsEmitCnpj(String sEmitCnpj) {
/*  776 */     this.sEmitCnpj = sEmitCnpj;
  }

  public String getsEmitCpf() {
/*  780 */     return this.sEmitCpf;
  }

  public void setsEmitCpf(String sEmitCpf) {
/*  784 */     this.sEmitCpf = sEmitCpf;
  }

  public String getsEmitXnome() {
/*  788 */     return this.sEmitXnome;
  }

  public void setsEmitXnome(String sEmitXnome) {
/*  792 */     this.sEmitXnome = sEmitXnome;
  }

  public String getsEmitXfant() {
/*  796 */     return this.sEmitXfant;
  }

  public void setsEmitXfant(String sEmitXfant) {
/*  800 */     this.sEmitXfant = sEmitXfant;
  }

  public String getsEmitLgr() {
/*  804 */     return this.sEmitLgr;
  }

  public void setsEmitLgr(String sEmitLgr) {
/*  808 */     this.sEmitLgr = sEmitLgr;
  }

  public String getsEmitNro() {
/*  812 */     return this.sEmitNro;
  }

  public void setsEmitNro(String sEmitNro) {
/*  816 */     this.sEmitNro = sEmitNro;
  }

  public String getsEmitXcpl() {
/*  820 */     return this.sEmitXcpl;
  }

  public void setsEmitXcpl(String sEmitXcpl) {
/*  824 */     this.sEmitXcpl = sEmitXcpl;
  }

  public String getsEmitXbairro() {
/*  828 */     return this.sEmitXbairro;
  }

  public void setsEmitXbairro(String sEmitXbairro) {
/*  832 */     this.sEmitXbairro = sEmitXbairro;
  }

  public Integer getnEmitCmun() {
/*  836 */     return this.nEmitCmun;
  }

  public void setnEmitCmun(Integer nEmitCmun) {
/*  840 */     this.nEmitCmun = nEmitCmun;
  }

  public String getsEmitXmun() {
/*  844 */     return this.sEmitXmun;
  }

  public void setsEmitXmun(String sEmitXmun) {
/*  848 */     this.sEmitXmun = sEmitXmun;
  }

  public String getsEmitUf() {
/*  852 */     return this.sEmitUf;
  }

  public void setsEmitUf(String sEmitUf) {
/*  856 */     this.sEmitUf = sEmitUf;
  }

  public Integer getnEmitCpais() {
/*  860 */     return this.nEmitCpais;
  }

  public void setnEmitCpais(Integer nEmitCpais) {
/*  864 */     this.nEmitCpais = nEmitCpais;
  }

  public String getsEmitXpais() {
/*  868 */     return this.sEmitXpais;
  }

  public void setsEmitXpais(String sEmitXpais) {
/*  872 */     this.sEmitXpais = sEmitXpais;
  }

  public Long getnEmitFone() {
/*  876 */     return this.nEmitFone;
  }

  public void setnEmitFone(Long nEmitFone) {
/*  880 */     this.nEmitFone = nEmitFone;
  }

  public String getsEmitFone() {
/*  884 */     return this.sEmitFone;
  }

  public void setsEmitFone(String sEmitFone) {
/*  888 */     this.sEmitFone = sEmitFone;
  }

  public String getsEmitIe() {
/*  892 */     return this.sEmitIe;
  }

  public void setsEmitIe(String sEmitIe) {
/*  896 */     this.sEmitIe = sEmitIe;
  }

  public String getsEmitIest() {
/*  900 */     return this.sEmitIest;
  }

  public void setsEmitIest(String sEmitIest) {
/*  904 */     this.sEmitIest = sEmitIest;
  }

  public String getsEmitIm() {
/*  908 */     return this.sEmitIm;
  }

  public void setsEmitIm(String sEmitIm) {
/*  912 */     this.sEmitIm = sEmitIm;
  }

  public String getsEmitCnae() {
/*  916 */     return this.sEmitCnae;
  }

  public void setsEmitCnae(String sEmitCnae) {
/*  920 */     this.sEmitCnae = sEmitCnae;
  }

  public Integer getsEmitCrt() {
/*  924 */     return this.sEmitCrt;
  }

  public void setsEmitCrt(Integer sEmitCrt) {
/*  928 */     this.sEmitCrt = sEmitCrt;
  }

  public String getsDestCnpj() {
/*  932 */     return this.sDestCnpj;
  }

  public void setsDestCnpj(String sDestCnpj) {
/*  936 */     this.sDestCnpj = sDestCnpj;
  }

  public String getsDestCpf() {
/*  940 */     return this.sDestCpf;
  }

  public void setsDestCpf(String sDestCpf) {
/*  944 */     this.sDestCpf = sDestCpf;
  }

  public String getsDestXnome() {
/*  948 */     return this.sDestXnome;
  }

  public void setsDestXnome(String sDestXnome) {
/*  952 */     this.sDestXnome = sDestXnome;
  }

  public String getsDestXlgr() {
/*  956 */     return this.sDestXlgr;
  }

  public void setsDestXlgr(String sDestXlgr) {
/*  960 */     this.sDestXlgr = sDestXlgr;
  }

  public String getsDestNro() {
/*  964 */     return this.sDestNro;
  }

  public void setsDestNro(String sDestNro) {
/*  968 */     this.sDestNro = sDestNro;
  }

  public String getsDestXcpl() {
/*  972 */     return this.sDestXcpl;
  }

  public void setsDestXcpl(String sDestXcpl) {
/*  976 */     this.sDestXcpl = sDestXcpl;
  }

  public String getsDestXbairro() {
/*  980 */     return this.sDestXbairro;
  }

  public void setsDestXbairro(String sDestXbairro) {
/*  984 */     this.sDestXbairro = sDestXbairro;
  }

  public Integer getsDestCmun() {
/*  988 */     return this.sDestCmun;
  }

  public void setsDestCmun(Integer sDestCmun) {
/*  992 */     this.sDestCmun = sDestCmun;
  }

  public String getsDestXmun() {
/*  996 */     return this.sDestXmun;
  }

  public void setsDestXmun(String sDestXmun) {
/* 1000 */     this.sDestXmun = sDestXmun;
  }

  public String getsDestUf() {
/* 1004 */     return this.sDestUf;
  }

  public void setsDestUf(String sDestUf) {
/* 1008 */     this.sDestUf = sDestUf;
  }

  public Integer getsDestCpais() {
/* 1012 */     return this.sDestCpais;
  }

  public void setsDestCpais(Integer sDestCpais) {
/* 1016 */     this.sDestCpais = sDestCpais;
  }

  public String getsDestXpais() {
/* 1020 */     return this.sDestXpais;
  }

  public void setsDestXpais(String sDestXpais) {
/* 1024 */     this.sDestXpais = sDestXpais;
  }

  public Long getsDestFone() {
/* 1028 */     return this.sDestFone;
  }

  public void setsDestFone(Long sDestFone) {
/* 1032 */     this.sDestFone = sDestFone;
  }

  public String getnDestFone() {
/* 1036 */     return this.nDestFone;
  }

  public void setnDestFone(String nDestFone) {
/* 1040 */     this.nDestFone = nDestFone;
  }

  public String getsDestIe() {
/* 1044 */     return this.sDestIe;
  }

  public void setsDestIe(String sDestIe) {
/* 1048 */     this.sDestIe = sDestIe;
  }

  public String getsDestIsuf() {
/* 1052 */     return this.sDestIsuf;
  }

  public void setsDestIsuf(String sDestIsuf) {
/* 1056 */     this.sDestIsuf = sDestIsuf;
  }

  public String getsDestEmail() {
/* 1060 */     return this.sDestEmail;
  }

  public void setsDestEmail(String sDestEmail) {
/* 1064 */     this.sDestEmail = sDestEmail;
  }

  public String getsLretCnpj() {
/* 1068 */     return this.sLretCnpj;
  }

  public void setsLretCnpj(String sLretCnpj) {
/* 1072 */     this.sLretCnpj = sLretCnpj;
  }

  public String getsLretCpf() {
/* 1076 */     return this.sLretCpf;
  }

  public void setsLretCpf(String sLretCpf) {
/* 1080 */     this.sLretCpf = sLretCpf;
  }

  public String getsLretXlgr() {
/* 1084 */     return this.sLretXlgr;
  }

  public void setsLretXlgr(String sLretXlgr) {
/* 1088 */     this.sLretXlgr = sLretXlgr;
  }

  public String getsLretNro() {
/* 1092 */     return this.sLretNro;
  }

  public void setsLretNro(String sLretNro) {
/* 1096 */     this.sLretNro = sLretNro;
  }

  public String getsLretXcpl() {
/* 1100 */     return this.sLretXcpl;
  }

  public void setsLretXcpl(String sLretXcpl) {
/* 1104 */     this.sLretXcpl = sLretXcpl;
  }

  public String getsLretXbairro() {
/* 1108 */     return this.sLretXbairro;
  }

  public void setsLretXbairro(String sLretXbairro) {
/* 1112 */     this.sLretXbairro = sLretXbairro;
  }

  public Integer getsLretCmun() {
/* 1116 */     return this.sLretCmun;
  }

  public void setsLretCmun(Integer sLretCmun) {
/* 1120 */     this.sLretCmun = sLretCmun;
  }

  public String getsLretXmun() {
/* 1124 */     return this.sLretXmun;
  }

  public void setsLretXmun(String sLretXmun) {
/* 1128 */     this.sLretXmun = sLretXmun;
  }

  public String getsLretUf() {
/* 1132 */     return this.sLretUf;
  }

  public void setsLretUf(String sLretUf) {
/* 1136 */     this.sLretUf = sLretUf;
  }

  public String getsLentCnpj() {
/* 1140 */     return this.sLentCnpj;
  }

  public void setsLentCnpj(String sLentCnpj) {
/* 1144 */     this.sLentCnpj = sLentCnpj;
  }

  public String getsLentCpf() {
/* 1148 */     return this.sLentCpf;
  }

  public void setsLentCpf(String sLentCpf) {
/* 1152 */     this.sLentCpf = sLentCpf;
  }

  public String getsLentXlgr() {
/* 1156 */     return this.sLentXlgr;
  }

  public void setsLentXlgr(String sLentXlgr) {
/* 1160 */     this.sLentXlgr = sLentXlgr;
  }

  public String getsLentNro() {
/* 1164 */     return this.sLentNro;
  }

  public void setsLentNro(String sLentNro) {
/* 1168 */     this.sLentNro = sLentNro;
  }

  public String getsLentXcpl() {
/* 1172 */     return this.sLentXcpl;
  }

  public void setsLentXcpl(String sLentXcpl) {
/* 1176 */     this.sLentXcpl = sLentXcpl;
  }

  public String getsLentXbairro() {
/* 1180 */     return this.sLentXbairro;
  }

  public void setsLentXbairro(String sLentXbairro) {
/* 1184 */     this.sLentXbairro = sLentXbairro;
  }

  public Integer getsLentCmun() {
/* 1188 */     return this.sLentCmun;
  }

  public void setsLentCmun(Integer sLentCmun) {
/* 1192 */     this.sLentCmun = sLentCmun;
  }

  public String getsLentXmun() {
/* 1196 */     return this.sLentXmun;
  }

  public void setsLentXmun(String sLentXmun) {
/* 1200 */     this.sLentXmun = sLentXmun;
  }

  public String getsLentUf() {
/* 1204 */     return this.sLentUf;
  }

  public void setsLentUf(String sLentUf) {
/* 1208 */     this.sLentUf = sLentUf;
  }

  public BigDecimal getnTotIcmsVbc() {
/* 1212 */     return this.nTotIcmsVbc;
  }

  public void setnTotIcmsVbc(BigDecimal nTotIcmsVbc) {
/* 1216 */     this.nTotIcmsVbc = nTotIcmsVbc;
  }

  public BigDecimal getnTotIcmsVicms() {
/* 1220 */     return this.nTotIcmsVicms;
  }

  public void setnTotIcmsVicms(BigDecimal nTotIcmsVicms) {
/* 1224 */     this.nTotIcmsVicms = nTotIcmsVicms;
  }

  public BigDecimal getnTotIcmsVbcst() {
/* 1228 */     return this.nTotIcmsVbcst;
  }

  public void setnTotIcmsVbcst(BigDecimal nTotIcmsVbcst) {
/* 1232 */     this.nTotIcmsVbcst = nTotIcmsVbcst;
  }

  public BigDecimal getnTotIcmsVst() {
/* 1236 */     return this.nTotIcmsVst;
  }

  public void setnTotIcmsVst(BigDecimal nTotIcmsVst) {
/* 1240 */     this.nTotIcmsVst = nTotIcmsVst;
  }

  public BigDecimal getnTotIcmsVprod() {
/* 1244 */     return this.nTotIcmsVprod;
  }

  public void setnTotIcmsVprod(BigDecimal nTotIcmsVprod) {
/* 1248 */     this.nTotIcmsVprod = nTotIcmsVprod;
  }

  public BigDecimal getnTotIcmsVfrete() {
/* 1252 */     return this.nTotIcmsVfrete;
  }

  public void setnTotIcmsVfrete(BigDecimal nTotIcmsVfrete) {
/* 1256 */     this.nTotIcmsVfrete = nTotIcmsVfrete;
  }

  public BigDecimal getnTotIcmsVseg() {
/* 1260 */     return this.nTotIcmsVseg;
  }

  public void setnTotIcmsVseg(BigDecimal nTotIcmsVseg) {
/* 1264 */     this.nTotIcmsVseg = nTotIcmsVseg;
  }

  public BigDecimal getnTotIcmsVdesc() {
/* 1268 */     return this.nTotIcmsVdesc;
  }

  public void setnTotIcmsVdesc(BigDecimal nTotIcmsVdesc) {
/* 1272 */     this.nTotIcmsVdesc = nTotIcmsVdesc;
  }

  public BigDecimal getnTotIcmsVii() {
/* 1276 */     return this.nTotIcmsVii;
  }

  public void setnTotIcmsVii(BigDecimal nTotIcmsVii) {
/* 1280 */     this.nTotIcmsVii = nTotIcmsVii;
  }

  public BigDecimal getnTotIcmsVipi() {
/* 1284 */     return this.nTotIcmsVipi;
  }

  public void setnTotIcmsVipi(BigDecimal nTotIcmsVipi) {
/* 1288 */     this.nTotIcmsVipi = nTotIcmsVipi;
  }

  public BigDecimal getnTotIcmsVpis() {
/* 1292 */     return this.nTotIcmsVpis;
  }

  public void setnTotIcmsVpis(BigDecimal nTotIcmsVpis) {
/* 1296 */     this.nTotIcmsVpis = nTotIcmsVpis;
  }

  public BigDecimal getnTotIcmsVcofins() {
/* 1300 */     return this.nTotIcmsVcofins;
  }

  public void setnTotIcmsVcofins(BigDecimal nTotIcmsVcofins) {
/* 1304 */     this.nTotIcmsVcofins = nTotIcmsVcofins;
  }

  public BigDecimal getnTotIcmsVoutro() {
/* 1308 */     return this.nTotIcmsVoutro;
  }

  public void setnTotIcmsVoutro(BigDecimal nTotIcmsVoutro) {
/* 1312 */     this.nTotIcmsVoutro = nTotIcmsVoutro;
  }

  public BigDecimal getnTotIcmsVnf() {
/* 1316 */     return this.nTotIcmsVnf;
  }

  public void setnTotIcmsVnf(BigDecimal nTotIcmsVnf) {
/* 1320 */     this.nTotIcmsVnf = nTotIcmsVnf;
  }

  public BigDecimal getnTotTottrib() {
/* 1324 */     return this.nTotTottrib;
  }

  public void setnTotTottrib(BigDecimal nTotTottrib) {
/* 1328 */     this.nTotTottrib = nTotTottrib;
  }

  public BigDecimal getnTotIssqnVserv() {
/* 1332 */     return this.nTotIssqnVserv;
  }

  public void setnTotIssqnVserv(BigDecimal nTotIssqnVserv) {
/* 1336 */     this.nTotIssqnVserv = nTotIssqnVserv;
  }

  public BigDecimal getnTotIssqnVbc() {
/* 1340 */     return this.nTotIssqnVbc;
  }

  public void setnTotIssqnVbc(BigDecimal nTotIssqnVbc) {
/* 1344 */     this.nTotIssqnVbc = nTotIssqnVbc;
  }

  public BigDecimal getnTotIssqnViss() {
/* 1348 */     return this.nTotIssqnViss;
  }

  public void setnTotIssqnViss(BigDecimal nTotIssqnViss) {
/* 1352 */     this.nTotIssqnViss = nTotIssqnViss;
  }

  public BigDecimal getnTotIssqnVpis() {
/* 1356 */     return this.nTotIssqnVpis;
  }

  public void setnTotIssqnVpis(BigDecimal nTotIssqnVpis) {
/* 1360 */     this.nTotIssqnVpis = nTotIssqnVpis;
  }

  public BigDecimal getnTotIssqnVcofins() {
/* 1364 */     return this.nTotIssqnVcofins;
  }

  public void setnTotIssqnVcofins(BigDecimal nTotIssqnVcofins) {
/* 1368 */     this.nTotIssqnVcofins = nTotIssqnVcofins;
  }

  public BigDecimal getnTotRetVretpis() {
/* 1372 */     return this.nTotRetVretpis;
  }

  public void setnTotRetVretpis(BigDecimal nTotRetVretpis) {
/* 1376 */     this.nTotRetVretpis = nTotRetVretpis;
  }

  public BigDecimal getnTotRetVretcofins() {
/* 1380 */     return this.nTotRetVretcofins;
  }

  public void setnTotRetVretcofins(BigDecimal nTotRetVretcofins) {
/* 1384 */     this.nTotRetVretcofins = nTotRetVretcofins;
  }

  public BigDecimal getnTotRetVretcsll() {
/* 1388 */     return this.nTotRetVretcsll;
  }

  public void setnTotRetVretcsll(BigDecimal nTotRetVretcsll) {
/* 1392 */     this.nTotRetVretcsll = nTotRetVretcsll;
  }

  public BigDecimal getnTotRetVbcirrf() {
/* 1396 */     return this.nTotRetVbcirrf;
  }

  public void setnTotRetVbcirrf(BigDecimal nTotRetVbcirrf) {
/* 1400 */     this.nTotRetVbcirrf = nTotRetVbcirrf;
  }

  public BigDecimal getnTotRetVirrf() {
/* 1404 */     return this.nTotRetVirrf;
  }

  public void setnTotRetVirrf(BigDecimal nTotRetVirrf) {
/* 1408 */     this.nTotRetVirrf = nTotRetVirrf;
  }

  public BigDecimal getnTotRetVbcretprev() {
/* 1412 */     return this.nTotRetVbcretprev;
  }

  public void setnTotRetVbcretprev(BigDecimal nTotRetVbcretprev) {
/* 1416 */     this.nTotRetVbcretprev = nTotRetVbcretprev;
  }

  public BigDecimal getnTotRetVretprev() {
/* 1420 */     return this.nTotRetVretprev;
  }

  public void setnTotRetVretprev(BigDecimal nTotRetVretprev) {
/* 1424 */     this.nTotRetVretprev = nTotRetVretprev;
  }

  public Integer getnTranspModfrete() {
/* 1428 */     return this.nTranspModfrete;
  }

  public void setnTranspModfrete(Integer nTranspModfrete) {
/* 1432 */     this.nTranspModfrete = nTranspModfrete;
  }

  public String getsTranspCnpj() {
/* 1436 */     return this.sTranspCnpj;
  }

  public void setsTranspCnpj(String sTranspCnpj) {
/* 1440 */     this.sTranspCnpj = sTranspCnpj;
  }

  public String getsTranspCpf() {
/* 1444 */     return this.sTranspCpf;
  }

  public void setsTranspCpf(String sTranspCpf) {
/* 1448 */     this.sTranspCpf = sTranspCpf;
  }

  public String getsTranspXnome() {
/* 1452 */     return this.sTranspXnome;
  }

  public void setsTranspXnome(String sTranspXnome) {
/* 1456 */     this.sTranspXnome = sTranspXnome;
  }

  public String getsTranspIe() {
/* 1460 */     return this.sTranspIe;
  }

  public void setsTranspIe(String sTranspIe) {
/* 1464 */     this.sTranspIe = sTranspIe;
  }

  public String getsTranspXender() {
/* 1468 */     return this.sTranspXender;
  }

  public void setsTranspXender(String sTranspXender) {
/* 1472 */     this.sTranspXender = sTranspXender;
  }

  public String getsTranspXmun() {
/* 1476 */     return this.sTranspXmun;
  }

  public void setsTranspXmun(String sTranspXmun) {
/* 1480 */     this.sTranspXmun = sTranspXmun;
  }

  public String getsTranspUf() {
/* 1484 */     return this.sTranspUf;
  }

  public void setsTranspUf(String sTranspUf) {
/* 1488 */     this.sTranspUf = sTranspUf;
  }

  public BigDecimal getnTranspVserv() {
/* 1492 */     return this.nTranspVserv;
  }

  public void setnTranspVserv(BigDecimal nTranspVserv) {
/* 1496 */     this.nTranspVserv = nTranspVserv;
  }

  public BigDecimal getnTranspVbcret() {
/* 1500 */     return this.nTranspVbcret;
  }

  public void setnTranspVbcret(BigDecimal nTranspVbcret) {
/* 1504 */     this.nTranspVbcret = nTranspVbcret;
  }

  public BigDecimal getnTranspPicmsret() {
/* 1508 */     return this.nTranspPicmsret;
  }

  public void setnTranspPicmsret(BigDecimal nTranspPicmsret) {
/* 1512 */     this.nTranspPicmsret = nTranspPicmsret;
  }

  public BigDecimal getnTranspVicmsret() {
/* 1516 */     return this.nTranspVicmsret;
  }

  public void setnTranspVicmsret(BigDecimal nTranspVicmsret) {
/* 1520 */     this.nTranspVicmsret = nTranspVicmsret;
  }

  public Integer getnTranspCfop() {
/* 1524 */     return this.nTranspCfop;
  }

  public void setnTranspCfop(Integer nTranspCfop) {
/* 1528 */     this.nTranspCfop = nTranspCfop;
  }

  public Integer getnTranspCmunfg() {
/* 1532 */     return this.nTranspCmunfg;
  }

  public void setnTranspCmunfg(Integer nTranspCmunfg) {
/* 1536 */     this.nTranspCmunfg = nTranspCmunfg;
  }

  public String getsTranspPlaca() {
/* 1540 */     return this.sTranspPlaca;
  }

  public void setsTranspPlaca(String sTranspPlaca) {
/* 1544 */     this.sTranspPlaca = sTranspPlaca;
  }

  public String getsTranspPlacaUf() {
/* 1548 */     return this.sTranspPlacaUf;
  }

  public void setsTranspPlacaUf(String sTranspPlacaUf) {
/* 1552 */     this.sTranspPlacaUf = sTranspPlacaUf;
  }

  public String getsTranspRntc() {
/* 1556 */     return this.sTranspRntc;
  }

  public void setsTranspRntc(String sTranspRntc) {
/* 1560 */     this.sTranspRntc = sTranspRntc;
  }

  public String getsTranspVagao() {
/* 1564 */     return this.sTranspVagao;
  }

  public void setsTranspVagao(String sTranspVagao) {
/* 1568 */     this.sTranspVagao = sTranspVagao;
  }

  public String getsTranspBalsa() {
/* 1572 */     return this.sTranspBalsa;
  }

  public void setsTranspBalsa(String sTranspBalsa) {
/* 1576 */     this.sTranspBalsa = sTranspBalsa;
  }

  public String getsCobrFatNfat() {
/* 1580 */     return this.sCobrFatNfat;
  }

  public void setsCobrFatNfat(String sCobrFatNfat) {
/* 1584 */     this.sCobrFatNfat = sCobrFatNfat;
  }

  public BigDecimal getnCobrFatVorig() {
/* 1588 */     return this.nCobrFatVorig;
  }

  public void setnCobrFatVorig(BigDecimal nCobrFatVorig) {
/* 1592 */     this.nCobrFatVorig = nCobrFatVorig;
  }

  public BigDecimal getnCobrFatVdesc() {
/* 1596 */     return this.nCobrFatVdesc;
  }

  public void setnCobrFatVdesc(BigDecimal nCobrFatVdesc) {
/* 1600 */     this.nCobrFatVdesc = nCobrFatVdesc;
  }

  public BigDecimal getnCobrFatVliq() {
/* 1604 */     return this.nCobrFatVliq;
  }

  public void setnCobrFatVliq(BigDecimal nCobrFatVliq) {
/* 1608 */     this.nCobrFatVliq = nCobrFatVliq;
  }

  public String getsInfadfisco() {
/* 1612 */     return this.sInfadfisco;
  }

  public void setsInfadfisco(String sInfadfisco) {
/* 1616 */     this.sInfadfisco = sInfadfisco;
  }

  public String getsInfcpl() {
/* 1620 */     return this.sInfcpl;
  }

  public void setsInfcpl(String sInfcpl) {
/* 1624 */     this.sInfcpl = sInfcpl;
  }

  public String getsNproc() {
/* 1628 */     return this.sNproc;
  }

  public void setsNproc(String sNproc) {
/* 1632 */     this.sNproc = sNproc;
  }

  public BigDecimal getnIndproc() {
/* 1636 */     return this.nIndproc;
  }

  public void setnIndproc(BigDecimal nIndproc) {
/* 1640 */     this.nIndproc = nIndproc;
  }

  public String getsXnemp() {
/* 1644 */     return this.sXnemp;
  }

  public void setsXnemp(String sXnemp) {
/* 1648 */     this.sXnemp = sXnemp;
  }

  public String getsXped() {
/* 1652 */     return this.sXped;
  }

  public void setsXped(String sXped) {
/* 1656 */     this.sXped = sXped;
  }

  public String getsXcont() {
/* 1660 */     return this.sXcont;
  }

  public void setsXcont(String sXcont) {
/* 1664 */     this.sXcont = sXcont;
  }

  public String getsCanaSafra() {
/* 1668 */     return this.sCanaSafra;
  }

  public void setsCanaSafra(String sCanaSafra) {
/* 1672 */     this.sCanaSafra = sCanaSafra;
  }

  public String getsCanaRef() {
/* 1676 */     return this.sCanaRef;
  }

  public void setsCanaRef(String sCanaRef) {
/* 1680 */     this.sCanaRef = sCanaRef;
  }

  public BigDecimal getnCanaQtotmes() {
/* 1684 */     return this.nCanaQtotmes;
  }

  public void setnCanaQtotmes(BigDecimal nCanaQtotmes) {
/* 1688 */     this.nCanaQtotmes = nCanaQtotmes;
  }

  public BigDecimal getnCanaQtotant() {
/* 1692 */     return this.nCanaQtotant;
  }

  public void setnCanaQtotant(BigDecimal nCanaQtotant) {
/* 1696 */     this.nCanaQtotant = nCanaQtotant;
  }

  public BigDecimal getnCanaQtotger() {
/* 1700 */     return this.nCanaQtotger;
  }

  public void setnCanaQtotger(BigDecimal nCanaQtotger) {
/* 1704 */     this.nCanaQtotger = nCanaQtotger;
  }

  public BigDecimal getnCanaVfor() {
/* 1708 */     return this.nCanaVfor;
  }

  public void setnCanaVfor(BigDecimal nCanaVfor) {
/* 1712 */     this.nCanaVfor = nCanaVfor;
  }

  public BigDecimal getnCanaVtotded() {
/* 1716 */     return this.nCanaVtotded;
  }

  public void setnCanaVtotded(BigDecimal nCanaVtotded) {
/* 1720 */     this.nCanaVtotded = nCanaVtotded;
  }

  public BigDecimal getnCanaVliqfor() {
/* 1724 */     return this.nCanaVliqfor;
  }

  public void setnCanaVliqfor(BigDecimal nCanaVliqfor) {
/* 1728 */     this.nCanaVliqfor = nCanaVliqfor;
  }

  public String getnEmitCep() {
/* 1732 */     return this.nEmitCep;
  }

  public void setnEmitCep(String nEmitCep) {
/* 1736 */     this.nEmitCep = nEmitCep;
  }

  public String getsDestCep() {
/* 1740 */     return this.sDestCep;
  }

  public void setsDestCep(String sDestCep) {
/* 1744 */     this.sDestCep = sDestCep;
  }

  public Integer getnIddest() {
/* 1748 */     return this.nIddest;
  }

  public void setnIddest(Integer nIddest) {
/* 1752 */     this.nIddest = nIddest;
  }

  public Integer getnIndfinal() {
/* 1756 */     return this.nIndfinal;
  }

  public void setnIndfinal(Integer nIndfinal) {
/* 1760 */     this.nIndfinal = nIndfinal;
  }

  public Integer getnIndpres() {
/* 1764 */     return this.nIndpres;
  }

  public void setnIndpres(Integer nIndpres) {
/* 1768 */     this.nIndpres = nIndpres;
  }

  public String getsDestIdestrangeiro() {
/* 1772 */     return this.sDestIdestrangeiro;
  }

  public void setsDestIdestrangeiro(String sDestIdestrangeiro) {
/* 1776 */     this.sDestIdestrangeiro = sDestIdestrangeiro;
  }

  public Integer getnDestIndiedest() {
/* 1780 */     return this.nDestIndiedest;
  }

  public void setnDestIndiedest(Integer nDestIndiedest) {
/* 1784 */     this.nDestIndiedest = nDestIndiedest;
  }

  public String getsDestIm() {
/* 1788 */     return this.sDestIm;
  }

  public void setsDestIm(String sDestIm) {
/* 1792 */     this.sDestIm = sDestIm;
  }

  public BigDecimal getnTotIcmsVicmsdeson() {
/* 1796 */     return this.nTotIcmsVicmsdeson;
  }

  public void setnTotIcmsVicmsdeson(BigDecimal nTotIcmsVicmsdeson) {
/* 1800 */     this.nTotIcmsVicmsdeson = nTotIcmsVicmsdeson;
  }

  public BigDecimal getnTotIcmsVfcpufdest() {
/* 1804 */     return this.nTotIcmsVfcpufdest;
  }
  public void setnTotIcmsVfcpufdest(BigDecimal nTotIcmsVfcpufdest) {
/* 1807 */     this.nTotIcmsVfcpufdest = nTotIcmsVfcpufdest;
  }
  public BigDecimal getnTotIcmsVicmsufdest() {
/* 1810 */     return this.nTotIcmsVicmsufdest;
  }

  public void setnTotIcmsVicmsufdest(BigDecimal nTotIcmsVicmsufdest) {
/* 1814 */     this.nTotIcmsVicmsufdest = nTotIcmsVicmsufdest;
  }

  public BigDecimal getnTotIcmsVicmsufremet() {
/* 1818 */     return this.nTotIcmsVicmsufremet;
  }

  public void setnTotIcmsVicmsufremet(BigDecimal nTotIcmsVicmsufremet) {
/* 1822 */     this.nTotIcmsVicmsufremet = nTotIcmsVicmsufremet;
  }

  public Date getdTotIssqnDcompet() {
/* 1826 */     return this.dTotIssqnDcompet;
  }

  public void setdTotIssqnDcompet(Date dTotIssqnDcompet) {
/* 1830 */     this.dTotIssqnDcompet = dTotIssqnDcompet;
  }

  public BigDecimal getnTotIssqnVdeducao() {
/* 1834 */     return this.nTotIssqnVdeducao;
  }

  public void setnTotIssqnVdeducao(BigDecimal nTotIssqnVdeducao) {
/* 1838 */     this.nTotIssqnVdeducao = nTotIssqnVdeducao;
  }

  public BigDecimal getnTotIssqnVoutro() {
/* 1842 */     return this.nTotIssqnVoutro;
  }

  public void setnTotIssqnVoutro(BigDecimal nTotIssqnVoutro) {
/* 1846 */     this.nTotIssqnVoutro = nTotIssqnVoutro;
  }

  public BigDecimal getnTotIssqnVdescincond() {
/* 1850 */     return this.nTotIssqnVdescincond;
  }

  public void setnTotIssqnVdescincond(BigDecimal nTotIssqnVdescincond) {
/* 1854 */     this.nTotIssqnVdescincond = nTotIssqnVdescincond;
  }

  public BigDecimal getnTotIssqnVdesccond() {
/* 1858 */     return this.nTotIssqnVdesccond;
  }

  public void setnTotIssqnVdesccond(BigDecimal nTotIssqnVdesccond) {
/* 1862 */     this.nTotIssqnVdesccond = nTotIssqnVdesccond;
  }

  public BigDecimal getnTotIssqnVissret() {
/* 1866 */     return this.nTotIssqnVissret;
  }

  public void setnTotIssqnVissret(BigDecimal nTotIssqnVissret) {
/* 1870 */     this.nTotIssqnVissret = nTotIssqnVissret;
  }

  public BigDecimal getnTotIssqnCregtrib() {
/* 1874 */     return this.nTotIssqnCregtrib;
  }

  public void setnTotIssqnCregtrib(BigDecimal nTotIssqnCregtrib) {
/* 1878 */     this.nTotIssqnCregtrib = nTotIssqnCregtrib;
  }

  public String getsUfsaidapais() {
/* 1882 */     return this.sUfsaidapais;
  }

  public void setsUfsaidapais(String sUfsaidapais) {
/* 1886 */     this.sUfsaidapais = sUfsaidapais;
  }

  public String getsXlocexporta() {
/* 1890 */     return this.sXlocexporta;
  }

  public void setsXlocexporta(String sXlocexporta) {
/* 1894 */     this.sXlocexporta = sXlocexporta;
  }

  public String getsXlocdespacho() {
/* 1898 */     return this.sXlocdespacho;
  }

  public void setsXlocdespacho(String sXlocdespacho) {
/* 1902 */     this.sXlocdespacho = sXlocdespacho;
  }

  public List<NfeCanaDeducao> getNfeCanaDeducaoCollection() {
/* 1906 */     return this.nfeCanaDeducaoCollection;
  }

  public String getsPrinterDsImpressora() {
/* 1910 */     return this.sPrinterDsImpressora;
  }

  public void setsPrinterDsImpressora(String sPrinterDsImpressora) {
/* 1914 */     this.sPrinterDsImpressora = sPrinterDsImpressora;
  }

  public String getsPrinterOrdemEmbarque() {
/* 1918 */     return this.sPrinterOrdemEmbarque;
  }

  public void setsPrinterOrdemEmbarque(String sPrinterOrdemEmbarque) {
/* 1922 */     this.sPrinterOrdemEmbarque = sPrinterOrdemEmbarque;
  }

  public String getsPrinterUsuarioEmitente() {
/* 1926 */     return this.sPrinterUsuarioEmitente;
  }

  public void setsPrinterUsuarioEmitente(String sPrinterUsuarioEmitente) {
/* 1930 */     this.sPrinterUsuarioEmitente = sPrinterUsuarioEmitente;
  }

  public void setNfeCanaDeducaoCollection(List<NfeCanaDeducao> nfeCanaDeducaoCollection)
  {
/* 1935 */     this.nfeCanaDeducaoCollection = nfeCanaDeducaoCollection;
  }

  public List<NfeCanaDiario> getNfeCanaDiarioCollection() {
/* 1939 */     return this.nfeCanaDiarioCollection;
  }

  public void setNfeCanaDiarioCollection(List<NfeCanaDiario> nfeCanaDiarioCollection)
  {
/* 1944 */     this.nfeCanaDiarioCollection = nfeCanaDiarioCollection;
  }

  public List<NfeDup> getNfeDupCollection() {
/* 1948 */     return this.nfeDupCollection;
  }

  public void setNfeDupCollection(List<NfeDup> nfeDupCollection) {
/* 1952 */     this.nfeDupCollection = nfeDupCollection;
  }

  public List<NfeReb> getNfeRebCollection() {
/* 1956 */     return this.nfeRebCollection;
  }

  public void setNfeRebCollection(List<NfeReb> nfeRebCollection) {
/* 1960 */     this.nfeRebCollection = nfeRebCollection;
  }

  public List<NfeRef> getNfeRefCollection() {
/* 1964 */     return this.nfeRefCollection;
  }

  public void setNfeRefCollection(List<NfeRef> nfeRefCollection) {
/* 1968 */     this.nfeRefCollection = nfeRefCollection;
  }

  public List<NfeVol> getNfeVolCollection() {
/* 1972 */     return this.nfeVolCollection;
  }

  public void setNfeVolCollection(List<NfeVol> nfeVolCollection) {
/* 1976 */     this.nfeVolCollection = nfeVolCollection;
  }

  public List<NfeVolLacres> getNfeVolLacresCollection() {
/* 1980 */     return this.nfeVolLacresCollection;
  }

  public void setNfeVolLacresCollection(List<NfeVolLacres> nfeVolLacresCollection) {
/* 1984 */     this.nfeVolLacresCollection = nfeVolLacresCollection;
  }

  public List<NfeItem> getNfeItemCollection() {
/* 1988 */     return this.nfeItemCollection;
  }

  public void setNfeItemCollection(List<NfeItem> nfeItemCollection) {
/* 1992 */     this.nfeItemCollection = nfeItemCollection;
  }

  public List<NfeItemDI> getNfeItemDICollection() {
/* 1996 */     return this.nfeItemDICollection;
  }

  public void setNfeItemDICollection(List<NfeItemDI> nfeItemDICollection) {
/* 2000 */     this.nfeItemDICollection = nfeItemDICollection;
  }

  public List<NfeItemAdi> getNfeItemAdiCollection() {
/* 2004 */     return this.nfeItemAdiCollection;
  }

  public void setNfeItemAdiCollection(List<NfeItemAdi> nfeItemAdiCollection) {
/* 2008 */     this.nfeItemAdiCollection = nfeItemAdiCollection;
  }

  public List<NfeAut> getNfeAutCollection() {
/* 2012 */     return this.nfeAutCollection;
  }

  public void setNfeAutCollection(List<NfeAut> nfeAutCollection) {
/* 2016 */     this.nfeAutCollection = nfeAutCollection;
  }

  public List<NfePag> getNfePagCollection() {
/* 2020 */     return this.nfePagCollection;
  }

  public void setNfePagCollection(List<NfePag> nfePagCollection) {
/* 2024 */     this.nfePagCollection = nfePagCollection;
  }

  public List<NfeItemExp> getNfeItemExpCollection() {
/* 2028 */     return this.nfeItemExpCollection;
  }

  public void setNfeItemExpCollection(List<NfeItemExp> nfeItemExpCollection) {
/* 2032 */     this.nfeItemExpCollection = nfeItemExpCollection;
  }

  public List<NfeItemComb> getNfeItemCombCollection() {
/* 2036 */     return this.nfeItemCombCollection;
  }

  public void setNfeItemCombCollection(List<NfeItemComb> nfeItemCombCollection) {
/* 2040 */     this.nfeItemCombCollection = nfeItemCombCollection;
  }

  public List<NfeItemCamp> getNfeItemCampCollection() {
/* 2044 */     return this.nfeItemCampCollection;
  }

  public void setNfeItemCampCollection(List<NfeItemCamp> nfeItemCampCollection) {
/* 2048 */     this.nfeItemCampCollection = nfeItemCampCollection;
  }

  public List<NfeItemVeic> getNfeItemVeicCollection() {
/* 2052 */     return this.nfeItemVeicCollection;
  }

  public void setNfeItemVeicCollection(List<NfeItemVeic> nfeItemVeicCollection) {
/* 2056 */     this.nfeItemVeicCollection = nfeItemVeicCollection;
  }

  public List<NfeItemMed> getNfeItemMedCollection() {
/* 2060 */     return this.nfeItemMedCollection;
  }

  public void setNfeItemMedCollection(List<NfeItemMed> nfeItemMedCollection) {
/* 2064 */     this.nfeItemMedCollection = nfeItemMedCollection;
  }

  public Integer getNumeroDeItens() {
/* 2068 */     return Integer.valueOf(this.nfeItemCollection.isEmpty() ? 0 : this.nfeItemCollection.size());
  }
}
