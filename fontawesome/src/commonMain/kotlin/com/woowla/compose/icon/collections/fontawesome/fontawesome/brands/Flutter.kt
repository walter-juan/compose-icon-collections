package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Flutter: ImageVector
    get() {
        if (_flutter != null) {
            return _flutter!!
        }
        _flutter = Builder(name = "Flutter", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.5f, 236.3f)
                lineTo(291.7f, 374.1f)
                lineTo(429.5f, 512.0f)
                lineTo(272.0f, 512.0f)
                curveToRelative(-36.1f, -36.1f, -82.1f, -82.1f, -137.9f, -137.9f)
                lineToRelative(137.9f, -137.8f)
                lineToRelative(157.5f, 0.0f)
                close()
                moveTo(272.0f, 0.0f)
                lineTo(16.0f, 256.0f)
                lineTo(94.8f, 334.8f)
                lineTo(429.5f, 0.0f)
                lineTo(272.0f, 0.0f)
                close()
            }
        }
        .build()
        return _flutter!!
    }

private var _flutter: ImageVector? = null
