package br.com.nfx.controller;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.primefaces.event.SelectEvent;

import br.com.nfx.model.Cliente;
import br.com.nfx.model.nfe.NfeHeader;
import br.com.nfx.model.nfe.NfeItem;


@ViewScoped
@ManagedBean(name = "emissaoNfeBean")
public class EmissaoNfeController implements Serializable {
	
	@ManagedProperty(value = "#{cliente}")
	private Cliente cliente;
	
	private Cliente selectedCliente;
	
	@ManagedProperty(value = "#{nfeHeader}")
	private NfeHeader nfe;
	
	private NfeItem item;
	private Date dataEmissao;
	
	public void clienteSelecionado(SelectEvent event) {
		
		Cliente cliente = (Cliente) event.getObject();
		setSelectedCliente(cliente);
		setCliente(cliente);
		System.out.println("Cliente selecionado; " + cliente);
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getSelectedCliente() {
		return selectedCliente;
	}

	public void setSelectedCliente(Cliente selectedCliente) {
		this.selectedCliente = selectedCliente;
	}

	public Date getDataEmissao() {
	    return Calendar.getInstance().getTime();
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public NfeHeader getNfe() {
		return nfe;
	}

	public void setNfe(NfeHeader nfe) {
		this.nfe = nfe;
	}

	public NfeItem getItem() {
		return item;
	}

	public void setItem(NfeItem item) {
		this.item = item;
	}

}
