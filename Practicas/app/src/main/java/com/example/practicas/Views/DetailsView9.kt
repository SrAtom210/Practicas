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
fun DetailsView9(navController: NavController, id: Int){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Minnesota VIKINGS") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(89, 42, 131)
                ), navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentDetailView9(navController,id)
    }
}

@Composable
fun ContentDetailView9(navController :NavController, id: Int){
    Column(modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row(verticalAlignment = Alignment.Top){
            Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.minn),
                contentDescription = null
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Text(text ="Son un equipo profesional de fútbol americano de " +
                    "los EE.UU con sede en Mineápolis, Minesota. Compiten en la División " +
                    "Norte de la NFC de la NFL y disputan sus encuentros como locales en el U.S. " +
                    "Bank Stadium. El equipo fue fundado por Max Winter en 1960 y comenzaron a " +
                    "jugar en la liga en 1961 sus mejores años fueron cuando alcanzaron el Super " +
                    "Bowl en la década de 1970, cuando tuvieron una gran equipo defensivo, pero " +
                    "nunca han podido ganarlo. En total han jugado en cuatro Super Bowls " +
                    "perdiéndolos todos. Los también llamados 'Vikes' han sido una de las " +
                    "franquicias más exitosas de la NFL con el segundo porcentaje de victorias, " +
                    "ganando su respectiva división 18 veces, el tercero entre los equipos que " +
                    "actualmente juegan en la liga. ",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }
    }
}