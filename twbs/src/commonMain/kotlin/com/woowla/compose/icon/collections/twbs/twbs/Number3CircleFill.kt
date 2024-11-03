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

public val Twbs.Number3CircleFill: ImageVector
    get() {
        if (_number3CircleFill != null) {
            return _number3CircleFill!!
        }
        _number3CircleFill = Builder(name = "Number3CircleFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-8.082f, 0.414f)
                curveToRelative(0.92f, 0.0f, 1.535f, 0.54f, 1.541f, 1.318f)
                curveToRelative(0.012f, 0.791f, -0.615f, 1.36f, -1.588f, 1.354f)
                curveToRelative(-0.861f, -0.006f, -1.482f, -0.469f, -1.54f, -1.066f)
                horizontalLineTo(5.104f)
                curveToRelative(0.047f, 1.177f, 1.05f, 2.144f, 2.754f, 2.144f)
                curveToRelative(1.653f, 0.0f, 2.954f, -0.937f, 2.93f, -2.396f)
                curveToRelative(-0.023f, -1.278f, -1.031f, -1.846f, -1.734f, -1.916f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.597f, -0.1f, 1.505f, -0.739f, 1.482f, -1.876f)
                curveToRelative(-0.03f, -1.177f, -1.043f, -2.074f, -2.637f, -2.062f)
                curveToRelative(-1.675f, 0.006f, -2.59f, 0.984f, -2.625f, 2.12f)
                horizontalLineToRelative(1.248f)
                curveToRelative(0.036f, -0.556f, 0.557f, -1.054f, 1.348f, -1.054f)
                curveToRelative(0.785f, 0.0f, 1.348f, 0.486f, 1.348f, 1.195f)
                curveToRelative(0.006f, 0.715f, -0.563f, 1.237f, -1.342f, 1.237f)
                horizontalLineToRelative(-0.838f)
                verticalLineToRelative(1.072f)
                horizontalLineToRelative(0.879f)
                close()
            }
        }
        .build()
        return _number3CircleFill!!
    }

private var _number3CircleFill: ImageVector? = null
