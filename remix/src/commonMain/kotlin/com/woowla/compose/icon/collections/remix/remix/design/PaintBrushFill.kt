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

public val DesignGroup.PaintBrushFill: ImageVector
    get() {
        if (_paintBrushFill != null) {
            return _paintBrushFill!!
        }
        _paintBrushFill = Builder(name = "PaintBrushFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.997f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.997f, 21.0f, 3.444f, 21.0f, 3.997f)
                verticalLineTo(8.997f)
                curveTo(21.0f, 9.549f, 20.552f, 9.997f, 20.0f, 9.997f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 9.997f, 3.0f, 9.549f, 3.0f, 8.997f)
                verticalLineTo(3.997f)
                curveTo(3.0f, 3.444f, 3.448f, 2.997f, 4.0f, 2.997f)
                close()
                moveTo(6.0f, 11.997f)
                horizontalLineTo(12.0f)
                curveTo(12.552f, 11.997f, 13.0f, 12.444f, 13.0f, 12.997f)
                verticalLineTo(15.997f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.997f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.997f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.997f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 13.997f, 4.0f, 13.549f, 4.0f, 12.997f)
                verticalLineTo(10.997f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.997f)
                close()
                moveTo(17.732f, 13.729f)
                lineTo(19.5f, 11.961f)
                lineTo(21.268f, 13.729f)
                curveTo(22.244f, 14.705f, 22.244f, 16.288f, 21.268f, 17.264f)
                curveTo(20.292f, 18.241f, 18.708f, 18.241f, 17.732f, 17.264f)
                curveTo(16.756f, 16.288f, 16.756f, 14.705f, 17.732f, 13.729f)
                close()
            }
        }
        .build()
        return _paintBrushFill!!
    }

private var _paintBrushFill: ImageVector? = null
