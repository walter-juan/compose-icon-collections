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

public val BrandsGroup.Quora: ImageVector
    get() {
        if (_quora != null) {
            return _quora!!
        }
        _quora = Builder(name = "Quora", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.7f, 386.7f)
                lineToRelative(-29.3f, 0.0f)
                curveToRelative(-1.5f, 13.5f, -10.5f, 30.8f, -33.0f, 30.8f)
                curveToRelative(-20.5f, 0.0f, -35.3f, -14.2f, -49.5f, -35.8f)
                curveToRelative(44.2f, -34.2f, 74.7f, -87.5f, 74.7f, -153.0f)
                curveToRelative(0.1f, -117.5f, -96.6f, -196.7f, -198.4f, -196.7f)
                curveToRelative(-99.7f, 0.0f, -197.7f, 79.7f, -197.7f, 196.7f)
                curveToRelative(0.0f, 134.1f, 131.3f, 221.6f, 249.0f, 189.0f)
                curveToRelative(19.7f, 33.6f, 45.7f, 62.3f, 95.2f, 62.3f)
                curveToRelative(81.8f, 0.0f, 90.8f, -75.3f, 89.0f, -93.3f)
                close()
                moveTo(297.2f, 329.2f)
                curveToRelative(-19.5f, -29.2f, -43.7f, -52.2f, -91.5f, -52.2f)
                curveToRelative(-30.5f, 0.0f, -54.3f, 10.0f, -69.0f, 22.8f)
                lineToRelative(12.2f, 24.3f)
                curveToRelative(6.2f, -3.0f, 13.0f, -4.0f, 19.8f, -4.0f)
                curveToRelative(35.5f, 0.0f, 53.7f, 30.8f, 69.2f, 61.3f)
                curveToRelative(-10.0f, 3.0f, -20.7f, 4.2f, -32.7f, 4.2f)
                curveToRelative(-75.0f, 0.0f, -107.5f, -53.0f, -107.5f, -156.7f)
                curveToRelative(0.0f, -104.4f, 32.5f, -157.9f, 107.5f, -157.9f)
                curveToRelative(76.2f, 0.0f, 108.7f, 53.5f, 108.7f, 157.7f)
                curveToRelative(0.1f, 41.8f, -5.4f, 75.6f, -16.7f, 100.5f)
                close()
            }
        }
        .build()
        return _quora!!
    }

private var _quora: ImageVector? = null
