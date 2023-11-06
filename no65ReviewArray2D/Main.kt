fun main(){
    println("------------------------------------------------------")
    println("Latihan Review Array 2Dimensi: Rizwan Elansyah")
    println("------------------------------------------------------")

    val data1 = arrayOf(intArrayOf(1, 4), intArrayOf(2,5)) 
    val data2 = arrayOf(arrayOf("One:", "Pepaya"), arrayOf("Two: ", "Kelapa")) 
    val data3 = arrayOf(charArrayOf('1', 'b'), charArrayOf('2', 'c')) 
    val data4 = arrayOf(booleanArrayOf(5 > 2, false), booleanArrayOf(false, true))

    val data5 = Array(2) {IntArray(2)} 
    val data6 = Array(2) {arrayOfNulls<String>(2)}
    val data7 = Array(2) {CharArray(2)} 
    val data8 = Array(2) {BooleanArray(2)}

    data5[0][0] = 1 
    data5[0][1] = 5 
    data5[1][0] = 2 
    data5[1][1] = 6 

    data6[0][0] = "01. " 
    data6[1][0] = "02. " 
    data6[1][1] = "Kentang" 

    data7[0][0]='1' 
    data7[0][1]='l' 
    data7[1][0]='2' 
    data7[1][1]='p' 

    data8[0][0] = true 
    data8[0][1]= true 
    data8[1][0] = true 
    data8[1][1] = false 


    val data9: Array<IntArray>
    val data10: Array<Array<String?>>
    val data11: Array<CharArray>
    val data12: Array<BooleanArray>

    
    data9= Array(2) {IntArray(2)}
    data9[0][0] = 1  
    data9[0][1] = 32 
    data9[1][0] = 2 
    data9[1][1] = 31 

    data10= Array(2) {arrayOfNulls(2)} 
    data10[0][0] ="01. "  
    data10[0][1] = "Leci"   
    data10[1][0] = "02. "  
    data10[1][1] = "Rambutan"   

    data11 = Array(2) {CharArray(2)} 
    data11[0][0]='1' 
    data11[0][1]='A'  
    data11[1][0]='2'  
    data11[1][1]='0'  

    data12= Array(2) {BooleanArray(2)} 
    data12[0][0] = false  
    data12[0][1] = true  
    data12[1][0] = false 
    data12[1][1] = true 
    

    println("Tampilkan isi array data1 :")
    for (baris in data1.indices){ 
        for (kolom in data1[0].indices){ 
            print("${data1[baris][kolom]} ") 
        }
        println()
    }
    //tampilkan array data2
    println("\nTampilkan isi array data2 :")
    for (baris in data2.indices){
        for (kolom in data2[0].indices){
            print("${data2[baris][kolom]} ")
        }
        println()
    }
    //tampilkan array data3 
    println("\nTampilkan isi array data3 :")
    for (baris in data3.indices){ 
        for (kolom in data3[0].indices){ 
            print("${data3[baris][kolom]} ")
        }
        println()
    }
    //tampilkan array data4 
    println("\nTampilkan isi array data4:") 
    for (baris in data4.indices){ 
        for (kolom in data4[0].indices){ 
            print("${data4[baris][kolom]} ")
        }
        println()
    }
    //tampilkan array data5 
    println("\nTampilkan isi array data5 :")
    for (baris in data5.indices){
        for (kolom in data5[0].indices){
            print("${data5[baris][kolom]} ")
        }
        println()
    }
    //tampilkan array data6 
    println("\nTampilkan isi array data6:") 
    for (baris in data6.indices){ 
        for (kolom in data6[0].indices){ 
            print("${data6[baris][kolom]} ")
        }
        println()
    }
    //tampilkan array data7 
    println("\nTampilkan isi array data7 :") 
    for (baris in data7.indices){ 
        for (kolom in data7[0].indices){
            print("${data7[baris][kolom]} ")
        }
        println()
    }
    //tampilkan array data8
    println("\nTampilkan isi array data8 :")
        for (baris in data8.indices){
            for (kolom in data8[0].indices){
                print("${data8[baris][kolom]} ")
        }
        println()
    }
    //tampilkan array data9 
    println("\nTampilkan isi array data9 :")
        for (baris in data9.indices){
            for (kolom in data9[0].indices){
                print("${data9[baris][kolom]} ")
        } 
        println()
    }
    //tampilkan array data10
    println("In Tampilkan isi array data10 :")
        for (baris in data10.indices){ 
            for (kolom in data10[0].indices){ 
            print("${data10[baris][kolom]} ")
        }
        println()
    } 
    //tampilkan array data11
    println("\nTampilkan isi array data11:")
        for (baris in data11.indices){
            for (kolom in data11[0].indices){
            print("${data11[baris] [kolom]} ")
        } 
        println()
    }
    //tampilkan array data12
    println("\nTampilkan isi array data12:")
        for (baris in data12.indices){ 
            for (kolom in data12[0].indices){
                print("${data12[baris][kolom]} ") 
            }
        println()
        }
    }