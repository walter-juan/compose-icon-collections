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

public val DeviceGroup.InstanceFill: ImageVector
    get() {
        if (_instanceFill != null) {
            return _instanceFill!!
        }
        _instanceFill = Builder(name = "InstanceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(21.5f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(12.0f, 23.0f)
                lineTo(2.5f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(6.499f, 9.971f)
                lineTo(11.0f, 12.577f)
                verticalLineTo(17.625f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.577f)
                lineTo(17.501f, 9.971f)
                lineTo(16.499f, 8.24f)
                lineTo(12.0f, 10.845f)
                lineTo(7.501f, 8.24f)
                lineTo(6.499f, 9.971f)
                close()
            }
        }
        .build()
        return _instanceFill!!
    }

private var _instanceFill: ImageVector? = null
