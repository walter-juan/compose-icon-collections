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

public val BrandsGroup.Mdb: ImageVector
    get() {
        if (_mdb != null) {
            return _mdb!!
        }
        _mdb = Builder(name = "Mdb", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4f, 160.4f)
                lineToRelative(-10.4f, 191.6f)
                lineToRelative(43.9f, 0.0f)
                lineToRelative(5.6f, -79.8f)
                lineToRelative(27.9f, 79.8f)
                lineToRelative(44.7f, 0.0f)
                lineToRelative(25.5f, -77.4f)
                lineToRelative(4.8f, 77.4f)
                lineToRelative(45.5f, 0.0f)
                lineToRelative(-12.8f, -191.6f)
                lineToRelative(-45.5f, 0.0f)
                lineToRelative(-40.7f, 117.3f)
                lineToRelative(-42.3f, -117.3f)
                lineToRelative(-46.3f, 0.0f)
                close()
                moveTo(298.4f, 160.4f)
                lineToRelative(-47.9f, 0.0f)
                lineToRelative(0.0f, 191.6f)
                lineToRelative(47.9f, 0.0f)
                reflectiveCurveToRelative(95.0f, 0.8f, 94.2f, -95.8f)
                curveToRelative(-0.8f, -94.2f, -94.2f, -95.8f, -94.2f, -95.8f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(297.2f, 306.9f)
                lineToRelative(0.0f, -102.1f)
                reflectiveCurveToRelative(46.0f, 4.3f, 46.8f, 50.6f)
                reflectiveCurveToRelative(-46.8f, 51.5f, -46.8f, 51.5f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(535.5f, 232.7f)
                curveToRelative(7.2f, -11.4f, 10.0f, -25.0f, 8.0f, -38.3f)
                curveToRelative(-5.3f, -35.8f, -55.1f, -34.3f, -55.1f, -34.3f)
                lineToRelative(-51.9f, 0.0f)
                lineToRelative(0.0f, 191.6f)
                lineToRelative(45.5f, 0.0f)
                reflectiveCurveToRelative(87.0f, 4.8f, 87.0f, -63.8f)
                curveToRelative(0.0f, -43.1f, -33.5f, -55.1f, -33.5f, -55.1f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(483.6f, 200.8f)
                reflectiveCurveToRelative(13.6f, -1.6f, 16.0f, 9.6f)
                curveToRelative(1.4f, 6.7f, -4.0f, 12.0f, -4.0f, 12.0f)
                lineToRelative(-12.0f, 0.0f)
                lineToRelative(0.0f, -21.6f)
                close()
                moveTo(483.5f, 310.3f)
                lineToRelative(0.1f, -24.9f)
                lineToRelative(0.0f, -18.2f)
                lineToRelative(0.1f, 0.0f)
                reflectiveCurveToRelative(41.6f, -4.7f, 41.2f, 22.4f)
                curveToRelative(-0.3f, 25.7f, -41.3f, 20.7f, -41.3f, 20.7f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mdb!!
    }

private var _mdb: ImageVector? = null
