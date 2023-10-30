fun main() {

    val a: Byte = 127
    val b: Short = 32767
    val c: Int = 2147483647
    val d: Long = 9223372036854775807
    val e: Long = 1231235432L

    val f: Float = 200.00F
    val maxf: Float = 3.40282346638528860F
    val g: Double = 100.00
    val maxh: Double = 1.7976931348623157

    val i: Short = 32_767
    val j: Int = 2_147_483_647
    val k: Long = 9_223_372_036_854_775_807
    val l: Double = 1.797_693_134_862_315
    
    println("-------------------------------------------------------------------------------")
    println("Latihan Tipe Data : Rizwan Elansyah \n")

    print("\n Nilai : $a \n Nilai : $b \n Nilai : $c \n Nilai : $d \n")
    print("Nilai : $e \n Nilai : $f \n Nilai : $maxf \n Nilai : $g \n Nilai : $maxh \n")
    println("\nNilai underscore : ")
    print("\n Nilai : $i \n Nilai : $j \n Nilai : $k \n Nilai : $l \n ")
    print("\n*Jika di cetak, nilai yang memiliki \n underscore akan tetap sama \n")
    print("dengan nilai aslinya (tanpa underscore) \n misal : 1_000 akan > 1000 \n")
    println("-------------------------------------------------------------------------------")

}