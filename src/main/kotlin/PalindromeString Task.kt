/*
    Write a function that checks whether a given string is a palindrome.
    A string is considered a palindrome if it reads the same forward and backward.
    The function should return true if the input string is a palindrome and false otherwise.
 */
fun main() {
    val listOfInputs = listOf("Level", "Hello", "abb", "Wow")
    for (input in listOfInputs) {
        println("Is $input a palindrome? ${isPalindrome(input)}")
    }

}

fun isPalindrome(input: String): Boolean {
    val normalized = input.lowercase()
    return normalized == normalized.reversed()
}
