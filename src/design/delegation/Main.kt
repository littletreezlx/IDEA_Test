package design.delegation

import java.lang.reflect.Proxy

class Main {


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            manualProxy()
//            dynamicProxy()
            kotlinDelegation()
        }

        private fun manualProxy(){
            val handler = LocalMoneyHandler()
            val proxy = MoneyHandlerProxy(handler)
            proxy.increaseMoney()
            proxy.decreaseMoney()
        }


        private fun dynamicProxy(){
//            val handler = LocalMoneyHandler() as MoneyHandlerInterface
            val handler = RemoteMoneyHandler() as MoneyHandlerInterface
            val invocationHandler = MoneyHandlerInvocationHandler(handler)
            val  dynamicProxy = Proxy.newProxyInstance(invocationHandler.javaClass.classLoader, handler.javaClass.interfaces, invocationHandler) as MoneyHandlerInterface
            dynamicProxy.increaseMoney()
            dynamicProxy.decreaseMoney()
        }


        private fun kotlinDelegation(){
            val handler = LocalMoneyHandler()
            val derived = KotlinDerived(handler)
            derived.increaseMoney()
            derived.decreaseMoney()
        }


    }

}