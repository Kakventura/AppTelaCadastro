package com.example.telacadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telacadastro.ui.theme.TelaCadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaCadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tela()
                }
            }
        }
    }
}

@Composable
fun Tela() {

    //VARIÁVEIS DE TEXFIELD
    var nome by remember { mutableStateOf("") }
    var endereco by remember { mutableStateOf("") }
    var bairro by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("") }
    Column (
      Modifier
          .fillMaxWidth(),
      horizontalAlignment = Alignment.CenterHorizontally //ALINHAMENTO DOS ELEMENTOS NO CENTRO
    ){
        // ROW DO TÍTULO PRINCIPAL DO APP
        Row (
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            Arrangement.Center

        ){
            Text(
                text = "APP Cadastro",
                style = TextStyle(
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    color = Color.DarkGray,
                    )
            )
        }
        // LINHA DA CAIXA DE TEXTO (NOME)
        Row (
            Modifier.padding(10.dp)
        ) {
            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Nome:") }
            )
        }

        // LINHA DA CAIXA DE TEXTO (ENDEREÇO)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = endereco,
                onValueChange = { endereco = it },
                label = { Text("Endereço:") }
            )
        }

        // LINHA DA CAIXA DE TEXTO (BAIRRO)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = bairro,
                onValueChange = { bairro = it },
                label = { Text("Bairro:") }
            )
        }

        // LINHA DA CAIXA DE TEXTO (CEP)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = cep,
                onValueChange = { cep = it },
                label = { Text("CEP:") }
            )
        }
        // LINHA DA CAIXA DE TEXTO (CIDADE)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = cidade,
                onValueChange = { cidade = it },
                label = { Text("Cidade:") }
            )
        }
        // LINHA DA CAIXA DE TEXTO (ESTADO)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = estado,
                onValueChange = { estado = it },
                label = { Text("Estado:") }
            )
        }
        // CRIAÇÃO DO BOTÃO
        Row (
            Modifier.padding(10.dp)
        ){
            Button (onClick = {}){
                Text(text = "Enviar Dados")
            }
        }

    }
}


@Preview(showBackground = false)
@Composable
fun TelaPreview() {
    TelaCadastroTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Tela()
        }
    }

}