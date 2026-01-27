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

public val BrandsGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(459.4f, 151.7f)
                curveToRelative(0.3f, 4.5f, 0.3f, 9.1f, 0.3f, 13.6f)
                curveToRelative(0.0f, 138.7f, -105.6f, 298.6f, -298.6f, 298.6f)
                curveToRelative(-59.5f, 0.0f, -114.7f, -17.2f, -161.1f, -47.1f)
                curveToRelative(8.4f, 1.0f, 16.6f, 1.3f, 25.3f, 1.3f)
                curveToRelative(49.1f, 0.0f, 94.2f, -16.6f, 130.3f, -44.8f)
                curveToRelative(-46.1f, -1.0f, -84.8f, -31.2f, -98.1f, -72.8f)
                curveToRelative(6.5f, 1.0f, 13.0f, 1.6f, 19.8f, 1.6f)
                curveToRelative(9.4f, 0.0f, 18.8f, -1.3f, 27.6f, -3.6f)
                curveToRelative(-48.1f, -9.7f, -84.1f, -52.0f, -84.1f, -103.0f)
                lineToRelative(0.0f, -1.3f)
                curveToRelative(14.0f, 7.8f, 30.2f, 12.7f, 47.4f, 13.3f)
                curveToRelative(-28.3f, -18.8f, -46.8f, -51.0f, -46.8f, -87.4f)
                curveToRelative(0.0f, -19.5f, 5.2f, -37.4f, 14.3f, -53.0f)
                curveToRelative(51.7f, 63.7f, 129.3f, 105.3f, 216.4f, 109.8f)
                curveToRelative(-1.6f, -7.8f, -2.6f, -15.9f, -2.6f, -24.0f)
                curveToRelative(0.0f, -57.8f, 46.8f, -104.9f, 104.9f, -104.9f)
                curveToRelative(30.2f, 0.0f, 57.5f, 12.7f, 76.7f, 33.1f)
                curveToRelative(23.7f, -4.5f, 46.5f, -13.3f, 66.6f, -25.3f)
                curveToRelative(-7.8f, 24.4f, -24.4f, 44.8f, -46.1f, 57.8f)
                curveToRelative(21.1f, -2.3f, 41.6f, -8.1f, 60.4f, -16.2f)
                curveToRelative(-14.3f, 20.8f, -32.2f, 39.3f, -52.6f, 54.3f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
