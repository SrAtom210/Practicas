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
fun DetailsView7(navController: NavController, id: Int){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Arizona CARDINALS") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(176, 30, 62)
                ), navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentDetailView7(navController,id)
    }
}

@Composable
fun ContentDetailView7(navController :NavController, id: Int){
    Column(modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row(verticalAlignment = Alignment.Top){
            Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.cardinals),
                contentDescription = null
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Text(text ="Es un equipo profesional de fútbol americano de los EE.UU con sede en el " +
                    "área metropolitana de Phoenix, Arizona. Compiten en la División Oeste de la " +
                    "NFC de la NFL y disputan sus partidos como locales en el State Farm Stadium, " +
                    "ubicado en la ciudad de Glendale. El equipo fue fundado en Chicago como Morgan " +
                    "Athletic Club en el año 1898, lo que hace de ellos el club de fútbol americano " +
                    "profesional más antiguo de Norteamérica. En 1920 entraron en la NFL como " +
                    "miembro fundador de la liga con el nombre Racine Cardinals, que en 1922 " +
                    "cambiaron por el de Chicago Cardinals. En 1960 se mudaron a San Luis (Misuri) " +
                    "y pasaron a denominarse St. Louis Cardinals, sin relación con el equipo " +
                    "homónimo de béisbol. A finales de los años ochenta la franquicia se trasladó " +
                    "a Arizona, donde fueron conocidos como Phoenix Cardinals hasta que en 1994 " +
                    "adoptaron su denominación actual. ",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }
    }
}