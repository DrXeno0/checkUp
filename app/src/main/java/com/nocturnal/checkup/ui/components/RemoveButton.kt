package com.nocturnal.checkup.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nocturnal.checkup.R

@Preview(showBackground = true)
@Composable
fun RemoveButton(modifier: Modifier = Modifier, onClick: () -> Unit = {}){
    Box(contentAlignment = Alignment.Center, modifier = Modifier.clickable { onClick() }.border(border = BorderStroke(1.dp, color = androidx.compose.ui.graphics.Color.Gray), shape = androidx.compose.foundation.shape.CircleShape)){
        Icon(painter = painterResource(R.drawable.remove), contentDescription = "add button" , tint = Color.Black, modifier = Modifier.padding(2.7f.dp))
    }
}