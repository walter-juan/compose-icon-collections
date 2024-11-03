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

public val Twbs.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 3.5f)
                curveToRelative(-0.614f, -0.884f, -0.074f, -1.962f, 0.858f, -2.5f)
                lineTo(8.0f, 7.226f)
                lineTo(11.642f, 1.0f)
                curveToRelative(0.932f, 0.538f, 1.472f, 1.616f, 0.858f, 2.5f)
                lineTo(8.81f, 8.61f)
                lineToRelative(1.556f, 2.661f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.794f, 0.637f)
                lineTo(8.0f, 9.73f)
                lineToRelative(-1.572f, 2.177f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.794f, -0.637f)
                lineTo(7.19f, 8.61f)
                close()
                moveTo(6.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                moveToRelative(7.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
