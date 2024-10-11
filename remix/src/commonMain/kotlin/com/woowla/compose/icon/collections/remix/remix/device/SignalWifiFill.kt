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

public val DeviceGroup.SignalWifiFill: ImageVector
    get() {
        if (_signalWifiFill != null) {
            return _signalWifiFill!!
        }
        _signalWifiFill = Builder(name = "SignalWifiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.31f, 6.996f)
                lineTo(12.0f, 21.0f)
                lineTo(0.69f, 6.997f)
                curveTo(3.781f, 4.497f, 7.716f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _signalWifiFill!!
    }

private var _signalWifiFill: ImageVector? = null
