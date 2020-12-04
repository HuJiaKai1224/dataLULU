package com.tom.kotlin

import com.tom.Person
import com.tom.Taitan
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest{
    @Test
    fun kingBmiTest(){
        val king= Taitan("Jack",65.7f,1.7f)
        Assertions.assertEquals(65.7f/(1.7f+1.7f),king.bmi())
    }
    @Test
    fun personBmiTest(){
        val person= Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f+1.7f),person.bmi())
    }
}