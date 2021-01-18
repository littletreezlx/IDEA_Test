package design.delegation

class LocalMoneyHandler : MoneyHandlerInterface {


    override fun increaseMoney() {
        println("LocalMoneyHandler___IncreaseMoney___+++")
    }


    override fun decreaseMoney() {
        println("LocalMoneyHandler___DecreaseMoney___---")
    }

}