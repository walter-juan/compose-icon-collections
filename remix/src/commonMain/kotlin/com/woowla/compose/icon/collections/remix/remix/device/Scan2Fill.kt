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

public val DeviceGroup.Scan2Fill: ImageVector
    get() {
        if (_scan2Fill != null) {
            return _scan2Fill!!
        }
        _scan2Fill = Builder(name = "Scan2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.257f, 5.671f)
                lineTo(6.394f, 7.808f)
                curveTo(5.518f, 8.976f, 5.0f, 10.428f, 5.0f, 12.0f)
                curveTo(5.0f, 15.866f, 8.134f, 19.0f, 12.0f, 19.0f)
                curveTo(15.866f, 19.0f, 19.0f, 15.866f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(10.428f, 5.0f, 8.976f, 5.518f, 7.808f, 6.394f)
                lineTo(5.671f, 4.257f)
                curveTo(7.395f, 2.846f, 9.599f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 9.599f, 2.846f, 7.395f, 4.257f, 5.671f)
                close()
                moveTo(7.828f, 9.243f)
                lineTo(12.0f, 13.414f)
                lineTo(13.414f, 12.0f)
                lineTo(9.243f, 7.828f)
                curveTo(10.033f, 7.305f, 10.981f, 7.0f, 12.0f, 7.0f)
                curveTo(14.761f, 7.0f, 17.0f, 9.239f, 17.0f, 12.0f)
                curveTo(17.0f, 14.761f, 14.761f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                curveTo(7.0f, 10.981f, 7.305f, 10.033f, 7.828f, 9.243f)
                close()
            }
        }
        .build()
        return _scan2Fill!!
    }

private var _scan2Fill: ImageVector? = null
