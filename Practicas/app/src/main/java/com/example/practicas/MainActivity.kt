package com.example.practicas

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
    var uno by remember { mutableStateOf(value = "1") }
    var dos by remember { mutableStateOf(value = "2") }
    var tres by remember { mutableStateOf(value = "3") }
    var cuatro by remember { mutableStateOf(value = "4") }
    var cinco by remember { mutableStateOf(value = "5") }
    var seis by remember { mutableStateOf(value = "6") }
    var siete by remember { mutableStateOf(value = "7") }
    var ocho by remember { mutableStateOf(value = "8") }
    var nueve by remember { mutableStateOf(value = "9") }
    var cero by remember { mutableStateOf(value = "0") }
    var suma by remember { mutableStateOf(value = "+") }
    var resta by remember { mutableStateOf(value = "-") }
    var multi by remember { mutableStateOf(value = "*") }
    var divi by remember { mutableStateOf(value = "/") }
    var borrar by remember { mutableStateOf(value = "") }
    Column {
        Row(modifier = Modifier.padding(10.dp,60.dp,10.dp,10.dp)) {
            Text(text = "Calculadora", )
        }
        Row (){
            TextField(
                value = borrar,
                textStyle = androidx.compose.ui.text.TextStyle(textAlign = TextAlign.End,
                    fontSize = 50.sp),
                onValueChange = { borrar = it},
                modifier = Modifier.size(500.dp,400.dp)
            )
        }

        Row {
            Button(onClick = {
                val ichi = uno.toInt()
            },
                shape = RectangleShape,

                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier.size(105.dp)
            ) {

                Text(text = "1", style = TextStyle(fontSize = 42.sp), color = Color.White)

            }

            Button(onClick = {
                val ni = dos.toInt()
            },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier.size(105.dp)
            ) {
                Text(text = "2", style = TextStyle(fontSize = 42.sp), color = Color.White)

            }

            Button(onClick = {
                val san = tres.toInt()
            },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(Color.Black),
                modifier = Modifier.size(105.dp)
            ) {
                Text(text = "3", style = TextStyle(fontSize = 42.sp),color = Color.White)

            }
            Button(onClick = {
                val sum = suma.toInt()
            },
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
                    val yon = cuatro.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "4",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    val go = cinco.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "5",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    val roku = seis.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "6",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }
                Button(onClick = {
                    val minus = resta.toInt()
                },
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
                    val nana = siete.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "7",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    val hachi = ocho.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "8",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    val kyu = nueve.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "9",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }
                Button(onClick = {
                    val por = multi.toInt()
                },
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
                    val nana = siete.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "<-",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }

                Button(onClick = {
                    val zero = cero.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "0", style = TextStyle(fontSize = 42.sp),color = Color.White)

                }

                Button(onClick = {
                    val borr = borrar.toInt()
                },
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier.size(105.dp)
                ) {
                    Text(text = "AC",style = TextStyle(fontSize = 42.sp), color = Color.White)

                }
                Button(onClick = {
                    val div = divi.toInt()
                },
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