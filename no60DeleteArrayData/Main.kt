fun main() {

    val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange", "Apple")
    val foods = arrayOf<String>("KFC", "Burger", "Pizza", "Potato Chip")

    println("================================================================")
    println("Latihan Menghapus Elemen Data Dari Array : Rizwan Elansyah")
    println("================================================================")

    println("Data Array Sebelum Dihapus")
    for (item in fruits) {
        print(item + " | ")
    }
    println()
    for (item in foods) {
        print(item + " | ")
    }

    println()
    val result1 = fruits.drop(2)
    val result2 = foods.dropLast(2)
    for (item in result1) {
        print(item + " | ")
    }
    println()
    for (item in result2) {
        print(item + " | ")
    }

}