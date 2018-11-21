package Learn.Basics.Functions

/**
 * @author jayaprakashs on 10/18/2018
 */

class BasicFunction {
    fun addNumbers(n1: Int, n2: Int) {
        println(n1 + n2)
    }

    fun sqrt(n1: Int): Double {
        return Math.sqrt(n1.toDouble())
    }


    fun printName(Fname: String, Lname: String): String = "$Fname" + "$Lname"

    fun ReturnName(Fname: String, Lname: String) = "$Fname" + "$Lname"

}

fun isExcellent(name: String) {
    println("student $name is excellent")
}

fun main(args: Array<String>) {
    val p = BasicFunction()
    p.addNumbers(10, 30)
    println(p.sqrt(40))
    println(p.printName("John", "Doe"))
    println(p.ReturnName("Jay", "Leo"))


}