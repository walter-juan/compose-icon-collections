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

public val Twbs.Number3Circle: ImageVector
    get() {
        if (_number3Circle != null) {
            return _number3Circle!!
        }
        _number3Circle = Builder(name = "Number3Circle", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.918f, 8.414f)
                horizontalLineToRelative(-0.879f)
                verticalLineTo(7.342f)
                horizontalLineToRelative(0.838f)
                curveToRelative(0.78f, 0.0f, 1.348f, -0.522f, 1.342f, -1.237f)
                curveToRelative(0.0f, -0.709f, -0.563f, -1.195f, -1.348f, -1.195f)
                curveToRelative(-0.79f, 0.0f, -1.312f, 0.498f, -1.348f, 1.055f)
                horizontalLineTo(5.275f)
                curveToRelative(0.036f, -1.137f, 0.95f, -2.115f, 2.625f, -2.121f)
                curveToRelative(1.594f, -0.012f, 2.608f, 0.885f, 2.637f, 2.062f)
                curveToRelative(0.023f, 1.137f, -0.885f, 1.776f, -1.482f, 1.875f)
                verticalLineToRelative(0.07f)
                curveToRelative(0.703f, 0.07f, 1.71f, 0.64f, 1.734f, 1.917f)
                curveToRelative(0.024f, 1.459f, -1.277f, 2.396f, -2.93f, 2.396f)
                curveToRelative(-1.705f, 0.0f, -2.707f, -0.967f, -2.754f, -2.144f)
                horizontalLineTo(6.33f)
                curveToRelative(0.059f, 0.597f, 0.68f, 1.06f, 1.541f, 1.066f)
                curveToRelative(0.973f, 0.006f, 1.6f, -0.563f, 1.588f, -1.354f)
                curveToRelative(-0.006f, -0.779f, -0.621f, -1.318f, -1.541f, -1.318f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 8.0f)
            }
        }
        .build()
        return _number3Circle!!
    }

private var _number3Circle: ImageVector? = null
