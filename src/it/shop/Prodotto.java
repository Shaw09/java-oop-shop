package it.shop;

import java.util.Random;

public class Prodotto {
	private int id;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva = 0.22;
	
	public Prodotto(String nome, String descrizione, double prezzo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.id = generateId();
		this.prezzo = prezzo;
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

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getId() {
		return id;
	}
	
	
	public int generateId() {
		Random randomGen = new Random();
		return randomGen.nextInt(9999999);
	}
	
	public String prezzoIncluso() {
		double prezzoIncluso = prezzo + getPrezzo() * iva;
		String prezzoIncluso2 = String.format("%.2f", prezzoIncluso);
		return prezzoIncluso2;
	}
	
}
