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

public val DeviceGroup.Scan2Line: ImageVector
    get() {
        if (_scan2Line != null) {
            return _scan2Line!!
        }
        _scan2Line = Builder(name = "Scan2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.671f, 4.257f)
                lineTo(13.414f, 12.0f)
                lineTo(12.0f, 13.414f)
                lineTo(8.554f, 9.968f)
                curveTo(8.202f, 10.564f, 8.0f, 11.258f, 8.0f, 12.0f)
                curveTo(8.0f, 14.209f, 9.791f, 16.0f, 12.0f, 16.0f)
                curveTo(14.209f, 16.0f, 16.0f, 14.209f, 16.0f, 12.0f)
                curveTo(16.0f, 9.875f, 14.343f, 8.137f, 12.25f, 8.008f)
                lineTo(10.446f, 6.203f)
                curveTo(10.942f, 6.071f, 11.462f, 6.0f, 12.0f, 6.0f)
                curveTo(15.314f, 6.0f, 18.0f, 8.686f, 18.0f, 12.0f)
                curveTo(18.0f, 15.314f, 15.314f, 18.0f, 12.0f, 18.0f)
                curveTo(8.686f, 18.0f, 6.0f, 15.314f, 6.0f, 12.0f)
                curveTo(6.0f, 10.704f, 6.411f, 9.504f, 7.109f, 8.523f)
                lineTo(5.68f, 7.094f)
                curveTo(4.627f, 8.449f, 4.0f, 10.151f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(10.892f, 4.0f, 9.836f, 4.225f, 8.876f, 4.633f)
                lineTo(7.374f, 3.132f)
                curveTo(8.758f, 2.409f, 10.331f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 8.878f, 3.43f, 6.091f, 5.671f, 4.257f)
                close()
            }
        }
        .build()
        return _scan2Line!!
    }

private var _scan2Line: ImageVector? = null
