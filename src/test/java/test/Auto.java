package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int numeroAsientos = 0;
		for (int i = 0 ; 1 < asientos.lenght; i++) {
			if (asientos[i] != null) {
				numeroAsientos++;
			}
		}
		return numeroAsientos;
	}

	public String verificarIntegridad() {
		if (this.registro) == (this.motor.registro) {
			for (int i = 0; i < asientos.lenght; i++) {
				if (asientos[i] !=  null) {
					if (asientos[i].registro != registro) {
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
		}

	}

}