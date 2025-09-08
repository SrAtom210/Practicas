package com.example.practicas

import android.R
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicas.ui.theme.PracticasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticasTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = Color(255,255,255)
                ){
                    Greeting()
                }
            }
        }
    }
}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticasTheme {
        Greeting("Android")
    }
}

@Composable
fun GreetingText(message: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = message,
            fontSize = 110.sp,
            lineHeight = 110.sp,
            color = Color(255,0,110),
            fontWeight = FontWeight.Bold
        )
    }
}
*/
@Composable
fun Greeting(){
    val context = LocalContext.current
    var texto1 by remember { mutableStateOf(value = "") }

    Column (modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Row {
            Text(text = "Escriba su nombre")
        }
        Row (modifier = Modifier.padding(10.dp,5.dp,10.dp,10.dp)){
            OutlinedTextField(
                value = texto1,
                label = {Text("Nombre")},
                onValueChange = {texto1 = it}
            )
        }
        Row (Modifier.align(Alignment.CenterHorizontally)){
            Button(onClick = {
                Toast.makeText(context,texto1,Toast.LENGTH_LONG).show()
            },
                colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
                Text(text = "Enviar", color = Color.White)
            }
        }
        /*//Botones
        Row {
            Button(onClick = {
            },
                colors = ButtonDefaults.buttonColors(Color.DarkGray))
            {
                Text(text = "Button con color", color = Color.White)
            }
        }

        Row(){
            Button(onClick = {/*Codigo*/}) {
                Text(text = "Boton", color = Color.Red)
                Text(text = "Colors", color = Color.Yellow)
            }
        }

        Row(){
            Button(onClick = {/*Codigo*/}) {
                Image(painter = painterResource(id = R.drawable.ic_menu_camera),
                    contentDescription = "")
                Text(text = "Camara")
            }
        }

        Row(){
            Button(onClick = {/*Codigo*/}, shape = RectangleShape) {
                Text(text = "Boton con rectangulo")
            }
        }

        Row(){
            Button(onClick = {/*Codigo*/}, shape = RoundedCornerShape(20.dp)) {
                Text(text = "Boton con Esquinas Redondas")
            }
        }

        Row(){
            Button(onClick = {/*Codigo*/}, shape = CutCornerShape(20.dp)) {
                Text(text = "Boton con Esquinas cortadas")
            }
        }

        Row(){
            Button(onClick = {/*Codigo*/}, border = BorderStroke(5.dp, Color.Black),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
                Text(text = "Boton con borde de colores")
            }
        }

        Row(){
            Button (onClick = {/*Codigo*/}, elevation = ButtonDefaults.buttonElevation(
                defaultElevation= 10.dp,
                pressedElevation = 100.dp,
                disabledElevation = 0.dp
            )) {
                Text(text = "Boton con Elevacion")
            }
        }

         */
    }
}