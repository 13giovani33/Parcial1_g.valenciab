package logica;

public class Caballo extends Pieza {

	public Caballo(int fila, int columna) {
		super(fila);
		super(columna);
	}

	@Override
	public int calcCasillas() throws Exception {
		int conteo = 8;
		if (  8<this.fila < 1  || 8<this.columna < 1 ) {
			throw new Exception("posicion fuera del limite");
		
		}
		else {
			
		
		if (this.columna == 1 || this.columna == 8) {
			conteo = conteo-4;
			if (this.fila == 1 || this.fila == 8) {
				conteo = conteo-2;
			}
			else if (this.fila== 2 || this.fila == 7)) {
				conteo = conteo-1;
			}
		}
		
		else {
			return conteo;
		}
	}
		return conteo;
		
	}
