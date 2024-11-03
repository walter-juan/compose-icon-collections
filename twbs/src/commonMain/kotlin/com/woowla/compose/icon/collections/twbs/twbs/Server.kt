package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Server: ImageVector
    get() {
        if (_server != null) {
            return _server!!
        }
        _server = Builder(name = "Server", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.333f, 2.667f)
                curveTo(1.333f, 1.194f, 4.318f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.667f, 1.194f, 6.667f, 2.667f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, 1.473f, -2.985f, 2.667f, -6.667f, 2.667f)
                reflectiveCurveTo(1.333f, 5.473f, 1.333f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.333f, 6.334f)
                verticalLineToRelative(3.0f)
                curveTo(1.333f, 10.805f, 4.318f, 12.0f, 8.0f, 12.0f)
                reflectiveCurveToRelative(6.667f, -1.194f, 6.667f, -2.667f)
                verticalLineTo(6.334f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -1.458f, 0.79f)
                curveTo(11.81f, 7.684f, 9.967f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.809f, -0.317f, -5.208f, -0.876f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -1.458f, -0.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.667f, 11.668f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -1.458f, 0.789f)
                curveToRelative(-1.4f, 0.56f, -3.242f, 0.876f, -5.21f, 0.876f)
                curveToRelative(-1.966f, 0.0f, -3.809f, -0.316f, -5.208f, -0.876f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -1.458f, -0.79f)
                verticalLineToRelative(1.666f)
                curveTo(1.333f, 14.806f, 4.318f, 16.0f, 8.0f, 16.0f)
                reflectiveCurveToRelative(6.667f, -1.194f, 6.667f, -2.667f)
                close()
            }
        }
        .build()
        return _server!!
    }

private var _server: ImageVector? = null
