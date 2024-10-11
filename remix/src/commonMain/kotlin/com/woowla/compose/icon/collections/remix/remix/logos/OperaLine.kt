package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.OperaLine: ImageVector
    get() {
        if (_operaLine != null) {
            return _operaLine!!
        }
        _operaLine = Builder(name = "OperaLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.767f, 19.509f)
                curveTo(17.822f, 18.383f, 20.001f, 15.446f, 20.001f, 12.0f)
                curveTo(20.001f, 8.554f, 17.822f, 5.617f, 14.767f, 4.491f)
                curveTo(16.712f, 5.976f, 18.001f, 8.934f, 18.001f, 12.0f)
                curveTo(18.001f, 15.066f, 16.712f, 18.024f, 14.767f, 19.509f)
                close()
                moveTo(9.235f, 4.491f)
                curveTo(6.18f, 5.617f, 4.001f, 8.554f, 4.001f, 12.0f)
                curveTo(4.001f, 15.446f, 6.18f, 18.383f, 9.235f, 19.509f)
                curveTo(7.29f, 18.024f, 6.001f, 15.066f, 6.001f, 12.0f)
                curveTo(6.001f, 8.934f, 7.29f, 5.976f, 9.235f, 4.491f)
                close()
                moveTo(12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                close()
                moveTo(12.001f, 18.5f)
                curveTo(14.001f, 18.5f, 16.001f, 15.467f, 16.001f, 12.0f)
                curveTo(16.001f, 8.533f, 14.001f, 5.5f, 12.001f, 5.5f)
                curveTo(10.001f, 5.5f, 8.001f, 8.533f, 8.001f, 12.0f)
                curveTo(8.001f, 15.467f, 10.001f, 18.5f, 12.001f, 18.5f)
                close()
            }
        }
        .build()
        return _operaLine!!
    }

private var _operaLine: ImageVector? = null
