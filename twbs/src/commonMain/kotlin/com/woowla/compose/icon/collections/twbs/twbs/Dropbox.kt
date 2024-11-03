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

public val Twbs.Dropbox: ImageVector
    get() {
        if (_dropbox != null) {
            return _dropbox!!
        }
        _dropbox = Builder(name = "Dropbox", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.01f, 4.555f)
                lineTo(4.005f, 7.11f)
                lineTo(8.01f, 9.665f)
                lineTo(4.005f, 12.22f)
                lineTo(0.0f, 9.651f)
                lineToRelative(4.005f, -2.555f)
                lineTo(0.0f, 4.555f)
                lineTo(4.005f, 2.0f)
                close()
                moveTo(3.984f, 13.042f)
                lineTo(7.99f, 10.487f)
                lineTo(11.995f, 13.042f)
                lineTo(7.99f, 15.597f)
                close()
                moveTo(8.01f, 9.652f)
                lineTo(12.015f, 7.096f)
                lineTo(8.01f, 4.555f)
                lineTo(11.995f, 2.0f)
                lineTo(16.0f, 4.555f)
                lineTo(11.995f, 7.11f)
                lineTo(16.0f, 9.665f)
                lineToRelative(-4.005f, 2.555f)
                close()
            }
        }
        .build()
        return _dropbox!!
    }

private var _dropbox: ImageVector? = null
