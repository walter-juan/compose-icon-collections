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

public val SystemGroup.Forbid2Fill: ImageVector
    get() {
        if (_forbid2Fill != null) {
            return _forbid2Fill!!
        }
        _forbid2Fill = Builder(name = "Forbid2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(16.891f, 8.523f)
                curveTo(16.7f, 8.255f, 16.484f, 7.998f, 16.243f, 7.757f)
                curveTo(16.002f, 7.516f, 15.745f, 7.3f, 15.477f, 7.109f)
                lineTo(7.109f, 15.477f)
                curveTo(7.3f, 15.745f, 7.516f, 16.002f, 7.757f, 16.243f)
                curveTo(7.998f, 16.484f, 8.255f, 16.7f, 8.523f, 16.891f)
                lineTo(16.891f, 8.523f)
                close()
            }
        }
        .build()
        return _forbid2Fill!!
    }

private var _forbid2Fill: ImageVector? = null