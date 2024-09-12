package org.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AppTwo() {
    MaterialTheme {
        var count by remember { mutableStateOf(0) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { count++ }) {
                Text("Click me!")
            }
            Text(text = "Clicked $count times")
        }
    }
}

@Preview
@Composable
fun PreviewAppTwo() {
    AppTwo()
}