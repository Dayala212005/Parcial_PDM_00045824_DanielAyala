package com.parcialpdm.orderup.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.parcialpdm.orderup.components.AppScaffold
import com.parcialpdm.orderup.components.TarjetaProducto
import com.parcialpdm.orderup.data.menu

@Composable
fun Menu(
    onOrden: () -> Unit
) {
    AppScaffold(
        titulo = "Menu",
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            menu.forEach{
                TarjetaProducto(it.id)
            }
        }
    }
}

@Preview
@Composable
fun previewMenu() {
    Menu()
}

