package `2`.`3`

open class Item(var lvl: Int, var weight: Double)

open class Weapon(lvl: Int, weight: Double): Item(lvl, weight) {
    open fun calcDamage(): Int = 42
}

class MagicWeapon(lvl: Int, weight: Double): Weapon(lvl, weight) {
    override fun calcDamage(): Int {
        return super.calcDamage() * 2
    }
}

fun main() {
    val instance = MagicWeapon(1, 1.0)
    println("calcDamage = ${instance.calcDamage()}")
}
