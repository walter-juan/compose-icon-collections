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

public val BrandsGroup.Redhat: ImageVector
    get() {
        if (_redhat != null) {
            return _redhat!!
        }
        _redhat = Builder(name = "Redhat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(341.5f, 285.6f)
                curveToRelative(33.7f, 0.0f, 82.3f, -6.9f, 82.3f, -47.0f)
                curveToRelative(0.2f, -6.7f, 0.9f, -1.8f, -20.9f, -96.2f)
                curveToRelative(-4.6f, -19.1f, -8.7f, -27.8f, -42.3f, -44.6f)
                curveToRelative(-26.1f, -13.3f, -82.9f, -35.4f, -99.7f, -35.4f)
                curveToRelative(-15.7f, 0.0f, -20.2f, 20.2f, -38.9f, 20.2f)
                curveToRelative(-18.0f, 0.0f, -31.3f, -15.1f, -48.1f, -15.1f)
                curveToRelative(-16.1f, 0.0f, -26.7f, 11.0f, -34.8f, 33.6f)
                curveToRelative(-27.5f, 77.6f, -26.3f, 74.3f, -26.1f, 78.3f)
                curveToRelative(0.0f, 24.8f, 97.6f, 106.1f, 228.5f, 106.1f)
                close()
                moveTo(429.0f, 254.8f)
                curveToRelative(4.7f, 22.0f, 4.7f, 24.3f, 4.7f, 27.2f)
                curveToRelative(0.0f, 37.7f, -42.3f, 58.6f, -98.0f, 58.6f)
                curveToRelative(-125.7f, 0.1f, -235.9f, -73.6f, -235.9f, -122.3f)
                curveToRelative(0.0f, -6.8f, 1.4f, -13.5f, 4.1f, -19.7f)
                curveToRelative(-45.2f, 2.3f, -103.8f, 10.3f, -103.8f, 62.0f)
                curveToRelative(0.0f, 84.7f, 200.6f, 189.0f, 359.5f, 189.0f)
                curveToRelative(121.8f, 0.0f, 152.5f, -55.1f, 152.5f, -98.6f)
                curveToRelative(0.0f, -34.2f, -29.6f, -73.0f, -82.9f, -96.2f)
                close()
            }
        }
        .build()
        return _redhat!!
    }

private var _redhat: ImageVector? = null
