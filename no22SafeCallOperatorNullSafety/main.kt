fun main(){
    var nama:String? = null
    var usia:String? = null

    println("-------------------------------------------------------------------------------")
    println("Latihan Operator Safe Calls (Null Safety) : RizwanElansyah")
    println("-------------------------------------------------------------------------------")

    println("Mengambil panjang karakter String dengan fungsi length :")
    print("Panjang karakter nama :")
    println(nama?.length)

    nama = "RizwanElansyah"
    val jumlahKarakter:Int? = nama?.length
    println("Panjang Karakter pada variabel nama :\'$nama\' adalah : $jumlahKarakter")

    usia = "80"
    val umur:Int? = usia?.toInt()
    println("Usia : $umur")
    println("-------------------------------------------------------------------------------")
}