import sun.rmi.runtime.Log
import java.io.IOException
import java.lang.Exception

fun main() {

    try {
        println(0)
        println(throwException())
        throwException()
        println(1)
    } catch (e: Exception) {
        println(e.message)
    }

}

fun throwException() : Int {
    throw IOException("111")
    return  1
}