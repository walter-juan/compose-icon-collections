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

public val DeviceGroup.UDiskLine: ImageVector
    get() {
        if (_uDiskLine != null) {
            return _uDiskLine!!
        }
        _uDiskLine = Builder(name = "UDiskLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(5.0f, 10.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 10.0f, 21.0f, 10.448f, 21.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 10.448f, 3.448f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _uDiskLine!!
    }

private var _uDiskLine: ImageVector? = null
