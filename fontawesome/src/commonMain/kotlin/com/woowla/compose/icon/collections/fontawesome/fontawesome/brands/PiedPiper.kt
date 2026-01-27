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

public val BrandsGroup.PiedPiper: ImageVector
    get() {
        if (_piedPiper != null) {
            return _piedPiper!!
        }
        _piedPiper = Builder(name = "PiedPiper", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.2f, 23.2f)
                curveToRelative(-26.7f, 6.8f, -68.1f, 28.5f, -114.6f, 67.5f)
                curveToRelative(-30.9f, -17.5f, -65.8f, -26.7f, -101.4f, -26.7f)
                curveToRelative(-114.9f, 0.0f, -208.0f, 93.1f, -208.0f, 208.0f)
                reflectiveCurveToRelative(93.1f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.1f, 208.0f, -208.0f)
                curveToRelative(0.1f, -54.1f, -21.0f, -106.1f, -58.7f, -144.8f)
                curveToRelative(-6.6f, 8.5f, -12.3f, 17.7f, -17.0f, 27.4f)
                curveToRelative(28.9f, 32.3f, 44.8f, 74.1f, 44.9f, 117.4f)
                curveToRelative(0.0f, 97.7f, -79.4f, 177.1f, -177.1f, 177.1f)
                curveToRelative(-30.8f, 0.0f, -61.0f, -8.1f, -87.6f, -23.4f)
                curveToRelative(82.9f, -107.3f, 150.8f, -37.8f, 184.3f, -226.6f)
                curveToRelative(5.8f, -32.6f, 28.0f, -94.3f, 126.2f, -160.2f)
                curveToRelative(8.1f, -5.4f, 2.4f, -18.1f, -7.0f, -15.7f)
                close()
                moveTo(109.3f, 406.4f)
                curveTo(89.8f, 389.8f, 74.2f, 369.2f, 63.5f, 346.0f)
                reflectiveCurveToRelative(-16.3f, -48.5f, -16.3f, -74.0f)
                curveToRelative(0.0f, -97.7f, 79.4f, -177.1f, 177.1f, -177.1f)
                curveToRelative(26.6f, 0.0f, 52.8f, 6.1f, 76.6f, 17.8f)
                curveToRelative(-66.0f, 62.1f, -126.9f, 152.9f, -191.6f, 293.8f)
                close()
            }
        }
        .build()
        return _piedPiper!!
    }

private var _piedPiper: ImageVector? = null
