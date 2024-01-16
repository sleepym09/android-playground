package com.sleep.android_playground.compse.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Follow Material Design 3.
 * For more detail, see https://m3.material.io/
 * To custom M3 style, see https://m3.material.io/theme-builder#/custom
 */
@Suppress("UnusedPrivateProperty")
object ColorPalette {

    private val BrandLight = Color(0xFF0353da)
    private val BrandDark = Color(0xFFb4c5ff)

    private val GrayStrongestLight = Color(0xFF535457)
    private val GrayStrongestDark = Color(0xFFAFB0B3)
    private val GrayStrongLight = Color(0xFF6F6F73)
    private val GrayStrongDark = Color(0xFF7E7F82)
    private val GrayBaseLight = Color(0xFF949598)
    private val GrayBaseDark = Color(0xFF404044)
    private val GraySoftLight = Color(0xFFD3D3D7)
    private val GraySoftDark = Color(0xFF36363A)
    private val GraySoftestLight = Color(0xFFEEEFF2)
    private val GraySoftestDark = Color(0xFF2E2F32)
    private val White = Color(0xFFFFFFFF)
    private val Black = Color(0xFF0E0E12)

    private val BlueLight = Color(0xFF003CAB)
    private val BlueDark = Color(0xFF618DFF)
    private val RedLight = Color(0xFFaf2e29)
    private val RedDark = Color(0xFFffb4ab)
    private val RedSoftLight = Color(0xFFffdad6)
    private val RedSoftDark = Color(0xFF8e1315)
    private val OrangeLight = Color(0xFF984800)
    private val OrangeDark = Color(0xFFffb689)
    private val OrangeSoftLight = Color(0xFFffdbc8)
    private val OrangeSoftDark = Color(0xFF743500)
    private val GreenLight = Color(0xFF006c46)
    private val GreenDark = Color(0xFF6adca4)
    private val GreenSoftLight = Color(0xFF87f8be)
    private val GreenSoftDark = Color(0xFF005234)

    val PrimaryPageLight = White
    val PrimaryDarkenLight = White
    val BackgroundPageLight = GraySoftLight
    val BackgroundCardLight = GraySoftLight
    val BackgroundComponentLight = GraySoftLight
    val BackgroundComponentDisabledLight = GraySoftLight
    val TextPrimaryLight = Black
    val TextSecondaryLight = GrayStrongestLight
    val TextDisabledLight = GraySoftLight
    val TextLinkLight = BlueLight
    val BorderLight = GraySoftLight
    val DividerLight = GrayBaseLight
    val FunctionalSuccessLight = GreenLight
    val FunctionalSuccessBackgroundLight = GreenSoftLight
    val FunctionalErrorLight = RedLight
    val FunctionalErrorBackgroundLight = RedSoftLight
    val FunctionalWarningLight = OrangeLight
    val FunctionalWarningBackgroundLight = OrangeSoftLight
    val CoverMaskLight = GrayStrongLight

    val PrimaryPageDark = Black
    val PrimaryDarkenDark = Black
    val BackgroundPageDark = GraySoftDark
    val BackgroundCardDark = GraySoftDark
    val BackgroundComponentDark = GraySoftDark
    val BackgroundComponentDisabledDark = GraySoftDark
    val TextPrimaryDark = White
    val TextSecondaryDark = GrayStrongestDark
    val TextDisabledDark = GraySoftDark
    val TextLinkDark = BlueDark
    val BorderDark = GraySoftDark
    val DividerDark = GrayBaseDark
    val FunctionalSuccessDark = GreenDark
    val FunctionalSuccessBackgroundDark = GreenSoftDark
    val FunctionalErrorDark = RedDark
    val FunctionalErrorBackgroundDark = RedSoftDark
    val FunctionalWarningDark = OrangeDark
    val FunctionalWarningBackgroundDark = OrangeSoftDark
    val CoverMaskDark = GrayStrongDark

}