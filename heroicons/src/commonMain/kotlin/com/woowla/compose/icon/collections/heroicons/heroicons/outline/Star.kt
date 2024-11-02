package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.481f, 3.499f)
                curveTo(11.673f, 3.037f, 12.327f, 3.037f, 12.519f, 3.499f)
                lineTo(14.645f, 8.61f)
                curveTo(14.726f, 8.805f, 14.91f, 8.938f, 15.12f, 8.955f)
                lineTo(20.638f, 9.397f)
                curveTo(21.137f, 9.437f, 21.339f, 10.06f, 20.959f, 10.385f)
                lineTo(16.755f, 13.987f)
                curveTo(16.594f, 14.124f, 16.524f, 14.339f, 16.573f, 14.544f)
                lineTo(17.858f, 19.929f)
                curveTo(17.974f, 20.416f, 17.445f, 20.801f, 17.018f, 20.54f)
                lineTo(12.293f, 17.654f)
                curveTo(12.113f, 17.544f, 11.887f, 17.544f, 11.707f, 17.654f)
                lineTo(6.982f, 20.54f)
                curveTo(6.555f, 20.801f, 6.026f, 20.416f, 6.142f, 19.929f)
                lineTo(7.427f, 14.544f)
                curveTo(7.475f, 14.339f, 7.405f, 14.124f, 7.245f, 13.987f)
                lineTo(3.041f, 10.385f)
                curveTo(2.661f, 10.06f, 2.863f, 9.437f, 3.362f, 9.397f)
                lineTo(8.88f, 8.955f)
                curveTo(9.09f, 8.938f, 9.274f, 8.805f, 9.355f, 8.61f)
                lineTo(11.481f, 3.499f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
