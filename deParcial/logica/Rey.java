package logica;

public class Rey extends Pieza {

	public Rey(int fila, int columna) {
		super(fila);
		super(columna);
	}

	@Override
	public int calcCasillas() throws Exception {
		if (  8<this.fila < 1  || 8<this.columna < 1 ) {
			throw new Exception("posicion fuera del limite");
		
		}
		else {
			
		
		if (this.fila == 1) {
			return 5;
			
		}
		else if (this.fila == 8) {
			return 5;
		}
		else if (this.columna == 1) {
			return 5;
		}
		else if (this.columna == 8) {
			return 5;
		}
		else {
			return 8;
		}
	}
		
	}
