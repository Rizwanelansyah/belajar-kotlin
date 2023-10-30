fun main (){
	var a:Boolean
	var b:Boolean
	var hasil:Boolean

	println("===================================================")
	println("Operator Logika And : Rizwan Elansyah")
	println("===================================================")

	a = true
	b = true
	hasil = ( a && b )
	println("$a && $b = $hasil\n")

	a = false
	b = true
	hasil = ( a && b )
	println("$a && $b = $hasil\n")

	a = true
	b = false
	hasil = ( a && b )
	println("$a && $b = $hasil\n")

	a = false
	b = false
	hasil = ( a && b )
	println("$a && $b = $hasil\n")
	println("===================================================")

	hasil = ( ( 5 > 3 ) && ( 5 == 5 ) )
	println("( 5 > 3 ) && ( 5 == 5 ) = $hasil")
	println("( true ) && ( true ) = $hasil")
}