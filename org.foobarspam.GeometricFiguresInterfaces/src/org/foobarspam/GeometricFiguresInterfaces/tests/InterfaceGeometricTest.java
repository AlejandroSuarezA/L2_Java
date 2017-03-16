package org.foobarspam.GeometricFiguresInterfaces.tests;
import org.foobarspam.GeometricFiguresInterfaces.figures.*;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class InterfaceGeometricTest {

	private static ArrayList<Drawable> figures;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		figures = new ArrayList<Drawable>();
		Circle circulo = new Circle("Circle", 2.0);
		Square cuadrado = new Square("Square", 2.0);
		Rectangle rectangulo = new Rectangle("Rectangle", 2.0, 3.0);
		Ellipse elipse = new Ellipse("Ellipse", 3.0, 2.0);

		figures.add(circulo);
		figures.add(cuadrado);
		figures.add(elipse);
		figures.add(rectangulo);
	}

	@Test
	public void ArrayListSizeTest() {
		
		assertEquals(4, figures.size());

	}
	
	@Test
	public void InstanceCircleTest(){
		assertTrue(figures.get(0) instanceof Circle);
		assertTrue(figures.get(0) instanceof Drawable);
	}
	
	@Test
	public void InstanceSquareTest(){
		assertTrue(figures.get(1) instanceof Square);
		assertTrue(figures.get(1) instanceof Drawable);
	}
	
	@Test
	public void DrawTest(){
		Drawables.drawFigures(figures);
	}

}
