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

public val BrandsGroup.OctopusDeploy: ImageVector
    get() {
        if (_octopusDeploy != null) {
            return _octopusDeploy!!
        }
        _octopusDeploy = Builder(name = "OctopusDeploy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(455.7f, 349.2f)
                curveToRelative(-45.9f, -39.1f, -36.7f, -77.9f, -16.1f, -128.1f)
                curveToRelative(35.7f, -87.0f, -23.5f, -186.9f, -109.6f, -212.8f)
                curveToRelative(-92.9f, -27.9f, -195.7f, 16.0f, -230.3f, 108.8f)
                curveToRelative(-8.7f, 23.5f, -12.5f, 48.5f, -11.0f, 73.5f)
                curveToRelative(1.7f, 29.5f, 14.7f, 53.0f, 24.1f, 80.3f)
                curveToRelative(17.2f, 50.2f, -28.1f, 92.7f, -66.7f, 117.6f)
                curveToRelative(-46.8f, 30.2f, -36.3f, 39.9f, -8.4f, 41.9f)
                curveToRelative(23.4f, 1.7f, 44.5f, -4.5f, 65.3f, -15.0f)
                curveToRelative(9.2f, -4.6f, 40.7f, -18.9f, 45.1f, -28.6f)
                curveToRelative(-12.2f, 26.6f, -37.0f, 72.7f, -21.5f, 102.1f)
                curveToRelative(19.1f, 36.2f, 67.1f, -31.8f, 76.7f, -45.8f)
                curveToRelative(8.6f, -12.6f, 43.0f, -81.3f, 63.6f, -46.9f)
                curveToRelative(18.9f, 31.4f, 8.6f, 76.4f, 35.7f, 104.6f)
                curveToRelative(32.9f, 34.2f, 51.2f, -18.3f, 51.4f, -44.2f)
                curveToRelative(0.2f, -16.4f, -6.1f, -95.9f, 29.9f, -59.9f)
                curveToRelative(21.4f, 21.4f, 52.9f, 71.2f, 88.6f, 67.0f)
                curveToRelative(38.7f, -4.5f, -22.1f, -68.0f, -28.3f, -78.7f)
                curveToRelative(5.4f, 4.3f, 53.7f, 34.1f, 53.8f, 9.5f)
                curveToRelative(0.1f, -18.8f, -30.1f, -34.7f, -42.5f, -45.3f)
                close()
            }
        }
        .build()
        return _octopusDeploy!!
    }

private var _octopusDeploy: ImageVector? = null
