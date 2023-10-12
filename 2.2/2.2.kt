fun calculateEvenDigits(input:String): Int{
    var sum = 0
    for (i in input) {
        if (i.digitToInt() % 2 == 0) {
            sum += i.digitToInt()
            println("i=${i.digitToInt()}, sum=${sum}")
        }
    }
    return sum
}

fun calculateBugMentions(input:List<String>): Int{
    var counter = 0
    for (word in input) {
        if (word == "BUG") {
            counter ++
        }
    }
    return counter
}


fun main (args: Array<String>){
    // println(calculateEvenDigits("660308340"))
    var list = ("KLPQYM BUG KHQR KLPQYM JVOJTD JVOJTD BUG BUG KHQR BUG KLPQYM JVOJTD KLPQYM JVOJTD QLSPA KHQR JVOJTD KLPQYM JVOJTD KLPQYM KLPQYM JVOJTD JVOJTD BUG KLPQYM KHQR JVOJTD KHQR KLPQYM KLPQYM JVOJTD KLPQYM BUG BUG BUG").split(" ")
    println(calculateBugMentions(list))
}
