package ar.edu.unju.fi.ejercicio1.Model;

public class Producto {
	 private String code;
	 private String description;
	 private double price;
	 private Origin origin;
	 private Category category;

	 public Producto(String code, String description, double price, Origin origin, Category category) {
	     this.code = code;
	     this.description = description;
	     this.price = price;
	     this.origin = origin;
	     this.category = category;
	 }
	 public enum Origin {
	     ARGENTINA,
	     CHINA,
	     BRASIL,
	     URUGUAY
	 }
	 public enum Category {
	     TELEFONIA,
	     INFORMATICA,
	     ELECTROHOGAR,
	     HERRAMIENTAS
	 }
}
