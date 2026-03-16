package com.example.pie.ui.theme.data


import com.example.pie.R

data class Pie(
    val day: Int,
    val nameRes: Int,
    val descriptionRes: Int,
    val imageRes: Int
)

val pies = (1..30).map { day ->
    Pie(
        day = day,
        // Оставляем динамический поиск текстов
        nameRes = R.string::class.java.getField("pie${day}_name").getInt(null),
        descriptionRes = R.string::class.java.getField("pie${day}_desc").getInt(null),

        // Указываем ОДНУ картинку для всех 30 дней.
        // Замени R.drawable.pie_placeholder на ту, что у тебя реально есть в папке drawable
        imageRes = R.drawable.pie1
    )
}


