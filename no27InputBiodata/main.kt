fun main(){
	var namaLengkap:String
	var jenisKelamin:String
	var usia:Byte
	var alamat:String
	var sekolah:String 
	var kelas:String 
	var hobby:String 
	var citaCita:String 
	var eMail:String 
	var mediaSosial:String

	println("---------------------------------------------------------")
	println("Latihan Input Biodata : Rizwan Elansyah")
	println("---------------------------------------------------------")
	println("----------------FORM INPUT BIODATA-----------------------")

	print("Isi Nama Lengkap:")
	val inputNamaLengkap = readLine()
	namaLengkap = inputNamaLengkap ?: "Nama Belum Diisi"

	print("Isi Jenis Kelamin:")
	val inputJenisKelamin = readLine()
	jenisKelamin = inputJenisKelamin ?: "jenis Kelamin Belum Diisi"

	print("Isi Usia:")
	val inputUsia = readLine()
	usia = inputUsia?.toByte() ?: 0

	print("Isi Alamat:")
	val inputAlamat = readLine()
	alamat = inputAlamat ?: "Alamat Belum Diisi"

	print("Isi Sekolah:")
	val inputSekolah = readLine()
	sekolah = inputSekolah ?: "Sekolah Belum Diisi"

	print("Input Kelas:")
	val inputKelas = readLine()
	kelas = inputKelas ?: "Kelas Belum Diidi"

	print("Isi Hobby:")
	val inputHobby = readLine()
	hobby = inputHobby ?: "Hobby Belum Diisi"

	print("Isi Cita-Cita:")
	val inputCitaCita = readLine()
	citaCita = inputCitaCita ?: "Cita-Cita Belum Diisi"

	print("Isi eMail:")
	val inputEMail = readLine()

	print("Isi Media Sosial:")
	val inputMediaSosial = readLine()
	mediaSosial = inputMediaSosial ?: "Media Sosial Belum Diidsi"

	println("\n---------------------------------------------------------")
	println("Biodata Teman Baru, Telah Ditambahkan :) ")
	println("---------------------------------------------------------")
	println("Nama Lengkap: $namaLengkap")
	println("Jenis Kelamin: $jenisKelamin")
	println("Usia: $usia")
	println("Alamat: $alamat")
	println("Sekolah: $sekolah")
	println("Kelas: $kelas")
	println("Hobby: $hobby")
	println("Cita-Cita: $citaCita")
	println("e-Mail: $eMail")
	println("Media Sosial: $mediaSosial")
	println("---------------------------------------------------------")
}