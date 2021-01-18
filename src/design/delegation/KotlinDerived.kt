package design.delegation


//kotlin的委托做不到在前后修改啊
class KotlinDerived(i: MoneyHandlerInterface) : MoneyHandlerInterface by i {


    override fun increaseMoney() {
        println("23213")
    }

}