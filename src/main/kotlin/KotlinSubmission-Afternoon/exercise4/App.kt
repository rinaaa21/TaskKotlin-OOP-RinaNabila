package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    print("Masukkan angka: ")
    val input = readLine()

    try {
        val number = input?.toInt() ?: throw NumberFormatException("Input tidak valid")
        println("Angka yang anda input: $number")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: ${e.message}")
    }

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
