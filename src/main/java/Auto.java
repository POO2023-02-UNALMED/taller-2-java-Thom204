package test;

public class Auto {
	String modelo;
	int percio;
	Asiento[] asiento;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos(){
		return this.asiento.length;
	}
	String verificarIntegridad() {
		String Result = null;
		for (Asiento i: asiento) {
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
