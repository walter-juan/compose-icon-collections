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

public val DeviceGroup.NetworkLine: ImageVector
    get() {
        if (_networkLine != null) {
            return _networkLine!!
        }
        _networkLine = Builder(name = "NetworkLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveTo(14.552f, 3.0f, 15.0f, 3.448f, 15.0f, 4.0f)
                verticalLineTo(8.0f)
                curveTo(15.0f, 8.552f, 14.552f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 15.0f, 20.0f, 15.448f, 20.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 20.552f, 19.552f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(14.448f, 21.0f, 14.0f, 20.552f, 14.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(14.0f, 15.448f, 14.448f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                curveTo(9.552f, 15.0f, 10.0f, 15.448f, 10.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(10.0f, 20.552f, 9.552f, 21.0f, 9.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 21.0f, 4.0f, 20.552f, 4.0f, 20.0f)
                verticalLineTo(16.0f)
                lineTo(4.005f, 15.898f)
                curveTo(4.056f, 15.393f, 4.482f, 15.0f, 5.0f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                curveTo(9.448f, 9.0f, 9.0f, 8.552f, 9.0f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(9.0f, 3.448f, 9.448f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _networkLine!!
    }

private var _networkLine: ImageVector? = null
