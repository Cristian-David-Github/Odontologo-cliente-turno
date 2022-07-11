package com.random0perator.odontologo;

import com.random0perator.odontologo.service.OdontologoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.couchbase.AutoConfigureDataCouchbase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OdontologoApplicationTests {
	@Autowired
	OdontologoServiceImpl odontologoServiceImpl;

	@Test
	void contextLoads() {
	}

}
