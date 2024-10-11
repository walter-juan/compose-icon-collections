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

public val DeviceGroup.Ram2Line: ImageVector
    get() {
        if (_ram2Line != null) {
            return _ram2Line!!
        }
        _ram2Line = Builder(name = "Ram2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                curveTo(1.448f, 5.0f, 1.0f, 5.448f, 1.0f, 6.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 15.552f, 1.448f, 16.0f, 2.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 18.552f, 2.448f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(10.414f)
                lineTo(11.414f, 18.0f)
                horizontalLineTo(12.586f)
                lineTo(13.586f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 19.0f, 22.0f, 18.552f, 22.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(22.552f, 16.0f, 23.0f, 15.552f, 23.0f, 15.0f)
                verticalLineTo(6.0f)
                curveTo(23.0f, 5.448f, 22.552f, 5.0f, 22.0f, 5.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(20.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.414f)
                lineTo(13.414f, 16.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(10.586f, 16.0f)
                lineTo(9.586f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.586f)
                close()
                moveTo(3.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _ram2Line!!
    }

private var _ram2Line: ImageVector? = null
