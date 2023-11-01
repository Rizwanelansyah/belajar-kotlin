fun main() {

    val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange")
    val fruitsData = arrayOf(
        arrayOf("1.", "Apple"),
        arrayOf("2.", "Jeruk"),
        arrayOf("3.", "Mangga")
    )

    println("================================================================")
    println("Latihan Index Rentang Array : Rizwan Elansyah")
    println("================================================================")

    println("Indeks Rentang Dari Data Array Fruits : " + (fruits.indices))
    println("Index Rentang BARIS Dari Data Array fruitsData : " + (fruitsData.indices))
    println("Index Rentang KOLOM Dari Data Array fruitsData : " + (fruitsData[0].indices))

}