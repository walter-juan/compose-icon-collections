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

public val BrandsGroup.Edge: ImageVector
    get() {
        if (_edge != null) {
            return _edge!!
        }
        _edge = Builder(name = "Edge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.1f, 37.4f)
                curveToRelative(41.0f, -25.2f, 87.6f, -38.2f, 134.9f, -37.4f)
                curveToRelative(168.0f, 0.0f, 257.0f, 123.8f, 257.0f, 219.5f)
                curveToRelative(-0.1f, 32.7f, -13.0f, 63.9f, -35.9f, 87.2f)
                curveToRelative(-22.9f, 23.2f, -54.0f, 36.5f, -86.7f, 37.0f)
                curveToRelative(-75.2f, 0.0f, -91.5f, -23.1f, -91.5f, -32.0f)
                curveToRelative(0.0f, -3.8f, 1.2f, -6.2f, 4.8f, -9.4f)
                lineToRelative(1.0f, -1.2f)
                lineToRelative(0.4f, -1.6f)
                curveToRelative(10.5f, -11.5f, 15.9f, -26.2f, 15.9f, -41.6f)
                curveToRelative(0.0f, -78.7f, -82.2f, -142.7f, -184.0f, -142.7f)
                curveToRelative(-37.5f, -0.3f, -74.5f, 8.9f, -107.5f, 26.9f)
                curveToRelative(27.0f, -57.5f, 82.7f, -97.6f, 91.3f, -103.8f)
                curveToRelative(0.8f, -0.6f, 0.3f, -0.8f, 0.3f, -0.8f)
                close()
                moveTo(135.7f, 355.5f)
                curveToRelative(-1.4f, 30.0f, 4.6f, 60.0f, 16.4f, 87.2f)
                curveToRelative(13.6f, 26.4f, 32.7f, 51.0f, 56.5f, 69.3f)
                curveToRelative(-59.5f, -11.5f, -111.5f, -43.9f, -149.4f, -89.3f)
                curveToRelative(-38.1f, -46.4f, -59.2f, -104.3f, -59.2f, -164.8f)
                curveToRelative(0.0f, -51.2f, 62.4f, -94.4f, 136.0f, -94.4f)
                curveToRelative(36.6f, -0.6f, 72.4f, 10.9f, 101.8f, 32.7f)
                lineToRelative(-3.6f, 1.2f)
                curveToRelative(-51.5f, 17.6f, -98.5f, 90.7f, -98.5f, 158.1f)
                close()
                moveTo(469.8f, 400.0f)
                lineToRelative(-0.7f, 0.1f)
                curveToRelative(-11.8f, 18.8f, -25.9f, 35.1f, -42.2f, 49.5f)
                curveToRelative(-30.8f, 28.0f, -68.1f, 45.5f, -108.8f, 49.9f)
                curveToRelative(-18.6f, 0.3f, -36.8f, -3.2f, -53.8f, -11.4f)
                curveToRelative(-25.6f, -10.3f, -47.1f, -30.0f, -61.6f, -53.0f)
                curveToRelative(-14.4f, -23.9f, -21.1f, -51.7f, -19.0f, -79.6f)
                curveToRelative(-0.6f, -20.1f, 5.4f, -40.3f, 15.0f, -58.2f)
                curveToRelative(13.9f, 33.1f, 37.5f, 61.3f, 67.6f, 80.8f)
                reflectiveCurveToRelative(65.5f, 29.5f, 101.4f, 28.6f)
                curveToRelative(31.0f, 0.3f, 62.1f, -6.7f, 90.2f, -20.5f)
                lineToRelative(1.9f, -0.9f)
                curveToRelative(3.9f, -2.3f, 7.7f, -3.9f, 11.6f, 0.0f)
                curveToRelative(4.5f, 4.9f, 1.8f, 9.2f, -1.2f, 14.0f)
                curveToRelative(-0.2f, 0.2f, -0.3f, 0.5f, -0.4f, 0.7f)
                close()
            }
        }
        .build()
        return _edge!!
    }

private var _edge: ImageVector? = null
