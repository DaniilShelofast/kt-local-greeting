package mate.academy

fun greetUsers() {
    var i = 0
    while (i < Int.MAX_VALUE) {
        println("Please enter a name (or press Enter to quit):")
        val name = readLine();
        if (name?.isEmpty() == true) {
            break
        }
        println("Hello, $name!")
        i++
    }
}

fun main() {
    greetUsers()
}
