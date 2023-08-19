package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos(){
		int totalasientos=0;
		for(Asiento e: asientos) {
			if(e!=null) {
				totalasientos++;
			}
		}
		return totalasientos;
	}
	String verificarIntegridad() {
		String Result = null;
		Result= "Las piezas no son originales";
		if(this.registro!=motor.registro) {
			return Result;
		}
		for (int i=1; i<asientos.length; i++) {
			if (asientos[i]!=null && asientos[i].registro!=this.registro) {
					return Result;
				}
			}
		Result= "Auto original";
		return Result;
		}
	}
