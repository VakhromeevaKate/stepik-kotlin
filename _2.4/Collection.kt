package _2.`4`

fun getCubeList(n:Int): List<Int>{
    // enter your function code here
    val list: List<Int> = List<Int>(n, {i -> i*i})
    return list
}

fun main(){
    println(getCubeList(10))
}
