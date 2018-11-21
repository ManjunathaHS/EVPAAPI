package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/4/2018
 */

fun main(args:Array<String>){

    val id= arrayOf(1,2,3,4,5)
    println(id[0])
    println(id[2])

    // Create any array using constr
    val asc=Array(5,{i -> i*2 })
    print(asc[0])

    val name="test\n"
    val address=""" this is
        |test line for the verfying the raw string
    """.trimMargin()

    val city="Bangalore\t"

    println(name+city+address)


}
