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

public val DeviceGroup.QrScanAiFill: ImageVector
    get() {
        if (_qrScanAiFill != null) {
            return _qrScanAiFill!!
        }
        _qrScanAiFill = Builder(name = "QrScanAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(18.529f, 1.319f)
                curveTo(18.706f, 0.894f, 19.294f, 0.894f, 19.471f, 1.319f)
                lineTo(19.724f, 1.931f)
                curveTo(20.156f, 2.973f, 20.962f, 3.806f, 21.975f, 4.257f)
                lineTo(22.691f, 4.576f)
                curveTo(23.102f, 4.759f, 23.102f, 5.356f, 22.691f, 5.539f)
                lineTo(21.933f, 5.877f)
                curveTo(20.945f, 6.316f, 20.153f, 7.119f, 19.714f, 8.128f)
                lineTo(19.467f, 8.693f)
                curveTo(19.286f, 9.108f, 18.714f, 9.108f, 18.533f, 8.693f)
                lineTo(18.286f, 8.128f)
                curveTo(17.847f, 7.119f, 17.055f, 6.316f, 16.067f, 5.877f)
                lineTo(15.308f, 5.539f)
                curveTo(14.897f, 5.356f, 14.897f, 4.759f, 15.308f, 4.576f)
                lineTo(16.025f, 4.257f)
                curveTo(17.038f, 3.806f, 17.844f, 2.973f, 18.276f, 1.931f)
                lineTo(18.529f, 1.319f)
                close()
                moveTo(9.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _qrScanAiFill!!
    }

private var _qrScanAiFill: ImageVector? = null
