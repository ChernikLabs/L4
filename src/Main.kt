import jdk.nashorn.internal.objects.NativeArray.length

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    val random = Random
    val math = random.nextInt(1, 10)
    val bio = random.nextInt(1, 10)
    val rus = random.nextInt(1, 10)
    if (math < 8 )
    {
        println("Оценка по математике - плохо")
    }
    else {
        println("Оценка по математике - хорошо")
    }
    if (bio < 8 )
        println("Оценка по биологии - плохо")
    else
        println("Оценка по биологии - хорошо")
    if (rus<8)
        println("Оценка по русскому - плохо")
    else
        println("Оценка по русскому - хорошо")

    val rnd = Random
    val sh1 = random.nextInt(0, 2)
    val sh2 = random.nextInt(0, 2)
    val sh1 = random.nextInt(0, 2)
    if (mis1 ==1)
    {
        println("Попадание")
    }
    else {
        println("Промах")
    }
    if (mis2 == 1 )
        println("Попадание")
    else
        println("Промах")
    if (mis3== 1)
        println("Попадание")
    else
        println("Промах")
    var result = mis1 + mis2 + mis3
    println("попаданий  " + result)

    var population = 10.0
    var rod = 14.0 //
    var smert = 8.0 //
    for (year in 1..10) {
        birthRate -= 1
        deathRate -= 1

        if (birthRate < 7) rod = 7.0
        if (deathRate < 6) smert = 6.0

        population += (population * rod / 1000) - (population * smert / 1000)
    }

    println("Численность населения через 10 лет: $population миллионов")


    print("Введите сумму вклада: ")
    val amount: Double = readLine()!!.toDouble()
    print("Введите количество месяцев: ")
    val months: Int = readLine()!!.toInt()

    var totalAmount = amount
    for (i in 1..months) {
        totalAmount += totalAmount * 0.07
    }
    println("Итоговая сумма вклада через $months месяцев: $totalAmount")

    print("Введите сумму вклада: ")
    val amount: Double = readLine()!!.toDouble()
            print("Введите количество месяцев: ")
    val months: Int = readLine().toInt()

    var totalAmount = amount
    var i = 1
    while (i <= months) {
        totalAmount += totalAmount * 0.07
        i++
    }

    println("Итоговая сумма вклада через $months месяцев: $totalAmount")

    Задание 9
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j}\t")
        }
        println()
    }
}

}
}