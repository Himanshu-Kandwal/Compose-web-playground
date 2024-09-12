package org.composables

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    val GITHUB_HOSTING_BASE_URL = "https://himanshu-kandwal.github.io/Compose-web-playground"

    var currentPath = document.location?.pathname ?: "/"

    //for github check, if project is running in github it will have different url than localhost
    if(currentPath.contains(GITHUB_HOSTING_BASE_URL))
    currentPath = currentPath.removePrefix(GITHUB_HOSTING_BASE_URL) //remove extra prefix added by github

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

}