package com.parcialpdm.orderup.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.parcialpdm.orderup.components.AppScaffold
import com.parcialpdm.orderup.model.Producto

@Composable
fun Mioriden(
    orden: List<Producto> = listOf<Producto>(),
    onBack: () -> Unit
) {
    AppScaffold(
        titulo = "Mi orden",
    ) {
    }
        Column(
            modifier = Modifier.fillMaxSize().padding(40.dp).padding(top = 40.dp)
        ) {
            Button(
                onClick = onBack
            ) { }
        }
}