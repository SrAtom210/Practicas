package com.example.practicas.Views


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                title = { TitleBar("MENU") },
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

        Row(){
            Button(onClick = {navController.navigate("Detail/${id}")},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(207, 8, 33))) {
                Image(
                    modifier = Modifier.size(110.dp),
                    painter = painterResource(id = R.drawable.afc),
                    contentDescription = null
                )
                Text(text = "                          AFC \n  American Football Conference",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp)
            }
        }

        Row(){

            Button(onClick = {navController.navigate("Detail2/${id2}")},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0, 59, 102))) {
                Image(
                    modifier = Modifier.size(110.dp),
                    painter = painterResource(id = R.drawable.nfc),
                    contentDescription = null
                )

                Text(text = "                          NFC \n  National Football Conference",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp)
            }
        }
    }
}