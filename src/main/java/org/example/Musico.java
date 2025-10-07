package org.example;


import java.util.ArrayList;

public class Musico {

	private String nombre;
	private int formacion;
	private String genero;
    private String frontman;
    private String discografica;
    private String paisOrigen;
    private ArrayList<String> disco;

	public Musico(String nombre, int formacion, String genero, String frontman,String discografica, String paisOrigen,ArrayList<String> disco) {
		super();
		this.nombre = nombre;
		this.formacion = formacion;
		this.genero = genero;
        this.frontman = frontman;
        this.discografica = discografica;
        this.paisOrigen = paisOrigen;
        this.disco = disco;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFormacion() {
		return formacion;
	}
	public void setFormacion(int formacion) {
		this.formacion = formacion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

    public ArrayList<String> getDisco() {
        return disco;
    }

    public String getDiscografica() {
        return discografica;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getFrontman() {
        return frontman;
    }

    @Override
	public String toString() {
		return "El grupo se llama " + nombre + " formado en " + formacion + " y su estilo musical es " + genero + " y el frontman es "+frontman;
	}
	
}