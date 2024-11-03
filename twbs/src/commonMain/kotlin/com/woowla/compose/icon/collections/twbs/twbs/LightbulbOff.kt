package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.LightbulbOff: ImageVector
    get() {
        if (_lightbulbOff != null) {
            return _lightbulbOff!!
        }
        _lightbulbOff = Builder(name = "LightbulbOff", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.23f, 4.35f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 6.0f)
                curveToRelative(0.0f, 1.691f, 0.7f, 3.22f, 1.826f, 4.31f)
                curveToRelative(0.203f, 0.196f, 0.359f, 0.4f, 0.453f, 0.619f)
                lineToRelative(0.762f, 1.769f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 5.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineToRelative(0.224f, 0.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, 0.553f)
                horizontalLineToRelative(2.764f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, -0.553f)
                lineTo(10.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.288f, -0.091f)
                lineTo(9.878f, 12.0f)
                lineTo(5.83f, 12.0f)
                lineToRelative(-0.632f, -1.467f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.676f, -0.941f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, -1.455f, -4.405f)
                close()
                moveTo(3.818f, 1.697f)
                lineTo(4.526f, 2.404f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.07f, 7.07f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.484f, -8.484f)
                close()
                moveTo(1.646f, 1.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(12.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineToRelative(-12.0f, -12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
            }
        }
        .build()
        return _lightbulbOff!!
    }

private var _lightbulbOff: ImageVector? = null
