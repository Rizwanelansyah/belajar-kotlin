fun main() {

    val data1 = intArrayOf(1, 2, 3, 4)
    val data2 = arrayOf("Jeruk", "Pepaya", "Anggur", "Kelapa")
    val data3 = charArrayOf('L', 'P')
    val data4 = booleanArrayOf(5 > 2, false)

    val data5 = IntArray(2)
    val data6 = arrayOfNulls<String>(2)
    val data7 = CharArray(2)
    val data8 = BooleanArray(2)

    data5[0] = 5
    data5[1] = 6

    data6[0] = "Keju"
    data6[1] = "Kentang"

    data7[0] = 'L'
    data7[1] = 'P'

    data8[0] = true
    data8[1] = 5 == 5

    val data9: IntArray
    val data10: Array<String?>
    val data11: CharArray
    val data12: BooleanArray

    data9 = IntArray(2)
    data9[0] = 34
    data9[1] = 31
    
    data10 = arrayOfNulls(2)
    data10[0] = "Leci"
    data10[1] = "Rambutan"

    data11 = CharArray(2)
    data11[0] = 'A'
    data11[1] = 'O'

    data12 = BooleanArray(2)
    data12[0] = false
    data12[1] = true

    println("Tampilkan isi data1 :")
    for(i in data1.indices) {
        println(data1[i])
    }
    println("Tampilkan isi data2 :")
    for(i in data2.indices) {
        println(data2[i])
    }
    println("Tampilkan isi data3 :")
    for(i in data3.indices) {
        println(data3[i])
    }
    println("Tampilkan isi data4 :")
    for(i in data4.indices) {
        println(data4[i])
    }
    println("Tampilkan isi data5 :")
    for(i in data5.indices) {
        println(data5[i])
    }
    println("Tampilkan isi data6 :")
    for(i in data6.indices) {
        println(data6[i])
    }
    println("Tampilkan isi data7 :")
    for(i in data7.indices) {
        println(data7[i])
    }
    println("Tampilkan isi data8 :")
    for(i in data8.indices) {
        println(data8[i])
    }
    println("Tampilkan isi data9 :")
    for(i in data9.indices) {
        println(data9[i])
    }
    println("Tampilkan isi data10 :")
    for(i in data10.indices) {
        println(data10[i])
    }
    println("Tampilkan isi data11 :")
    for(i in data11.indices) {
        println(data11[i])
    }
    println("Tampilkan isi data12 :")
    for(i in data12.indices) {
        println(data12[i])
    }

}