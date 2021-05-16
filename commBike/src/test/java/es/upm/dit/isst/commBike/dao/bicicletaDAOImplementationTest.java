package es.upm.dit.isst.commBike.dao;
import es.upm.dit.isst.commBike.dao.bicicletaDAOImplementation;

import es.upm.dit.isst.commBike.model.bicicleta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bicicletaDAOImplementationTest {

	@Test
	void testBicicleta() {
		bicicletaDAOImplementation bicicletadao = bicicletaDAOImplementation.getInstance();

        bicicleta bici = new bicicleta();


        bici.setBikeCode("2010");

        bici.setBikeCoordenatesX(40);

        bici.setBikeCoordenatesY(-3);

        bici.setAvailable(true);

        bicicletadao.create(bici);

        bicicleta bici2 = bicicletadao.read("2010");

        assertEquals(bici2.getBikeCode(), "2010");

        assertEquals(bici2.getBikeCoordenatesX(), 40);
        assertEquals(bici2.getBikeCoordenatesY(), -3);
        
        
        bici.setBikeCoordenatesX(41);

        bicicletadao.update(bici);

        bici2 = bicicletadao.read("2010");

        assertNotEquals(bici2.getBikeCoordenatesX(), 40);

        

        

        bicicletadao.delete(bici);

        bici2 = bicicletadao.read("2010");

        assertNull(bici2);
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
