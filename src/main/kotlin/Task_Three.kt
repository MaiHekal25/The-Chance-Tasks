import kotlin.math.abs

/*
    Given a non-sorted array of integers,
    write a function to check if the array contains any duplicate elements,
    ignoring the sign of numbers. That is , if both -2 and 2 appear in the array,
    they should be counted as duplicates. The function should return true if duplicated are found (ignoring sign),
    otherwise false.
 */
fun main() {
    println(checkDuplication(listOf(2, -1, 1, 10)))
}

fun checkDuplication(list: List<Int>): Boolean {
    val storedValues = mutableListOf<Int>()
    list.forEach {
        val nonSignedValue = abs(it)
        if (nonSignedValue in storedValues) {
            return true
        }
        storedValues.add(nonSignedValue)
    }
    return false

}