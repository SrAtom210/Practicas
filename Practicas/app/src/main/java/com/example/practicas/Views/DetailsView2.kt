package com.example.practicas.Views

import android.R
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                title = { TitleBar("N F C") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0, 59, 102)
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
    val id21 = 21
    val id22 = 22
    val id23 = 23
    val id24 = 24

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.Bottom){
            Button(onClick = {navController.navigate("Detail21/${id21}")},
                Modifier.size(400.dp,180.dp).padding(top = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(176, 30, 62))) {
                Image(
                    modifier = Modifier.size(180.dp),
                    painter = painterResource(id = com.example.practicas.R.drawable.arizona),
                    contentDescription = null
                )
                Text(text = " Arizona\n  \n CARDINALS",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)
            }
        }
        Row(verticalAlignment = Alignment.Bottom){
            Button(onClick = {navController.navigate("Detail22/${id22}")},
                Modifier.size(400.dp,180.dp).padding(top = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0, 68, 78))) {
                Image(
                    modifier = Modifier.size(180.dp),
                    painter = painterResource(id = com.example.practicas.R.drawable.eagles),
                    contentDescription = null
                )
                Text(text = " Philadelphia  \n  \n EAGLES",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 29.sp)
            }
        }
        Row(verticalAlignment = Alignment.Bottom){
            Button(onClick = {navController.navigate("Detail23/${id23}")},
                Modifier.size(400.dp,180.dp).padding(top = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(89, 42, 131))) {
                Image(
                    modifier = Modifier.size(180.dp),
                    painter = painterResource(id = com.example.practicas.R.drawable.vikings),
                    contentDescription = null
                )
                Text(text = " Minnesota \n  \n VIKINGS",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)
            }
        }
        Row(verticalAlignment = Alignment.Bottom) {
            Button(
                onClick = {navController.navigate("Detail24/${id24}")},
                Modifier.size(400.dp, 180.dp).padding(top = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(26, 52, 45)
                )
            ) {
                Image(
                    modifier = Modifier.size(180.dp),
                    painter = painterResource(id = com.example.practicas.R.drawable.greenday),
                    contentDescription = null
                )
                Text(
                    text = " Green Bay\n  \n PACKERS",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
            }
        }
    }
}