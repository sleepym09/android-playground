package com.sleep.android_playground.compse.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun PlaygroundTheme(
    isDarkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = remember(isDarkMode) { if (isDarkMode) darkColors else lightColors }
    val materialColors = remember(isDarkMode) { getColorScheme(isDarkMode) }
    val materialShapes = remember {
        Shapes(
            small = RoundedCornerShape(4.dp),
            medium = RoundedCornerShape(4.dp),
            large = RoundedCornerShape(4.dp),
        )
    }

    val headlineSmall = PlaygroundTheme.typography.headlineSmall
    val headlineMedium = PlaygroundTheme.typography.headlineMedium
    val headlineLarge = PlaygroundTheme.typography.headlineLarge
    val titleSmall = PlaygroundTheme.typography.titleSmall
    val titleMedium = PlaygroundTheme.typography.titleMedium
    val titleLarge = PlaygroundTheme.typography.titleLarge
    val bodySmall = PlaygroundTheme.typography.bodySmall
    val bodyMedium = PlaygroundTheme.typography.bodyMedium
    val bodyLarge = PlaygroundTheme.typography.bodyLarge

    val typography = remember {
        androidx.compose.material3.Typography(
            headlineLarge = headlineLarge,
            headlineMedium = headlineMedium,
            headlineSmall = headlineSmall,
            titleLarge = titleLarge,
            titleMedium = titleMedium,
            titleSmall = titleSmall,
            bodyLarge = bodyLarge,
            bodyMedium = bodyMedium,
            bodySmall = bodySmall,
        )
    }
    MaterialTheme(
        colorScheme = materialColors,
        shapes = materialShapes,
        typography = typography,
    ) {
        CompositionLocalProvider(
            LocalColors provides colors,
            LocalContentColor provides MaterialTheme.colorScheme.onBackground,
            content = content,
        )
    }
}

private fun getColorScheme(isDarkMode: Boolean) =
    with(PlaygroundTheme.colorPalette) { if (isDarkMode) darkColorScheme else lightColorScheme }

private val ColorPalette.lightColorScheme: ColorScheme
    get() = ColorScheme(
        background = BackgroundPageLight,
        error = FunctionalErrorLight,
        errorContainer = FunctionalErrorLight,
        inverseOnSurface = BackgroundComponentLight,
        inversePrimary = PrimaryPageLight,
        inverseSurface = BackgroundCardDark,
        onBackground = BackgroundComponentLight,
        onError = FunctionalErrorLight,
        onErrorContainer = FunctionalErrorLight,
        onPrimary = BackgroundComponentLight,
        onPrimaryContainer = BackgroundComponentLight,
        onSecondary = BackgroundComponentLight,
        onSecondaryContainer = BackgroundComponentLight,
        onSurface = BackgroundComponentLight,
        onSurfaceVariant = BackgroundComponentDisabledLight,
        onTertiary = BackgroundComponentLight,
        onTertiaryContainer = BackgroundComponentLight,
        outline = BackgroundCardLight,
        outlineVariant = BackgroundCardLight,
        primary = PrimaryPageLight,
        primaryContainer = PrimaryPageLight,
        scrim = BackgroundComponentDisabledLight,
        secondary = PrimaryDarkenLight,
        secondaryContainer = PrimaryDarkenLight,
        surface = BackgroundCardLight,
        surfaceTint = BackgroundCardLight,
        surfaceVariant = BackgroundCardLight,
        tertiary = BackgroundComponentDisabledLight,
        tertiaryContainer = BackgroundComponentDisabledLight,
    )

private val ColorPalette.darkColorScheme: ColorScheme
    get() = ColorScheme(
        background = BackgroundPageDark,
        error = FunctionalErrorDark,
        errorContainer = FunctionalErrorDark,
        inverseOnSurface = BackgroundComponentDark,
        inversePrimary = PrimaryPageDark,
        inverseSurface = BackgroundCardDark,
        onBackground = BackgroundComponentDark,
        onError = FunctionalErrorDark,
        onErrorContainer = FunctionalErrorDark,
        onPrimary = BackgroundComponentDark,
        onPrimaryContainer = BackgroundComponentDark,
        onSecondary = BackgroundComponentDark,
        onSecondaryContainer = BackgroundComponentDark,
        onSurface = BackgroundComponentDark,
        onSurfaceVariant = BackgroundComponentDisabledDark,
        onTertiary = BackgroundComponentDark,
        onTertiaryContainer = BackgroundComponentDark,
        outline = BackgroundCardDark,
        outlineVariant = BackgroundCardDark,
        primary = PrimaryPageDark,
        primaryContainer = PrimaryPageDark,
        scrim = BackgroundComponentDisabledDark,
        secondary = PrimaryDarkenDark,
        secondaryContainer = PrimaryDarkenDark,
        surface = BackgroundCardDark,
        surfaceTint = BackgroundCardDark,
        surfaceVariant = BackgroundCardDark,
        tertiary = BackgroundComponentDisabledDark,
        tertiaryContainer = BackgroundComponentDisabledDark,
    )

object PlaygroundTheme {
    val typography = Typography
    val colorPalette = ColorPalette
    val colors: Colors @Composable @ReadOnlyComposable get() = LocalColors.current
}