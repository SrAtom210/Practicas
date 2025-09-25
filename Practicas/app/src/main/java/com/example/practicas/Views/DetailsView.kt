package com.example.practicas.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
import com.example.practicas.R
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsView(navController: NavController, id: Int){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("A F C") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(207, 8, 33)
                ), navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentDetailView(navController,id)
    }
}

@Composable
fun ContentDetailView(navController: NavController, id: Int){
    val id11 = 11
    val id12 = 12
    val id13 = 13
    val id14 = 14

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Row(verticalAlignment = Alignment.Bottom){
            Button(onClick = {navController.navigate("Detail11/${id11}")},
                Modifier.size(400.dp,180.dp).padding(top = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(31, 11, 95))) {
                Image(
                    modifier = Modifier.size(180.dp),
                    painter = painterResource(id = R.drawable.raven),
                    contentDescription = null
                )
                Text(text = "  Baltimore\n  \n  RAVENS",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)
            }
        }
        Row(verticalAlignment = Alignment.Bottom){
            Button(onClick = {navController.navigate("Detail12/${id12}")},
                Modifier.size(400.dp,180.dp).padding(top = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0, 0, 0))) {
                Image(
                    modifier = Modifier.size(180.dp),
                    painter = painterResource(id = R.drawable.pitts),
                    contentDescription = null
                )
                Text(text = "  Pittsburgh \n  \n  STEELERS",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)
            }
        }
        Row(verticalAlignment = Alignment.Bottom){
            Button(onClick = {navController.navigate("Detail13/${id13}")},
                Modifier.size(400.dp,180.dp).padding(top = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(255, 75, 0))) {
                Image(
                    modifier = Modifier.size(180.dp),
                    painter = painterResource(id = R.drawable.denver),
                    contentDescription = null
                )
                Text(text = "  Denver\n  \n  BRONCOS",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)
            }
        }
        Row(verticalAlignment = Alignment.Bottom) {
            Button(
                onClick = {navController.navigate("Detail14/${id14}")},
                Modifier.size(400.dp, 180.dp).padding(top = 50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0, 142, 151)
                )
            ) {
                Image(
                    modifier = Modifier.size(180.dp),
                    painter = painterResource(id = R.drawable.miami),
                    contentDescription = null
                )
                Text(
                    text = "  Miami\n  \n  DOLPHINS",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
            }
        }
    }
    /*
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start) {
        TextView(texto = "Detail View")
        Space(espcio = 20)
        TextView(texto = id.toString())
        MainButton(
            name = "Return Home",
            backColor = Color.Magenta,
            color = Color.White
        ){
            navController.navigate("Home")
        }
    }

     */
}