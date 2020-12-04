package com.tom

import javafx.scene.text.FontWeight

fun main() {
//    println("Yoooo man kotlin")
//    Taitan().hello()
    var s:String? ="abcde"
    s =null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    val h = Taitan(weight = 66.5f,height = 1.7f)
    println(h.bmi())
    val score=90;
    println(score<100)
    val c :Char='A'
    println(c.toInt() >60)
//    var age = 19
//    age = 20
//    var weight = 66.5f
//    var name : String
//    name = "King"
}

class Taitan(var name:String="",var weight:Float,var height:Float){
    init {
        println("test$weight")
    }
//    constructor(name: String, weight: Float,height: Float) :this(weight,height)

    fun bmi():Float{
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello(){
        println("Hello kotlin~")
    }
}