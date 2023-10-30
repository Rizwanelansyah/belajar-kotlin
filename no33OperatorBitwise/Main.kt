fun main () {
	var x:Int = 10 // 0000 1010
	var y:Int = 6 // 0000 0110
	var hasil:Int

	println("=========================================")
	println("Operator Bitwise : Rizwan Elansyah")
	println("=========================================")
	hasil = x.shl(1)	// 20 = 0001 0100
	println("x.shl(1) = " + hasil)

	hasil = x.shr(1)	// 5 = 0000 0101
	println("x.shr(1) = " + hasil)

	hasil = x.ushr(1)	// 5 = 0000 0101
	println("x.ushr(1) = " + hasil)

	hasil = x.and(y)	// 2 = 0000 0010
	println("x.and(y) = " + hasil)

	hasil = x.or(y)		// 14 = 0000 1110 
	println("x.or(y) = " + hasil)

	hasil = x.xor(y)	// 12 = 0000 1100
	println("x.xor(y) = " + hasil)

	hasil = x.inv() //-11 = 111 0110
	println("x.inv() = " + hasil)
}