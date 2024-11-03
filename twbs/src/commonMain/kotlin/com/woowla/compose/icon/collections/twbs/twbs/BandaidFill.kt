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

public val Twbs.BandaidFill: ImageVector
    get() {
        if (_bandaidFill != null) {
            return _bandaidFill!!
        }
        _bandaidFill = Builder(name = "BandaidFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.68f, 7.676f)
                lineToRelative(6.49f, -6.504f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.653f)
                lineToRelative(-1.477f, 1.529f)
                lineToRelative(-5.006f, 5.006f)
                lineToRelative(-1.523f, 1.472f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.653f, -5.66f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(1.505f, -1.492f)
                lineToRelative(0.001f, -0.002f)
                close()
                moveTo(8.39f, 4.818f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, -0.707f)
                close()
                moveTo(6.974f, 6.939f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.707f)
                moveTo(5.56f, 8.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.708f)
                moveToRelative(2.828f, 2.828f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.707f)
                moveToRelative(1.414f, -2.121f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, -0.707f)
                moveToRelative(1.414f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.706f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.708f)
                close()
                moveTo(6.974f, 9.061f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, -0.707f)
                moveToRelative(1.414f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.708f)
                moveToRelative(1.414f, -2.122f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, -0.707f)
                moveTo(8.646f, 3.354f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-4.0f, -4.0f)
                close()
                moveTo(7.354f, 12.646f)
                lineTo(3.354f, 8.646f)
                lineTo(2.646f, 9.354f)
                lineTo(6.646f, 13.354f)
                close()
            }
        }
        .build()
        return _bandaidFill!!
    }

private var _bandaidFill: ImageVector? = null
