package com.nocturnal.checkup.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nocturnal.checkup.R


@Preview(showBackground = true)
@Composable
fun ItemCard(
    image: Int = R.drawable.ramen_image,
    contentDescription: String = "default",
    title: String = "Ramen with Chicken and eggs",
    price: Float = 100.00f
) {
    Row(Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(image),
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .aspectRatio(1f)
                .clip(
                    RoundedCornerShape(16.dp)
                )
        )
        Spacer(Modifier.width(14.dp))
        Column {
            Text(text = title,Modifier.padding(top = 7.dp).width(150.dp))
            Text(text = "${price} $")
            Row {
                AddButton()
                Text(text = "1")
                RemoveButton()
            }
        }

    }
}
