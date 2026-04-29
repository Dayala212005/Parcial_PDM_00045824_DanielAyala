package com.parcialpdm.orderup.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        LazyColumn (
            modifier = Modifier.fillMaxSize()
        ) {
            items(menu) { menu ->
                TarjetaProducto(menu.id)
                Spacer(modifier = Modifier.height(12.dp))
            }
            item {
                Button(
                    modifier = Modifier.fillMaxSize(),
                    onClick = onOrden

                ) {
                    Text(text = "Ordenar")
                }
            }
            item {
                Spacer(modifier = Modifier.height(12.dp))
            }
        }

    }
}


//@Preview
//@Composable
//fun previewMenu() {
//    Menu()
//}

