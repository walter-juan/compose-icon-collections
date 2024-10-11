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

public val DeviceGroup.GpsFill: ImageVector
    get() {
        if (_gpsFill != null) {
            return _gpsFill!!
        }
        _gpsFill = Builder(name = "GpsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 16.0f)
                close()
                moveTo(9.373f, 16.255f)
                curveTo(7.949f, 15.374f, 7.0f, 13.798f, 7.0f, 12.0f)
                curveTo(7.0f, 9.239f, 9.239f, 7.0f, 12.0f, 7.0f)
                curveTo(14.761f, 7.0f, 17.0f, 9.239f, 17.0f, 12.0f)
                curveTo(17.0f, 13.798f, 16.051f, 15.374f, 14.627f, 16.255f)
                lineTo(13.272f, 13.544f)
                curveTo(13.717f, 13.177f, 14.0f, 12.622f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 13.105f, 10.0f, 12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 10.895f, 10.0f, 12.0f)
                curveTo(10.0f, 12.622f, 10.283f, 13.177f, 10.728f, 13.544f)
                lineTo(9.373f, 16.255f)
                close()
                moveTo(7.132f, 20.737f)
                curveTo(4.07f, 19.027f, 2.0f, 15.755f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 15.755f, 19.93f, 19.027f, 16.868f, 20.737f)
                lineTo(15.525f, 18.049f)
                curveTo(17.603f, 16.835f, 19.0f, 14.581f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 14.581f, 6.397f, 16.835f, 8.475f, 18.049f)
                lineTo(7.132f, 20.737f)
                close()
            }
        }
        .build()
        return _gpsFill!!
    }

private var _gpsFill: ImageVector? = null
