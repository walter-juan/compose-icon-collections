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

public val BrandsGroup.Mastodon: ImageVector
    get() {
        if (_mastodon != null) {
            return _mastodon!!
        }
        _mastodon = Builder(name = "Mastodon", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.0f, 179.1f)
                curveToRelative(0.0f, -97.2f, -63.7f, -125.7f, -63.7f, -125.7f)
                curveToRelative(-62.5f, -28.7f, -228.6f, -28.4f, -290.5f, 0.0f)
                curveToRelative(0.0f, 0.0f, -63.7f, 28.5f, -63.7f, 125.7f)
                curveToRelative(0.0f, 115.7f, -6.6f, 259.4f, 105.6f, 289.1f)
                curveToRelative(40.5f, 10.7f, 75.3f, 13.0f, 103.3f, 11.4f)
                curveToRelative(50.8f, -2.8f, 79.3f, -18.1f, 79.3f, -18.1f)
                lineToRelative(-1.7f, -36.9f)
                reflectiveCurveToRelative(-36.3f, 11.4f, -77.1f, 10.1f)
                curveToRelative(-40.4f, -1.4f, -83.0f, -4.4f, -89.6f, -54.0f)
                curveToRelative(-0.6f, -4.6f, -0.9f, -9.3f, -0.9f, -13.9f)
                curveToRelative(85.6f, 20.9f, 158.7f, 9.1f, 178.7f, 6.7f)
                curveToRelative(56.1f, -6.7f, 105.0f, -41.3f, 111.2f, -72.9f)
                curveToRelative(9.8f, -49.8f, 9.0f, -121.5f, 9.0f, -121.5f)
                close()
                moveTo(357.9f, 304.3f)
                lineToRelative(-46.6f, 0.0f)
                lineToRelative(0.0f, -114.2f)
                curveToRelative(0.0f, -49.7f, -64.0f, -51.6f, -64.0f, 6.9f)
                lineToRelative(0.0f, 62.5f)
                lineToRelative(-46.3f, 0.0f)
                lineToRelative(0.0f, -62.5f)
                curveToRelative(0.0f, -58.5f, -64.0f, -56.6f, -64.0f, -6.9f)
                lineToRelative(0.0f, 114.2f)
                lineToRelative(-46.7f, 0.0f)
                curveToRelative(0.0f, -122.1f, -5.2f, -147.9f, 18.4f, -175.0f)
                curveToRelative(25.9f, -28.9f, 79.8f, -30.8f, 103.8f, 6.1f)
                lineToRelative(11.6f, 19.5f)
                lineToRelative(11.6f, -19.5f)
                curveToRelative(24.1f, -37.1f, 78.1f, -34.8f, 103.8f, -6.1f)
                curveToRelative(23.7f, 27.3f, 18.4f, 53.0f, 18.4f, 175.0f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mastodon!!
    }

private var _mastodon: ImageVector? = null
