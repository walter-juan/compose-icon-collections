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

public val Simpleicons.Avaloniaui: ImageVector
    get() {
        if (_avaloniaui != null) {
            return _avaloniaui!!
        }
        _avaloniaui = Builder(name = "Avaloniaui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.034f, 8.208f)
                curveToRelative(-2.003f, 0.0f, -3.627f, 1.696f, -3.627f, 3.789f)
                reflectiveCurveToRelative(1.624f, 3.789f, 3.627f, 3.789f)
                reflectiveCurveToRelative(3.627f, -1.697f, 3.627f, -3.79f)
                reflectiveCurveToRelative(-1.624f, -3.788f, -3.627f, -3.788f)
                moveToRelative(-7.392f, 2.067f)
                curveToRelative(0.72f, 0.211f, 1.248f, 0.902f, 1.248f, 1.722f)
                reflectiveCurveToRelative(-0.528f, 1.51f, -1.248f, 1.721f)
                curveToRelative(0.752f, 3.54f, 3.776f, 6.188f, 7.392f, 6.188f)
                curveToRelative(1.316f, 0.0f, 2.554f, -0.35f, 3.632f, -0.967f)
                verticalLineToRelative(0.914f)
                horizontalLineToRelative(3.94f)
                verticalLineToRelative(-7.528f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -0.224f)
                verticalLineToRelative(-0.104f)
                curveToRelative(0.0f, -4.369f, -3.39f, -7.91f, -7.572f, -7.91f)
                curveToRelative(-3.616f, 0.0f, -6.64f, 2.648f, -7.392f, 6.188f)
                moveToRelative(-0.5f, 2.982f)
                curveToRelative(0.67f, 0.0f, 1.212f, -0.567f, 1.212f, -1.266f)
                reflectiveCurveToRelative(-0.542f, -1.265f, -1.212f, -1.265f)
                reflectiveCurveToRelative(-1.211f, 0.566f, -1.211f, 1.265f)
                curveToRelative(0.0f, 0.7f, 0.542f, 1.266f, 1.211f, 1.266f)
                moveTo(20.682f, 24.0f)
                horizontalLineTo(11.8f)
                curveTo(5.549f, 23.887f, 0.515f, 18.556f, 0.515f, 12.0f)
                curveToRelative(0.0f, -6.627f, 5.143f, -12.0f, 11.487f, -12.0f)
                curveToRelative(6.241f, 0.0f, 11.32f, 5.2f, 11.483f, 11.678f)
                lineToRelative(-0.02f, 9.743f)
                curveTo(23.3f, 22.876f, 22.12f, 24.0f, 20.683f, 24.0f)
            }
        }
        .build()
        return _avaloniaui!!
    }

private var _avaloniaui: ImageVector? = null
