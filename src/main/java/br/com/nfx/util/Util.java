/*     */ package br.com.nfx.util;
/*     */ 
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.IOException;
/*     */ import java.math.BigDecimal;
/*     */ import java.text.DecimalFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Random;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.parsers.ParserConfigurationException;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.commons.lang3.math.NumberUtils;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Node;
/*     */ import org.xml.sax.SAXException;
/*     */ 
/*     */ public class Util
/*     */ {
/*  19 */   private static Random gna = new Random();
/*  20 */   public static String VRS_SIS = "";
/*  21 */   public static String FMTDECIMAL2 = "0.00";
/*  22 */   public static String FMTDECIMAL3 = "0.000";
/*  23 */   public static String FMTDECIMAL4 = "0.0000";
/*  24 */   public static String FMTDECIMAL10 = "0.0000000000";
/*  25 */   public static String FMTYYYYMMDD = "yyyy-MM-dd";
/*  26 */   public static String FMTYYMM = "yyMM";
/*  27 */   public static String FMTDDMMYYYYHHMMSS = "dd/MM/yyyy HH:mm:ss";
/*  28 */   public static String FMTHHMMSS = "HH:mm:ss";
/*     */ 
/*     */   public static String preencheZeroEsquerda(String num, int tamanho)
/*     */   {
/*  35 */     if (num.length() == tamanho) {
/*  36 */       return num;
/*     */     }
/*  38 */     while (num.length() < tamanho) {
/*  39 */       num = "0" + num;
/*     */     }
/*  41 */     return num;
/*     */   }
/*     */ 
/*     */   public static String formataDecimal(BigDecimal num, String formato)
/*     */   {
/*  49 */     DecimalFormat fmtDecimal = new DecimalFormat(formato);
/*  50 */     if (num == null) {
/*  51 */       num = new BigDecimal(0);
/*     */     }
/*  53 */     String dec = fmtDecimal.format(num);
/*  54 */     return dec.replaceAll(",", ".");
/*     */   }
/*     */ 
/*     */   public static String formataDecimal(BigDecimal num) {
/*  58 */     if (num == null) {
/*  59 */       return "";
/*     */     }
/*  61 */     return num.toPlainString();
/*     */   }
/*     */ 
/*     */   public static String formataData(Date data, String formato)
/*     */   {
/*  68 */     SimpleDateFormat fmt = new SimpleDateFormat(formato);
/*     */ 
/*  70 */     return fmt.format(data);
/*     */   }
/*     */ 
/*     */   public static String retiraQuebraLinha(String txt) {
/*  74 */     if (txt != null)
/*  75 */       return txt.replaceAll("\n|\r|\t", " ");
/*  76 */     return txt;
/*     */   }
/*     */ 
/*     */   public static String parseNumeroAleatorio(String chaveAcesso) {
/*  80 */     if ((chaveAcesso != null) && (chaveAcesso.length() > 0)) {
/*  81 */       int size = chaveAcesso.length();
/*     */       String nrAleatorio;
/*  83 */       if (size >= 10)
/*  84 */         nrAleatorio = chaveAcesso.substring(size - 10, size - 1);
/*     */       else
/*  86 */         nrAleatorio = chaveAcesso;
/*  87 */       return nrAleatorio;
/*  88 */     }return "000000000";
/*     */   }
/*     */ 
/*     */   public static String limpaNCM(String ncm) {
/*  92 */     String strAux = null;
/*     */     try
/*     */     {
/*  95 */       strAux = ncm.trim().replace(".", "");
/*     */ 
/*  97 */       if ((strAux != null) && (strAux.length() >= 10))
/*     */       {
/*  99 */         strAux = strAux.substring(2, 10);
/*     */       }
/*     */     } catch (Exception localException) {
/*     */     }
/* 103 */     return strAux;
/*     */   }
/*     */ 
/*     */   public static Node createElementFromText(Document doc, String name, String text) throws ParserConfigurationException, SAXException, IOException {
/* 107 */     String temp = "<" + name + ">" + text + "</" + name + ">";
/* 108 */     Document source = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(temp.getBytes()));
/* 109 */     return doc.importNode(source.getDocumentElement(), true);
/*     */   }
/*     */ 
/*     */   public static String geraNumeroAleatorioVersao2() {
/* 113 */     return StringUtils.leftPad(Integer.toString(Math.abs(gna.nextInt(999999))), 8, "0");
/*     */   }
/*     */ 
/*     */   public static Integer calculaDigitoVerificador(String chaveAcesso) {
/* 117 */     int[] pesos = { 2, 3, 4, 5, 6, 7, 8, 9 };
/* 118 */     int pos = 0;
/* 119 */     int total = 0;
/*     */ 
/* 121 */     for (int i = chaveAcesso.length() - 1; i >= 0; i--) {
/* 122 */       int pond = Integer.parseInt(String.valueOf(chaveAcesso.charAt(i))) * pesos[pos];
/* 123 */       total += pond;
/* 124 */       pos++;
/* 125 */       if (pos == 8) {
/* 126 */         pos = 0;
/*     */       }
/*     */     }
/* 129 */     int r = total % 11;
/*     */ 
/* 131 */     if ((r == 0) || (r == 1)) {
/* 132 */       return Integer.valueOf(0);
/*     */     }
/* 134 */     return Integer.valueOf(11 - r);
/*     */   }
/*     */ 
/*     */   public static String converteFormaEmissao(String formaEmissao)
/*     */   {
/* 139 */     if (formaEmissao.equals("N"))
/* 140 */       formaEmissao = "1";
/* 141 */     else if (formaEmissao.equals("C"))
/* 142 */       formaEmissao = "2";
/* 143 */     else if (formaEmissao.equals("S"))
/* 144 */       formaEmissao = "3";
/* 145 */     else if (formaEmissao.equals("D"))
/* 146 */       formaEmissao = "4";
/* 147 */     else if (formaEmissao.equals("F")) {
/* 148 */       formaEmissao = "5";
/*     */     }
/* 150 */     return formaEmissao;
/*     */   }
/*     */ 
/*     */   public static String preencheAEsquerdaCom(String linha_a_preencher, String letra, int tamanho)
/*     */   {
/* 157 */     return preencheCom(linha_a_preencher, letra, tamanho, 1);
/*     */   }
/*     */ 
/*     */   public static String preencheADireitaCom(String linha_a_preencher, String letra, int tamanho) {
/* 161 */     return preencheCom(linha_a_preencher, letra, tamanho, 2);
/*     */   }
/*     */ 
/*     */   private static String preencheCom(String linha_a_preencher, String letra, int tamanho, int direcao)
/*     */   {
/* 167 */     if ((linha_a_preencher == null) || (linha_a_preencher.trim().equals(""))) {
/* 168 */       return null;
/*     */     }
/* 170 */     StringBuffer sb = new StringBuffer(linha_a_preencher);
/* 171 */     if (direcao == 1) {
/* 172 */       for (int i = sb.length(); i < tamanho; i++)
/* 173 */         sb.insert(0, letra);
/*     */     }
/* 175 */     else if (direcao == 2) {
/* 176 */       for (int i = sb.length(); i < tamanho; i++) {
/* 177 */         sb.append(letra);
/*     */       }
/*     */     }
/* 180 */     return sb.toString();
/*     */   }
/*     */ 
/*     */   public static String getDateToXmlIn(String date) {
/* 184 */     if (StringUtils.isNotBlank(date)) {
/* 185 */       String unformattedDate = date.replaceAll("[^0-9]+", "");
/* 186 */       return unformattedDate.substring(0, 8);
/*     */     }
/* 188 */     return "";
/*     */   }
/*     */ 
/*     */   public static String getTimeToXmlIn(String date) {
/* 192 */     if (StringUtils.isNotBlank(date)) {
/* 193 */       String unformattedDate = date.replaceAll("[^0-9]+", "");
/* 194 */       return unformattedDate.substring(8, 14);
/*     */     }
/* 196 */     return "";
/*     */   }
/*     */ 
/*     */   public static String formatDateTimeFromStringSap(String dateTime)
/*     */   {
/* 201 */     StringBuilder builder = new StringBuilder(dateTime);
/* 202 */     builder.insert(4, "-");
/* 203 */     builder.insert(7, "-");
/* 204 */     builder.insert(10, "T");
/* 205 */     builder.insert(13, ":");
/* 206 */     builder.insert(16, ":");
/*     */ 
/* 208 */     return builder.toString();
/*     */   }
/*     */ 
/*     */   public static String returnAuthCodeLength15(String authCode) {
/* 212 */     String ret = null;
/* 213 */     if (StringUtils.isNotEmpty(authCode)) {
/* 214 */       if (authCode.length() < 15)
/* 215 */         ret = StringUtils.leftPad(authCode, 15, "0");
/* 216 */       else if (authCode.length() > 15)
/* 217 */         ret = authCode.substring(0, 15);
/*     */       else {
/* 219 */         ret = authCode;
/*     */       }
/*     */     }
/* 222 */     return ret;
/*     */   }
/*     */ 
/*     */   public static String formatAliquota(String aliquota) {
/* 226 */     if (!NumberUtils.isNumber(aliquota)) {
/* 227 */       return "";
/*     */     }
/*     */ 
/* 230 */     BigDecimal decimal = new BigDecimal(aliquota);
/* 231 */     BigDecimal dividido = decimal.divide(new BigDecimal(100L));
/* 232 */     return dividido.toString();
/*     */   }
/*     */ 
/*     */   public static String returnRandonNumberLength8(String randonNumber) {
/* 236 */     if ((randonNumber != null) && (randonNumber.length() == 9)) {
/* 237 */       return randonNumber.substring(1);
/*     */     }
/* 239 */     return randonNumber;
/*     */   }
/*     */ 
/*     */   public static String returnRandonNumberLength8(long randonNumber)
/*     */   {
/* 244 */     String random = randonNumber + "";
/* 245 */     if (random.length() == 9) {
/* 246 */       return random.substring(1);
/*     */     }
/* 248 */     return random;
/*     */   }
/*     */ 
/*     */   public static String returnLocalTime(String utcTime)
/*     */   {
/* 253 */     if (StringUtils.isNotBlank(utcTime))
/*     */     {
/* 255 */       if (utcTime.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}[+|-][0-9]{2}:[0-9]{2}")) {
/* 256 */         int year = Integer.valueOf(utcTime.substring(0, 4)).intValue();
/* 257 */         int month = Integer.valueOf(utcTime.substring(5, 7)).intValue();
/* 258 */         int day = Integer.valueOf(utcTime.substring(8, 10)).intValue();
/* 259 */         int hour = Integer.valueOf(utcTime.substring(11, 13)).intValue();
/* 260 */         int minute = Integer.valueOf(utcTime.substring(14, 16)).intValue();
/* 261 */         int second = Integer.valueOf(utcTime.substring(17, 19)).intValue();
/*     */ 
/* 263 */         String fuso = utcTime.substring(19, 20);
/*     */ 
/* 265 */         int hourUTC = Integer.valueOf(utcTime.substring(20, 22)).intValue();
/* 266 */         int minuteUTC = Integer.valueOf(utcTime.substring(23, 25)).intValue();
/*     */ 
/* 268 */         if ("-".equals(fuso)) {
/* 269 */           hour -= hourUTC;
/* 270 */           minute -= minuteUTC;
/*     */         } else {
/* 272 */           hour += hourUTC;
/* 273 */           minute += minuteUTC;
/*     */         }
/* 275 */         Calendar cal = Calendar.getInstance();
/* 276 */         cal.set(year, month - 1, day, hour, minute, second);
/*     */ 
/* 278 */         SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
/* 279 */         return sdf.format(cal.getTime());
/*     */       }
/* 281 */       return utcTime.replaceAll("[^0-9]+", "");
/*     */     }
/*     */ 
/* 284 */     return utcTime;
/*     */   }
/*     */ }

/* Location:           D:\DFe\ConectorEBS3.49.0\lib\conectorcommonsebs.3.49.0.jar
 * Qualified Name:     com.mastersaf.dfe.connectores.util.Util
 * JD-Core Version:    0.6.0
 */