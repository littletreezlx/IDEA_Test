package design.delegation.kotlinproperty

import kotlin.reflect.KProperty

class MutablePropertyDelegation {

    private var str = "init"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println(thisRef)
        println(property)
        return str
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>,value:String){
        str = value
    }

}