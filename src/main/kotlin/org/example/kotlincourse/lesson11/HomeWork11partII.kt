package org.example.kotlincourse.lesson11

fun main() {
    // Задание 1: Словарь Библиотека
    val library: Map<String, List<String>> = mapOf(
        "Довлатов" to listOf("Соло на ундервуде", "Чемодан", "Заповедник", "Иностранка"),
        "Шолом-Алейхем" to listOf("Тевье-Молочник", "Блуждающие звезды"),
        "Эфраим Севела" to listOf("Остановите самолет — я сойду", "Легенды инвалидной улицы", "Почему нет рая на земле"),
        "Евреи" to listOf("Тора")
    )

    // Задание 2: Справочник Растений
    val plantDirectory: Map<String, List<String>> = mapOf(
        "Лекарственные растения" to listOf("Мандрагора", "Подлесник", "Фиалка Ноктюрн"),
        "Растения для зельеварения" to listOf("Змеиный корень", "Мимбулус мимблетония"),
        "Ядовитые растения" to listOf("Дьявольские силки", "Остролист", "Буботубер")
    )


    // Задание 3: Четвертьфинала по доте
    val quarterFinalTeams: Map<String, List<String>> = mapOf(
        "Team Falcons" to listOf("Oleksandr Oleghovych Kostyljev", "Maksymilian Trocha", "Peter Rothmann Rasmussen"),
        "Team Liquid" to listOf("miCKe. Майк Ву", "Nisha. Михал Янковски", "SabeRLighT- Йонас Волек", "Boxi. Самуэль Сван"),
        "Xtreme Gaming" to listOf("Ван Чуньюй", "Го Хунчэн", "Лин Дзин", "Чжао Цзысин")
    )

    // Задание 4: Курс лечения
    val treatmentCourse: Map<String, List<String>> = mapOf(
        "01-01-2024" to listOf("Смехотерапия для сердца", "Гипнотический массаж с медом"),
        "02-01-2024" to listOf("Укол счастья", "Чай из волшебных трав"),
        "03-01-2024" to listOf("Ароматерапия с печеньем", "Танец с клизмами"),
        "04-01-2024" to listOf("Проверка на наличие смеха", "Принятие кекса для поднятия настроения")
    )

    // Задание 5: Гайд по Мишленовским ресторанам
    val travelerDictionary: Map<String, Map<String, List<String>>> = mapOf(
        "Франция" to mapOf(
            "Париж" to listOf("Le Meurice", "L'Arpège", "Pierre Gagnaire"),
            "Лион" to listOf("Paul Bocuse", "La Mère Brazier")
        ),
        "Италия" to mapOf(
            "Рим" to listOf("La Pergola", "Il Pagliaccio"),
            "Милан" to listOf("Seta", "Vun Andrea Aprea")
        ),
        "Испания" to mapOf(
            "Барселона" to listOf("El Celler de Can Roca", "Moments"),
            "Мадрид" to listOf("DiverXO", "La Terraza del Casino")
        ),
        "Япония" to mapOf(
            "Токио" to listOf("Sukiyabashi Jiro", "Nihonryori RyuGin"),
            "Осака" to listOf("Hajime", "Kashiwaya")
        ),
        "США" to mapOf(
            "Нью-Йорк" to listOf("Eleven Madison Park", "Le Bernardin"),
            "Сан-Франциско" to listOf("Atelier Crenn", "Benu")
        ),
        "Великобритания" to mapOf(
            "Лондон" to listOf("The Ledbury", "Restaurant Gordon Ramsay"),
            "Эдинбург" to listOf("The Kitchin", "Restaurant Martin Wishart")
        ),
        "Австралия" to mapOf(
            "Сидней" to listOf("Quay", "Momofuku Seiobo"),
            "Мельбурн" to listOf("Attica", "Vue de Monde")
        ),
        "Дания" to mapOf(
            "Копенгаген" to listOf("Noma", "Geranium"),
            "Оденсе" to listOf("Restaurant Substans")
        )
    )
}

