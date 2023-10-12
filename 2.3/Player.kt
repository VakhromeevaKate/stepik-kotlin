package `2`.`3`

class Player(
    var str: Int = 0,
    var dex: Int = 0,
    var XP: Int = 0,
    var lvl: Int = 1,
    var nextLvlXp: Int = 10
) {
    fun receivePX(xp: Int) {
        XP += xp
        if (XP >= nextLvlXp) lvlUp()
        println("str = ${str} XP = ${XP} lvl = ${lvl}")
    }

    private fun lvlUp() {
        lvl += 1
        str+= if (lvl % 2 == 0) 1 else 0
        dex+= if (dex % 2 != 0) 1 else 0
        nextLvlXp += 100
    }
}

fun main() {
    var p = Player(str=2)
    p.receivePX(10)
    p.receivePX(100)
    p.receivePX(100)
}
