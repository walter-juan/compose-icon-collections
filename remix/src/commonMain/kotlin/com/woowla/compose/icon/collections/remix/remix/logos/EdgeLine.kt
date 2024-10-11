package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.EdgeLine: ImageVector
    get() {
        if (_edgeLine != null) {
            return _edgeLine!!
        }
        _edgeLine = Builder(name = "EdgeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.008f, 14.001f)
                curveTo(8.003f, 14.084f, 8.001f, 14.167f, 8.001f, 14.25f)
                curveTo(8.001f, 16.632f, 9.754f, 19.0f, 13.001f, 19.0f)
                curveTo(15.374f, 19.0f, 17.528f, 18.345f, 19.001f, 17.447f)
                verticalLineTo(20.797f)
                curveTo(17.212f, 21.564f, 15.113f, 22.0f, 13.001f, 22.0f)
                curveTo(7.499f, 22.0f, 5.001f, 18.53f, 5.001f, 14.25f)
                curveTo(5.001f, 11.019f, 7.042f, 8.249f, 9.944f, 7.086f)
                curveTo(8.54f, 8.663f, 8.001f, 10.341f, 8.001f, 10.995f)
                lineTo(18.001f, 11.0f)
                curveTo(18.001f, 7.594f, 15.453f, 5.0f, 12.001f, 5.0f)
                curveTo(7.001f, 5.0f, 4.0f, 8.988f, 3.001f, 10.999f)
                curveTo(3.291f, 6.237f, 7.01f, 2.0f, 12.001f, 2.0f)
                curveTo(17.201f, 2.0f, 21.001f, 6.029f, 21.001f, 11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.001f)
                lineTo(8.008f, 14.001f)
                close()
            }
        }
        .build()
        return _edgeLine!!
    }

private var _edgeLine: ImageVector? = null
