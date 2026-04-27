package com.parcialpdm.orderup.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.parcialpdm.orderup.Routes.Routes
import com.parcialpdm.orderup.Screens.Menu
import com.parcialpdm.orderup.Screens.Mioriden

@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = backStack,
        entryProvider =  entryProvider{
            entry<Routes.Home> {
                Menu(onOrden = {
                    backStack.add(Routes.Pedido)
                })
            }
            entry<Routes.Pedido> {
                Mioriden(onBack = {
                    backStack.removeLastOrNull()
                },)
            }
        },
    )
}