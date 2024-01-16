package com.sleep.android_playground.compse.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class Colors internal constructor(
    val primaryPage: Color,
    val backgroundPage: Color,
    val backgroundComponent: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val textDisabled: Color,
    val textLink: Color,
    val border: Color,
    val divider: Color,
    val functionalSuccess: Color,
    val functionalSuccessBackground: Color,
    val functionalError: Color,
    val functionalErrorBackground: Color,
    val functionalWarning: Color,
    val functionalWarningBackground: Color,
    val coverMask: Color,
)

val lightColors: Colors = with(ColorPalette) {
    Colors(
        primaryPage = PrimaryPageLight,
        backgroundPage = BackgroundPageLight,
        backgroundComponent = BackgroundComponentLight,
        textPrimary = TextPrimaryLight,
        textSecondary = TextSecondaryLight,
        textDisabled = TextDisabledLight,
        textLink = TextLinkLight,
        border = BorderLight,
        divider = DividerLight,
        functionalSuccess = FunctionalErrorLight,
        functionalSuccessBackground = FunctionalSuccessBackgroundLight,
        functionalError = FunctionalErrorLight,
        functionalErrorBackground = FunctionalErrorBackgroundLight,
        functionalWarning = FunctionalWarningLight,
        functionalWarningBackground = FunctionalWarningBackgroundLight,
        coverMask = CoverMaskLight,
    )
}

val darkColors: Colors = with(ColorPalette) {
    Colors(
        primaryPage = PrimaryPageDark,
        backgroundPage = BackgroundPageDark,
        backgroundComponent = BackgroundComponentDark,
        textPrimary = TextPrimaryDark,
        textSecondary = TextSecondaryDark,
        textDisabled = TextDisabledDark,
        textLink = TextLinkDark,
        border = BorderDark,
        divider = DividerDark,
        functionalSuccess = FunctionalSuccessDark,
        functionalSuccessBackground = FunctionalSuccessBackgroundDark,
        functionalError = FunctionalErrorDark,
        functionalErrorBackground = FunctionalErrorBackgroundDark,
        functionalWarning = FunctionalWarningDark,
        functionalWarningBackground = FunctionalWarningBackgroundDark,
        coverMask = CoverMaskDark,
    )
}

internal val LocalColors = staticCompositionLocalOf { lightColors }