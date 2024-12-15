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

public val Simpleicons.Jio: ImageVector
    get() {
        if (_jio != null) {
            return _jio!!
        }
        _jio = Builder(name = "Jio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 0.0f)
                moveToRelative(5.587f, 14.559f)
                curveToRelative(-0.883f, 0.0f, -1.49f, -0.648f, -1.49f, -1.574f)
                curveToRelative(0.0f, -0.912f, 0.62f, -1.56f, 1.49f, -1.56f)
                reflectiveCurveToRelative(1.491f, 0.648f, 1.491f, 1.573f)
                curveToRelative(0.0f, 0.897f, -0.634f, 1.56f, -1.49f, 1.56f)
                close()
                moveTo(17.617f, 9.407f)
                curveToRelative(-2.265f, 0.0f, -3.772f, 1.437f, -3.772f, 3.576f)
                curveToRelative(0.0f, 2.195f, 1.451f, 3.604f, 3.729f, 3.604f)
                curveToRelative(2.264f, 0.0f, 3.755f, -1.409f, 3.755f, -3.59f)
                curveToRelative(0.0f, -2.153f, -1.475f, -3.59f, -3.713f, -3.59f)
                close()
                moveTo(11.78f, 6.272f)
                curveToRelative(-0.856f, 0.0f, -1.395f, 0.483f, -1.395f, 1.243f)
                curveToRelative(0.0f, 0.774f, 0.552f, 1.257f, 1.435f, 1.257f)
                curveToRelative(0.857f, 0.0f, 1.395f, -0.483f, 1.395f, -1.257f)
                reflectiveCurveToRelative(-0.552f, -1.243f, -1.435f, -1.243f)
                moveToRelative(0.152f, 3.204f)
                horizontalLineToRelative(-0.277f)
                curveToRelative(-0.675f, 0.0f, -1.187f, 0.317f, -1.187f, 1.285f)
                verticalLineToRelative(4.42f)
                curveToRelative(0.0f, 0.98f, 0.496f, 1.284f, 1.216f, 1.284f)
                horizontalLineToRelative(0.275f)
                curveToRelative(0.677f, 0.0f, 1.16f, -0.33f, 1.16f, -1.285f)
                verticalLineToRelative(-4.419f)
                curveToRelative(0.0f, -0.995f, -0.47f, -1.285f, -1.187f, -1.285f)
                moveTo(8.316f, 7.392f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-0.76f, 0.0f, -1.174f, 0.43f, -1.174f, 1.285f)
                verticalLineToRelative(4.13f)
                curveToRelative(0.0f, 1.063f, -0.36f, 1.436f, -1.2f, 1.436f)
                curveToRelative(-0.662f, 0.0f, -1.201f, -0.29f, -1.63f, -0.816f)
                curveTo(3.87f, 13.373f, 3.0f, 13.786f, 3.0f, 14.81f)
                curveToRelative(0.0f, 1.104f, 1.035f, 1.781f, 2.955f, 1.781f)
                curveToRelative(2.334f, 0.0f, 3.563f, -1.173f, 3.563f, -3.742f)
                lineTo(9.518f, 8.675f)
                curveToRelative(0.0f, -0.856f, -0.413f, -1.283f, -1.202f, -1.283f)
            }
        }
        .build()
        return _jio!!
    }

private var _jio: ImageVector? = null
