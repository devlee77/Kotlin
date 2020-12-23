fun main() {
    var x = 4               //0100(2진)
    var y = 0b0000_1010     //10(10진)
    var z = 0x0f            //0b0000_1111(2진) 15(10진)

    println("x shl 2 -> ${x.shl(2)}") // 16(10진) 0001_0000(2진)
    println("x inv -> ${x.inv()}")              // 111...1011(2진)

    println("y shr 2 -> ${y/4}, ${y shr 2}")     // 2, 2
    println("x shl 2 -> ${x*16}, ${x shl 4}")    // 64, 64
    println("z shl 2 -> ${z*16}, ${z shl 4}")    // 240, 240

    x = 64
    println("x shr 4 -> ${x/4}, ${x shr 2}")     // 16, 16
}