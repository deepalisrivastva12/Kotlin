
class Car{
    var make:String=""
    var model:String=""
    var year:Int=0

    fun getInfo():String{
        return "$make $model ,$year"
    }
}
fun main(){
    val mycar=Car()
    mycar.make="maruti suzuki"
    mycar.model="xyz"
    mycar.year=2024

    println(mycar.getInfo())


}