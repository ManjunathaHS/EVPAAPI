package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/3/2018
 */

fun main(args:Array<String>){

    // Way to intalize the variables this is called type inference
    val lang="Kotlin"
    var  version=1.2

    println(lang)
    println(version)

    // One more way to intiliaze the above is as follows
    var lang2:String="Java"
    val version2:Double=1.8

    println(lang2)
    println(version2)

    // One more way to intiliaze
    var lang3:String
    lang3= "C#"
    val version3:Double
    version3= 0.5
    println(lang3)
    println(version3)

    // What is var and val
    // val is immutable where as var is mutable

    version=1.3
    println(lang)
    println(version)






}