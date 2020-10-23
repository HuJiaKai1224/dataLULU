package Test1

import javafx.scene.text.FontWeight
import javax.swing.tree.FixedHeightLayoutCache

fun main() {
    val h =Pubig(name = "king",weight = 60.8f,height = 1.85f)
    println(h.bmi())
}
class Pubig(var name:String,var weight:Float,var height:Float){
    init{
        println("name$name,height$height,weight$weight")
    }
    fun bmi():Float{
        val bmi=weight / (height*height)
        return bmi
    }
}