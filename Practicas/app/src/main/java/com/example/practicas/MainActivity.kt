package com.example.practicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    CalculadoraISR()
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
fun CalculadoraISR(){
    val context = LocalContext.current
    var ingresoM by remember { mutableStateOf(value = "") }
    var isr by remember { mutableStateOf(value = "") }
    var neto by remember { mutableStateOf(value = "") }

    Column (modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Row {
            Image(
                modifier = Modifier.size(500.dp),
                painter = painterResource(id = R.drawable.him),
                contentDescription = null
            )
        }
        Row {
            Text(text = "¿Cuanto te va a quitar el SAT(anas) mensualmente?")
        }
        Row (modifier = Modifier.padding(10.dp,5.dp,10.dp,10.dp)){
            OutlinedTextField(
                value = ingresoM,
                label = {Text("Escriba su ingreso mensual")},
                onValueChange = {ingresoM = it}
            )
        }

        Row (Modifier.align(Alignment.CenterHorizontally)){
            Button(onClick = {
                //Toast.makeText(context,valorA,Toast.LENGTH_LONG).show()
                val a = ingresoM.toDouble()
                var b = 0.00
                var n = 0.00

                if(a <= 746.04)
                    b = ((a-0.01)*0.0192)+0.00
                else
                if(a <= 6332.05)
                    b = ((a-746.05)*0.0640)+14.32
                else
                if(a <= 11128.01)
                    b = ((a-6332.06)*0.1088)+371.83
                else
                if(a <= 12935.82)
                    b = ((a-11128.02)*0.16)+893.63
                else
                if(a <= 15487.71)
                    b = ((a-12935.83)*0.1792)+1182.88
                else
                if(a <= 31236.49)
                    b = ((a-15487.72)*0.2136)+1640.18
                else
                if(a <= 49233.00)
                    b = ((a-31236.50)*0.2352)+5004.12
                else
                if(a <= 93993.90)
                    b = ((a-49233.01)*0.30)+9236.89
                else
                if(a <= 125325.20)
                    b = ((a-93993.91)*0.32)+22665.17
                else
                if(a <= 375975.61)
                    b = ((a-125325.21)*0.34)+32691.18
                else
                if(a >= 375975.61)
                    b = ((a-375975.62)*0.35)+117912.32

                isr = b.toString()
                n = (a - b)
                neto = n.toString()


            },
                colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
                Text(text = "Calcular", color = Color.White)
            }

            OutlinedButton(onClick = {
                //Toast.makeText(context,valorA,Toast.LENGTH_LONG).show()
                val a = ""
                val b = ""
                val res = ""
                ingresoM = a.toString()
                isr = b.toString()
                neto = res.toString()
            },
                colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
                Text(text = "Borrar", color = Color.White)
            }
        }

        Row (modifier = Modifier.padding(10.dp,5.dp,10.dp,10.dp)){
            OutlinedTextField(
                value = isr.toString(),
                label = {Text("ISR")},
                onValueChange = {isr = it}
            )
        }

        Row (modifier = Modifier.padding(10.dp,5.dp,10.dp,10.dp)){
            OutlinedTextField(
                value = neto.toString(),
                label = {Text("Ingresos netos")},
                onValueChange = {neto = it}
            )
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