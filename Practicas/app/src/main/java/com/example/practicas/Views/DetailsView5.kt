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
fun DetailsView5(navController: NavController, id: Int){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Denver BRONCOS") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(255, 75, 0)
                ), navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentDetailView5(navController,id)
    }
}

@Composable
fun ContentDetailView5(navController :NavController, id: Int){
    Column(modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row(verticalAlignment = Alignment.Top){
            Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.broncos),
                contentDescription = null
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Text(text ="Son un equipo profesional de fútbol americano de los EE.UU con sede en " +
                    "Denver, Colorado. Compiten en la División Oeste de la AFC de la NFL y disputan " +
                    "sus encuentros como locales en el Empower Field at Mile High. Entre sus logros" +
                    "y títulos, los Broncos ostentan el mayor número de puntos y touchdowns en una " +
                    "sola temporada (2013-14) en toda la historia de la NFL, con 606 (el único en " +
                    "superar los 600) y 76, respectivamente, y han ganado quince títulos de " +
                    "división (récord), ocho campeonatos de la AFC y han disputado ocho Super " +
                    "Bowls, de las cuales han ganado tres (XXXII, XXXIII y 50). ",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }
    }
}