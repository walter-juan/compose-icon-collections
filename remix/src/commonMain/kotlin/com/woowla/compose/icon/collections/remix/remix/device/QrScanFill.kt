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

public val DeviceGroup.QrScanFill: ImageVector
    get() {
        if (_qrScanFill != null) {
            return _qrScanFill!!
        }
        _qrScanFill = Builder(name = "QrScanFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                verticalLineTo(20.007f)
                curveTo(21.0f, 20.555f, 20.555f, 21.0f, 20.007f, 21.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 21.0f, 3.0f, 20.555f, 3.0f, 20.007f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 3.0f, 21.0f, 3.445f, 21.0f, 3.993f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _qrScanFill!!
    }

private var _qrScanFill: ImageVector? = null
