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

public val SolidGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.0f, 7.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(89.4f, 89.4f)
                lineToRelative(55.0f, -55.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(-55.0f, 55.0f)
                lineToRelative(89.4f, 89.4f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-96.0f, 96.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-89.4f, -89.4f)
                lineToRelative(-15.5f, 15.5f)
                curveToRelative(11.4f, 24.6f, 17.8f, 52.0f, 17.8f, 80.9f)
                curveToRelative(0.0f, 31.7f, -7.7f, 61.5f, -21.2f, 87.8f)
                curveToRelative(-4.7f, 9.0f, -16.7f, 10.3f, -23.8f, 3.1f)
                lineToRelative(-96.3f, -96.3f)
                lineToRelative(-60.0f, 60.0f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(60.0f, -60.0f)
                lineToRelative(-96.3f, -96.3f)
                curveToRelative(-7.2f, -7.2f, -5.9f, -19.2f, 3.1f, -23.8f)
                curveToRelative(26.3f, -13.6f, 56.2f, -21.2f, 87.8f, -21.2f)
                curveToRelative(28.9f, 0.0f, 56.3f, 6.4f, 80.9f, 17.8f)
                lineTo(192.4f, 226.3f)
                lineTo(103.0f, 137.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(199.0f, 7.0f)
                close()
                moveTo(216.0f, 57.9f)
                lineToRelative(-62.1f, 62.1f)
                lineToRelative(72.4f, 72.4f)
                lineToRelative(62.1f, -62.1f)
                lineToRelative(-72.4f, -72.4f)
                close()
                moveTo(392.0f, 358.1f)
                lineToRelative(62.1f, -62.1f)
                lineToRelative(-72.4f, -72.4f)
                lineToRelative(-62.1f, 62.1f)
                lineToRelative(72.4f, 72.4f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
