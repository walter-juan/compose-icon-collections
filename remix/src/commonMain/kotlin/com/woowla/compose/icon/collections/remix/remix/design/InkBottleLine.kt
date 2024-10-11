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

public val DesignGroup.InkBottleLine: ImageVector
    get() {
        if (_inkBottleLine != null) {
            return _inkBottleLine!!
        }
        _inkBottleLine = Builder(name = "InkBottleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.997f)
                lineTo(20.371f, 10.745f)
                curveTo(20.751f, 10.897f, 21.0f, 11.265f, 21.0f, 11.674f)
                verticalLineTo(20.997f)
                curveTo(21.0f, 21.549f, 20.552f, 21.997f, 20.0f, 21.997f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.997f, 3.0f, 21.549f, 3.0f, 20.997f)
                verticalLineTo(11.674f)
                curveTo(3.0f, 11.265f, 3.249f, 10.897f, 3.629f, 10.745f)
                lineTo(8.0f, 8.997f)
                horizontalLineTo(16.0f)
                close()
                moveTo(15.615f, 10.997f)
                horizontalLineTo(8.385f)
                lineTo(5.0f, 12.351f)
                verticalLineTo(19.997f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.997f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.997f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.351f)
                lineTo(15.615f, 10.997f)
                close()
                moveTo(16.0f, 2.997f)
                curveTo(16.552f, 2.997f, 17.0f, 3.444f, 17.0f, 3.997f)
                verticalLineTo(7.997f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.997f)
                curveTo(7.0f, 3.444f, 7.448f, 2.997f, 8.0f, 2.997f)
                horizontalLineTo(16.0f)
                close()
                moveTo(15.0f, 4.997f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.997f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.997f)
                close()
            }
        }
        .build()
        return _inkBottleLine!!
    }

private var _inkBottleLine: ImageVector? = null
