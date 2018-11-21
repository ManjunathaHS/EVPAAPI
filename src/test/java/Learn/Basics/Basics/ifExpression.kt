package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/5/2018
 */

fun main(args: Array<String>) {
    val n = 10
    val n2 = 20
    val result = if (n > n2) {
        "$n is greater than $n2"
    } else {
        "$n2 is greater than $n"
    }
    println(result)

    /****************************************/
    val n3 = 20
    val n4 = 30
    val result2 = if (n3 > n4) "$n3 is greater than $n4" else "$n4 is greater than $n3"
    println(result2)

    /****************************************/

    val n5 = 30
    val n6 = 20
    var n7: Int
    val result3 = if (n5 > n4) n7 = n5 else n7 = n6
    println(result3)
    println(n7)

    /****************************************/

    val num1 = 10
    val num2 = 20
    val num3 = 30
    val result4 = if (num1 > num2) {
       val result5= if (num1 > num3) {
            "$num1 is greater than $num2,$num3"
        } else {
            "$num3 is greater than $num1"
        }
        print(result5)
    } else if (num2 > num3) {
        "$num2 is greater than $num3"
    } else {
        "$num1 is greater than $num3"
    }
    print(result4)

}

