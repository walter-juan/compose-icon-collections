package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 208.0f)
                curveToRelative(0.0f, 7.8f, 4.4f, 18.7f, 17.1f, 30.3f)
                curveToRelative(45.4f, -24.2f, 107.7f, -38.3f, 174.9f, -38.3f)
                reflectiveCurveToRelative(129.5f, 14.1f, 174.9f, 38.3f)
                curveToRelative(12.8f, -11.6f, 17.1f, -22.5f, 17.1f, -30.3f)
                curveToRelative(0.0f, -12.3f, -10.8f, -32.0f, -47.9f, -50.6f)
                curveToRelative(-35.2f, -17.6f, -86.1f, -29.4f, -144.1f, -29.4f)
                reflectiveCurveToRelative(-108.9f, 11.8f, -144.1f, 29.4f)
                curveTo(74.8f, 176.0f, 64.0f, 195.7f, 64.0f, 208.0f)
                close()
                moveTo(256.0f, 248.0f)
                curveToRelative(-47.0f, 0.0f, -89.3f, 7.6f, -122.9f, 19.7f)
                curveToRelative(33.2f, 12.4f, 75.7f, 20.3f, 122.9f, 20.3f)
                reflectiveCurveToRelative(89.7f, -7.8f, 122.9f, -20.3f)
                curveTo(345.3f, 255.6f, 303.0f, 248.0f, 256.0f, 248.0f)
                close()
                moveTo(0.0f, 208.0f)
                curveTo(0.0f, 158.4f, 39.4f, 122.2f, 83.3f, 100.2f)
                curveTo(129.1f, 77.3f, 190.3f, 64.0f, 256.0f, 64.0f)
                reflectiveCurveToRelative(126.9f, 13.3f, 172.7f, 36.2f)
                curveToRelative(43.9f, 22.0f, 83.3f, 58.2f, 83.3f, 107.8f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 49.6f, -39.4f, 85.8f, -83.3f, 107.8f)
                curveToRelative(-45.9f, 22.9f, -107.0f, 36.2f, -172.7f, 36.2f)
                reflectiveCurveTo(129.1f, 434.7f, 83.3f, 411.8f)
                curveTo(39.4f, 389.8f, 0.0f, 353.6f, 0.0f, 304.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
