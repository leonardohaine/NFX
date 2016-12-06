package br.com.estudo.java;



import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import br.com.test.nfx.nfe.ObjectFactory;
import br.com.test.nfx.nfe.TEnderEmi;
import br.com.test.nfx.nfe.TEndereco;
import br.com.test.nfx.nfe.TEnviNFe;
import br.com.test.nfx.nfe.TNFe;
import br.com.test.nfx.nfe.TNFe.InfNFe;
import br.com.test.nfx.nfe.TNFe.InfNFe.Dest;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det.Imposto;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det.Imposto.COFINS;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det.Imposto.ICMS;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det.Imposto.PIS;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det.Imposto.PIS.PISNT;
import br.com.test.nfx.nfe.TNFe.InfNFe.Det.Prod;
import br.com.test.nfx.nfe.TNFe.InfNFe.Emit;
import br.com.test.nfx.nfe.TNFe.InfNFe.Ide;
import br.com.test.nfx.nfe.TNFe.InfNFe.InfAdic;
import br.com.test.nfx.nfe.TNFe.InfNFe.Total;
import br.com.test.nfx.nfe.TNFe.InfNFe.Total.ICMSTot;
import br.com.test.nfx.nfe.TNFe.InfNFe.Transp;
import br.com.test.nfx.nfe.TNFe.InfNFe.Transp.Transporta;
import br.com.test.nfx.nfe.TNFe.InfNFe.Transp.Vol;
import br.com.test.nfx.nfe.TUf;
import br.com.test.nfx.nfe.TUfEmi;  
  
/*import br.com.javac.v200.envinfe.ObjectFactory;  
import br.com.javac.v200.envinfe.TEnderEmi;  
import br.com.javac.v200.envinfe.TEndereco;  
import br.com.javac.v200.envinfe.TEnviNFe;  
import br.com.javac.v200.envinfe.TNFe;  
import br.com.javac.v200.envinfe.TNFe.InfNFe;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Dest;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det.Imposto;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det.Imposto.COFINS;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det.Imposto.COFINS.COFINSNT;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det.Imposto.ICMS;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det.Imposto.PIS;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det.Imposto.PIS.PISNT;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Det.Prod;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Emit;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Ide;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.InfAdic;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Total;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Total.ICMSTot;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Transp;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Transp.Transporta;  
import br.com.javac.v200.envinfe.TNFe.InfNFe.Transp.Vol;  
import br.com.javac.v200.envinfe.TUf;  
import br.com.javac.v200.envinfe.TUfEmi;  */
  
/**  
* Geração do XML da NF-e (Versão 2.00).  
*   
* @author Copyright (c) 2012 Maciel Gonçalves  
*   
* Este programa é software livre, você pode redistribuí-lo e ou modificá-lo  
* sob os termos da Licença Pública Geral GNU como publicada pela Free  
* Software Foundation, tanto a versão 2 da Licença, ou (a seu critério)  
* qualquer versão posterior.  
*   
* http://www.gnu.org/licenses/gpl.txt  
*   
*/  
public class GenerateXmlNFe {  
  
    public static void main(String[] args) {  
        try {  
            TNFe nFe = new TNFe();  
            InfNFe infNFe = new InfNFe();  
      
            infNFe.setId("NFe42110403452234000145550010000000281765232800");  
            infNFe.setVersao("3.10");  
      
            infNFe.setIde(dadosDeIdentificacao());  
            infNFe.setEmit(dadosDoEmitente());  
            infNFe.setDest(dadosDoDestinatario());  
              
            infNFe.getDet().add(dadosDoProduto());  
              
            infNFe.setTotal(totaisDaNFe());  
            infNFe.setTransp(dadosDoTransporte());  
            infNFe.setInfAdic(informacoesAdicionais());  
              
            nFe.setInfNFe(infNFe);  
  
            TEnviNFe enviNFe = new TEnviNFe();  
            enviNFe.setVersao("3.10");  
            enviNFe.setIdLote("0000001");  
            enviNFe.getNFe().add(nFe);  
              
            info("XML EnviNF-e: " + strValueOf(enviNFe));  
        } catch (Exception e) {  
            error(e.toString());  
        }  
    }  
  
    /** 
     * B - Identificação da Nota Fiscal eletrônica 
     * @return 
     */  
    private static Ide dadosDeIdentificacao() {  
        Ide ide = new Ide();  
        ide.setCUF("42");  
        ide.setCNF("76523280");  
        ide.setNatOp("5102");  
        ide.setIndPag("0");  
        ide.setMod("55");  
        ide.setSerie("1");  
        ide.setNNF("101");  
        ide.setTpAmb("2");
        ide.setDhEmi("2016-10-11T09:55:27-03:00");  
        ide.setDhSaiEnt("2016-10-11T09:55:27-03:00");  
        //ide.setHSaiEnt("15:03:56");  
        ide.setTpNF("1");
        ide.setIdDest("1");
        ide.setCMunFG("4202800");  
        ide.setTpImp("2");  
        ide.setTpEmis("1");  
        ide.setCDV("0");  
        ide.setTpAmb("2");  
        ide.setFinNFe("1");  
        ide.setIndFinal("0");
        ide.setIndPres("9");
        ide.setProcEmi("3");  
        ide.setVerProc("3.0");  
        return ide;  
    }  
  
    /** 
     * C - Identificação do Emitente da Nota Fiscal eletrônica 
     * @return 
     */  
    private static Emit dadosDoEmitente() {  
        Emit emit = new Emit();  
        emit.setCNPJ("99999999000191");  
        emit.setXNome("NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");  
        emit.setXFant("JavaC");  
  
        TEnderEmi enderEmit = new TEnderEmi();   
        enderEmit.setXLgr("AV. www.javac.com.br");  
        enderEmit.setNro("677");  
        enderEmit.setXBairro("WEB");  
        enderEmit.setCMun("4202800");  
        enderEmit.setXMun("Java");  
        enderEmit.setUF(TUfEmi.valueOf("SC"));  
        enderEmit.setCEP("88750000");  
        enderEmit.setCPais("1058");  
        enderEmit.setXPais("Brasil");  
        enderEmit.setFone("4812121212");  
        emit.setEnderEmit(enderEmit);  
  
        emit.setIE("111111111");  
        emit.setCRT("1");         
        return emit;  
    }  
  
    /** 
     * E - Identificação do Destinatário da Nota Fiscal eletrônica 
     * @return 
     */  
    private static Dest dadosDoDestinatario() {  
        Dest dest = new Dest();  
        dest.setCNPJ("12345123000133");  
        dest.setXNome("NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL");  
          
        TEndereco enderDest = new TEndereco();   
        enderDest.setXLgr("Rua: Membros JavaC");  
        enderDest.setNro("10");  
        enderDest.setXBairro("WEB");  
        enderDest.setCMun("4202800");  
        enderDest.setXMun("Java");  
        enderDest.setUF(TUf.valueOf("SC"));  
        enderDest.setCEP("88750000");  
        enderDest.setCPais("1058");  
        enderDest.setXPais("Brasil");  
        enderDest.setFone("4845454545");  
        dest.setEnderDest(enderDest);  
  
    	dest.setIndIEDest("1");
        dest.setIE("464646464");  
        dest.setEmail("forum@javac.com.br");  
        return dest;  
    }  
  
    /** 
     * H - Detalhamento de Produtos e Serviços da NF-e 
     * I - Produtos e Serviços da NF-e 
     * M - Tributos incidentes no Produto ou Serviço 
     * V - Informações adicionais 
     * @return 
     */  
    private static Det dadosDoProduto() {  
        Det det = new Det();  
        det.setNItem("1");  
  
        /** 
         * Dados do Produro 
         */  
        Prod prod = new Prod();  
        prod.setCProd("2");  
        prod.setCEAN("");  
        prod.setXProd("Exemplo geracao XML JAXB");  
        prod.setNCM("19059090");
        prod.setCEST("1706200");
        prod.setCFOP("5102");  
        prod.setUCom("UND");  
        prod.setQCom("2.0000");  
        prod.setVUnCom("90.0000");  
        prod.setVProd("19845.50");  
        prod.setUTrib("UND");  
        prod.setQTrib("2.0000");  
        prod.setCEANTrib("");  
        prod.setVUnTrib("90.0000");  
        prod.setIndTot("1");  
        det.setProd(prod);  
          
        /** 
         * Impostos da NF-e 
         */  
        Imposto imposto = new Imposto();  
          
        ICMS icms = new ICMS();  
        ICMSSN500 icmssn500 = new ICMSSN500();  
        icmssn500.setOrig("0");  
        icmssn500.setCSOSN("500");  
        icmssn500.setVBCSTRet("0.00");  
        icmssn500.setVICMSSTRet("0.00");  
        icms.setICMSSN500(icmssn500);  
          
        PIS pis = new PIS();  
        PISNT pisnt = new PISNT();  
        pisnt.setCST("07");  
        pis.setPISNT(pisnt);  
  
        COFINS cofins = new COFINS();  
        COFINSNT cofinsnt = new COFINSNT();  
        cofinsnt.setCST("07");  
        cofins.setCOFINSNT(cofinsnt);  
        
        JAXBElement<ICMS> icmsElement = new JAXBElement<ICMS>(new QName("ICMS"), ICMS.class, icms);
        JAXBElement<PIS> pisElement = new JAXBElement<PIS>(new QName("PIS"), PIS.class, pis);
        JAXBElement<COFINS> confinsElement = new JAXBElement<COFINS>(new QName("COFINS"), COFINS.class, cofins);
        
        
        
        imposto.getContent().add(icmsElement);
        imposto.getContent().add(pisElement);
        imposto.getContent().add(confinsElement);
          
        det.setImposto(imposto);  
          
        /** 
         * Informações adicionais do Produto. 
         */  
        det.setInfAdProd("Nota Fiscal Eletronica de Exemplo");  
  
        return det;  
    }  
  
    /** 
     * W - Valores Totais da NF-e 
     * @return 
     */  
    private static Total totaisDaNFe() {  
        Total total = new Total();  
  
        ICMSTot icmstot = new ICMSTot();  
        icmstot.setVBC("0.00");  
        icmstot.setVICMS("0.00");  
        icmstot.setVICMSDeson("0.00");
        icmstot.setVBCST("0.00");
        icmstot.setVST("0.00");  
        icmstot.setVProd("19845.50");  
        icmstot.setVFrete("0.00");  
        icmstot.setVSeg("0.00");  
        icmstot.setVDesc("0.00");  
        icmstot.setVII("0.00");  
        icmstot.setVIPI("0.00");  
        icmstot.setVPIS("0.00");  
        icmstot.setVCOFINS("0.00");  
        icmstot.setVOutro("0.00");  
        icmstot.setVNF("19845.50");  
        total.setICMSTot(icmstot);  
  
        return total;  
    }  
  
    /** 
     * X - Informações do Transporte da NF-e 
     * @return 
     */  
    private static Transp dadosDoTransporte() {  
        Transp transp = new Transp();  
        transp.setModFrete("0");  
          
        /** 
         * Dados da Transportadora. 
         */  
        Transporta transporta = new Transporta();  
        transporta.setCNPJ("34523233000123");  
        transporta.setXNome("JavaC - Java Communuty");  
        transporta.setIE("121212121");  
        transporta.setXEnder("AV. www.javac.com.br");  
        transporta.setXMun("Java");  
        transporta.setUF(TUf.valueOf("SC"));          
        transp.setTransporta(transporta);  
          
        /** 
         * Dados de Volumes. 
         */  
        Vol vol = new Vol();  
        vol.setQVol("0");  
        vol.setNVol("0");  
        vol.setPesoL("0.000");  
        vol.setPesoB("0.000");  
        transp.getVol().add(vol);  
  
        return transp;  
    }  
  
    /** 
     * Z - Informações Adicionais da NF-e 
     * @return 
     */  
    private static InfAdic informacoesAdicionais() {  
        InfAdic infAdic = new InfAdic();  
        infAdic.setInfCpl("Informacoes Adicionais da NF-e.");  
        return infAdic;  
    }  
  
    /** 
     * Método que Converte o Objeto em String. 
     * @param consStatServ 
     * @return 
     * @throws JAXBException 
     */  
    private static String strValueOf(TEnviNFe enviNFe) throws JAXBException {  
        JAXBContext context = JAXBContext.newInstance(TEnviNFe.class);  
        Marshaller marshaller = context.createMarshaller();  
        JAXBElement<TEnviNFe> element = new ObjectFactory().createEnviNFe((enviNFe));  
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);  
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);  
  
        StringWriter sw = new StringWriter();  
        marshaller.marshal(element, sw);  
  
        String xml = sw.toString();  
        xml = xml.replaceAll("xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");  
        xml = xml.replaceAll("<NFe>", "<NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\">");
        xml = xml.replaceAll("xmlns=\"\" xmlns:ns3=\"http://www.portalfiscal.inf.br/nfe\"", "");
        xml = xml.replaceAll("ns3:", "");
          
        return xml;  
    }  
  
    /** 
     * Log ERROR. 
     * @param error 
     */  
    private static void error(String error) {  
        System.out.println("| ERROR: " + error);  
    }  
  
    /** 
     * Log INFO. 
     * @param info 
     */  
    private static void info(String info) {  
        System.out.println("| INFO: " + info);  
    }  
      
}  