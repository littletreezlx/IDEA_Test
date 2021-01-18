interface Production<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consume(item: T)
}

interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}


open class Food : Comparable2<Food> {

    override fun compareTo(other: Food): Int {

        println("hhh")
        return 1
    }

}


public interface Comparable2<T> {
    /**
     * Compares this object with the specified object for order. Returns zero if this object is equal
     * to the specified [other] object, a negative number if it's less than [other], or a positive number
     * if it's greater than [other].
     */
    public operator fun compareTo(other: T): Int
}


open class FastFood : Food()
class Burger : FastFood()


class FoodStore<out T>(private val t: T) {

//    override fun consume(item: T) {
//        TODO("Not yet implemented")
//    }

    fun produce(): T {


        println("Produce food")
        return t
    }
}


interface Transformer<in T> {
    fun transform(t: T): String
}

fun main() {
//    val trans = object : Transformer<Burger> {
//        override fun transform(t: Burger): String {
//            TODO("Not yet implemented")
//        }
//    }
//    handleTran(trans)

//    val food= Burger()
//    handle(food)


    Food().compareTo(Food())
    Food().compareTo(Burger())
    Burger().compareTo(Burger())
    Burger().compareTo(Food())


    val str = "005"
    println(str.toInt())

    val list = mutableListOf<Int>(0,1)
    println(list.lastIndex)
    println(list.subList(1,1))
}

fun handle(trans: Food) {

}

fun handleTran(trans: Transformer<Burger>) {
    trans.transform(Burger())
}


//fun copy(from: Array<in Any>, to: Array<Any>) {
//    from[0] = 1
//    for (i in from.indices) {
//        to[i] = from[i]
//    }
//}





