package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.ProhibitedLine: ImageVector
    get() {
        if (_prohibitedLine != null) {
            return _prohibitedLine!!
        }
        _prohibitedLine = Builder(name = "ProhibitedLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.094f, 5.68f)
                lineTo(18.32f, 16.906f)
                curveTo(19.374f, 15.551f, 20.0f, 13.849f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(10.151f, 4.0f, 8.449f, 4.626f, 7.094f, 5.68f)
                close()
                moveTo(16.906f, 18.32f)
                lineTo(5.68f, 7.094f)
                curveTo(4.626f, 8.449f, 4.0f, 10.151f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(13.849f, 20.0f, 15.551f, 19.374f, 16.906f, 18.32f)
                close()
                moveTo(4.929f, 4.929f)
                curveTo(6.737f, 3.12f, 9.239f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 14.761f, 20.88f, 17.263f, 19.071f, 19.071f)
                curveTo(17.263f, 20.88f, 14.761f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 9.239f, 3.12f, 6.737f, 4.929f, 4.929f)
                close()
            }
        }
        .build()
        return _prohibitedLine!!
    }

private var _prohibitedLine: ImageVector? = null
