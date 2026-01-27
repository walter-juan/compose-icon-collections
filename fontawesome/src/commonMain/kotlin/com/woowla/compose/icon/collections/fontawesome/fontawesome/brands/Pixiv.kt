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

public val BrandsGroup.Pixiv: ImageVector
    get() {
        if (_pixiv != null) {
            return _pixiv!!
        }
        _pixiv = Builder(name = "Pixiv", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 32.0f)
                curveTo(43.0f, 32.0f, 0.0f, 75.0f, 0.0f, 128.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -256.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                lineTo(96.0f, 32.0f)
                close()
                moveTo(173.7f, 249.3f)
                arcToRelative(60.1f, 60.1f, 0.0f, true, false, 120.3f, 0.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, true, false, -120.3f, 0.0f)
                close()
                moveTo(119.1f, 387.8f)
                curveToRelative(-0.3f, -0.8f, -0.5f, -1.7f, -0.5f, -2.6f)
                lineToRelative(0.0f, -244.3f)
                curveToRelative(0.0f, -1.8f, 0.7f, -3.6f, 2.0f, -4.9f)
                reflectiveCurveToRelative(3.0f, -2.0f, 4.9f, -2.0f)
                lineToRelative(16.9f, 0.0f)
                curveToRelative(1.2f, 0.0f, 2.3f, 0.3f, 3.3f, 0.8f)
                reflectiveCurveToRelative(1.9f, 1.3f, 2.5f, 2.3f)
                lineToRelative(14.0f, 21.8f)
                curveToRelative(19.7f, -15.6f, 44.5f, -25.0f, 71.6f, -25.0f)
                curveToRelative(63.6f, 0.0f, 115.2f, 51.6f, 115.2f, 115.2f)
                reflectiveCurveTo(297.5f, 364.5f, 233.8f, 364.5f)
                curveToRelative(-22.0f, 0.0f, -42.6f, -6.2f, -60.1f, -16.9f)
                lineToRelative(0.0f, 37.6f)
                curveToRelative(0.0f, 0.9f, -0.2f, 1.8f, -0.5f, 2.6f)
                reflectiveCurveToRelative(-0.9f, 1.6f, -1.5f, 2.2f)
                reflectiveCurveToRelative(-1.4f, 1.1f, -2.2f, 1.5f)
                reflectiveCurveToRelative(-1.7f, 0.5f, -2.6f, 0.5f)
                lineToRelative(-41.3f, 0.0f)
                curveToRelative(-0.9f, 0.0f, -1.8f, -0.2f, -2.6f, -0.5f)
                reflectiveCurveToRelative(-1.6f, -0.9f, -2.2f, -1.5f)
                reflectiveCurveToRelative(-1.1f, -1.4f, -1.5f, -2.2f)
                close()
            }
        }
        .build()
        return _pixiv!!
    }

private var _pixiv: ImageVector? = null
