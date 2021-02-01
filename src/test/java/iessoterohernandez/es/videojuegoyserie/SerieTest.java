package iessoterohernandez.es.videojuegoyserie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SerieTest {
	
	Serie s;

    @BeforeEach
	void init() {
		s = new Serie();
	}

	@Test
	void testSetTitulo() {
		s.setTitulo("Test");
		assertEquals("Test",s.getTitulo());
	}


	@Test
	void testSetnumeroTemporadas() {
		s.setnumeroTemporadas(5);
		assertEquals(5,s.getnumeroTemporadas());
	}

	@Test
	void testSetGenero() {
		s.setGenero("Test");
		assertEquals("Test",s.getGenero());
	}

	@Test
	void testSetcreador() {
		s.setcreador("Test");
		assertEquals("Test",s.getcreador());
	}

	@Test
	void testEntregar() {
		s.entregar();
		assertEquals(true,s.isEntregado());
	}

	@Test
	void testDevolver() {
		s.devolver();
		assertEquals(false,s.isEntregado());
	}

	@Test
	void testCompareTo() {
		s.setnumeroTemporadas(2);
		Serie test = new Serie();
		test.setnumeroTemporadas(2);
		assertEquals(0,s.compareTo(test));
		test.setnumeroTemporadas(3);
		assertEquals(-1,s.compareTo(test));
		test.setnumeroTemporadas(1);
		assertEquals(1,s.compareTo(test));
	}

	@Test
	void testToString() {
		assertEquals("Informacion de la Serie: \n" +
                "\tTitulo: "+""+"\n" +
                "\tNumero de temporadas: "+3+"\n" +
                "\tGenero: "+""+"\n" +
                "\tCreador: "+"",s.toString());
	}

	@Test
	void testEqualsSerie() {
		Serie test = new Serie();
		assertEquals(true,s.equals(test));
		test.setcreador("Test");
		assertEquals(false,s.equals(test));
	}
}
