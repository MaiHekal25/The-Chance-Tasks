/*
    Write a function that checks whether a given string is a palindrome.
    A string is considered a palindrome if it reads the same forward and backward.
    The function should return true if the input string is a palindrome and false otherwise.
 */
fun main() {
    println(isPalindrome("Level"))
    println(isPalindrome("Hello"))

}

fun isPalindrome(input: String): Boolean {
    val newInputWithIgnore = input.lowercase()
    var leftPointer = 0
    var rightPointer = input.length - 1

    while (leftPointer < rightPointer) {

        if (newInputWithIgnore[leftPointer] != newInputWithIgnore[rightPointer])
            return false
        leftPointer++
        rightPointer--
    }
    return true
}
