package com.example.practicas.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.practicas.Views.DetailsView
import com.example.practicas.Views.DetailsView2
import com.example.practicas.Views.DetailsView3
import com.example.practicas.Views.HomeView

@Composable
fun NavManager(){
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }

        composable("Detail/{id}",
            arguments = listOf(navArgument("id"){type = NavType.IntType})) {
            val id = it.arguments?.getInt("id")?:0
            DetailsView(navController,id)
        }

        composable("Detail2/{id}",
            arguments = listOf(navArgument("id"){type = NavType.IntType})) {
            val id = it.arguments?.getInt("id")?:0
            DetailsView2(navController,id)
        }

        composable("Detail11/{id}",
            arguments = listOf(navArgument("id"){type = NavType.IntType})) {
            val id = it.arguments?.getInt("id")?:0
            DetailsView3(navController,id)
        }
    }
}