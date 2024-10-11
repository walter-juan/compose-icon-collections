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

public val DeviceGroup.DualSim2Line: ImageVector
    get() {
        if (_dualSim2Line != null) {
            return _dualSim2Line!!
        }
        _dualSim2Line = Builder(name = "DualSim2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineTo(19.707f, 6.707f)
                curveTo(19.895f, 6.895f, 20.0f, 7.149f, 20.0f, 7.414f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.552f, 19.552f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 22.0f, 4.0f, 21.552f, 4.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.448f, 4.448f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(14.171f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.829f)
                lineTo(14.171f, 4.0f)
                close()
                moveTo(12.0f, 7.5f)
                curveTo(13.657f, 7.5f, 15.0f, 8.843f, 15.0f, 10.5f)
                curveTo(15.0f, 11.384f, 14.618f, 12.179f, 14.009f, 12.728f)
                lineTo(14.001f, 12.72f)
                lineTo(14.007f, 12.729f)
                lineTo(12.595f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                lineTo(8.999f, 14.547f)
                lineTo(12.669f, 11.243f)
                curveTo(12.872f, 11.06f, 13.0f, 10.795f, 13.0f, 10.5f)
                curveTo(13.0f, 9.948f, 12.552f, 9.5f, 12.0f, 9.5f)
                curveTo(11.448f, 9.5f, 11.0f, 9.948f, 11.0f, 10.5f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 8.843f, 10.343f, 7.5f, 12.0f, 7.5f)
                close()
            }
        }
        .build()
        return _dualSim2Line!!
    }

private var _dualSim2Line: ImageVector? = null
