package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel on 1/18/2018.
 */
public class PersonTest {

    @Test
    public void temp() throws Exception{
        Person person = new Person();
        person.setName("Reed");
        person.setAge(39);

        assertEquals( "Reed", person.getName());

        // change name on person to robert
        person.setName("Robert");
        assertEquals( "Robert", person.getName());


        Person person2 = new Person();
        person2.setName("Mikel");
        person2.setAge(25);

        assertEquals("Mikel", person2.getName());
    }
}