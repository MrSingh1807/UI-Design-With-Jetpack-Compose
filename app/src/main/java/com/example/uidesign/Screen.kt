package com.example.uidesign

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Details :
        Screen("details_screen/{$DETAILS_ARGUMENT_KEY}") {// "/{id}" -> how argument pass
    fun passID( id :Int): String{
        return "details_screen/{$id}"
   /*   Second Type -->
        return this.route.replace(oldValue = "${DETAILS_ARGUMENT_KEY}", newValue = id.toString())
    */
    }
    }
}
