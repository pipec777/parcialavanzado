package com.example.parcialprimercorte;

import static org.junit.Assert.*;

import org.junit.Test;

public class datosTest {

    @Test
    public void testDatos() {

        // Crear una instancia de la clase datos
        datos persona = new datos("FELIPE", "BOGOTA");

        // Verificar los valores de los campos usando los métodos get
        assertEquals("FELIPE", persona.getNombre());
        assertEquals("BOGOTA", persona.getCiudad());

        // Cambiar el valor del campo "ciudad" usando el método set
        persona.setCiudad("BOGOTA");

        // Verificar el nuevo valor del campo "ciudad" usando el método get
        assertEquals("CARTAGENA", persona.getCiudad());

    }
}