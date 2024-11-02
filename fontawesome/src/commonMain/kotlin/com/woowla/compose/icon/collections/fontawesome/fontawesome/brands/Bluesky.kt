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

public val BrandsGroup.Bluesky: ImageVector
    get() {
        if (_bluesky != null) {
            return _bluesky!!
        }
        _bluesky = Builder(name = "Bluesky", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.8f, 294.7f)
                curveToRelative(-3.3f, -0.4f, -6.7f, -0.8f, -10.0f, -1.3f)
                curveToRelative(3.4f, 0.4f, 6.7f, 0.9f, 10.0f, 1.3f)
                close()
                moveTo(288.0f, 227.1f)
                curveTo(261.9f, 176.4f, 190.9f, 81.9f, 124.9f, 35.3f)
                curveTo(61.6f, -9.4f, 37.5f, -1.7f, 21.6f, 5.5f)
                curveTo(3.3f, 13.8f, 0.0f, 41.9f, 0.0f, 58.4f)
                reflectiveCurveTo(9.1f, 194.0f, 15.0f, 213.9f)
                curveToRelative(19.5f, 65.7f, 89.1f, 87.9f, 153.2f, 80.7f)
                curveToRelative(3.3f, -0.5f, 6.6f, -0.9f, 10.0f, -1.4f)
                curveToRelative(-3.3f, 0.5f, -6.6f, 1.0f, -10.0f, 1.4f)
                curveTo(74.3f, 308.6f, -9.1f, 342.8f, 100.3f, 464.5f)
                curveTo(220.6f, 589.1f, 265.1f, 437.8f, 288.0f, 361.1f)
                curveToRelative(22.9f, 76.7f, 49.2f, 222.5f, 185.6f, 103.4f)
                curveToRelative(102.4f, -103.4f, 28.1f, -156.0f, -65.8f, -169.9f)
                curveToRelative(-3.3f, -0.4f, -6.7f, -0.8f, -10.0f, -1.3f)
                curveToRelative(3.4f, 0.4f, 6.7f, 0.9f, 10.0f, 1.3f)
                curveToRelative(64.1f, 7.1f, 133.6f, -15.1f, 153.2f, -80.7f)
                curveTo(566.9f, 194.0f, 576.0f, 75.0f, 576.0f, 58.4f)
                reflectiveCurveToRelative(-3.3f, -44.7f, -21.6f, -52.9f)
                curveToRelative(-15.8f, -7.1f, -40.0f, -14.9f, -103.2f, 29.8f)
                curveTo(385.1f, 81.9f, 314.1f, 176.4f, 288.0f, 227.1f)
                close()
            }
        }
        .build()
        return _bluesky!!
    }

private var _bluesky: ImageVector? = null
