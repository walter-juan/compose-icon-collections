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

public val Twbs.Moisture: ImageVector
    get() {
        if (_moisture != null) {
            return _moisture!!
        }
        _moisture = Builder(name = "Moisture", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(15.0f, 1.0f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                lineTo(15.0f, 7.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(15.0f, 8.5f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                lineTo(15.0f, 15.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(16.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(7.0f, 1.5f)
                lineToRelative(0.364f, -0.343f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.728f, 0.0f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.006f, 0.007f)
                lineToRelative(-0.022f, 0.023f)
                lineToRelative(-0.08f, 0.088f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, -1.274f, 1.517f)
                curveToRelative(-0.769f, 0.983f, -1.714f, 2.325f, -2.385f, 3.727f)
                curveTo(2.368f, 7.564f, 2.0f, 8.682f, 2.0f, 9.733f)
                curveTo(2.0f, 12.614f, 4.212f, 15.0f, 7.0f, 15.0f)
                reflectiveCurveToRelative(5.0f, -2.386f, 5.0f, -5.267f)
                curveToRelative(0.0f, -1.05f, -0.368f, -2.169f, -0.867f, -3.212f)
                curveToRelative(-0.671f, -1.402f, -1.616f, -2.744f, -2.385f, -3.727f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, false, -1.354f, -1.605f)
                lineToRelative(-0.022f, -0.023f)
                lineToRelative(-0.006f, -0.007f)
                lineToRelative(-0.002f, -0.001f)
                close()
                moveTo(7.0f, 1.5f)
                lineTo(6.636f, 1.157f)
                close()
                moveTo(6.984f, 2.266f)
                lineTo(7.0f, 2.247f)
                lineToRelative(0.016f, 0.019f)
                curveToRelative(0.24f, 0.274f, 0.572f, 0.667f, 0.944f, 1.144f)
                curveToRelative(0.611f, 0.781f, 1.32f, 1.776f, 1.901f, 2.827f)
                lineTo(4.14f, 6.237f)
                curveToRelative(0.58f, -1.051f, 1.29f, -2.046f, 1.9f, -2.827f)
                curveToRelative(0.373f, -0.477f, 0.706f, -0.87f, 0.945f, -1.144f)
                close()
                moveTo(3.0f, 9.733f)
                curveToRelative(0.0f, -0.755f, 0.244f, -1.612f, 0.638f, -2.496f)
                horizontalLineToRelative(6.724f)
                curveToRelative(0.395f, 0.884f, 0.638f, 1.741f, 0.638f, 2.496f)
                curveTo(11.0f, 12.117f, 9.182f, 14.0f, 7.0f, 14.0f)
                reflectiveCurveToRelative(-4.0f, -1.883f, -4.0f, -4.267f)
            }
        }
        .build()
        return _moisture!!
    }

private var _moisture: ImageVector? = null
