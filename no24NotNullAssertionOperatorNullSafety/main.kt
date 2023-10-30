fun main(){
    var nama:String? = "Rizwan"
    val panjangKarakter:Int 

    println("--------------------------------------------")
    println("Latihan Operator not-null Assertion (Null Safety) : Rizwan Elansyah")
    println("--------------------------------------------")
    panjangKarakter = nama!!.length
    println("Panjang Karakter Dari Variabel Nama : $nama")
    println("Panjang Karakter : $panjangKarakter")

    // nama = null
    // panjangKarakter = nama!!.length

    println("--------------------------------------------")
}