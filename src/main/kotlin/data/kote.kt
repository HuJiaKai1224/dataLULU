package data

import javafx.scene.text.FontWeight

fun main() {
//    println("my name is lala")
//   Dctata().tee()
    val c =Dctata(weight = 60.7f,height = 1.8f)
    println(c.bmi())
//    c.tee()
}

class Dctata(var name:String="", var weight: Float, var height:Float){
    init{
        println("test$weight")
    }
//    constructor(name: String=,weight: Float,height: Float):this(weight,height)
    fun bmi():Float{
        var bmi= weight/(height*height)
        return bmi
    }
    fun tee(){
        print("I need the drop!!")
    }
}