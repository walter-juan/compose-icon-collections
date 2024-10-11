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

public val DeviceGroup.AirplayFill: ImageVector
    get() {
        if (_airplayFill != null) {
            return _airplayFill!!
        }
        _airplayFill = Builder(name = "AirplayFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4f, 13.533f)
                lineTo(17.4f, 20.2f)
                curveTo(17.566f, 20.421f, 17.521f, 20.734f, 17.3f, 20.9f)
                curveTo(17.213f, 20.965f, 17.108f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(6.724f, 21.0f, 6.5f, 20.776f, 6.5f, 20.5f)
                curveTo(6.5f, 20.392f, 6.535f, 20.287f, 6.6f, 20.2f)
                lineTo(11.6f, 13.533f)
                curveTo(11.766f, 13.312f, 12.079f, 13.268f, 12.3f, 13.433f)
                curveTo(12.338f, 13.462f, 12.372f, 13.495f, 12.4f, 13.533f)
                close()
                moveTo(18.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 19.0f, 2.0f, 18.555f, 2.0f, 17.999f)
                verticalLineTo(4.001f)
                curveTo(2.0f, 3.448f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 4.001f)
                verticalLineTo(17.999f)
                curveTo(22.0f, 18.552f, 21.545f, 19.0f, 21.008f, 19.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _airplayFill!!
    }

private var _airplayFill: ImageVector? = null
