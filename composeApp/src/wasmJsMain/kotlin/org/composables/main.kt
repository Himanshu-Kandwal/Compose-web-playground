package org.composables

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    /*ComposeViewport(document.body!!) {
        App()
    }*/

   /* ComposeViewport(viewportContainerId = "composeApplicationSample") {
        AppTwo()
    }*/

    val currentPath = document.location?.pathname ?: "/"
    // Log the current path to the console
    println("Current path: $currentPath")

    when (currentPath) { //checking path in browser to figure out which composable to load

        "/" -> ComposeViewport(viewportContainerId = "composeApplicationSample") {
            App()
        }
        "/two.html" -> ComposeViewport(viewportContainerId = "composeApplicationSample") {
            AppTwo()
        }
    }


    /* ComposeViewport(viewportContainerId = "composeApplicationSampleTwo") {
         App()
     }*/
}