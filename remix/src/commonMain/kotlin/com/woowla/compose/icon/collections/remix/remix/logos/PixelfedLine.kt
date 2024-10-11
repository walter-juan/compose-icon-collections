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

public val LogosGroup.PixelfedLine: ImageVector
    get() {
        if (_pixelfedLine != null) {
            return _pixelfedLine!!
        }
        _pixelfedLine = Builder(name = "PixelfedLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(12.001f, 4.0f)
                curveTo(7.583f, 4.0f, 4.001f, 7.582f, 4.001f, 12.0f)
                curveTo(4.001f, 16.418f, 7.583f, 20.0f, 12.001f, 20.0f)
                curveTo(16.419f, 20.0f, 20.001f, 16.418f, 20.001f, 12.0f)
                curveTo(20.001f, 7.582f, 16.419f, 4.0f, 12.001f, 4.0f)
                close()
                moveTo(13.032f, 8.099f)
                curveTo(14.745f, 8.099f, 16.133f, 9.444f, 16.133f, 11.104f)
                curveTo(16.133f, 12.764f, 14.745f, 14.109f, 13.032f, 14.109f)
                horizontalLineTo(11.214f)
                lineTo(8.619f, 16.58f)
                verticalLineTo(9.832f)
                curveTo(8.619f, 8.875f, 9.42f, 8.099f, 10.408f, 8.099f)
                horizontalLineTo(13.032f)
                close()
            }
        }
        .build()
        return _pixelfedLine!!
    }

private var _pixelfedLine: ImageVector? = null
