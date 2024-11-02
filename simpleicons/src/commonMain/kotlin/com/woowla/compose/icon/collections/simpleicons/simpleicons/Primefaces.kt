package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Primefaces: ImageVector
    get() {
        if (_primefaces != null) {
            return _primefaces!!
        }
        _primefaces = Builder(name = "Primefaces", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.43f, 0.0f)
                lineTo(3.875f, 2.564f)
                lineToRelative(3.833f, 0.367f)
                lineTo(8.988f, 0.0f)
                close()
                moveTo(9.534f, 0.0f)
                lineTo(8.081f, 3.465f)
                lineTo(1.5f, 2.931f)
                lineToRelative(1.094f, 4.58f)
                lineToRelative(7.853f, 2.931f)
                horizontalLineToRelative(1.095f)
                lineTo(11.542f, 0.0f)
                close()
                moveTo(12.274f, 0.0f)
                verticalLineToRelative(10.442f)
                horizontalLineToRelative(1.278f)
                lineToRelative(7.853f, -2.93f)
                lineToRelative(1.095f, -4.58f)
                lineToRelative(-6.756f, 0.547f)
                lineTo(14.283f, 0.0f)
                close()
                moveTo(14.83f, 0.0f)
                lineTo(16.11f, 2.931f)
                lineTo(19.944f, 2.564f)
                lineTo(17.387f, 0.0f)
                close()
                moveTo(2.778f, 8.244f)
                verticalLineToRelative(6.229f)
                lineToRelative(4.383f, 3.663f)
                verticalLineToRelative(-5.68f)
                lineToRelative(1.278f, -1.83f)
                lineToRelative(-1.643f, 0.366f)
                lineToRelative(-2.009f, -2.016f)
                close()
                moveTo(21.039f, 8.244f)
                lineTo(19.03f, 8.976f)
                lineTo(17.021f, 10.992f)
                lineTo(15.378f, 10.625f)
                lineTo(16.656f, 12.457f)
                verticalLineToRelative(5.68f)
                lineToRelative(4.383f, -3.664f)
                close()
                moveTo(9.17f, 10.625f)
                lineToRelative(-1.462f, 2.199f)
                verticalLineToRelative(8.243f)
                lineToRelative(1.097f, 1.65f)
                lineTo(10.083f, 24.0f)
                horizontalLineToRelative(3.652f)
                lineToRelative(1.278f, -1.284f)
                lineToRelative(1.096f, -1.649f)
                verticalLineToRelative(-8.243f)
                lineToRelative(-1.46f, -2.199f)
                lineToRelative(-0.914f, 0.55f)
                horizontalLineToRelative(-3.652f)
                close()
                moveTo(4.787f, 16.855f)
                verticalLineToRelative(2.38f)
                lineToRelative(2.374f, 2.382f)
                lineTo(7.161f, 18.87f)
                close()
                moveTo(19.03f, 16.855f)
                lineTo(16.656f, 18.87f)
                verticalLineToRelative(2.747f)
                lineToRelative(2.374f, -2.381f)
                close()
            }
        }
        .build()
        return _primefaces!!
    }

private var _primefaces: ImageVector? = null
