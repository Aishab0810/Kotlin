package one

fun main() {
    for (nums in 1..10) {
        if (nums == 7) {
            continue
        }
        println(nums)
    }
}