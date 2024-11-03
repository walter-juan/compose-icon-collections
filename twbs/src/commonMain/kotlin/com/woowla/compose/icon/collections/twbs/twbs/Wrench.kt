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

public val Twbs.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.102f, 2.223f)
                arcTo(3.004f, 3.004f, 0.0f, false, false, 3.78f, 5.897f)
                lineToRelative(6.341f, 6.252f)
                arcTo(3.003f, 3.003f, 0.0f, false, false, 13.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -0.851f, -5.878f)
                lineTo(5.897f, 3.781f)
                arcTo(3.004f, 3.004f, 0.0f, false, false, 2.223f, 0.1f)
                lineToRelative(2.141f, 2.142f)
                lineTo(4.0f, 4.0f)
                lineToRelative(-1.757f, 0.364f)
                close()
                moveTo(13.472f, 11.242f)
                lineTo(14.0f, 11.268f)
                lineTo(14.287f, 11.713f)
                lineTo(14.732f, 12.0f)
                lineTo(14.758f, 12.529f)
                lineTo(15.0f, 13.0f)
                lineToRelative(-0.242f, 0.471f)
                lineToRelative(-0.026f, 0.529f)
                lineToRelative(-0.445f, 0.287f)
                lineToRelative(-0.287f, 0.445f)
                lineToRelative(-0.529f, 0.026f)
                lineTo(13.0f, 15.0f)
                lineToRelative(-0.471f, -0.242f)
                lineToRelative(-0.529f, -0.026f)
                lineToRelative(-0.287f, -0.445f)
                lineToRelative(-0.445f, -0.287f)
                lineToRelative(-0.026f, -0.529f)
                lineTo(11.0f, 13.0f)
                lineToRelative(0.242f, -0.471f)
                lineToRelative(0.026f, -0.529f)
                lineToRelative(0.445f, -0.287f)
                lineToRelative(0.287f, -0.445f)
                lineToRelative(0.529f, -0.026f)
                lineTo(13.0f, 11.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
