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

public val BrandsGroup.Speakap: ImageVector
    get() {
        if (_speakap != null) {
            return _speakap!!
        }
        _speakap = Builder(name = "Speakap", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.4f, 391.8f)
                curveTo(-15.0f, 303.6f, -7.6f, 167.4f, 81.1f, 87.6f)
                reflectiveCurveToRelative(224.8f, -73.0f, 304.2f, 15.2f)
                reflectiveCurveToRelative(72.0f, 224.4f, -16.6f, 304.1f)
                curveToRelative(-18.7f, 16.9f, 64.0f, 43.1f, 42.0f, 52.3f)
                curveToRelative(-82.1f, 34.2f, -253.9f, 35.0f, -346.2f, -67.5f)
                lineToRelative(0.0f, 0.0f)
                close()
                moveTo(277.7f, 180.2f)
                lineToRelative(38.5f, -40.9f)
                curveToRelative(-9.6f, -8.9f, -32.0f, -26.8f, -76.2f, -27.6f)
                curveToRelative(-52.3f, -0.9f, -95.9f, 28.3f, -96.8f, 80.0f)
                curveToRelative(-0.2f, 11.3f, 0.3f, 36.7f, 29.4f, 54.8f)
                curveToRelative(34.5f, 21.4f, 86.5f, 21.5f, 86.0f, 52.3f)
                curveToRelative(-0.4f, 21.3f, -26.4f, 25.8f, -38.6f, 25.6f)
                curveToRelative(-3.0f, 0.0f, -30.2f, -0.5f, -47.6f, -24.6f)
                lineToRelative(-40.0f, 42.6f)
                curveToRelative(28.2f, 27.0f, 59.0f, 32.6f, 83.5f, 33.0f)
                curveToRelative(10.2f, 0.2f, 96.4f, 0.3f, 97.8f, -81.0f)
                curveToRelative(0.3f, -15.8f, -2.1f, -39.7f, -28.9f, -56.6f)
                curveToRelative(-34.4f, -21.6f, -85.0f, -19.4f, -84.4f, -49.7f)
                curveToRelative(0.4f, -23.3f, 31.0f, -25.4f, 37.5f, -25.3f)
                curveToRelative(0.4f, 0.0f, 26.6f, 0.3f, 39.6f, 17.4f)
                lineToRelative(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _speakap!!
    }

private var _speakap: ImageVector? = null
