package com.sleep.android_playground.compse.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle

object Typography {
    val headlineSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.headlineSmall.copy()

    val headlineMedium: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.headlineMedium.copy()

    val headlineLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.headlineLarge.copy()

    val titleSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.titleSmall.copy()

    val titleMedium: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.titleMedium.copy()

    val titleLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.titleLarge.copy()

    val bodySmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.bodySmall.copy()

    val bodyMedium: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.bodyMedium.copy()

    val bodyLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography.bodyLarge.copy()
}