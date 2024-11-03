package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.AirplaneFill: ImageVector
    get() {
        if (_airplaneFill != null) {
            return _airplaneFill!!
        }
        _airplaneFill = Builder(name = "AirplaneFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.428f, 1.151f)
                curveTo(6.708f, 0.591f, 7.213f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(1.292f, 0.592f, 1.572f, 1.151f)
                curveTo(9.861f, 1.73f, 10.0f, 2.431f, 10.0f, 3.0f)
                verticalLineToRelative(3.691f)
                lineToRelative(5.17f, 2.585f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.83f, 1.342f)
                verticalLineTo(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.582f, 0.493f)
                lineToRelative(-5.507f, -0.918f)
                lineToRelative(-0.375f, 2.253f)
                lineToRelative(1.318f, 1.318f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 16.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.354f, -0.854f)
                lineToRelative(1.319f, -1.318f)
                lineToRelative(-0.376f, -2.253f)
                lineToRelative(-5.507f, 0.918f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.0f, 12.0f)
                verticalLineToRelative(-1.382f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.83f, -1.342f)
                lineTo(6.0f, 6.691f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.568f, 0.14f, -1.271f, 0.428f, -1.849f)
            }
        }
        .build()
        return _airplaneFill!!
    }

private var _airplaneFill: ImageVector? = null
