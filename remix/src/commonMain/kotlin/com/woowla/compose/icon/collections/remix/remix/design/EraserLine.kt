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

public val DesignGroup.EraserLine: ImageVector
    get() {
        if (_eraserLine != null) {
            return _eraserLine!!
        }
        _eraserLine = Builder(name = "EraserLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.586f, 8.854f)
                lineTo(3.636f, 13.804f)
                lineTo(8.83f, 18.999f)
                lineTo(10.0f, 18.998f)
                verticalLineTo(18.997f)
                horizontalLineTo(11.171f)
                lineTo(14.95f, 15.218f)
                lineTo(8.586f, 8.854f)
                close()
                moveTo(10.0f, 7.44f)
                lineTo(16.364f, 13.804f)
                lineTo(19.192f, 10.976f)
                lineTo(12.828f, 4.612f)
                lineTo(10.0f, 7.44f)
                close()
                moveTo(14.0f, 18.997f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.997f)
                horizontalLineTo(12.0f)
                lineTo(8.002f, 20.999f)
                lineTo(1.515f, 14.511f)
                curveTo(1.124f, 14.121f, 1.124f, 13.488f, 1.515f, 13.097f)
                lineTo(12.121f, 2.491f)
                curveTo(12.512f, 2.1f, 13.145f, 2.1f, 13.535f, 2.491f)
                lineTo(21.314f, 10.269f)
                curveTo(21.704f, 10.659f, 21.704f, 11.292f, 21.314f, 11.683f)
                lineTo(14.0f, 18.997f)
                close()
            }
        }
        .build()
        return _eraserLine!!
    }

private var _eraserLine: ImageVector? = null
