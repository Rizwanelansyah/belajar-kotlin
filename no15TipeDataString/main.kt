fun main() {
    val escapedString:String = "Ini adalah escaped String!\n"
    val rawString:String
    rawString ="""Ini akan menjadi string lebih dari satu baris dan
tidak boleh memiliki karakter escaped didalamnya.""";

    var nama = "RizwanElansyah"
    var nilaiString1 = "2"
    var nilaiString2 = "2"

    println("---------------------------------------------------")
    println("Latihan Tipe Data String : $nama \n")

    print(escapedString)
    println(rawString+"\n\n")
    println("Ketika nilai string ditambah dengan nilai String")
    println("maka akan terjadi gabungan String")
    println(nilaiString1+nilaiString2)
    println("---------------------------------------------------")
}