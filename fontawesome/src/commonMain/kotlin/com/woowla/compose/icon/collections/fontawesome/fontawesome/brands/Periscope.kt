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

public val BrandsGroup.Periscope: ImageVector
    get() {
        if (_periscope != null) {
            return _periscope!!
        }
        _periscope = Builder(name = "Periscope", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(370.0f, 63.6f)
                curveToRelative(-38.6f, -41.0f, -89.5f, -63.6f, -143.4f, -63.6f)
                curveToRelative(-114.7f, 0.0f, -208.1f, 96.2f, -208.1f, 214.4f)
                curveToRelative(0.0f, 75.1f, 57.8f, 159.8f, 82.7f, 192.7f)
                curveToRelative(36.6f, 48.4f, 91.4f, 104.9f, 125.4f, 104.9f)
                curveToRelative(41.6f, 0.0f, 112.9f, -94.2f, 120.9f, -105.0f)
                curveToRelative(24.6f, -33.1f, 82.0f, -118.3f, 82.0f, -192.6f)
                curveToRelative(0.0f, -56.5f, -21.1f, -110.1f, -59.5f, -150.8f)
                close()
                moveTo(226.6f, 493.9f)
                curveToRelative(-42.5f, 0.0f, -190.0f, -167.3f, -190.0f, -279.4f)
                curveToRelative(0.0f, -107.4f, 83.9f, -196.3f, 190.0f, -196.3f)
                curveToRelative(100.8f, 0.0f, 184.7f, 89.0f, 184.7f, 196.3f)
                curveToRelative(0.1f, 112.1f, -147.4f, 279.4f, -184.7f, 279.4f)
                close()
                moveTo(338.0f, 206.8f)
                curveToRelative(0.0f, 59.1f, -51.1f, 109.7f, -110.8f, 109.7f)
                curveToRelative(-100.6f, 0.0f, -150.7f, -108.2f, -92.9f, -181.8f)
                lineToRelative(0.0f, 0.4f)
                curveToRelative(0.0f, 24.5f, 20.1f, 44.4f, 44.8f, 44.4f)
                reflectiveCurveToRelative(44.8f, -19.9f, 44.8f, -44.4f)
                curveToRelative(0.0f, -18.2f, -11.1f, -33.8f, -26.9f, -40.7f)
                curveToRelative(76.6f, -19.2f, 141.0f, 39.3f, 141.0f, 112.4f)
                close()
            }
        }
        .build()
        return _periscope!!
    }

private var _periscope: ImageVector? = null
