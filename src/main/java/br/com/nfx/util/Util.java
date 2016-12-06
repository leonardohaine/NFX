/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.util;

/**
 *
 * @author Leonardo
 */
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Util {

	public static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	}

	public static HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}

	public static HttpServletResponse getRespose() {
		return (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
	}

	public static String getUserName() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		return session.getAttribute("username").toString();
	}

	public static String getUserId() {
		HttpSession session = getSession();
		if (session != null)
			return (String) session.getAttribute("userid");
		else
			return null;
	}

	public String toString(Double valor, int size) {
		String newValor = "";

		NumberFormat formatter = new DecimalFormat("#,##0.00");
		if (valor != null) {
			newValor = formatter.format(valor).replace(".", "").replace(",", "");
		}

		return newValor;
		// return StringUtils.leftPad(newValor, size);

	}

	public String toString4(Double valor, int size) {
		String newValor = "";

		NumberFormat formatter = new DecimalFormat("#,####0.0000");
		if (valor != null) {
			newValor = formatter.format(valor).replace(".", "").replace(",", "");
		}

		return newValor;
		// return StringUtils.leftPad(newValor, size);

	}

	public String toString6(Double valor, int size) {
		String newValor = "";

		NumberFormat formatter = new DecimalFormat("#,######0.000000");
		if (valor != null) {
			newValor = formatter.format(valor).replace(".", "").replace(",", "");
		}

		return newValor;
		// return StringUtils.leftPad(newValor, size);

	}

	public static String cript(String pwd) throws Exception {

		MessageDigest md = MessageDigest.getInstance("MD5");

		if (md != null) {
			return new String(hexCodes(md.digest(pwd.getBytes())));
		}

		return null;
	}

	private static char[] hexCodes(byte[] text) {
		char[] hexOutput = new char[text.length * 2];
		String hexString;

		for (int i = 0; i < text.length; i++) {
			hexString = "00" + Integer.toHexString(text[i]);
			hexString.toUpperCase().getChars(hexString.length() - 2, hexString.length(), hexOutput, i * 2);
		}

		return hexOutput;
	}

	public static void main(String[] args) {
		String senha = "teste";
		try {
			System.out.println(cript(senha));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
