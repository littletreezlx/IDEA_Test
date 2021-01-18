package design.delegation

class RemoteMoneyHandler : MoneyHandlerInterface {


    override fun increaseMoney() {
        println("RemoteMoneyHandler___IncreaseMoney___+++")
    }


    override fun decreaseMoney() {
        println("RemoteMoneyHandler___DecreaseMoney___---")
    }

}