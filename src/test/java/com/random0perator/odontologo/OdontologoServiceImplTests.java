package com.random0perator.odontologo;

import com.random0perator.odontologo.model.Odontologo;
import com.random0perator.odontologo.service.OdontologoServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;



@SpringBootTest
public class OdontologoServiceImplTests {
    @Autowired
    OdontologoServiceImpl odontologoService;





    @Test
    public void testGuardarNuevoOdontologo(){
        Odontologo o = new Odontologo("Cristian","david",1541);
        odontologoService.guardarNuevoOdontologo(o);
        Optional<Odontologo> check1 = odontologoService.buscarOdontologoXid(1);
        Assert.assertNotNull(check1);

    }
    @Test
    public void traerTodos() {
        List<Odontologo> odontologos = odontologoService.buscarTodosLosOdontologos();
        Assert.assertTrue(!odontologos.isEmpty());
        System.out.println(odontologos);


    }




}
