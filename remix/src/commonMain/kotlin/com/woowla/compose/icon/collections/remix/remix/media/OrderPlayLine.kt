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

public val MediaGroup.OrderPlayLine: ImageVector
    get() {
        if (_orderPlayLine != null) {
            return _orderPlayLine!!
        }
        _orderPlayLine = Builder(name = "OrderPlayLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                verticalLineTo(2.068f)
                curveTo(17.0f, 1.791f, 17.224f, 1.567f, 17.5f, 1.567f)
                curveTo(17.617f, 1.567f, 17.73f, 1.609f, 17.82f, 1.683f)
                lineTo(21.939f, 5.116f)
                curveTo(22.151f, 5.293f, 22.18f, 5.608f, 22.003f, 5.82f)
                curveTo(21.908f, 5.934f, 21.767f, 6.0f, 21.619f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(2.0f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _orderPlayLine!!
    }

private var _orderPlayLine: ImageVector? = null
