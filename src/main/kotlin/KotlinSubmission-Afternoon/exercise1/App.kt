package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName = "Rina"
    val lastName = "Nabila"
    val age = 20
    val status = true

    println("Nama Depan: $firstName \n" +
            "Nama Belakang: $lastName \n" +
            "Umur: $age tahun \n" +
            "Status: ${if (status) "Single" else "Tidak Single"} karena belum punya suami hhhehe \n")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group        : $groupId")
    println("Anggota Grup : $groupMember")
    println("Sesi         : $session")

    return arrayOf(groupId,groupMember,session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */


fun myTeam(): List<Any> {
    val listName = listOf("Agym", "Faqih", "M.Nofa", "M.Rifki", "Rina", "Winarno",
                          "Miftakhul", "Rizka", "Alif Esa", "Gunawan", "Ilham", "Stefan")
    val myName = listName[4]

    return listOf(myName)
}


/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Jessica Aulia", "Pupu")
    val countOfGroup = 12

    return (mentor.count() + countOfGroup)
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("Nama saya di dalam grup: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("12", listOf("Agym", "Faqih", "M.Nofa", "M.Rifki", "Rina", "Winarno",
        "Miftakhul", "Rizka", "Alif Esa", "Gunawan", "Ilham", "Stefan"), "Afternoon")

}