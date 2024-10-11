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

public val LogosGroup.GeminiLine: ImageVector
    get() {
        if (_geminiLine != null) {
            return _geminiLine!!
        }
        _geminiLine = Builder(name = "GeminiLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.124f, 1.091f)
                horizontalLineTo(12.875f)
                lineTo(12.927f, 1.945f)
                curveTo(13.223f, 6.851f, 17.149f, 10.777f, 22.055f, 11.073f)
                lineTo(22.909f, 11.125f)
                verticalLineTo(12.876f)
                lineTo(22.055f, 12.927f)
                curveTo(17.149f, 13.223f, 13.223f, 17.15f, 12.927f, 22.055f)
                lineTo(12.875f, 22.91f)
                horizontalLineTo(11.124f)
                lineTo(11.073f, 22.055f)
                curveTo(10.777f, 17.15f, 6.85f, 13.223f, 1.945f, 12.927f)
                lineTo(1.091f, 12.876f)
                verticalLineTo(11.125f)
                lineTo(1.945f, 11.073f)
                curveTo(6.85f, 10.777f, 10.777f, 6.851f, 11.073f, 1.945f)
                lineTo(11.124f, 1.091f)
                close()
                moveTo(12.0f, 5.85f)
                curveTo(10.83f, 8.615f, 8.615f, 10.83f, 5.85f, 12.0f)
                curveTo(8.615f, 13.17f, 10.83f, 15.385f, 12.0f, 18.15f)
                curveTo(13.17f, 15.385f, 15.385f, 13.17f, 18.15f, 12.0f)
                curveTo(15.385f, 10.83f, 13.17f, 8.615f, 12.0f, 5.85f)
                close()
            }
        }
        .build()
        return _geminiLine!!
    }

private var _geminiLine: ImageVector? = null
