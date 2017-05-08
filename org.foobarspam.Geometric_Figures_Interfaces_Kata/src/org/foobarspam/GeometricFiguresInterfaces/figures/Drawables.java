package org.foobarspam.GeometricFiguresInterfaces.figures;

import java.util.ArrayList;

public class Drawables {

	public static void drawFigures(ArrayList<Drawable> figures){
		for(Drawable figure : figures){
			figure.draw();
		}
	}
	
}
