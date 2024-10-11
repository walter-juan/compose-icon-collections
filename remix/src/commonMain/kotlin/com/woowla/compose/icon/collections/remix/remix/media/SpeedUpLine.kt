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

public val MediaGroup.SpeedUpLine: ImageVector
    get() {
        if (_speedUpLine != null) {
            return _speedUpLine!!
        }
        _speedUpLine = Builder(name = "SpeedUpLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                curveTo(20.0f, 15.209f, 19.105f, 17.209f, 17.657f, 18.657f)
                lineTo(19.071f, 20.071f)
                curveTo(20.881f, 18.261f, 22.0f, 15.761f, 22.0f, 13.0f)
                curveTo(22.0f, 7.477f, 17.523f, 3.0f, 12.0f, 3.0f)
                curveTo(6.477f, 3.0f, 2.0f, 7.477f, 2.0f, 13.0f)
                curveTo(2.0f, 15.761f, 3.119f, 18.261f, 4.929f, 20.071f)
                lineTo(6.343f, 18.657f)
                curveTo(4.895f, 17.209f, 4.0f, 15.209f, 4.0f, 13.0f)
                curveTo(4.0f, 8.582f, 7.582f, 5.0f, 12.0f, 5.0f)
                curveTo(16.418f, 5.0f, 20.0f, 8.582f, 20.0f, 13.0f)
                close()
                moveTo(15.293f, 8.293f)
                lineTo(10.793f, 12.793f)
                lineTo(12.207f, 14.207f)
                lineTo(16.707f, 9.707f)
                lineTo(15.293f, 8.293f)
                close()
            }
        }
        .build()
        return _speedUpLine!!
    }

private var _speedUpLine: ImageVector? = null
