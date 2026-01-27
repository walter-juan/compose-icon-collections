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

public val BrandsGroup.Rebel: ImageVector
    get() {
        if (_rebel != null) {
            return _rebel!!
        }
        _rebel = Builder(name = "Rebel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.9f, 504.0f)
                curveToRelative(-139.3f, 0.0f, -247.5f, -116.2f, -243.3f, -254.1f)
                curveToRelative(2.8f, -79.2f, 43.2f, -152.2f, 116.5f, -200.4f)
                curveToRelative(0.3f, 0.0f, 1.9f, -0.6f, 1.1f, 0.8f)
                curveToRelative(-5.8f, 5.5f, -111.3f, 129.8f, -14.1f, 226.4f)
                curveToRelative(49.8f, 49.5f, 90.0f, 2.5f, 90.0f, 2.5f)
                curveToRelative(38.5f, -50.1f, -0.6f, -125.9f, -0.6f, -125.9f)
                curveToRelative(-10.0f, -24.9f, -45.7f, -40.1f, -45.7f, -40.1f)
                lineToRelative(28.8f, -31.8f)
                curveToRelative(24.4f, 10.5f, 43.2f, 38.7f, 43.2f, 38.7f)
                curveToRelative(0.8f, -29.6f, -21.9f, -61.4f, -21.9f, -61.4f)
                lineTo(255.5f, 8.0f)
                lineTo(299.8f, 58.1f)
                curveToRelative(-20.5f, 28.8f, -21.9f, 62.6f, -21.9f, 62.6f)
                curveToRelative(13.8f, -23.0f, 43.5f, -39.3f, 43.5f, -39.3f)
                lineToRelative(28.5f, 31.8f)
                curveToRelative(-27.4f, 8.9f, -45.4f, 39.9f, -45.4f, 39.9f)
                curveToRelative(-15.8f, 28.5f, -27.1f, 89.4f, 0.6f, 127.3f)
                curveToRelative(32.4f, 44.6f, 87.7f, -2.8f, 87.7f, -2.8f)
                curveToRelative(102.7f, -91.9f, -10.5f, -225.0f, -10.5f, -225.0f)
                curveToRelative(-6.1f, -5.5f, 0.8f, -2.8f, 0.8f, -2.8f)
                curveToRelative(50.1f, 36.5f, 114.6f, 84.4f, 116.2f, 204.8f)
                curveToRelative(2.0f, 145.6f, -99.9f, 249.4f, -242.4f, 249.4f)
                close()
            }
        }
        .build()
        return _rebel!!
    }

private var _rebel: ImageVector? = null
