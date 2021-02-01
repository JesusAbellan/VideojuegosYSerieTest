package iessoterohernandez.es.videojuegoyserie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


/**
 *
 * @author jesus
 */
public class VideojuegoTest {
    public Videojuego instance;
    
    @BeforeEach
    public void setUp() {
        instance = new Videojuego();
    }

    /**
     * Test of setTitulo method, of class Videojuego.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "God of War";
        instance.setTitulo(titulo);
        assertEquals("God of War",instance.getTitulo());
    }

    /**
     * Test of setHorasEstimadas method, of class Videojuego.
     */
    @Test
    public void testSetHorasEstimadas() {
        System.out.println("setHorasEstimadas");
        int horasEstimadas = 10;
        instance.setHorasEstimadas(horasEstimadas);
        assertEquals(10,instance.getHorasEstimadas());
    }

    /**
     * Test of setGenero method, of class Videojuego.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "Acción";
        instance.setGenero(genero);
        assertEquals("Acción",instance.getGenero());
    }

    /**
     * Test of getcompañia method, of class Videojuego.
     */

    /**
     * Test of setcompañia method, of class Videojuego.
     */
    @Test
    public void testSetcompania() {
        System.out.println("setcompania");
        String compania = "Konami";
        instance.setcompania(compania);
        assertEquals("Konami",instance.getcompania());
    }

    /**
     * Test of entregar method, of class Videojuego.
     */
    @Test
    public void testEntregar() {
        System.out.println("entregar");
        instance.entregar();
        assertEquals(true,instance.isEntregado());
    }

    /**
     * Test of devolver method, of class Videojuego.
     */
    @Test
    public void testDevolver() {
        System.out.println("devolver");
        instance.devolver();
        assertEquals(false,instance.isEntregado());
    }

    /**
     * Test of compareTo method, of class Videojuego.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        int expResult = 0;
        int result = instance.compareTo(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Videojuego.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Informacion del videojuego: \n" +
               "\tTitulo: "+""+"\n" +
               "\tHoras estimadas: "+100+"\n" +
               "\tGenero: "+""+"\n" +
               "\tcompañia: "+"";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Videojuego.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Videojuego a = new Videojuego();
        a.setTitulo("Otro Titulo");
        boolean expResult = false;
        boolean result = instance.equals(a);
        assertEquals(expResult, result);
    }  
}
