fun main(){
	var operand1:Int
	var operand2:Boolean

	println("--------------------------------------------")
	println("Latihan Operator Unary : Rizwan Elansyah")
	println("--------------------------------------------")

	operand1 = 10
	println("operand1 = $operand1\n")

	println("+operand1 -> " + (+operand1))
	println("Penjelasan: +operand1, maksudnya nilai pada operand adalah positif\n")

	println("-operand1 -> " + (-operand1))
	println("Penjelasan: -operand, maksudnya nilai pada operand adalah negatifr \n")

	++operand1
	println("++operand1 -> $operand1")
	println("Penjelasan: ++operand, maksudnya nilai pada operand ditambahkan 1\n")

	--operand1
	println("--operand1 -> $operand1")
	println("Penjelasan: --operand, maksudnya nilai pada operand dikurangi 1\n")

	operand2 = false
	println("operand2 = $operand2\n")
	println("Membalikan Nilai !operand2 = $operand2 menjadi -> " + (!operand2))
}