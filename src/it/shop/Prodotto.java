package it.shop;

import java.util.Random;

public class Prodotto {
	private int id;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float iva = (float)0.22;
	
	public Prodotto() {
		this.id = generateId();
		this.prezzo = generatePrezzo();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public int getId() {
		return id;
	}
	
	
	public int generateId() {
		Random randomGen = new Random();
		return randomGen.nextInt();
	}
	
	public float generatePrezzo() {
		Random randomGen = new Random();
		return randomGen.nextFloat();
	}
	
	public float prezzoIncluso() {
		float prezzoIncluso = getPrezzo() + generatePrezzo() * iva;
		return prezzoIncluso;
	}
	
}
