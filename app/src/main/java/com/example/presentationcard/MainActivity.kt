package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun PersonalInformation() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Spacer(modifier = Modifier.height(192.dp))
        Image(
            painter = painterResource(id = R.drawable.android_robot),
            contentDescription = null
        )
        Text(
            text = "Alexis Aguilar",
            fontSize = 44.sp,
            fontFamily = FontFamily.SansSerif,
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3ddc84)
        )
    }
}

@Composable
fun ContactInformation() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Row {
            Icon(
                imageVector = Icons.Rounded.Call,
                contentDescription = "Phone number",
                tint = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "+58 (412) 279 3762")
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row {
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = "GitHub profile",
                tint = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "@dan-alcubilla")
        }
        Spacer(modifier = Modifier.height(4.dp))
        Row {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "Email",
                tint = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "alexdanaguilar@gmail.com")
        }
        Spacer(modifier = Modifier.height(64.dp))
    }
}

@Composable
fun PresentationCard() {
    Box {
        PersonalInformation()
        Spacer(modifier = Modifier.height(128.dp))
        ContactInformation()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFccecda)
@Composable
fun PersonalInformationPreview() {
    PresentationCardTheme {
        PresentationCard()
    }
}