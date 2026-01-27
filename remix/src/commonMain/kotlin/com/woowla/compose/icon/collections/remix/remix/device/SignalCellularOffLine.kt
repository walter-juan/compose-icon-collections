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

public val DeviceGroup.SignalCellularOffLine: ImageVector
    get() {
        if (_signalCellularOffLine != null) {
            return _signalCellularOffLine!!
        }
        _signalCellularOffLine = Builder(name = "SignalCellularOffLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.207f, 20.793f)
                lineTo(20.793f, 22.207f)
                lineTo(19.586f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.414f)
                lineTo(15.0f, 16.414f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.414f)
                lineTo(1.793f, 3.207f)
                lineTo(3.207f, 1.793f)
                lineTo(22.207f, 20.793f)
                close()
                moveTo(8.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.414f)
                lineTo(11.0f, 12.414f)
                verticalLineTo(19.0f)
                close()
                moveTo(22.0f, 17.758f)
                lineTo(20.0f, 15.758f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.758f)
                lineTo(16.0f, 11.758f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.758f)
                close()
                moveTo(15.0f, 10.758f)
                lineTo(12.242f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.758f)
                close()
            }
        }
        .build()
        return _signalCellularOffLine!!
    }

private var _signalCellularOffLine: ImageVector? = null
