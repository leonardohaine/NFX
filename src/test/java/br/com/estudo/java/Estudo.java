package br.com.estudo.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estudo {

	private static String nome;
	
	public static void main(String[] args) throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime today = LocalDateTime.now();
		System.out.println(formatter.format(today));
		
		 String cnpj ="77777777777777";
		 cnpj = (cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." +
				 cnpj.substring(5, 8) + "." + cnpj.substring(8, 12) + "-" +
				 cnpj.substring(12, 14));
		    System.out.println(cnpj);
		    
		    
		    System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("18/10/16 10:06:46".substring(0, "18/10/16 10:06:46".length()))));
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
