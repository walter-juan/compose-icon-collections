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

public val Twbs.Number8CircleFill: ImageVector
    get() {
        if (_number8CircleFill != null) {
            return _number8CircleFill!!
        }
        _number8CircleFill = Builder(name = "Number8CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-5.03f, 1.803f)
                curveToRelative(0.0f, -1.248f, -0.943f, -1.84f, -1.646f, -1.992f)
                verticalLineToRelative(-0.065f)
                curveToRelative(0.598f, -0.187f, 1.336f, -0.72f, 1.336f, -1.781f)
                curveToRelative(0.0f, -1.225f, -1.084f, -2.121f, -2.654f, -2.121f)
                reflectiveCurveToRelative(-2.66f, 0.896f, -2.66f, 2.12f)
                curveToRelative(0.0f, 1.044f, 0.709f, 1.589f, 1.33f, 1.782f)
                verticalLineToRelative(0.065f)
                curveToRelative(-0.697f, 0.152f, -1.647f, 0.732f, -1.647f, 2.003f)
                curveToRelative(0.0f, 1.39f, 1.19f, 2.344f, 2.953f, 2.344f)
                curveToRelative(1.77f, 0.0f, 2.989f, -0.96f, 2.989f, -2.355f)
                close()
                moveTo(6.623f, 6.093f)
                curveToRelative(0.0f, 0.739f, 0.586f, 1.255f, 1.383f, 1.255f)
                reflectiveCurveToRelative(1.377f, -0.516f, 1.377f, -1.254f)
                curveToRelative(0.0f, -0.733f, -0.58f, -1.23f, -1.377f, -1.23f)
                reflectiveCurveToRelative(-1.383f, 0.497f, -1.383f, 1.23f)
                close()
                moveTo(6.342f, 9.738f)
                curveToRelative(0.0f, 0.838f, 0.72f, 1.412f, 1.664f, 1.412f)
                curveToRelative(0.943f, 0.0f, 1.658f, -0.574f, 1.658f, -1.412f)
                curveToRelative(0.0f, -0.843f, -0.715f, -1.424f, -1.658f, -1.424f)
                curveToRelative(-0.944f, 0.0f, -1.664f, 0.58f, -1.664f, 1.424f)
            }
        }
        .build()
        return _number8CircleFill!!
    }

private var _number8CircleFill: ImageVector? = null
