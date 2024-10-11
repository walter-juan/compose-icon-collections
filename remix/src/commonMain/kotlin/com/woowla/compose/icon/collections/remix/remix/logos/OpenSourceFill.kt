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

public val LogosGroup.OpenSourceFill: ImageVector
    get() {
        if (_openSourceFill != null) {
            return _openSourceFill!!
        }
        _openSourceFill = Builder(name = "OpenSourceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 16.13f, 19.497f, 19.676f, 15.924f, 21.201f)
                lineTo(13.406f, 14.651f)
                curveTo(14.355f, 14.148f, 15.001f, 13.149f, 15.001f, 12.0f)
                curveTo(15.001f, 10.343f, 13.658f, 9.0f, 12.001f, 9.0f)
                curveTo(10.344f, 9.0f, 9.001f, 10.343f, 9.001f, 12.0f)
                curveTo(9.001f, 13.15f, 9.648f, 14.148f, 10.597f, 14.652f)
                lineTo(8.079f, 21.201f)
                curveTo(4.505f, 19.676f, 2.001f, 16.131f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                close()
            }
        }
        .build()
        return _openSourceFill!!
    }

private var _openSourceFill: ImageVector? = null
