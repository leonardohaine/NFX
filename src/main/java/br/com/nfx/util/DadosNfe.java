package br.com.nfx.util;

import org.joda.time.DateTime;

public class DadosNfe
{
  public final String tipoEmissao;
  public final String numeroCompoeNfe;
  public final String codUf;
  public final DateTime dataEmissao;
  public final String cnpjEmissor;		
  public final String modelo;
  public final String serie;
  public final Long numero;
  public final String tipoImpressao;
  public final String versaoXml;
  public final DateTime dataEntradaContingencia;
  public final String mensagemContingencia;
  private String numeroCompoeNfeAleatorio;
  public final String ieEmissor;

  public DadosNfe(String tipoEmissao, String numeroCompoeNfe, String codUf, DateTime dataEmissao, String cnpjEmissor, String modelo, String serie, Long numero, String tipoImpressao, String versaoXml, DateTime dataEntradaContingencia, String mensagemContingencia, String ieEmissor)
  {
    this.tipoEmissao = tipoEmissao;
    this.numeroCompoeNfe = numeroCompoeNfe;
    this.codUf = codUf;
    this.dataEmissao = dataEmissao;
    this.cnpjEmissor = cnpjEmissor;
    this.modelo = modelo;
    this.serie = serie;
    this.numero = numero;
    this.tipoImpressao = tipoImpressao;
    this.versaoXml = versaoXml;
    this.dataEntradaContingencia = dataEntradaContingencia;
    this.mensagemContingencia = mensagemContingencia;
    this.ieEmissor = ieEmissor;
  }

  public void setNumeroCompoeNfeAleatorio(String numeroCompoeNfeAleatorio) {
    this.numeroCompoeNfeAleatorio = numeroCompoeNfeAleatorio;
  }

  public String getNumeroCompoeNfeAleatorio() {
    return this.numeroCompoeNfeAleatorio;
  }
}
