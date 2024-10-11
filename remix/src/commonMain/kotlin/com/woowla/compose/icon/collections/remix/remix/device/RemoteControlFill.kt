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

public val DeviceGroup.RemoteControlFill: ImageVector
    get() {
        if (_remoteControlFill != null) {
            return _remoteControlFill!!
        }
        _remoteControlFill = Builder(name = "RemoteControlFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                curveTo(17.552f, 12.0f, 18.0f, 12.448f, 18.0f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 12.448f, 6.448f, 12.0f, 7.0f, 12.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(14.349f, 6.0f, 16.383f, 7.35f, 17.368f, 9.316f)
                lineTo(15.579f, 10.211f)
                curveTo(14.922f, 8.9f, 13.566f, 8.0f, 12.0f, 8.0f)
                curveTo(10.434f, 8.0f, 9.078f, 8.9f, 8.422f, 10.211f)
                lineTo(6.632f, 9.316f)
                curveTo(7.618f, 7.35f, 9.651f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.915f, 2.0f, 19.305f, 4.25f, 20.947f, 7.527f)
                lineTo(19.158f, 8.422f)
                curveTo(17.844f, 5.8f, 15.132f, 4.0f, 12.0f, 4.0f)
                curveTo(8.868f, 4.0f, 6.156f, 5.8f, 4.843f, 8.422f)
                lineTo(3.054f, 7.527f)
                curveTo(4.695f, 4.25f, 8.085f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _remoteControlFill!!
    }

private var _remoteControlFill: ImageVector? = null
