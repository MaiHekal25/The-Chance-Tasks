/* FizzBuzz Task
    Write a Function that takes an integer n as input and returns a list of strings representing numbers from 1 to n.

    if a number is divisible by 3 , replace it with the string "Fizz".
    if a number is divisible by 5 , replace it with the string "Buzz".
    if a number is divisible by both 3 and 5 , replace it with the string "FizzBuzz".
    For all other numbers, include the number itself as a string in the list.

*/
fun main() {
    println(fizzBuzz(20))
}

fun fizzBuzz(number: Int): List<String> {
    val result: MutableList<String> = mutableListOf() //[1,2,"Fizz",4,"Buzz","Fizz",7,8,"Fizz"."Buzz"]
    for (currentNumber in 1..number) {
        val value = calculateSingleNumber(currentNumber)
        result.add(value)
    }
    return result
}

fun calculateSingleNumber(currentNumber: Int): String {
    return when {
        currentNumber % 3 == 0 && currentNumber % 5 == 0 -> "FizzBuzz"
        currentNumber % 3 == 0 -> "Fizz"
        currentNumber % 5 == 0 -> "Buzz"
        else -> currentNumber.toString()
    }
}