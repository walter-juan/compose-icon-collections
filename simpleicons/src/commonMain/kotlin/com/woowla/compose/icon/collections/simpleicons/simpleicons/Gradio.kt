package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Gradio: ImageVector
    get() {
        if (_gradio != null) {
            return _gradio!!
        }
        _gradio = Builder(name = "Gradio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.527f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 11.24f, 1.73f)
                lineTo(0.77f, 7.732f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 0.0f, 9.021f)
                lineTo(0.0f, 9.109f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 0.77f, 10.4f)
                lineTo(3.57f, 12.0f)
                lineTo(0.77f, 13.61f)
                curveTo(0.256f, 13.9f, 0.0f, 14.42f, 0.0f, 14.94f)
                curveTo(0.0f, 15.45f, 0.256f, 15.97f, 0.77f, 16.26f)
                lineTo(11.24f, 22.27f)
                curveTo(11.71f, 22.54f, 12.29f, 22.54f, 12.76f, 22.27f)
                lineTo(23.23f, 16.26f)
                curveTo(23.73f, 15.98f, 23.99f, 15.48f, 24.0f, 14.97f)
                lineTo(24.0f, 14.9f)
                curveTo(23.99f, 14.4f, 23.73f, 13.89f, 23.23f, 13.61f)
                lineTo(20.42f, 12.0f)
                lineTo(23.23f, 10.4f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 24.0f, 9.223f)
                lineTo(24.0f, 8.91f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 23.23f, 7.732f)
                lineTo(12.76f, 1.73f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 12.0f, 1.527f)
                close()
                moveTo(12.0f, 4.826f)
                lineTo(19.39f, 9.061f)
                lineTo(17.34f, 10.24f)
                lineTo(12.76f, 7.602f)
                curveTo(12.53f, 7.47f, 12.27f, 7.398f, 12.0f, 7.398f)
                curveTo(11.73f, 7.398f, 11.47f, 7.469f, 11.24f, 7.602f)
                lineTo(6.652f, 10.24f)
                lineTo(4.613f, 9.061f)
                lineTo(12.0f, 4.826f)
                close()
                moveTo(12.0f, 10.7f)
                lineTo(14.27f, 12.0f)
                lineTo(12.0f, 13.3f)
                lineTo(9.734f, 12.0f)
                lineTo(12.0f, 10.7f)
                close()
                moveTo(6.652f, 13.77f)
                lineTo(11.24f, 16.39f)
                arcTo(1.532f, 1.532f, 0.0f, false, false, 12.76f, 16.39f)
                lineTo(17.34f, 13.77f)
                lineTo(19.39f, 14.94f)
                lineTo(12.0f, 19.17f)
                lineTo(4.613f, 14.94f)
                lineTo(6.652f, 13.77f)
                close()
            }
        }
        .build()
        return _gradio!!
    }

private var _gradio: ImageVector? = null
