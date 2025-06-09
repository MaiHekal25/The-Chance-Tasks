/*
    Given a string containing only the characters '(' and ')', write a function that checks whether the parentheses
    in the string are valid. A string is considered valid if:

    Every opening parenthesis '(' has a corresponding closing parenthesis ')'.
    Parentheses are properly nested.
    Return true if the string is valid, otherwise return false.
*/
fun main() {
    val testCases = listOf(
        "()",          // true
        "(())",        // true
        "(()",         // false
        "())(",        // false
        "((()))",      // true
        "(()(()))",    // true
        ")(",          // false
    )

    for (input in testCases) {
        println("Is \"$input\" Valid? ${checkIsParenthesesValid(input)}")
    }
}

fun checkIsParenthesesValid(input: String): Boolean {

    var count = 0
    for (car in input) {
        when (car) {
            '(' -> count++ //2
            ')' -> {
                count--
                if (count < 0) return false
            }
        }
    }
    return count == 0
}