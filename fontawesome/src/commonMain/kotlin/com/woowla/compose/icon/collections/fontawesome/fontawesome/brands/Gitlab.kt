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

public val BrandsGroup.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 204.6f)
                lineToRelative(-0.7f, -1.8f)
                lineToRelative(-69.7f, -181.8f)
                curveToRelative(-1.4f, -3.6f, -3.9f, -6.6f, -7.2f, -8.6f)
                curveToRelative(-2.4f, -1.6f, -5.1f, -2.5f, -8.0f, -2.8f)
                reflectiveCurveToRelative(-5.7f, 0.1f, -8.4f, 1.1f)
                reflectiveCurveToRelative(-5.1f, 2.7f, -7.1f, 4.8f)
                curveToRelative(-1.9f, 2.1f, -3.3f, 4.7f, -4.1f, 7.4f)
                lineToRelative(-47.0f, 144.0f)
                lineToRelative(-190.5f, 0.0f)
                lineToRelative(-47.1f, -144.0f)
                curveToRelative(-0.8f, -2.8f, -2.2f, -5.3f, -4.1f, -7.4f)
                curveToRelative(-2.0f, -2.1f, -4.4f, -3.7f, -7.1f, -4.8f)
                curveToRelative(-2.6f, -1.0f, -5.5f, -1.4f, -8.4f, -1.1f)
                reflectiveCurveToRelative(-5.6f, 1.2f, -8.0f, 2.8f)
                curveToRelative(-3.2f, 2.0f, -5.8f, 5.1f, -7.2f, 8.6f)
                lineTo(9.8f, 202.8f)
                lineTo(9.0f, 204.6f)
                curveToRelative(-10.0f, 26.2f, -11.3f, 55.0f, -3.5f, 82.0f)
                curveToRelative(7.7f, 26.9f, 24.0f, 50.7f, 46.4f, 67.6f)
                lineToRelative(0.3f, 0.2f)
                lineToRelative(0.6f, 0.4f)
                lineToRelative(106.0f, 79.5f)
                curveToRelative(38.5f, 29.1f, 66.7f, 50.3f, 84.6f, 63.9f)
                curveToRelative(3.7f, 1.9f, 8.3f, 4.3f, 13.0f, 4.3f)
                reflectiveCurveToRelative(9.3f, -2.4f, 13.0f, -4.3f)
                curveToRelative(17.9f, -13.5f, 46.1f, -34.9f, 84.6f, -63.9f)
                lineToRelative(106.7f, -79.9f)
                lineToRelative(0.3f, -0.3f)
                curveToRelative(22.4f, -16.9f, 38.7f, -40.6f, 45.6f, -67.5f)
                curveToRelative(8.6f, -27.0f, 7.4f, -55.8f, -2.6f, -82.0f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
