package design.delegation.kotlinproperty

class Main {


    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val holder = KotlinPropertyHolder()
            holder.printAll()
        }

    }

}