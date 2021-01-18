package design.delegation.kotlinproperty

class KotlinPropertyHolder {

    private val imMutableProperty: String by ImMutablePropertyDelegation()

    private var mutableProperty: String by MutablePropertyDelegation()


    fun printAll(){
        println(imMutableProperty)
        println(mutableProperty)
        mutableProperty = "hhh"
        println(mutableProperty)
    }

}