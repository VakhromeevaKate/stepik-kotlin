package `2`.`3`

class SugarStorage(var volume: Int = 0) {
    fun increaseSugar(v: Int) {
        if (v >= 0) volume += v
        println("balance after increaseSugar: ${volume}")
    }
    fun decreaseSugar(v: Int) {
        if (v >= 0) {
            volume -= v
            if (volume < 0) volume = 0
        }
        println("balance after decreaseSugar: ${volume}")
    }
}

fun main() {
    var st = SugarStorage(10)
    println("start balance: ${st.volume}")
    st.increaseSugar(100)
    st.decreaseSugar(10)
}
