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

public val DeviceGroup.HardDrive3Fill: ImageVector
    get() {
        if (_hardDrive3Fill != null) {
            return _hardDrive3Fill!!
        }
        _hardDrive3Fill = Builder(name = "HardDrive3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 2.0f)
                curveTo(4.996f, 2.0f, 4.57f, 2.376f, 4.508f, 2.876f)
                lineTo(3.008f, 14.876f)
                curveTo(3.003f, 14.917f, 3.0f, 14.958f, 3.0f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.552f, 3.448f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 22.0f, 21.0f, 21.552f, 21.0f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 14.958f, 20.997f, 14.917f, 20.992f, 14.876f)
                lineTo(19.492f, 2.876f)
                curveTo(19.43f, 2.376f, 19.004f, 2.0f, 18.5f, 2.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _hardDrive3Fill!!
    }

private var _hardDrive3Fill: ImageVector? = null
