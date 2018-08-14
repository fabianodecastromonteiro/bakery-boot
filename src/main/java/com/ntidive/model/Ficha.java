package com.ntidive.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Ficha {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date dtCadastro;
    @NotNull
    private String observacao;
    @Column(name="status")
	private boolean status;
    @OneToMany(
    	mappedBy = "ficha", 
        cascade = CascadeType.ALL, 
        orphanRemoval = true
    )
	private List<Animal> animais = new ArrayList<Animal>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getObservacao() {
		return observacao;
	}

	// Observação (local onde você descreve o que foi coletado);
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public boolean getStatus() {
		return status;
	}

	// Status(Radio button): ativo ou inativo (ativa ou desativa ficha);
	public void setStatus(boolean status) {
		this.status = status;
	}

}
