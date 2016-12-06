package br.com.nfx.util;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;


public class CepService {

	public static void main(String[] args) throws Exception {


		// Define o CEP
		String cep = "06764290"; //JOptionPane.showInputDialog(null,"Informe o CEP");
		
		// String da url		
		String urlString = "http://viacep.com.br/ws/"+cep+"/xml/";

		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(urlString);
		HttpResponse response = client.execute(request);
		InputStream is = response.getEntity().getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		
		StringBuffer newData = new StringBuffer();
		String s = "";
		while((s = br.readLine()) != null){
			newData.append(s);
		}
		br.close();
		
		System.out.println("Dados: " + newData);
		
		String line = "";
		
	
		
	


	}

}
