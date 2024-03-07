package com.user.guess
import java.util.*

class secretnumber {
    val secret : Int = Random().nextInt(10 )+1
    var count = 0

    fun validate = (number:Int) : Int {
        count ++
        return number- secret
    }
}
fun main() {
    val secretnumber = secretnumber()
    println(secretnumber.secret)
    println("${secretnumber.validate(number:2)} ,count: ${secretNumber.count}")

}