package org.foobarspam.GeometricFiguresInterfaces.figures;

public interface Drawable {

	void draw();

	default void aplicarTema() {
		throw new UnsupportedOperationException("No se puede aplicar tema");
	}

}
