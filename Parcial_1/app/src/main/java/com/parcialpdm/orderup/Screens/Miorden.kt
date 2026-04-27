package com.parcialpdm.orderup.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.parcialpdm.orderup.model.Producto

@Composable
fun Mioriden(
    orden: List<Producto> = listOf<Producto>(),
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = onBack
        ) { }
    }
}