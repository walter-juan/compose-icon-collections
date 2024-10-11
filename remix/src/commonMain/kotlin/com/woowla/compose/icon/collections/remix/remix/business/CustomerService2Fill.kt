package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.CustomerService2Fill: ImageVector
    get() {
        if (_customerService2Fill != null) {
            return _customerService2Fill!!
        }
        _customerService2Fill = Builder(name = "CustomerService2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                curveTo(22.105f, 8.0f, 23.0f, 8.895f, 23.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 15.105f, 22.105f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(19.938f)
                curveTo(19.446f, 19.946f, 16.08f, 23.0f, 12.0f, 23.0f)
                verticalLineTo(21.0f)
                curveTo(15.314f, 21.0f, 18.0f, 18.314f, 18.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 5.686f, 15.314f, 3.0f, 12.0f, 3.0f)
                curveTo(8.686f, 3.0f, 6.0f, 5.686f, 6.0f, 9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                curveTo(1.895f, 16.0f, 1.0f, 15.105f, 1.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 8.895f, 1.895f, 8.0f, 3.0f, 8.0f)
                horizontalLineTo(4.062f)
                curveTo(4.554f, 4.054f, 7.92f, 1.0f, 12.0f, 1.0f)
                curveTo(16.08f, 1.0f, 19.446f, 4.054f, 19.938f, 8.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(7.759f, 15.785f)
                lineTo(8.82f, 14.089f)
                curveTo(9.742f, 14.666f, 10.832f, 15.0f, 12.0f, 15.0f)
                curveTo(13.168f, 15.0f, 14.258f, 14.666f, 15.18f, 14.089f)
                lineTo(16.241f, 15.785f)
                curveTo(15.011f, 16.555f, 13.558f, 17.0f, 12.0f, 17.0f)
                curveTo(10.442f, 17.0f, 8.989f, 16.555f, 7.759f, 15.785f)
                close()
            }
        }
        .build()
        return _customerService2Fill!!
    }

private var _customerService2Fill: ImageVector? = null
