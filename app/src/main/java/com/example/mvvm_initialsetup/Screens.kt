package com.example.mvvm_initialsetup
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable



data class Screen(
    val route: String,
    val label: String,
    val composable: @Composable () -> Unit
)

// Create a list of screens
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
val screens = listOf(
    Screen("home", "home") { Text(text = "Home") },
    Screen("second", "second") { Text(text = "Second") },
)