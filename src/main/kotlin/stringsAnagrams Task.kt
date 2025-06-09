/*
    Write a function to check if two given strings are anagrams of each other.
    Two strings are considered anagrams if they contain the same characters in the same frequency but in any order.
*/
fun main() {
    println(areAnagrams("Listen", "Silent"))     // true
    println(areAnagrams("Triangle", "Integral")) // true
    println(areAnagrams("Apple", "Pabble"))      // false

}

fun areAnagrams(firstInput: String, secondInput: String): Boolean {
    val normalizedFirstInput = firstInput.lowercase().toCharArray().sorted()
    val normalizedSecondInput = secondInput.lowercase().toCharArray().sorted()
    return normalizedFirstInput == normalizedSecondInput
}