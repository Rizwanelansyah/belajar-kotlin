fun main(){
    var nilai:String = "26"
    var nilaiByte:Byte = nilai.toByte()
    var nilaiInt:Int = nilai.toInt()
    var nilaiDouble:Double = nilai.toDouble()
    var nilaiLong:Long = nilai.toLong()
    var nilaiShort:Short = nilai.toShort()
    var nilaiBoolean:Boolean = nilai.toBoolean()
    // untuk boolean jika nilainya angka maka nilainya false
    //karena nilai boolean hanya true dan false
    var nilaiChar:Char = nilai.first()

    val nilaiString1:String = "5"
    val nilaiString2:String = "5"
    val operasiString:String = (nilaiString1 + nilaiString2)

    val operasiInt:Int = ((nilaiString1.toInt())+(nilaiString2.toInt()))

    val nilaiStringLogika:String = "true"
    val operasiBoolean:Boolean = nilaiStringLogika.toBoolean()

    println("---------------------------------------------------")
    println("Latihan Konversi Tipe Data String : Rizwan Elansyah")

    println("Nilai String : $nilai")
    println("Niali Byte : $nilaiByte")
    println("Nilai Int : $nilaiInt")
    println("Niali Double : $nilaiDouble")
    println("Niali Long : $nilaiLong")
    println("Nilai Short : $nilaiShort")
    println("Nilai Boolean : $nilaiBoolean")
    println("Nilai Char : $nilaiChar")

    println("\nOperasi String : $operasiString")
    println("Operasi Int : $operasiInt")
    println("Operasi Boolean : $operasiBoolean")

    println("---------------------------------------------------")
}