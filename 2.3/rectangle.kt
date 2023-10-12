package `2`.`3`

class rectangle(h: Int, w: Int) {
    // this code:
    var h: Int = h
    var w: Int = w
    // or this code (optional):
    init {
        this.h = h
        this.w = w
    }
    constructor(x1: Int, x2: Int, y1: Int, y2: Int): this(y1 - y2, x2 - x1) {
        println("anything you want")
    }
}
