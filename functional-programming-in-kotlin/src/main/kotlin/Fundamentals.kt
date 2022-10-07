import java.lang.NumberFormatException

fun main() {
    usingDeclarativeApproach()
}

/**
 * Suppose you have a list, List<String>. Some list elements are numbers, like "123".
 * Others are normal Strings, like "abc". You want to implement a function, stringSum,
 * which returns the sum of all the values you can convert from String to Int.
 **/
fun usingDeclarativeApproach() {

    val input = listOf("123", "abc", "1ds", "987", "abdf", "1d3", "de1", "88", "101")
    val sumImp = imperativeSum(input)
    val sumDec = declarativeSum(input)
    println(sumImp)
    println(sumDec)

}

fun imperativeSum(input: List<String>): Int {

    var sum = 0
    for (item in input) {
        try {
            sum += item.toInt()
        } catch (e: NumberFormatException) { //Bad practice
            //skip
        }
    }
    return sum
}

fun declarativeSum(list: List<String>): Int = list
    .filter(::isValidNumber)
    .map(String::toInt)
    .sum()

fun isValidNumber(str: String): Boolean =
    try {
        str.toInt()
        true
    } catch (e: NumberFormatException) {
        false
    }

/**
 *  Implement the function sumInRange, which sums the values in
 *  a List<String> within a given interval. The signature is:
 */
fun exercise1_1(){

}