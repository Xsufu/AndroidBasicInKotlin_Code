fun main() {
    val border = "`-._,-'"
    val timesToRepeat = 4
    
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
}

//Функция печати границы
fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat){
        print(border)
    }
    println()
}