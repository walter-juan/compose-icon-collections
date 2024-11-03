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

public val Twbs.Number8Square: ImageVector
    get() {
        if (_number8Square != null) {
            return _number8Square!!
        }
        _number8Square = Builder(name = "Number8Square", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.97f, 9.803f)
                curveToRelative(0.0f, 1.394f, -1.218f, 2.355f, -2.988f, 2.355f)
                curveToRelative(-1.763f, 0.0f, -2.953f, -0.955f, -2.953f, -2.344f)
                curveToRelative(0.0f, -1.271f, 0.95f, -1.851f, 1.647f, -2.003f)
                verticalLineToRelative(-0.065f)
                curveToRelative(-0.621f, -0.193f, -1.33f, -0.738f, -1.33f, -1.781f)
                curveToRelative(0.0f, -1.225f, 1.09f, -2.121f, 2.66f, -2.121f)
                reflectiveCurveToRelative(2.654f, 0.896f, 2.654f, 2.12f)
                curveToRelative(0.0f, 1.061f, -0.738f, 1.595f, -1.336f, 1.782f)
                verticalLineToRelative(0.065f)
                curveToRelative(0.703f, 0.152f, 1.647f, 0.744f, 1.647f, 1.992f)
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _number8Square!!
    }

private var _number8Square: ImageVector? = null
