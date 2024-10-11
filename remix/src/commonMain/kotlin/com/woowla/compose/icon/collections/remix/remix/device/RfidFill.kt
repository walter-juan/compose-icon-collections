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

public val DeviceGroup.RfidFill: ImageVector
    get() {
        if (_rfidFill != null) {
            return _rfidFill!!
        }
        _rfidFill = Builder(name = "RfidFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 18.364f)
                curveTo(21.879f, 14.849f, 21.879f, 9.151f, 18.364f, 5.636f)
                lineTo(19.778f, 4.222f)
                curveTo(24.074f, 8.518f, 24.074f, 15.483f, 19.778f, 19.778f)
                lineTo(18.364f, 18.364f)
                close()
                moveTo(5.636f, 5.636f)
                curveTo(2.121f, 9.151f, 2.121f, 14.849f, 5.636f, 18.364f)
                lineTo(4.222f, 19.778f)
                curveTo(-0.074f, 15.483f, -0.074f, 8.518f, 4.222f, 4.222f)
                lineTo(5.636f, 5.636f)
                close()
                moveTo(15.535f, 15.535f)
                curveTo(17.488f, 13.583f, 17.488f, 10.417f, 15.535f, 8.464f)
                lineTo(16.95f, 7.05f)
                curveTo(19.683f, 9.784f, 19.683f, 14.216f, 16.95f, 16.95f)
                lineTo(15.535f, 15.535f)
                close()
                moveTo(8.464f, 8.464f)
                curveTo(6.512f, 10.417f, 6.512f, 13.583f, 8.464f, 15.535f)
                lineTo(7.05f, 16.95f)
                curveTo(4.317f, 14.216f, 4.317f, 9.784f, 7.05f, 7.05f)
                lineTo(8.464f, 8.464f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.896f, 13.105f, 10.0f, 12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 10.896f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _rfidFill!!
    }

private var _rfidFill: ImageVector? = null
