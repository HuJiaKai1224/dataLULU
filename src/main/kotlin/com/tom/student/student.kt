package com.kotlin

import java.util.*

fun main() {
//    userinput()
    val stu = Student("Jack", 70, 80)
    stu.print()
//    println("High score:"+ stu.higest())
    println("High score:${stu.higest()}") /* $?????? */
}

private fun userinput() {
    val scanner = Scanner(System.`in`)
    print("Please Enter Studnet name:")
//    var name=scanner.next()
    var name = null
    print("Please Enter Studnet english:")
    var english = scanner.nextInt()
    print("Please Enter Studnet math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameChack()
}

class Student(var name:String?,var english:Int,var math:Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverge()}\t${passOrFailed()}\t${grading()}")
        /*print(name+"\t"+english+"\t"+math+"\t"
                +getAverge()+"\t"+
                if(getAverge()>=60) "Pass" else "Failed")
        println("\t"+grading())*/
    }
    fun grading():Char{
        return when(getAverge()){
            in 90..100 ->'A'
            in 80..89 ->'B'
            in 70..79 ->'C'
            in 60..69 ->'D'
            else ->'F'
        }
        /*var grading:Char =when(getAverge()){
            in 90..100 ->'A'
            in 80..89 ->'B'
            in 70..79 ->'C'
            in 60..69 ->'D'
            else ->'F'
        }
        return grading;*/
    }
    fun passOrFailed()=
            if(getAverge()>=60) "Pass" else "Failed"
    fun getAverge()=(english+math)/2

    fun higest():Int {
        var max=
        return if (english>math){
            println("english")
            english
        }else{
            println("math")
            math
        }
    }

    fun nameChack(){
        println(name?.length)
    }

}