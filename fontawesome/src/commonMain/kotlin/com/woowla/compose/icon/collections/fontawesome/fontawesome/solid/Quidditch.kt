package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Quidditch: ImageVector
    get() {
        if (_quidditch != null) {
            return _quidditch!!
        }
        _quidditch = Builder(name = "Quidditch", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 544.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                close()
                moveTo(106.8f, 277.2f)
                curveToRelative(30.6f, -30.6f, 73.1f, -45.9f, 115.8f, -42.2f)
                lineTo(341.0f, 353.3f)
                curveToRelative(3.7f, 42.8f, -11.6f, 85.2f, -42.2f, 115.9f)
                curveToRelative(-27.4f, 27.4f, -64.6f, 42.8f, -103.3f, 42.8f)
                lineTo(22.1f, 512.0f)
                curveToRelative(-12.2f, 0.0f, -22.1f, -9.9f, -22.1f, -22.1f)
                curveToRelative(0.0f, -6.3f, 2.7f, -12.3f, 7.3f, -16.5f)
                lineTo(133.7f, 359.7f)
                curveToRelative(4.2f, -3.7f, -0.4f, -10.4f, -5.4f, -7.9f)
                lineTo(77.2f, 377.4f)
                curveToRelative(-6.1f, 3.0f, -13.2f, -1.4f, -13.2f, -8.2f)
                curveToRelative(0.0f, -31.5f, 12.5f, -61.8f, 34.8f, -84.0f)
                lineToRelative(8.0f, -8.0f)
                close()
                moveTo(523.8f, 7.2f)
                curveToRelative(12.6f, -10.3f, 31.1f, -9.5f, 42.8f, 2.2f)
                reflectiveCurveToRelative(12.4f, 30.2f, 2.2f, 42.8f)
                lineToRelative(-2.2f, 2.4f)
                lineToRelative(-192.0f, 192.0f)
                lineToRelative(34.8f, 34.7f)
                curveToRelative(4.2f, 4.2f, 6.6f, 10.0f, 6.6f, 16.0f)
                curveToRelative(0.0f, 12.5f, -10.1f, 22.6f, -22.6f, 22.6f)
                lineToRelative(-29.1f, 0.0f)
                lineToRelative(-108.3f, -108.3f)
                lineToRelative(0.0f, -29.1f)
                curveToRelative(0.0f, -12.5f, 10.1f, -22.6f, 22.6f, -22.6f)
                curveToRelative(6.0f, 0.0f, 11.8f, 2.4f, 16.0f, 6.6f)
                lineToRelative(34.8f, 34.7f)
                lineToRelative(192.0f, -192.0f)
                lineToRelative(2.4f, -2.2f)
                close()
            }
        }
        .build()
        return _quidditch!!
    }

private var _quidditch: ImageVector? = null
