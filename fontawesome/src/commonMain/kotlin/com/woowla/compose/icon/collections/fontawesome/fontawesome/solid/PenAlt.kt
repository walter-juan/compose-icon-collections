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

public val SolidGroup.PenAlt: ImageVector
    get() {
        if (_penAlt != null) {
            return _penAlt!!
        }
        _penAlt = Builder(name = "PenAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.0f, 0.0f)
                curveToRelative(19.2f, 0.0f, 37.6f, 7.6f, 51.1f, 21.2f)
                lineToRelative(35.7f, 35.7f)
                curveTo(504.4f, 70.4f, 512.0f, 88.8f, 512.0f, 108.0f)
                reflectiveCurveToRelative(-7.6f, 37.6f, -21.2f, 51.1f)
                lineTo(445.9f, 204.0f)
                lineTo(308.0f, 66.1f)
                lineTo(352.9f, 21.2f)
                curveTo(366.4f, 7.6f, 384.8f, 0.0f, 404.0f, 0.0f)
                close()
                moveTo(274.1f, 100.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(137.9f, 137.9f)
                lineToRelative(-215.1f, 215.1f)
                curveToRelative(-10.7f, 10.7f, -24.1f, 18.5f, -38.7f, 22.6f)
                lineTo(30.4f, 511.1f)
                curveToRelative(-8.3f, 2.3f, -17.3f, 0.0f, -23.4f, -6.2f)
                reflectiveCurveToRelative(-8.5f, -15.1f, -6.2f, -23.4f)
                lineTo(36.4f, 353.8f)
                curveToRelative(4.1f, -14.6f, 11.8f, -27.9f, 22.6f, -38.7f)
                lineTo(240.1f, 133.9f)
                lineTo(223.0f, 116.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(89.0f, 217.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(155.1f, 82.9f)
                curveToRelative(28.1f, -28.1f, 73.7f, -28.1f, 101.8f, 0.0f)
                lineTo(274.1f, 100.0f)
                close()
            }
        }
        .build()
        return _penAlt!!
    }

private var _penAlt: ImageVector? = null
