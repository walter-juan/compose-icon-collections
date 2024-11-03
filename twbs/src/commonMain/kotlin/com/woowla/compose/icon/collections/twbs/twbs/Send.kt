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

public val Twbs.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.854f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.11f, 0.54f)
                lineToRelative(-5.819f, 14.547f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.329f, 0.124f)
                lineToRelative(-3.178f, -4.995f)
                lineTo(0.643f, 7.184f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.124f, -1.33f)
                lineTo(15.314f, 0.037f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.54f, 0.11f)
                close()
                moveTo(6.636f, 10.07f)
                lineToRelative(2.761f, 4.338f)
                lineTo(14.13f, 2.576f)
                close()
                moveTo(13.423f, 1.869f)
                lineTo(1.591f, 6.602f)
                lineToRelative(4.339f, 2.76f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
