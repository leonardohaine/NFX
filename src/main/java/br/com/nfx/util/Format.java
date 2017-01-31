 package br.com.nfx.util;
 
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

 
 public class Format
 {
   private static final Logger log = Logger.getLogger(Format.class);
 
   private static final Logger logger = Logger.getLogger(Format.class);
 
   public static String number(double numero, int quantidade_inteiros, int quantidade_decimais)
   {
     BigDecimal num = new BigDecimal(numero);
 
     num = num.setScale(quantidade_decimais, 4);
 
     return num.toPlainString();
   }
 
   public static String number(double numero, int quantidade_inteiros)
   {
     return number(numero, quantidade_inteiros, 0);
   }
 
   public static String numberS(String numero) {
     String novaSPrimeiro = "";
     if (numero == null) {
       novaSPrimeiro = "";
     } else {
       String sPrimeiro = numero;
       BigDecimal bdPrimeiro = new BigDecimal(sPrimeiro);
       NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
       n.setMinimumFractionDigits(2);
       novaSPrimeiro = n.format(bdPrimeiro);
       novaSPrimeiro = novaSPrimeiro.replaceAll(",", "");
     }
 
     return novaSPrimeiro;
   }
 
   public static String numberSP4(String numero) {
     String novaSPrimeiro = "";
     if (numero == null) {
       novaSPrimeiro = "";
     } else {
       String sPrimeiro = numero;
       BigDecimal bdPrimeiro = new BigDecimal(sPrimeiro);
       NumberFormat n = NumberFormat.getNumberInstance(Locale.US);
       n.setMinimumFractionDigits(4);
       novaSPrimeiro = n.format(bdPrimeiro);
       novaSPrimeiro = novaSPrimeiro.replaceAll(",", "");
     }
 
     return novaSPrimeiro;
   }
 
   public static String numberZeroAEsquerda(String numero, int quantidade_inteiros, int quantidade_decimais)
   {
     BigDecimal bdPrimeiro = new BigDecimal(numero);
     return numberZeroAEsquerda(bdPrimeiro, quantidade_inteiros, quantidade_decimais);
   }
 
   public static String numberZeroAEsquerda(double numero, int quantidade_inteiros, int quantidade_decimais) {
     BigDecimal bdPrimeiro = new BigDecimal(numero);
     return numberZeroAEsquerda(bdPrimeiro, quantidade_inteiros, quantidade_decimais);
   }
 
   public static String numberZeroAEsquerda(BigDecimal bdPrimeiro, int quantidade_inteiros, int quantidade_decimais)
   {
     NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
     nf.setMinimumFractionDigits(quantidade_decimais);
     nf.setMaximumFractionDigits(quantidade_decimais);
 
     nf.setMinimumIntegerDigits(quantidade_inteiros);
     nf.setMaximumIntegerDigits(quantidade_inteiros);
 
     nf.setRoundingMode(RoundingMode.HALF_DOWN);
 
     String novaSPrimeiro = nf.format(bdPrimeiro);
     novaSPrimeiro = novaSPrimeiro.replaceAll(",", "");
 
     return novaSPrimeiro;
   }
 
   public static String date(Date d)
   {
     if (d != null) {
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       return dateFormat.format(d);
     }
     return "";
   }
 
   public static String hour(Date d)
   {
     SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
     return dateFormat.format(d);
   }
 
   public static String datehourwebservice(Date d)
   {
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
     String result = dateFormat.format(d);
 
     SimpleDateFormat dateFormathour = new SimpleDateFormat("HHmmss");
     result = new StringBuilder().append(result).append("T").append(dateFormathour.format(d)).toString();
 
     return result;
   }
 
   public static String dateiso8601(Timestamp d)
   {
     StringBuilder result = new StringBuilder();
 
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     result.append(dateFormat.format(d));
 
     SimpleDateFormat dateFormathour = new SimpleDateFormat("HH:mm:ssZ");
 
     String horas_minutos = dateFormathour.format(d);
 
     if ((!dateFormat.format(d).substring(8, 10).equals("01")) || (!horas_minutos.substring(0, 8).equals("00:00:00")))
     {
       result.append(new StringBuilder().append("T").append(horas_minutos).toString());
       result.insert(22, ":");
     }
 
     return result.toString();
   }
 
   /*public static String dateiso8601dhEmi(Timestamp d)
   {
     ConfigEbs configEbs = ConfigEbs.getInstance();
 
     boolean eliminarDataEHora = configEbs.getDateTimeEmissaoVazia();
     boolean eliminarHora = configEbs.getDateTimeEmissaoSemHora();
     String result;
     String result;
     if (eliminarDataEHora) {
       result = "";
     }
     else {
       result = dateiso8601(d);
 
       if ((eliminarHora) && 
         (result.length() >= 10)) {
         result = result.substring(0, 10);
       }
 
     }
 
     return dateiso8601EBS(result, timezoneInUse());
   }*/
 
   /*public static String dateiso8601EBS(String d, String timezone)
   {
     String result;
     String result;
     if (d == null) {
       result = null;
     }
     else
     {
       d = d.replaceAll("[-;:T ]+", "");
       String result;
       if (d.length() == 8) {
         result = new StringBuilder().append(d.substring(0, 4)).append("-").append(d.substring(4, 6)).append("-").append(d.substring(6, 8)).toString();
       }
       else
       {
         String result;
         if (d.length() < 14) {
           log.warn(new StringBuilder().append("Data enviada do EBS esta em formato incorreto! Formato esperado: yyyymmddhhmiss. Data recebida: ").append(d).toString());
           result = null;
         }
         else
         {
           String tmz;
           String tmz;
           if ((timezone == null) || (timezone.isEmpty()) || (timezone.length() < 6))
             tmz = timezoneInUse();
           else {
             tmz = timezone;
           }
           result = new StringBuilder().append(d.substring(0, 4)).append("-").append(d.substring(4, 6)).append("-").append(d.substring(6, 8)).toString();
           result = new StringBuilder().append(result).append("T").append(d.substring(8, 10)).append(":").append(d.substring(10, 12)).append(":").append(d.substring(12, 14)).append(tmz).toString();
         }
       }
 
     }
 
     return result;
   }
 
   public static String timezoneInUse() {
     ConfigEbs configEbs = ConfigEbs.getInstance();
     String c = configEbs.getTimezoneFixo();
     String r;
     String r;
     if (c.equals("N"))
     {
       r = "-03:00";
     }
     else r = c;
 
     return r;
   }*/
 }
