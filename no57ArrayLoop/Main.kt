fun main() {

    val fruits = arrayOf<String>("Apple", "Manggo", "Banana", "Orange")
    val array2D = arrayOf(
        arrayOf("One : ", "Apel"),
        arrayOf("Two : ", "Jeruk")
    )

    println("================================================================")
    println("Latihan Loop Melalui Array : Rizwan Elansyah")
    println("================================================================")

    for (item in fruits) {
        println(item)
    }

    for (baris in array2D.indices) {
        for (kolom in array2D.indices) {
            print(array2D[baris][kolom])
            print(" ")
        }
    }

}