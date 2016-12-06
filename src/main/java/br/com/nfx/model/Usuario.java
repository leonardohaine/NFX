/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nfx.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Type;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCodusuario", query = "SELECT u FROM Usuario u WHERE u.codusuario = :codusuario"),
    @NamedQuery(name = "Usuario.findByCheckconfig", query = "SELECT u FROM Usuario u WHERE u.checkconfig = :checkconfig"),
    @NamedQuery(name = "Usuario.findByCheckusuarios", query = "SELECT u FROM Usuario u WHERE u.checkusuarios = :checkusuarios"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
    @NamedQuery(name = "Usuario.findByIsadmin", query = "SELECT u FROM Usuario u WHERE u.isadmin = :isadmin"),
    @NamedQuery(name = "Usuario.findByativo", query = "SELECT u FROM Usuario u WHERE u.ativo = :ativo"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USU")
	@SequenceGenerator(name = "SEQ_USU", sequenceName = "seq_usuario")
    @Basic(optional = false)
    @Column(name = "codusuario")
    private Long codusuario;
    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "checkconfig")
    private Boolean checkconfig;
    
    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "checkusuarios")
    private Boolean checkusuarios;
    @Column(name = "email")
    private String email;
    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "isadmin")
    private Boolean isadmin;
    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "ativo")
    private Boolean ativo;
    @Column(name = "login")
    private String login;
    @Column(name = "nome")
    private String nome;
    @Column(name = "senha")
    private String senha;

    public Usuario() {
    }

    public Usuario(Long codusuario) {
        this.codusuario = codusuario;
    }

    public Long getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(Long codusuario) {
        this.codusuario = codusuario;
    }

    public Boolean getCheckconfig() {
        return checkconfig;
    }

    public void setCheckconfig(Boolean checkconfig) {
        this.checkconfig = checkconfig;
    }

    public Boolean getCheckusuarios() {
        return checkusuarios;
    }

    public void setCheckusuarios(Boolean checkusuarios) {
        this.checkusuarios = checkusuarios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codusuario != null ? codusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codusuario == null && other.codusuario != null) || (this.codusuario != null && !this.codusuario.equals(other.codusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.entidades.Usuario[ codusuario=" + codusuario + " ]";
    }
    
}
