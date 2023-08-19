package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int CantidadAsientos(){
		return this.asientos.length;
	}
	String VerificarIntegridad() {
		String Result = null;
		for (Asiento i: asientos) {
			if (!(this.registro== motor.registro && this.registro==i.registro)) {
				Result="Las piezas no son originales";
				break;
		}else {
			Result="Auto original";
				}
		}
		return Result;
	}
}
