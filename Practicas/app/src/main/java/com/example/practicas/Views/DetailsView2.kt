package com.example.practicas.Views

import android.R
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.practicas.Components.MainButton
import com.example.practicas.Components.MainIconButton
import com.example.practicas.Components.Space
import com.example.practicas.Components.TextView
import com.example.practicas.Components.TitleBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsView2(navController: NavController, id: Int){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("DetailsView2") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Green
                ), navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentDetailView2(navController,id)
    }
}

@Composable
fun ContentDetailView2(navController: NavController, id: Int){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextView(texto = "Detail View 2")
        Space(espcio = 20)
        TextView(texto = id.toString())
        MainButton(
            name = "Return Home",
            backColor = Color.Green,
            color = Color.White
        ){
            navController.navigate("Home")
        }
    }
}