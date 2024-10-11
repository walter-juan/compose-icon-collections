package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.Brush3Line: ImageVector
    get() {
        if (_brush3Line != null) {
            return _brush3Line!!
        }
        _brush3Line = Builder(name = "Brush3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.997f)
                verticalLineTo(14.997f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.997f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.997f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.997f)
                horizontalLineTo(8.0f)
                close()
                moveTo(4.0f, 10.997f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.997f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.997f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.997f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.997f)
                close()
                moveTo(3.0f, 20.997f)
                verticalLineTo(12.997f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.997f)
                curveTo(2.0f, 6.444f, 2.448f, 5.997f, 3.0f, 5.997f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.997f)
                curveTo(8.0f, 2.444f, 8.448f, 1.997f, 9.0f, 1.997f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 1.997f, 16.0f, 2.444f, 16.0f, 2.997f)
                verticalLineTo(5.997f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.997f, 22.0f, 6.444f, 22.0f, 6.997f)
                verticalLineTo(12.997f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.997f)
                curveTo(21.0f, 21.549f, 20.552f, 21.997f, 20.0f, 21.997f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.997f, 3.0f, 21.549f, 3.0f, 20.997f)
                close()
            }
        }
        .build()
        return _brush3Line!!
    }

private var _brush3Line: ImageVector? = null
