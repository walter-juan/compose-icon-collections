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

public val Twbs.Wechat: ImageVector
    get() {
        if (_wechat != null) {
            return _wechat!!
        }
        _wechat = Builder(name = "Wechat", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.176f, 14.429f)
                curveToRelative(-2.665f, 0.0f, -4.826f, -1.8f, -4.826f, -4.018f)
                curveToRelative(0.0f, -2.22f, 2.159f, -4.02f, 4.824f, -4.02f)
                reflectiveCurveTo(16.0f, 8.191f, 16.0f, 10.411f)
                curveToRelative(0.0f, 1.21f, -0.65f, 2.301f, -1.666f, 3.036f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, -0.12f, 0.366f)
                lineToRelative(0.218f, 0.81f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.029f, 0.117f)
                arcToRelative(0.166f, 0.166f, 0.0f, false, true, -0.162f, 0.162f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.092f, -0.03f)
                lineToRelative(-1.057f, -0.61f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.256f, -0.074f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.142f, 0.021f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -1.576f, 0.22f)
                moveTo(9.064f, 9.542f)
                arcToRelative(0.647f, 0.647f, 0.0f, true, false, 0.557f, -1.0f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, false, -0.646f, 0.647f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.09f, 0.353f)
                close()
                moveTo(12.296f, 9.543f)
                arcToRelative(0.646f, 0.646f, 0.0f, true, false, 0.546f, -1.0f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, false, -0.644f, 0.644f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, 0.098f, 0.356f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.826f)
                curveToRelative(0.0f, 1.455f, 0.781f, 2.765f, 2.001f, 3.656f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, true, 0.143f, 0.439f)
                lineToRelative(-0.161f, 0.6f)
                lineToRelative(-0.1f, 0.373f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.032f, 0.14f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, false, 0.193f, 0.193f)
                quadToRelative(0.06f, 0.0f, 0.111f, -0.029f)
                lineToRelative(1.268f, -0.733f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.308f, -0.088f)
                quadToRelative(0.088f, 0.0f, 0.171f, 0.025f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 1.625f, 0.26f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.177f, -1.251f)
                curveToRelative(0.0f, -2.936f, 2.785f, -5.02f, 5.824f, -5.02f)
                lineToRelative(0.15f, 0.002f)
                curveTo(10.587f, 3.429f, 8.392f, 2.0f, 5.796f, 2.0f)
                curveTo(2.596f, 2.0f, 0.0f, 4.16f, 0.0f, 6.826f)
                moveToRelative(4.632f, -1.555f)
                arcToRelative(0.77f, 0.77f, 0.0f, true, true, -1.54f, 0.0f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, 1.54f, 0.0f)
                moveToRelative(3.875f, 0.0f)
                arcToRelative(0.77f, 0.77f, 0.0f, true, true, -1.54f, 0.0f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, 1.54f, 0.0f)
            }
        }
        .build()
        return _wechat!!
    }

private var _wechat: ImageVector? = null
