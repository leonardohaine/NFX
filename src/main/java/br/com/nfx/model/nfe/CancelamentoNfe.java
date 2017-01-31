package br.com.nfx.model.nfe;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.nfx.util.EntityBase;



@Entity
@Table(name="nfe_cancelamento")
@NamedQuery(name="CancelamentoNfe.findByTrxIdRef", query="select c from CancelamentoNfe c where c.customerTrxIdRef = :customerTrxIdRef ")
public class CancelamentoNfe extends EntityBase
  implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name="cancelamento_id")
  private Long cancelamentoId;

  @Column(name="CUSTOMER_TRX_ID_REF")
  private Long customerTrxIdRef;

  @Column(name="TRANSACTION_ID")
  private Long transactionId;

  @Column(name="N_VERSAO")
  private String versao;

  @Column(name="S_ID")
  private String chave;

  @Column(name="S_CNPJ")
  private String cnpj;

  @Column(name="S_XJUST")
  private String xJustificativa;

  @Column(name="S_IE")
  private String ie;

  @Transient
  private String docNum;

  public Long getCancelamentoId()
  {
     return this.cancelamentoId;
  }

  public void setCancelamentoId(Long cancelamentoId) {
     this.cancelamentoId = cancelamentoId;
  }

  public Long getCustomerTrxIdRef() {
     return this.customerTrxIdRef;
  }

  public void setCustomerTrxIdRef(Long customerTrxIdRef) {
     this.customerTrxIdRef = customerTrxIdRef;
  }

  public Long getTransactionId() {
     return this.transactionId;
  }

  public void setTransactionId(Long transactionId) {
     this.transactionId = transactionId;
  }

  public String getVersao() {
     return this.versao;
  }

  public void setVersao(String versao) {
     this.versao = versao;
  }

  public String getChave() {
     return this.chave;
  }

  public void setChave(String chave) {
     this.chave = chave;
  }

  public String getCnpj() {
     return this.cnpj;
  }

  public void setCnpj(String cnpj) {
     this.cnpj = cnpj;
  }

  public String getxJustificativa() {
     return this.xJustificativa;
  }

  public void setxJustificativa(String xJustificativa) {
     this.xJustificativa = xJustificativa;
  }

  public String getIe() {
     return this.ie;
  }

  public void setIe(String ie) {
     this.ie = ie;
  }

  public String getDocNum() {
     if (this.cancelamentoId != null) {
       this.docNum = this.cancelamentoId.toString();
    }
     return this.docNum;
  }
}
