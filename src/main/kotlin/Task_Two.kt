/*
     Find index of the first even number in a list
     if the list has an even number then return the index of the first even number
     if the list has no even number then return -1
*/
fun main(){
    println(findIndexOfEvenNumber(listOf(10,4,6,8)))
    println(findIndexOfEvenNumber(listOf(11,3,7,9)))

}
fun findIndexOfEvenNumber(list : List<Int>) = list.indexOfFirst { it % 2 == 0 }
