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

public val Twbs.Number5Circle: ImageVector
    get() {
        if (_number5Circle != null) {
            return _number5Circle!!
        }
        _number5Circle = Builder(name = "Number5Circle", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 1.0f, 8.0f)
                moveToRelative(15.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                moveToRelative(-8.006f, 4.158f)
                curveToRelative(-1.57f, 0.0f, -2.654f, -0.902f, -2.719f, -2.115f)
                horizontalLineToRelative(1.237f)
                curveToRelative(0.14f, 0.72f, 0.832f, 1.031f, 1.529f, 1.031f)
                curveToRelative(0.791f, 0.0f, 1.57f, -0.597f, 1.57f, -1.681f)
                curveToRelative(0.0f, -0.967f, -0.732f, -1.57f, -1.582f, -1.57f)
                curveToRelative(-0.767f, 0.0f, -1.242f, 0.45f, -1.435f, 0.808f)
                horizontalLineTo(5.445f)
                lineTo(5.791f, 4.0f)
                horizontalLineToRelative(4.705f)
                verticalLineToRelative(1.103f)
                horizontalLineTo(6.875f)
                lineToRelative(-0.193f, 2.343f)
                horizontalLineToRelative(0.064f)
                curveToRelative(0.17f, -0.258f, 0.715f, -0.68f, 1.611f, -0.68f)
                curveToRelative(1.383f, 0.0f, 2.561f, 0.944f, 2.561f, 2.585f)
                curveToRelative(0.0f, 1.687f, -1.184f, 2.806f, -2.924f, 2.806f)
                close()
            }
        }
        .build()
        return _number5Circle!!
    }

private var _number5Circle: ImageVector? = null
