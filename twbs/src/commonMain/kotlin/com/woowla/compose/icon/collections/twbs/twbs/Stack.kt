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

public val Twbs.Stack: ImageVector
    get() {
        if (_stack != null) {
            return _stack!!
        }
        _stack = Builder(name = "Stack", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.12f, 10.163f)
                lineToRelative(1.715f, 0.858f)
                curveToRelative(0.22f, 0.11f, 0.22f, 0.424f, 0.0f, 0.534f)
                lineTo(8.267f, 15.34f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.534f, 0.0f)
                lineTo(0.165f, 11.555f)
                arcToRelative(0.299f, 0.299f, 0.0f, false, true, 0.0f, -0.534f)
                lineToRelative(1.716f, -0.858f)
                lineToRelative(5.317f, 2.659f)
                curveToRelative(0.505f, 0.252f, 1.1f, 0.252f, 1.604f, 0.0f)
                lineToRelative(5.317f, -2.66f)
                close()
                moveTo(7.733f, 0.063f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.534f, 0.0f)
                lineToRelative(7.568f, 3.784f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.0f, 0.535f)
                lineTo(8.267f, 8.165f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.534f, 0.0f)
                lineTo(0.165f, 4.382f)
                arcToRelative(0.299f, 0.299f, 0.0f, false, true, 0.0f, -0.535f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.12f, 6.576f)
                lineToRelative(1.715f, 0.858f)
                curveToRelative(0.22f, 0.11f, 0.22f, 0.424f, 0.0f, 0.534f)
                lineToRelative(-7.568f, 3.784f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.534f, 0.0f)
                lineTo(0.165f, 7.968f)
                arcToRelative(0.299f, 0.299f, 0.0f, false, true, 0.0f, -0.534f)
                lineToRelative(1.716f, -0.858f)
                lineToRelative(5.317f, 2.659f)
                curveToRelative(0.505f, 0.252f, 1.1f, 0.252f, 1.604f, 0.0f)
                close()
            }
        }
        .build()
        return _stack!!
    }

private var _stack: ImageVector? = null
