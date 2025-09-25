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
import androidx.compose.foundation.layout.width
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
fun DetailsView3(navController: NavController, id: Int){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Baltimore RAVENS") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(31, 11, 95)
                ), navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentDetailView3(navController,id)
    }
}

@Composable
fun ContentDetailView3(navController :NavController, id: Int){
    Column(modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row(verticalAlignment = Alignment.Top){
                Image(
                    modifier = Modifier.size(260.dp),
                    painter = painterResource(id = R.drawable.ravenmascot),
                    contentDescription = null
                )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Text(text ="Equipo profesional de fútbol americano de los EE.UU con sede en Baltimore,"+
                    "Maryland. Compiten en la División Norte de la AFC de la NFL y disputan sus " +
                    "partidos como locales en el M&T Bank Stadium. El equipo fue fundado en 1996, " +
                    "cuando Art Modell, entonces propietario de los Cleveland Browns, anunció el " +
                    "traslado de los Cleveland Browns a Baltimore. Sin embargo, como parte de un " +
                    "acuerdo entre la NFL y la ciudad ohioana, se le exigió a Modell que dejara la "+
                    "historia, los colores y los récords de los Browns en Cleveland a cambio de un " +
                    "equipo y personal de reemplazo que reanudaría la actividad en 1999. A cambio, " +
                    "se le permitió llevar a su propio personal y equipo a Baltimore, donde dicho " +
                    "personal formaría un equipo de expansión. El equipo es propiedad de Steve " +
                    "Bisciotti y fue valorado en 4630 millones de dólares en 2023, lo que lo " +
                    "convierte en la vigesimoctava franquicia deportiva más valiosa del mundo.",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }
    }
}