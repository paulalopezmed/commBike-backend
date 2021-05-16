package es.upm.dit.isst.commBike.dao;
import es.upm.dit.isst.commBike.model.registro;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import es.upm.dit.isst.commBike.model.bicicleta;

class registroDAOImplementationTest {

	@Test
	void testRegistro() {
		registroDAOImplementation registroadao = registroDAOImplementation.getInstance();

        registro reg = new registro();

        reg.setRecordCode("1");

        reg.setBikeCode("2010");

        reg.setOriginBikeCoordenatesX(40);

        reg.setOriginBikeCoordenatesY(-3);
        reg.setEndBikeCoordenatesX(41);
        reg.setEndBikeCoordenatesY(-3.5);
        reg.setEndTime(0);
        reg.setOriginTime(5);
        reg.setPrecio(34);
        reg.setTime(5);

        registroadao.create(reg);

        registro reg2 = registroadao.read("1");

        assertEquals(reg2.getRecordCode(), "1");

        assertEquals(reg2.getEndBikeCoordenatesX(), 41);
        assertEquals(reg2.getEndTime(), 0);
        
        
        reg.setOriginBikeCoordenatesY(-4);

        registroadao.update(reg);

        reg2 = registroadao.read("1");

        assertNotEquals(reg2.getOriginBikeCoordenatesY(), -3);

        

        

        registroadao.delete(reg);

        reg2 = registroadao.read("1");

        assertNull(reg2);
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
