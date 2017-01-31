package br.com.nfx.util;

import org.apache.commons.lang.StringUtils;

public class DigitoVerificador
{
  public String acrescentaDV(String number)
  {
    return number + calculaDV(number);
  }

  public String calculaDV(CharSequence numero)
  {
    long soma = 0L;
    int peso = 2;

    for (int i = numero.length() - 1; i >= 0; i--)
    {
      if (!Character.isDigit(numero.charAt(i)))
      {
        continue;
      }
      int digito = Character.getNumericValue(numero.charAt(i));
      long ponderacao = digito * peso;
      soma += ponderacao;

      peso = proximoPeso(peso);
    }

    int digitoVerificador = (int)(11L - soma % 11L);
    if ((digitoVerificador == 11) || (digitoVerificador == 10)) {
      digitoVerificador = 0;
    }

    return Integer.toString(digitoVerificador);
  }

  private static int proximoPeso(int peso) {
    if (peso == 9) {
      return 2;
    }
    peso++; int novoPeso = peso;
    return novoPeso;
  }

  public boolean verificaAutenticidadeChaveAcesso(String chaveAcesso) {
    return (!StringUtils.isEmpty(chaveAcesso)) && (chaveAcesso.length() == 44) && (chaveAcesso.substring(43).equals(calculaDV(chaveAcesso.substring(0, 43))));
  }
}
