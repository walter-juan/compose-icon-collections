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

public val DeviceGroup.HardDriveFill: ImageVector
    get() {
        if (_hardDriveFill != null) {
            return _hardDriveFill!!
        }
        _hardDriveFill = Builder(name = "HardDriveFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.951f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(12.951f)
                curveTo(3.329f, 12.983f, 3.662f, 13.0f, 4.0f, 13.0f)
                curveTo(9.523f, 13.0f, 14.0f, 8.523f, 14.0f, 3.0f)
                curveTo(14.0f, 2.662f, 13.983f, 2.329f, 13.951f, 2.0f)
                close()
                moveTo(15.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(11.938f, 2.0f)
                curveTo(11.979f, 2.328f, 12.0f, 2.661f, 12.0f, 3.0f)
                curveTo(12.0f, 7.418f, 8.418f, 11.0f, 4.0f, 11.0f)
                curveTo(3.661f, 11.0f, 3.328f, 10.979f, 3.0f, 10.938f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(11.938f)
                close()
            }
        }
        .build()
        return _hardDriveFill!!
    }

private var _hardDriveFill: ImageVector? = null
