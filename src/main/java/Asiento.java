package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		if (color=="rojo"||color=="verde"||color=="amarillo"||color=="blanco"||color=="negro") {
			this.color=color;
		}
	}
}
