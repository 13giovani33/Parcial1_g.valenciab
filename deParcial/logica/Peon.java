package logica;

public class Peon extends Pieza {

	public Peon(int fila, int columna) {
		super(fila);
		super(columna);
	}

	@Override
	public int calcCasillas() throws Exception {
		if (  8<this.fila < 1  || 8<this.columna < 1 ) {
			throw new Exception("posicion fuera del limite");
		
		}
		else {
			
		
		if (this.fila == 2) {
			return 2;
			
		}
		else if (this.fila == 8) {
			return 0;
		}
		else {
			return 1;
		}
	}
		
	}
