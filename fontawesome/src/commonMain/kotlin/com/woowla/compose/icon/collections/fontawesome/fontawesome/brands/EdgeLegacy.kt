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

public val BrandsGroup.EdgeLegacy: ImageVector
    get() {
        if (_edgeLegacy != null) {
            return _edgeLegacy!!
        }
        _edgeLegacy = Builder(name = "EdgeLegacy", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(-6.0f, 228.2f)
                lineToRelative(0.4f, -0.5f)
                curveToRelative(0.0f, 0.2f, 0.0f, 0.3f, -0.1f, 0.5f)
                lineToRelative(-0.3f, 0.0f)
                close()
                moveTo(454.6f, 243.7f)
                curveToRelative(0.0f, -44.0f, -7.8f, -84.5f, -28.8f, -122.4f)
                curveToRelative(-41.0f, -73.4f, -113.6f, -113.3f, -198.6f, -113.3f)
                curveToRelative(-139.9f, -0.3f, -218.3f, 105.2f, -232.8f, 219.7f)
                curveToRelative(42.4f, -61.3f, 117.1f, -121.4f, 220.4f, -125.0f)
                curveToRelative(0.0f, 0.0f, 109.7f, 0.0f, 99.4f, 105.0f)
                lineToRelative(-175.8f, 0.0f)
                curveToRelative(6.4f, -37.4f, 18.5f, -59.0f, 34.3f, -78.9f)
                curveToRelative(-75.0f, 34.9f, -121.8f, 96.1f, -120.8f, 188.3f)
                curveToRelative(0.8f, 71.5f, 50.1f, 144.8f, 120.8f, 172.0f)
                curveToRelative(83.4f, 31.8f, 192.8f, 7.2f, 240.1f, -21.3f)
                lineToRelative(0.0f, -104.4f)
                curveToRelative(-80.9f, 56.5f, -270.9f, 60.9f, -272.3f, -67.6f)
                lineToRelative(314.1f, 0.0f)
                lineToRelative(0.0f, -52.1f)
                close()
            }
        }
        .build()
        return _edgeLegacy!!
    }

private var _edgeLegacy: ImageVector? = null
