fun main() {

    var name:String = "Rizwan Elansyah"

    println("=========================================================")
    println("Latihan Fungsi getOrNull() : Rizwan Elansyah")
    println("=========================================================")

    println(name)
    println("Ambil Character Pada Index 0 Pada Variabel name: ${name.getOrNull(0)}")
    println("Ambil Character Pada Index 2 Pada Variabel name: ${name.getOrNull(2)}")
    println("Ambil Character Pada Index 100 Pada Variabel name: ${name.getOrNull(100)}")

}