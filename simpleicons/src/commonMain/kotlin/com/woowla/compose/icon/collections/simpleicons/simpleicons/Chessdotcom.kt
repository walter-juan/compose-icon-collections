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

public val Simpleicons.Chessdotcom: ImageVector
    get() {
        if (_chessdotcom != null) {
            return _chessdotcom!!
        }
        _chessdotcom = Builder(name = "Chessdotcom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, false, -3.875f, 3.846f)
                arcTo(3.84f, 3.84f, 0.0f, false, false, 9.73f, 6.969f)
                lineToRelative(-2.79f, 1.85f)
                curveToRelative(0.0f, 0.622f, 0.144f, 1.114f, 0.434f, 1.649f)
                horizontalLineTo(9.83f)
                curveToRelative(-0.014f, 0.245f, -0.014f, 0.549f, -0.014f, 0.925f)
                curveToRelative(0.0f, 0.025f, 0.003f, 0.048f, 0.006f, 0.071f)
                curveToRelative(-0.064f, 1.353f, -0.507f, 3.472f, -3.62f, 5.842f)
                curveToRelative(-0.816f, 0.625f, -1.423f, 1.495f, -1.806f, 2.533f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.045f, 0.084f)
                arcToRelative(8.124f, 8.124f, 0.0f, false, false, -0.39f, 2.516f)
                curveToRelative(0.0f, 0.1f, 0.216f, 1.561f, 8.038f, 1.561f)
                reflectiveCurveToRelative(8.038f, -1.46f, 8.038f, -1.561f)
                curveToRelative(0.0f, -2.227f, -0.824f, -4.048f, -2.24f, -5.133f)
                curveToRelative(-4.034f, -3.08f, -3.586f, -5.74f, -3.644f, -6.838f)
                horizontalLineToRelative(2.458f)
                curveToRelative(0.29f, -0.535f, 0.434f, -1.027f, 0.434f, -1.649f)
                lineToRelative(-2.79f, -1.836f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, 1.604f, -3.123f)
                arcTo(3.873f, 3.873f, 0.0f, false, false, 13.445f, 0.275f)
                curveToRelative(-0.004f, -0.002f, -0.01f, 0.004f, -0.015f, 0.004f)
                arcTo(3.76f, 3.76f, 0.0f, false, false, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chessdotcom!!
    }

private var _chessdotcom: ImageVector? = null
