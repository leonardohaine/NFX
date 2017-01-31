package br.com.nfx.util;

import org.apache.commons.lang.StringUtils;

public class ChaveAcesso
{
  //private static final DateTimeFormatter FORMAT = DateTimeFormat.forPattern("yyMM");

  public static String geraChaveAcesso(DadosNfe dadosNfe, String tipoEmissao)
  //public static String geraChaveAcesso()
  {
    String numeroCompoeNfe = dadosNfe.numeroCompoeNfe;
    if (StringUtils.isBlank(numeroCompoeNfe)) {
      numeroCompoeNfe = UtilNfx.geraNumeroAleatorioNf();
      dadosNfe.setNumeroCompoeNfeAleatorio(numeroCompoeNfe);
    }
    StringBuilder chave = new StringBuilder();
    chave.append(dadosNfe.codUf);
    //chave.append(FORMAT.print(dadosNfe.dataEmissao.withZone(dataConfig.dateTimeZoneDestino())));
    chave.append(UtilNfx.preencheZeroEsquerda(dadosNfe.cnpjEmissor, 14));
    chave.append(UtilNfx.preencheZeroEsquerda(dadosNfe.modelo, 2));
    chave.append(UtilNfx.preencheZeroEsquerda(dadosNfe.serie, 3));
    chave.append(UtilNfx.preencheZeroEsquerda(dadosNfe.numero, 9));
    chave.append(tipoEmissao);
    chave.append(UtilNfx.preencheZeroEsquerda(numeroCompoeNfe, 8));

    String digitoVerificador = new DigitoVerificador().calculaDV(chave.toString());
    chave.append(digitoVerificador);

    return chave.toString();
  }

}