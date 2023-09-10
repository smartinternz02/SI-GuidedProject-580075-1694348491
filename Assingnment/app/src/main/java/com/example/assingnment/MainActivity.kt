package com.example.assingnment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.ComposableTarget
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.assingnment.ui.theme.AssingnmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssingnmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginPage()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage() {
    var username= remember {
        mutableStateOf("")

    }
    var Password= remember {
        mutableStateOf("")
    }


    Column(modifier=Modifier.fillMaxSize().padding(20.dp), verticalArrangement =Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "LoginScreen",
            color=Color.Blue,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(value = username.value,
            onValueChange ={
                username.value=it},
            leadingIcon = {
                Icon(Icons.Default.Person,contentDescription="person")
            },
            label={
                Text(text="Useranme")
            },
            placeholder={
                Text(text = "enter username")
            })
        OutlinedTextField(value = Password.value,
            onValueChange ={
                Password.value=it},
            leadingIcon = {
                Icon(Icons.Default.Info,contentDescription="person")
            },
            label={
                Text(text="Password")
            },
            placeholder={
                Text(text = "enter password")
            })
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text ="Login")
            
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AssingnmentTheme {
        LoginPage()
    }
}