package com.parcialpdm.orderup.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.parcialpdm.orderup.data.menu
import com.parcialpdm.orderup.model.Producto

@Composable
fun TarjetaProducto(
    Indicador: Int,
): Unit {
    val data = menu.find { it.id == Indicador }
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier.size(240.dp,100.dp),

    ) {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Spacer(modifier = Modifier.padding(5.dp))
                Text(text = data?.nombre ?: "Not Found")
                Spacer(modifier = Modifier.padding(10.dp))
                AsyncImage(
                    model = data?.imagenUrl,
                    contentDescription = "Translated description of what the image contains"
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Column(
                modifier = Modifier.weight(1f)
            ){
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = data?.tipo.toString())
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = data?.precio.toString() + "$")
            }
        }
    }
}

@Preview
@Composable
fun previewTarjeta() {
    TarjetaProducto(1)
}