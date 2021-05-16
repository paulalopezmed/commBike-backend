package es.upm.dit.isst.commBike.dao;
import es.upm.dit.isst.commBike.dao.UsuarioDAOImplementation;
import es.upm.dit.isst.commBike.model.Usuario;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class UsuarioDAOImplementationTest {

	@Test
	void testUsuario() {
		UsuarioDAOImplementation usuariodao = UsuarioDAOImplementation.getInstance();

        Usuario usu = new Usuario();
       

        usu.setNombre("Ana");

        usu.setPassword("1234");

        usu.setRole("user");

        

        usuariodao.create(usu);

        Usuario usu2 = usuariodao.read("Ana");

        assertEquals(usu2.getNombre(), "Ana");

        assertEquals(usu2.getPassword(), "1234");
        assertEquals(usu2.getRole(), "user");
        
        
        usu.setPassword("5678");

        usuariodao.update(usu);

        usu2 = usuariodao.read("Ana");

        assertNotEquals(usu2.getPassword(), "1234");

        

        

        usuariodao.delete(usu);

        usu2 = usuariodao.read("Ana");

        assertNull(usu2);
		
	}

	@Test
	void testCreate() {
	}

	@Test
	void testUpdate() {
	}

	@Test
	void testDelete() {
	}

	@Test
	void testReadAll() {
	}

	@Test
	void testReadAllString() {
	}

	@Test
	void testObject() {
	}

	@Test
	void testGetClass() {
	}
	@Test
	void testHashCode() {
	}

	@Test
	void testEquals() {
	}

	@Test
	void testClone() {
	}

	@Test
	void testToString() {
	}

	@Test
	void testNotify() {
	}

	@Test
	void testNotifyAll() {
	}

	@Test
	void testWaitLong() {
	}

	@Test
	void testWaitLongInt() {
	}

	@Test
	void testWait() {
	}

	@Test
	void testFinalize() {
	}

}
