package design.delegation

class MoneyHandlerProxy(private val localMoneyHandler: LocalMoneyHandler) : MoneyHandlerInterface {


    override fun increaseMoney() {
        println("IncreaseMoney___Before")
        localMoneyHandler.increaseMoney()
        println("IncreaseMoney___After")
    }


    override fun decreaseMoney() {
        println("DecreaseMoney___Before")
        localMoneyHandler.decreaseMoney()
        println("DecreaseMoney___After")
    }

}