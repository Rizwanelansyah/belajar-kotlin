fun main(){
	var operand:Int

	println("--------------------------------------------")
	println("Latihan Operator Penugasan : Rizwan Elansyah")
	println("--------------------------------------------")

	operand = 10
	println("Operator Penugasan = (Menetapkan Nilai Pada Operand):\n $operand")

	operand += 10
	println("Operand+=10=$operand\nOperator Penugasan += (Menambahkan Nilai Pada Operand)")
	println("Penyederhanaan: (operand = operand + 10) artinya (operand = 10 + 10) Jadi operand = $operand\n")

	operand -= 10
	println("Operand-=10 = $operand\nOperator Penugasan -=(Mengurangi Nilai Pada Operand)")
	println("Penyederhanaan: (operand = operand - 10) artinya (operand = 20 - 10) Jadi operand = $operand\n") 

	operand *= 10
	println("Operand*=10 = $operand\nOperator Penugasan *= (Mengalikan Nilai Pada Operand)")
	println("Penyederhanaan: (operand = operand * 10) artinya  (operand = 10 * 10) Jadi operand = $operand\n")

	operand /= 10
	println("Operand/=10 = $operand\nOperator Penugasan /= (Membagi Nilai Pada Operand)")
	println("Penyederhanaan: (operand = operand / 10) artinya (operand = 100 / 10) Jadi operand = $operand\n")

	operand %= 10
	println("Operand%=10 = $operand\nOperator Penugasan %= (Sisa Pembagian Nilai Pada Operand)")
	println("Penyederhanaan: (operand = operand % 10) artinya (operand = 10 % 10) Jadi operand = $operand\n")
}