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

public val SolidGroup.SackXmark: ImageVector
    get() {
        if (_sackXmark != null) {
            return _sackXmark!!
        }
        _sackXmark = Builder(name = "SackXmark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(328.0f, 112.0f)
                lineToRelative(-144.0f, 0.0f)
                lineToRelative(-37.3f, -74.5f)
                curveToRelative(-1.8f, -3.6f, -2.7f, -7.6f, -2.7f, -11.6f)
                curveToRelative(0.0f, -14.3f, 11.6f, -25.9f, 25.9f, -25.9f)
                lineTo(342.1f, 0.0f)
                curveToRelative(14.3f, 0.0f, 25.9f, 11.6f, 25.9f, 25.9f)
                curveToRelative(0.0f, 4.0f, -0.9f, 8.0f, -2.7f, 11.6f)
                lineTo(328.0f, 112.0f)
                close()
                moveTo(169.6f, 160.0f)
                lineToRelative(172.8f, 0.0f)
                lineToRelative(48.7f, 40.6f)
                curveTo(457.6f, 256.0f, 496.0f, 338.0f, 496.0f, 424.5f)
                curveTo(496.0f, 472.8f, 456.8f, 512.0f, 408.5f, 512.0f)
                lineToRelative(-305.1f, 0.0f)
                curveTo(55.2f, 512.0f, 16.0f, 472.8f, 16.0f, 424.5f)
                curveTo(16.0f, 338.0f, 54.4f, 256.0f, 120.9f, 200.6f)
                lineTo(169.6f, 160.0f)
                close()
                moveTo(323.9f, 284.1f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-33.9f, 33.9f)
                lineToRelative(-33.9f, -33.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(33.9f, 33.9f)
                lineToRelative(-33.9f, 33.9f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(33.9f, -33.9f)
                lineToRelative(33.9f, 33.9f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-33.9f, -33.9f)
                lineToRelative(33.9f, -33.9f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                close()
            }
        }
        .build()
        return _sackXmark!!
    }

private var _sackXmark: ImageVector? = null
