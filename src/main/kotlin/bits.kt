fun main() {
    val y = 5         // 0101 in binary
    val z = 3         // 0011 in binary

    println("y and z: ${y.and(z)}")   // 1 (0001)
    println("y or z: ${y.or(z)}")     // 7 (0111)
    println("y xor z: ${y.xor(z)}")   // 6 (0110)
    println("inv y: ${y.inv()}")      // -6 (in two's complement)
    println("y shl 1: ${y.shl(1)}")   // 10 (1010)
    println("y shr 1: ${y.shr(1)}")   // 2 (0010)
}