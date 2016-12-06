package br.com.nfx.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import br.com.nfx.model.Endereco;

public class BuscaCep {
     public static void main(String[] args) throws Exception {
    	 BuscaCep json = new BuscaCep();
    	 	Endereco e = json.getEndereco("06764290");
    	 	
     }	 
 	public  static Endereco getEndereco(String cep){
	 		//cep = JOptionPane.showInputDialog(null,"Informe o CEP");
	 		
	 		String urlString = "http://viacep.com.br/ws/"+cep+"/json/";
			URL url;
			Endereco end = new Endereco();
			
			try {
				url = new URL(urlString);
			
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestProperty("Request-Method", "GET");
				connection.setDoInput(true);
				connection.setDoOutput(false);
				connection.connect();

				BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
				StringBuffer newData = new StringBuffer();
				String s = "";
				while (null != ((s = br.readLine()))) {
					newData.append(s);
				}
				br.close();

	            String comHtml = new String(newData);
		 
	            JSONObject obj = new JSONObject(newData.toString());
	            
		        JSONObject jsonObject = (JSONObject) obj;
	        
		        if(jsonObject.has("erro") && jsonObject.get("erro").toString().equals("true")){
		        	System.out.println("Cep não encontrado");
		        	return null;
		        }
		        String teste = (String) jsonObject.get("cep");
		        end.setCep((String) jsonObject.get("cep"));
				end.setLogradouro((String) jsonObject.get("logradouro"));
				end.setComplemento((String) jsonObject.get("complemento"));
				end.setBairro((String) jsonObject.get("bairro"));
				end.setLocalidade((String) jsonObject.get("localidade"));
				end.setUf((String) jsonObject.get("uf"));
				end.setIbge((String) jsonObject.get("ibge"));
				end.setGia((String) jsonObject.get("gia"));
				
				System.out.println(jsonObject.get("cep"));
				System.out.println(jsonObject.get("logradouro"));
		        System.out.println(jsonObject.get("localidade"));
		        
		        System.out.println(end.toString());
	        
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        
	        return end;
			
     }

}