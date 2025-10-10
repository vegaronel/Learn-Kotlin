fun main() {
    val song = listOf<Song>(
        Song("Akala ", 200),
        Song("niyo ", 150),
        Song("ba ", 200),
        Song("ang ", 100),
        Song("kapangyarihan ", 220),
        Song("\nay ", 90),
        Song("nasa ", 120),
        Song("inyo ", 200),
        Song("sino ", 200),
        Song("ba ", 100),
        Song("kayo ", 150),
    )
    song.forEach {
        for(i in it.lyrics) {  print(i)
            Thread.sleep(it.interval)
        }
    }
}
class Song(var lyrics : String, var interval : Long)