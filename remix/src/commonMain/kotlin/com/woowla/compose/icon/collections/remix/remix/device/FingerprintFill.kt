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

public val DeviceGroup.FingerprintFill: ImageVector
    get() {
        if (_fingerprintFill != null) {
            return _fingerprintFill!!
        }
        _fingerprintFill = Builder(name = "FingerprintFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 16.77f, 16.336f, 19.445f, 15.085f, 21.846f)
                lineTo(14.858f, 22.266f)
                lineTo(13.112f, 21.292f)
                curveTo(14.272f, 19.212f, 14.921f, 16.882f, 14.993f, 14.456f)
                lineTo(15.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                lineTo(12.995f, 14.379f)
                curveTo(12.915f, 17.149f, 11.965f, 19.773f, 10.304f, 21.928f)
                lineTo(10.073f, 22.219f)
                lineTo(8.524f, 20.954f)
                curveTo(10.041f, 19.097f, 10.915f, 16.802f, 10.994f, 14.366f)
                lineTo(11.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(14.762f, 6.0f, 17.0f, 8.239f, 17.0f, 11.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 9.343f, 13.657f, 8.0f, 12.0f, 8.0f)
                curveTo(10.343f, 8.0f, 9.0f, 9.343f, 9.0f, 11.0f)
                verticalLineTo(14.0f)
                curveTo(9.0f, 16.235f, 8.181f, 18.344f, 6.729f, 19.977f)
                lineTo(6.518f, 20.207f)
                lineTo(5.07f, 18.827f)
                curveTo(6.233f, 17.606f, 6.921f, 16.012f, 6.994f, 14.303f)
                lineTo(7.0f, 14.0f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 8.239f, 9.239f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(16.971f, 2.0f, 21.0f, 6.029f, 21.0f, 11.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 15.698f, 20.799f, 17.37f, 20.403f, 18.99f)
                lineTo(20.265f, 19.528f)
                lineTo(18.335f, 19.003f)
                curveTo(18.726f, 17.566f, 18.948f, 16.081f, 18.992f, 14.568f)
                lineTo(19.0f, 14.0f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.134f, 15.866f, 4.0f, 12.0f, 4.0f)
                curveTo(10.428f, 4.0f, 8.977f, 4.518f, 7.808f, 5.394f)
                lineTo(6.383f, 3.968f)
                curveTo(7.923f, 2.736f, 9.875f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.968f, 5.383f)
                lineTo(6.394f, 6.808f)
                curveTo(5.563f, 7.917f, 5.054f, 9.28f, 5.004f, 10.759f)
                lineTo(5.0f, 10.999f)
                lineTo(5.004f, 13.0f)
                curveTo(5.004f, 14.12f, 4.74f, 15.203f, 4.243f, 16.177f)
                lineTo(4.086f, 16.466f)
                lineTo(2.35f, 15.475f)
                curveTo(2.729f, 14.81f, 2.951f, 14.068f, 2.995f, 13.292f)
                lineTo(3.004f, 13.0f)
                lineTo(3.004f, 11.0f)
                curveTo(3.0f, 8.875f, 3.737f, 6.922f, 4.968f, 5.383f)
                close()
            }
        }
        .build()
        return _fingerprintFill!!
    }

private var _fingerprintFill: ImageVector? = null
