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

public val BrandsGroup.InternetExplorer: ImageVector
    get() {
        if (_internetExplorer != null) {
            return _internetExplorer!!
        }
        _internetExplorer = Builder(name = "InternetExplorer", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.1f, 159.7f)
                curveToRelative(10.9f, -24.6f, 21.4f, -60.4f, 21.4f, -87.9f)
                curveToRelative(0.0f, -72.7f, -79.6f, -98.4f, -209.7f, -38.6f)
                curveToRelative(-107.6f, -7.2f, -211.2f, 73.7f, -237.1f, 186.5f)
                curveToRelative(30.9f, -34.9f, 78.3f, -82.3f, 122.0f, -101.2f)
                curveToRelative(-54.3f, 48.3f, -100.6f, 109.4f, -135.7f, 173.2f)
                curveToRelative(-20.7f, 37.9f, -44.0f, 99.2f, -44.0f, 145.0f)
                curveToRelative(0.0f, 98.6f, 92.9f, 86.5f, 180.3f, 42.0f)
                curveToRelative(31.4f, 15.4f, 66.6f, 15.6f, 101.7f, 15.6f)
                curveToRelative(97.1f, 0.0f, 184.2f, -54.3f, 216.8f, -146.0f)
                lineToRelative(-120.8f, 0.0f)
                curveToRelative(-52.5f, 88.6f, -196.8f, 53.0f, -196.8f, -47.4f)
                lineToRelative(328.8f, 0.0f)
                curveToRelative(6.4f, -43.6f, -1.7f, -95.7f, -26.9f, -141.2f)
                close()
                moveTo(64.6f, 346.9f)
                curveTo(82.3f, 398.0f, 118.3f, 442.7f, 164.8f, 470.2f)
                curveTo(76.1f, 519.1f, -8.4f, 499.3f, 64.6f, 346.9f)
                close()
                moveTo(180.5f, 238.0f)
                curveToRelative(2.0f, -55.2f, 50.3f, -94.9f, 104.0f, -94.9f)
                curveToRelative(53.4f, 0.0f, 102.0f, 39.7f, 104.0f, 94.9f)
                lineToRelative(-208.0f, 0.0f)
                close()
                moveTo(365.1f, 50.4f)
                curveToRelative(21.4f, -10.3f, 48.6f, -22.0f, 72.6f, -22.0f)
                curveToRelative(31.4f, 0.0f, 54.3f, 21.7f, 54.3f, 53.7f)
                curveToRelative(0.0f, 20.0f, -7.4f, 49.0f, -14.6f, 67.9f)
                curveToRelative(-26.3f, -42.3f, -66.0f, -81.6f, -112.3f, -99.6f)
                close()
            }
        }
        .build()
        return _internetExplorer!!
    }

private var _internetExplorer: ImageVector? = null
