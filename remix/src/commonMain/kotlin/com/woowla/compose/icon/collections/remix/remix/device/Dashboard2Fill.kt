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

public val DeviceGroup.Dashboard2Fill: ImageVector
    get() {
        if (_dashboard2Fill != null) {
            return _dashboard2Fill!!
        }
        _dashboard2Fill = Builder(name = "Dashboard2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 13.852f, 5.72f, 15.537f, 6.894f, 16.789f)
                lineTo(7.05f, 16.95f)
                lineTo(8.464f, 15.535f)
                curveTo(7.56f, 14.631f, 7.0f, 13.381f, 7.0f, 12.0f)
                curveTo(7.0f, 9.239f, 9.239f, 7.0f, 12.0f, 7.0f)
                curveTo(12.448f, 7.0f, 12.882f, 7.059f, 13.295f, 7.169f)
                lineTo(14.858f, 5.608f)
                curveTo(13.985f, 5.217f, 13.018f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(18.392f, 9.143f)
                lineTo(16.831f, 10.705f)
                curveTo(16.941f, 11.118f, 17.0f, 11.552f, 17.0f, 12.0f)
                curveTo(17.0f, 13.381f, 16.44f, 14.631f, 15.535f, 15.535f)
                lineTo(16.95f, 16.95f)
                curveTo(18.216f, 15.683f, 19.0f, 13.933f, 19.0f, 12.0f)
                curveTo(19.0f, 10.982f, 18.783f, 10.016f, 18.392f, 9.143f)
                close()
                moveTo(16.243f, 6.343f)
                lineTo(12.517f, 10.068f)
                curveTo(12.352f, 10.024f, 12.179f, 10.0f, 12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 10.895f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 11.821f, 13.976f, 11.648f, 13.932f, 11.483f)
                lineTo(17.657f, 7.757f)
                lineTo(16.243f, 6.343f)
                close()
            }
        }
        .build()
        return _dashboard2Fill!!
    }

private var _dashboard2Fill: ImageVector? = null
