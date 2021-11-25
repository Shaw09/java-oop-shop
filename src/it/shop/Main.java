package it.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prodotto1 = new Prodotto("Iphone", "descrizione", 500);
		System.out.println("Prodotto " + prodotto1.getId());
		System.out.println("Prezzo Iva esclusa " + prodotto1.getPrezzo() + "€");
		System.out.println("Prezzo Iva inclusa " + prodotto1.prezzoIncluso() + "€");
		System.out.println("Codice prodotto: " + prodotto1.getId() + prodotto1.getNome());
	}

}
