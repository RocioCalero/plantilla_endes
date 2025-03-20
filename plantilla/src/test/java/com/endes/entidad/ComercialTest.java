package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComercialTest {
	private Comercial comercial;
	@BeforeEach
	void setUp() throws Exception {
		comercial = new Comercial ("11111111H","Alejandro", "Garcia", 2500.00, 25.00);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName ("Debería crear una venta")
	void testVentaEsperada() {
		Double ventaEsperado = 25.00;
		assertEquals(ventaEsperado, comercial.getVentas());
	}

	@Test
	@DisplayName ("Debería crear una excepcion al ser la venta negativa")
	void testVentaNegativa() {
		Exception exception = assertThrows(IllegalArgumentException.class, ()-> comercial.setVentas(-25.00));
		String mensajeEsperado = "Las ventas no pueden ser negativas: -25.0";
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	@Test
	@DisplayName ("Debería calcular el extra")
	void testCalcularExtra() {
		double ExtraCalculado = 25;
		assertEquals(ExtraCalculado, comercial.calcularExtra());
	}
	@Test
	@DisplayName ("Debería crear el sueldo")
	void testGetSueldo() {
		Double sueldoEsperado = 2500.00;
		assertEquals(sueldoEsperado, comercial.getSueldo());
	}
	
}
