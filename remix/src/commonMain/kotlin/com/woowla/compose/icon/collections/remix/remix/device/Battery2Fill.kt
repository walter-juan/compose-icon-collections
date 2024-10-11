package com.woowla.compose.icon.collections.remix.remix.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DeviceGroup

public val DeviceGroup.Battery2Fill: ImageVector
    get() {
        if (_battery2Fill != null) {
            return _battery2Fill!!
        }
        _battery2Fill = Builder(name = "Battery2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 2.448f, 9.448f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 2.0f, 15.0f, 2.448f, 15.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 4.0f, 19.0f, 4.448f, 19.0f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.552f, 18.552f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 22.0f, 5.0f, 21.552f, 5.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.448f, 5.448f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _battery2Fill!!
    }

private var _battery2Fill: ImageVector? = null
