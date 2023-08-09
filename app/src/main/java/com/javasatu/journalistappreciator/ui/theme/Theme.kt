package com.javasatu.journalistappreciator.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Material 3 color schemes
private val skemaWarnaJAGelap = darkColorScheme(
    primary = jaDarkPrimary,
    onPrimary = jaDarkOnPrimary,
    primaryContainer = jaDarkPrimaryContainer,
    onPrimaryContainer = jaDarkOnPrimaryContainer,
    inversePrimary = jaGelapPrimaryInverse,
    secondary = jaDarkSecondary,
    onSecondary = jaDarkOnSecondary,
    secondaryContainer = jaDarkSecondaryContainer,
    onSecondaryContainer = jaDarkOnSecondaryContainer,
    tertiary = jaDarkTertiary,
    onTertiary = jaGelapOnTertiary,
    tertiaryContainer = jaGelapTertiaryContainer,
    onTertiaryContainer = jaGelapOnTertiaryContainer,
    error = jaGelapError,
    onError = jaGelapOnError,
    errorContainer = jaGelapErrorContainer,
    onErrorContainer = jaGelapOnErrorContainer,
    background = jaGelapDarkBackground,
    onBackground = jaGelapDarkOnBackground,
    surface = jaGelapSurface,
    onSurface = jaGelapOnSurface,
    inverseSurface = jaGelapInverseSurface,
    inverseOnSurface = jaGelapInverseOnSurface,
    surfaceVariant = jaGelapSurfaceVariant,
    onSurfaceVariant = jaGelapOnSurfaceVariant,
    outline = jaGelapOutline
)

private val skemaWarnaJATerang = lightColorScheme(
    primary = jaLightPrimary,
    onPrimary = jaLightOnPrimary,
    primaryContainer = jaLightPrimaryContainer,
    onPrimaryContainer = jaLightOnPrimaryContainer,
    inversePrimary = replyLightPrimaryInverse,
    secondary = jaLightSecondary,
    onSecondary = jaLightOnSecondary,
    secondaryContainer = jaLightSecondaryContainer,
    onSecondaryContainer = jaLightOnSecondaryContainer,
    tertiary = replyLightTertiary,
    onTertiary = replyLightOnTertiary,
    tertiaryContainer = replyLightTertiaryContainer,
    onTertiaryContainer = replyLightOnTertiaryContainer,
    error = replyLightError,
    onError = replyLightOnError,
    errorContainer = replyLightErrorContainer,
    onErrorContainer = replyLightOnErrorContainer,
    background = replyLightBackground,
    onBackground = replyLightOnBackground,
    surface = replyLightSurface,
    onSurface = replyLightOnSurface,
    inverseSurface = replyLightInverseSurface,
    inverseOnSurface = replyLightInverseOnSurface,
    surfaceVariant = replyLightSurfaceVariant,
    onSurfaceVariant = replyLightOnSurfaceVariant,
    outline = replyLightOutline
)

@Composable
fun LazyColumnTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val skemaWarnaJA = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> skemaWarnaJAGelap
        else -> skemaWarnaJATerang
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = skemaWarnaJA.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = skemaWarnaJA,
        typography = kustomTypography,
        shapes = shapes,
        content = content
    )

//    MaterialTheme(
//        colorScheme = colorScheme,
//        typography = Typography,
//        content = content
//    )
}