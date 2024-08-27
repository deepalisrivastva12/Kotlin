
fun anyTask(num : Int,num2:Int) : Int{
    var a=3
    var b=3
    val c=a+b+num+num2
    return c
}
fun anyTask2() : Int{
    var a=3
    var b=3
    val c=a+b
    return c
}
fun main(){
    val result=anyTask(4,8)
    println(result)
    println(anyTask(3,6))
    println(anyTask2())
}