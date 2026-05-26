package com.ferfloo07.bld3x3app.presentation.on_boarding

import androidx.annotation.DrawableRes
import com.ferfloo07.bld3x3app.R

sealed class OnBoardingPage(
    @DrawableRes
    val image:Int,
    val title:String,
    val descripcion:String
){
    object First : OnBoardingPage(
        image = R.drawable.fonde_welcome,
        title = "You can do it",
        descripcion = "Tu puedes hacerlo "
    )

    object Second : OnBoardingPage(
        image = R.drawable.ic_launcher_background,
        title = "You can do it 2",
        descripcion = "Tu puedes hacerlo "
    )

    object Thrid : OnBoardingPage(
        image = R.drawable.fonde_welcome,
        title = "You can do it 3",
        descripcion = "Tu puedes hacerlo "
    )
}

// ENUM CLASS VS SEALED CLASS
/*
* ENUM
* enum class HttpErrorEnum(val code:Int){
*   Unauthorized(401),
*   NotFound(404),
*   ServerError(500),
*   Succesfull(200)
* }
*
*
* SEALED
*
* Mas posibilidades de personalizacion
* Comportamiento individual
*
*
* sealed class HttpErrorSealed(val code:Int){
*
*   object Unauthorized : HttpErrorSealed(401)
*   object NotFound : HttpErrorSealed(404)
*   data class ServerError(val reason: String) : HttpErrorSealed(500)
* }
* */

