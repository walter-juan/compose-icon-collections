package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.Lock2Line: ImageVector
    get() {
        if (_lock2Line != null) {
            return _lock2Line!!
        }
        _lock2Line = Builder(name = "Lock2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 3.686f, 8.686f, 1.0f, 12.0f, 1.0f)
                curveTo(15.314f, 1.0f, 18.0f, 3.686f, 18.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 8.0f, 21.0f, 8.448f, 21.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 8.448f, 3.448f, 8.0f, 4.0f, 8.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(11.0f, 15.732f)
                curveTo(10.402f, 15.387f, 10.0f, 14.74f, 10.0f, 14.0f)
                curveTo(10.0f, 12.895f, 10.895f, 12.0f, 12.0f, 12.0f)
                curveTo(13.105f, 12.0f, 14.0f, 12.895f, 14.0f, 14.0f)
                curveTo(14.0f, 14.74f, 13.598f, 15.387f, 13.0f, 15.732f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.732f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                curveTo(16.0f, 4.791f, 14.209f, 3.0f, 12.0f, 3.0f)
                curveTo(9.791f, 3.0f, 8.0f, 4.791f, 8.0f, 7.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _lock2Line!!
    }

private var _lock2Line: ImageVector? = null
