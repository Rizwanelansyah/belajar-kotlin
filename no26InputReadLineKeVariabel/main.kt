fun main(){
    var nama:String 
    var jenisKelamin:Char
    var usia:Int
    var alamat:String

    println("--------------------------------------------")
    println("Latihan Input Data Ke Variabel : Rizwan Elansyah")
    println("--------------------------------------------")
    println("INPUT DATA:")

    //Input Data
    print("Input Nama:")
    val inputDataNama = readLine()

    print("Input Jenis Kelamin (L/P):")
    val inputDataJenisKelamin = readLine()

    print("Input Usia:")
    val inputDataUsia = readLine()

    print("Injput Alamat:")
    val inputDataAlamat = readLine()

    //Konversi Data
    nama = inputDataNama ?: "Nama Belum DiInput"
    try{jenisKelamin = inputDataJenisKelamin?.get(0) ?: 'L'}catch(e:StringIndexOutOfBoundsException){jenisKelamin = 'L'}
    try{usia = inputDataUsia?.toInt() ?: 0}catch (e: NumberFormatException){usia = 0}
    alamat = inputDataAlamat ?: "Alamat Belim Di Input"

    println("\n--------------------------------------------")
    println("\nBIODATA SINGKAT")
    println("Nama : $nama")
    println("Jenis Kelamin : $jenisKelamin")
    println("Usia : $usia")
    println("Alamat : $alamat")
    println("--------------------------------------------")
}