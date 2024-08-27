fun main(){

    var a = 4
    var b = 2

    println("Addition: "+ (a+b))
    println("Substraction: "+ (a - b))
    println("Multiplication: "+a*b)
    println("Division: "+ (a / b))
    println("Modulus: "+ (a % b))
    println("Right shift: " +a.shr(1))
    println("left shift: " +b.shl(1))
    println("Bitwise and: " + (a and b))
    println("Bitwise or :" + (a or b))
    println("Bitwise xor: " + (a xor b))

    var c = true
    var d=false

    println("Logical and is : "+ (c && d))
    println("Logical or is : "+ (c || d))


}