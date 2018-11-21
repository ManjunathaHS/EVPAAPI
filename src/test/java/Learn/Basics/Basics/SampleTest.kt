package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/10/2018
 */


class SampleTest{

    private var name= "test"
    protected  var name2= "demo"
    public  var name3= "prod"
    internal var name4="UAT"

    fun main(args:Array<String>){
        var test= SampleTest()
        println(test.name)
    }
}