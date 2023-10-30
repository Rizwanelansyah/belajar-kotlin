fun main (){
	var a:Boolean
	var b:Boolean
	var hasil:Boolean

	println("=====================================")
	println("Operator Logika Not : Rizwan Elansyah")
	println("=====================================")

	a = true
	println("a = $a dengan (!a) a menjadi -> " + (!a))

	println("=====================================")
	a = true
	b = false
	hasil = !( a || b )
	println("!$a || $b = $hasil\n")

	hasil = !( ( 5 > 3 ) || ( 5 == 5 ) )
	println("!( 5 > 3 ) || ( 5 == 5 ) ) = $hasil")
	println(" not( true ) || ( true ) ) = $hasil")
}