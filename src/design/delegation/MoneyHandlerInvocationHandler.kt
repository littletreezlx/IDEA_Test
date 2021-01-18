package design.delegation

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class MoneyHandlerInvocationHandler(private val moneyHandler: MoneyHandlerInterface) : InvocationHandler {


    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        println("${method?.name}___Before")
        val result = method?.invoke(moneyHandler, *(args ?: emptyArray()))
        println("${method?.name}___After")
        return result ?: Any()
    }

}