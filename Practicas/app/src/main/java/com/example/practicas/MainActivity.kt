package com.example.practicas

import android.icu.text.DecimalFormat
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculadora()
                }
            }
        }
    }
}


@Composable
fun Calculadora(){
    /*
    //val context = LocalContext.current
    var valorA by remember { mutableStateOf(value = "") }
    var valorB by remember { mutableStateOf(value = "") }
    var resul by remember { mutableStateOf(value = "") }

    Column (modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Row {
            Text(text = "Escriba los valores")
        }
        Row (modifier = Modifier.padding(10.dp,5.dp,10.dp,10.dp)){
            OutlinedTextField(
                value = valorA,
                label = {Text("Primer valor")},
                onValueChange = {valorA = it}
            )
        }

        Row (modifier = Modifier.padding(10.dp,5.dp,10.dp,10.dp)){
            OutlinedTextField(
                value = valorB,
                label = {Text("Segundo valor")},
                onValueChange = {valorB = it}
            )
        }

        Row (Modifier.align(Alignment.CenterHorizontally)){
            Button(onClick = {
                //Toast.makeText(context,valorA,Toast.LENGTH_LONG).show()
                val a = valorA.toInt()
                val b = valorB.toInt()
                val res = a + b
                resul = res.toString()
            },
                colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
                Text(text = "Calcular", color = Color.White)
            }

            OutlinedButton(onClick = {
                //Toast.makeText(context,valorA,Toast.LENGTH_LONG).show()
                val a = ""
                val b = ""
                val res = ""
                valorA = a.toString()
                valorB = b.toString()
                resul = res.toString()
            },
                colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
                Text(text = "Borrar", color = Color.White)
            }
        }

        Row (modifier = Modifier.padding(10.dp,5.dp,10.dp,10.dp)){
            OutlinedTextField(
                value = resul,
                label = {Text("Resultado")},
                onValueChange = {resul = it}
            )
        }
    }

     */
    //Variables que guardan los numeros de la operacion
    var num1 by remember { mutableStateOf(value = "") }
    var num2 by remember { mutableStateOf(value = "") }

    //Variables que muestran la operacion y el resultado
    var operad by remember { mutableStateOf<Int?>(null) }
    var operac by remember { mutableStateOf(value = "") }
    var resul by remember { mutableStateOf(value = "") }
    Column {
        Row(modifier = Modifier.padding(10.dp,60.dp,10.dp,10.dp)) {
            Text(text = "Calculadora", )
        }
        Row (){
            //Muestra el resultado
            Text(
                text =  if (resul.isNotEmpty()) resul else num2.ifEmpty() {num1},
                fontSize = 100.sp,
                modifier = Modifier.size(500.dp,300.dp),
                textAlign = TextAlign.End
            )
        }

        Row (){
            //Muestra la operacion
            Text(
                text =  operac,
                fontSize = 50.sp,
                modifier = Modifier.size(500.dp,100.dp),
                textAlign = TextAlign.End
            )
        }

        Row {
            Button(onClick = {
                num2 += 1
                operac += 1 },
                shape = RectangleShape,

                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier.size(105.dp)
            ) {

                Text(text = "1", style = TextStyle(fontSize = 42.sp), color = Color.White)

            }

            Button(onClick = {
                num2 += 2
                operac += 2 },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier.size(105.dp)
            ) {
                Text(text = "2", style = TextStyle(fontSize = 42.sp), color = Color.White)

            }

            Button(onClick = {
                num2 += 3
                operac += 3 },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier.size(105.dp)
            ) {
                Text(text = "3", style = TextStyle(fontSize = 42.sp),color = Color.White)

            }
            Button(onClick = {
                operad = 1
                num1 = num2
                num2 = ""
                operac += "+" },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                modifier = Modifier.size(120.dp,105.dp)
            ) {
                Text(text = "+", style = TextStyle(fontSize = 42.sp),color = Color.White)

            }
        }

        Column {
            Row {
                Button(onClick = {
                    num2 += 4
                    operac += 4 },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "4",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    num2 += 5
                    operac += 5 },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "5",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    num2 += 6
                    operac += 6 },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "6",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }
                Button(onClick = {
                    operad = 2
                    num1 = num2
                    num2 = ""
                    operac += "-" },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.DarkGray),
                    modifier = Modifier.size(120.dp,105.dp)
                ) {
                    Text(text = "-",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }
            }
        }

        Column {
            Row {
                Button(onClick = {
                    num2 += 7
                    operac += 7 },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "7",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    num2 += 8
                    operac += 8 },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "8",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    num2 += 9
                    operac += 9 },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "9",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }
                Button(onClick = {
                    operad = 3
                    num1 = num2
                    num2 = ""
                    operac += "*" },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.DarkGray),
                    modifier = Modifier.size(120.dp,105.dp)
                ) {
                    Text(text = "*",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }
            }
        }

        Column {
            Row {
                Button(onClick = {
                    num1 = ""
                    num2 = ""
                    operad = null
                    resul = "" },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "AC",style = TextStyle(fontSize = 42.sp), color = Color(210,0,101))

                }

                Button(onClick = {
                    num2 += 0
                    operac += 0 },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "0", style = TextStyle(fontSize = 42.sp),color = Color.White)

                }

                Button(onClick = {
                    val n1 = num1.toDoubleOrNull() ?: 0.0
                    val n2 = num2.toDoubleOrNull() ?: 0.0
                    val resulta = when (operad){
                        1 -> n1 + n2
                        2 -> n1 - n2
                        3 -> n1 * n2
                        4 -> if(n2 != 0.0) n1 / n2 else Double.NaN
                        else -> n2
                    }

                    val decimales = DecimalFormat("#.######")
                    resul = decimales.format(resulta)
                    operac = ""
                    operad = null
                    num2 = ""
                    num1 = ""
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "=",style = TextStyle(fontSize = 42.sp), color = Color(65, 112, 206))

                }
                Button(onClick = {
                    operad = 4
                    num1 = num2
                    num2 = ""
                    operac += "/" },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.DarkGray),
                    modifier = Modifier.size(120.dp,105.dp)
                ) {
                    Text(text = "/",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }
            }
        }
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