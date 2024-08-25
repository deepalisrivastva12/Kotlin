
class Person{
    var name :String="John doe"
    val age :Int=30
    fun displayInfo(){
        println("Name : $name , Age = $age") //this "$" sign is for interpolation of the variable
        println("name is +name + age is +age")//wrong

        println("name is "+name+" age is "+age)
    }
}
fun greet(){
    val msg :String= "helllo i am deepali"
    println(msg)
}

fun main(){

    val person =Person()
    person.displayInfo()
    //println(msg) we cannot directly access variable which is in function
    greet()



    val ab=10
    val bc=20
    val result="Sum of $ab and $bc is ${ab+bc}"
    println(result)

    var k:Char='A'
    println(k)

    var newVar: String = """This is 
my first 
program""" //this is a multi-line input

    println(newVar)
    val boolvar:Boolean=true
    println(boolvar)
}