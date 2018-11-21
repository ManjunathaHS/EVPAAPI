package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/5/2018
 */

fun main(args: Array<String>) {

    val number = 7;
    val max = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        6 -> "Six"
        else -> "seven"

    }
    println(max)

    /**************************/

    when (number) {
        1 -> print("one")
        2 -> print("two")
        3 -> print("Three")
        4 -> print("four")
        5 -> print("Five")
        6 -> print("Six")
        else -> println("seven")
    }

    /**************************/

    val max2 = when (number) {
        1, 2, 3 -> "Sunday"
        4, 5, 6, 7 -> "Monday"
        else -> println("Invalid")
    }
    println(max2)

    /**************************/

    when (number) {
        1, 2, 3 -> println("One,two,Three")
        4, 5, 6, 7 -> println("Four,Five,Six,seven")
        else -> println("Invalid")
    }

    /**************************/

    when(number){
        in 1..4-> println("One,two,Three")
        in 5..6-> println("Four,Five,Six")
        else -> println("seven")
    }

}