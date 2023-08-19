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
