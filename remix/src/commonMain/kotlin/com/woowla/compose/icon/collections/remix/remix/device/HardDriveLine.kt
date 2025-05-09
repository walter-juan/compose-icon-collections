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

public val DeviceGroup.HardDriveLine: ImageVector
    get() {
        if (_hardDriveLine != null) {
            return _hardDriveLine!!
        }
        _hardDriveLine = Builder(name = "HardDriveLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.938f)
                curveTo(8.619f, 10.487f, 11.487f, 7.619f, 11.938f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.938f)
                close()
                moveTo(5.0f, 12.951f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.951f)
                curveTo(13.482f, 8.724f, 9.724f, 12.482f, 5.0f, 12.951f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _hardDriveLine!!
    }

private var _hardDriveLine: ImageVector? = null
