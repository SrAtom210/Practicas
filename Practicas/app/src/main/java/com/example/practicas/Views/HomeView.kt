package com.example.practicas.Views


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.practicas.Components.ActionButton
import com.example.practicas.Components.MainButton
import com.example.practicas.Components.Space
import com.example.practicas.Components.TextView
import com.example.practicas.Components.TitleBar
import com.example.practicas.R


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("MENÚ") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(28, 62, 115)
                )
            )
        }
    ) {
        ContentHomeView(navController)
    }
}

@Composable
fun ContentHomeView(navController: NavController){
    val id = 1
    val id2 = 2
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextView("Conferencias NFL")

        Row {
            Image(
                modifier = Modifier.size(120.dp),
                painter = painterResource(id = R.drawable.afc),
                contentDescription = null
            )
        }

        Row(){
            Button(onClick = {navController.navigate("Detail/${id}")},
                shape = CutCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(Color(220, 35, 42))) {

                Text(text = "                        AFC \nAmerican Football Conference",
                    color = Color.White)
            }
        }

        Row {
            Image(
                modifier = Modifier.size(120.dp),
                painter = painterResource(id = R.drawable.nfc),
                contentDescription = null
            )
        }
        Row(){

            Button(onClick = {navController.navigate("Detail2/${id2}")},
                shape = CutCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(Color(77, 116, 149))) {

                Text(text = "                        NFC \nNational Football Conference",
                    color = Color.White)
            }
        }
    }
}