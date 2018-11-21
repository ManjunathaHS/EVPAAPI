package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/16/2018
 */

fun main(args: Array<String>) {

    var string1 = "kotlin is a programming language developed by JetBrains\n".capitalize() +
            "for modern multiplatform applications.\n".capitalize() +
            "it is safe, concise and fun to read and write.".capitalize()

    println("--------------Escaped String-------------------")
    print(string1)
    println()
    println(" ---------------Raw String---------------------")

    var string2 = """Kotlin is a programming language developed by JetBrains
        |for modern multiplatform applications.
        |It is safe, concise and fun to read and write.""".trimMargin()
    println(string2)
    println(string2.length)
    println(string2==string1)
    println(string2===string1)
    println(string2.compareTo(string2))
    println("--------String templates---------------")
    println("$string2 length is ${string2.length}")
    println("--------String---------------")
    println(""+string2 +"length is:" + string2.length)

    var str1= 10
    println(str1)
    println("str1 value is ${str1}")
    println("the value of str1 is"+str1)

    // if we want to use a raw dollar sign and not as a part of a String template?
    println("\$str1")

    // constructor an expression into variable using string templates
    val message= if(str1 > 0) "positive" else "not positive"
    println("message is $message")

    val message1= "${if(str1 > 0) "positive" else "not positive"}"
    println("message1:$message1")


    var message2="$str1 is ${if(str1 > 0) "positive" else "not positive"}"
    println("message is $message2")


    // String methods

    println("message get: "+ message2.get(0))
    println("plus: ${message2.plus( " is new negative")}")
    println("subsequence: ${message2.subSequence(0,5)}")
    println("post subsequ: $message2")
    println("contains: ${message2.contains('S',ignoreCase = true)}")
    println("count: ${message2.count()}")
    println("drop: ${message2.drop(1)}")
    println("droplast: ${message2.dropLast(9)}")
    println("Element at ${message2.elementAt(4)}")
    println("${message2.reversed()}")





}





