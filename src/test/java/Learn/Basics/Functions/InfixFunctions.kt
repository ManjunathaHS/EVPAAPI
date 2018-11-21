package Learn.Basics.Functions


/**
 * @author jayaprakashs on 10/18/2018
 */

class InfixFunctions {

    infix fun sqrt2(n1: Int) {
        println(Math.sqrt(n1.toDouble()))
    }

}

// This is extended Function
infix fun BasicFunction.isExcellent(name: String) = if (name.equals("John")) print(("$name is Excellent student")) else print("$name is not Excellent")


// Infix allow us write the code without using "." when calling the method

fun main(args: Array<String>) {
    val p = InfixFunctions()
    p sqrt2 (10)
    val s = BasicFunction()
    s isExcellent ("John cena")
}




