package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.SlowDownFill: ImageVector
    get() {
        if (_slowDownFill != null) {
            return _slowDownFill!!
        }
        _slowDownFill = Builder(name = "SlowDownFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.0f)
                curveTo(4.0f, 15.209f, 4.895f, 17.209f, 6.343f, 18.657f)
                lineTo(4.929f, 20.071f)
                curveTo(3.119f, 18.261f, 2.0f, 15.761f, 2.0f, 13.0f)
                curveTo(2.0f, 7.477f, 6.477f, 3.0f, 12.0f, 3.0f)
                curveTo(17.523f, 3.0f, 22.0f, 7.477f, 22.0f, 13.0f)
                curveTo(22.0f, 15.761f, 20.881f, 18.261f, 19.071f, 20.071f)
                lineTo(17.657f, 18.657f)
                curveTo(19.105f, 17.209f, 20.0f, 15.209f, 20.0f, 13.0f)
                curveTo(20.0f, 8.582f, 16.418f, 5.0f, 12.0f, 5.0f)
                curveTo(7.582f, 5.0f, 4.0f, 8.582f, 4.0f, 13.0f)
                close()
                moveTo(8.707f, 8.293f)
                lineTo(13.5f, 12.5f)
                lineTo(11.5f, 14.5f)
                lineTo(7.293f, 9.707f)
                lineTo(8.707f, 8.293f)
                close()
            }
        }
        .build()
        return _slowDownFill!!
    }

private var _slowDownFill: ImageVector? = null
