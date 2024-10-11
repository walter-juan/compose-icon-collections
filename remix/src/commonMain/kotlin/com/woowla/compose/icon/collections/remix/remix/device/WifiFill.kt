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

public val DeviceGroup.WifiFill: ImageVector
    get() {
        if (_wifiFill != null) {
            return _wifiFill!!
        }
        _wifiFill = Builder(name = "WifiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.689f, 6.997f)
                curveTo(3.78f, 4.497f, 7.715f, 3.0f, 12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.219f, 4.497f, 23.31f, 6.997f)
                lineTo(21.425f, 9.33f)
                curveTo(18.85f, 7.248f, 15.57f, 6.0f, 12.0f, 6.0f)
                curveTo(8.429f, 6.0f, 5.15f, 7.248f, 2.575f, 9.33f)
                lineTo(0.689f, 6.997f)
                close()
                moveTo(3.831f, 10.886f)
                curveTo(6.063f, 9.081f, 8.905f, 8.0f, 12.0f, 8.0f)
                curveTo(15.094f, 8.0f, 17.936f, 9.081f, 20.169f, 10.886f)
                lineTo(18.284f, 13.22f)
                curveTo(16.566f, 11.832f, 14.38f, 11.0f, 12.0f, 11.0f)
                curveTo(9.62f, 11.0f, 7.433f, 11.832f, 5.716f, 13.22f)
                lineTo(3.831f, 10.886f)
                close()
                moveTo(6.973f, 14.776f)
                curveTo(8.347f, 13.665f, 10.096f, 13.0f, 12.0f, 13.0f)
                curveTo(13.904f, 13.0f, 15.653f, 13.665f, 17.027f, 14.776f)
                lineTo(15.142f, 17.11f)
                curveTo(14.283f, 16.416f, 13.19f, 16.0f, 12.0f, 16.0f)
                curveTo(10.81f, 16.0f, 9.717f, 16.416f, 8.858f, 17.11f)
                lineTo(6.973f, 14.776f)
                close()
                moveTo(10.115f, 18.666f)
                curveTo(10.63f, 18.25f, 11.286f, 18.0f, 12.0f, 18.0f)
                curveTo(12.714f, 18.0f, 13.37f, 18.25f, 13.885f, 18.666f)
                lineTo(12.0f, 21.0f)
                lineTo(10.115f, 18.666f)
                close()
            }
        }
        .build()
        return _wifiFill!!
    }

private var _wifiFill: ImageVector? = null
