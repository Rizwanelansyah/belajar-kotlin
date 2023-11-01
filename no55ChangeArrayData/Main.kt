fun main() {

    val fruits = arrayOf<String>("Apple", "Manggo", "Banana", "Orange")
    val array2D = arrayOf(
        arrayOf("One : ", "Pepaya"),
        arrayOf("Two : ", "Kelapa")
    )

    println("================================================================")
    println("Latihan Mengubah Elemen Atau Data Array : Rizwan Elansyah")
    println("================================================================")
    
    println("Data Sebelum Diubah / Diatur")
    println("Data Index [0] : " + fruits[0]) 
    println("Data Index [0][1] : " + array2D[0][1])
    
    fruits[0] = "Watermelon"
    array2D[0][1] = "Coconut"
    
    println("Data Sesudah Diubah / Diatur")
    println("Data Index [0] : " + fruits[0]) 
    println("Data Index [0][1] : " + array2D[0][1])

}