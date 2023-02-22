package com.example.uidesign

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Details :
        Screen("details_screen?id={$DETAILS_ARGUMENT_KEY}&name={$DETAILS_ARGUMENT_KEY_NAME}") {
            // Optional Arguments => you pass a default value

//            fun passID(id: Int = 0): String {
//                return "details_screen?id=$id"
//            }
        fun passNameAndId(id: Int = 0, name: String = "Mr Singh"): String{
            return "details_screen?id=$id&name=$name"
        }
    }

    object LogIn : Screen("log_in")
    object SignUp : Screen ("sign_up")
}
