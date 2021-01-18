package design.delegation.kotlinproperty

import kotlin.reflect.KProperty

class ImMutablePropertyDelegation {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "UnChangeAble"
    }

}