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

public val Twbs.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.359f, 11.238f)
                curveTo(15.06f, 9.72f, 16.0f, 8.0f, 16.0f, 8.0f)
                reflectiveCurveToRelative(-3.0f, -5.5f, -8.0f, -5.5f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -2.79f, 0.588f)
                lineToRelative(0.77f, 0.771f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 3.5f)
                curveToRelative(2.12f, 0.0f, 3.879f, 1.168f, 5.168f, 2.457f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 14.828f, 8.0f)
                quadToRelative(-0.086f, 0.13f, -0.195f, 0.288f)
                curveToRelative(-0.335f, 0.48f, -0.83f, 1.12f, -1.465f, 1.755f)
                quadToRelative(-0.247f, 0.248f, -0.517f, 0.486f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.297f, 9.176f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.474f, -4.474f)
                lineToRelative(0.823f, 0.823f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.829f, 2.829f)
                close()
                moveTo(8.354f, 10.475f)
                lineTo(9.176f, 11.297f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.474f, -4.474f)
                lineToRelative(0.823f, 0.823f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.829f, 2.829f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.35f, 5.47f)
                quadToRelative(-0.27f, 0.24f, -0.518f, 0.487f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 1.172f, 8.0f)
                lineToRelative(0.195f, 0.288f)
                curveToRelative(0.335f, 0.48f, 0.83f, 1.12f, 1.465f, 1.755f)
                curveTo(4.121f, 11.332f, 5.881f, 12.5f, 8.0f, 12.5f)
                curveToRelative(0.716f, 0.0f, 1.39f, -0.133f, 2.02f, -0.36f)
                lineToRelative(0.77f, 0.772f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 8.0f, 13.5f)
                curveTo(3.0f, 13.5f, 0.0f, 8.0f, 0.0f, 8.0f)
                reflectiveCurveToRelative(0.939f, -1.721f, 2.641f, -3.238f)
                lineToRelative(0.708f, 0.709f)
                close()
                moveTo(13.646f, 14.354f)
                lineTo(1.646f, 2.354f)
                lineTo(2.354f, 1.646f)
                lineTo(14.354f, 13.646f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
