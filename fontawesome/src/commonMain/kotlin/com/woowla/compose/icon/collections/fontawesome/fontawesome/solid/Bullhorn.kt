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

public val SolidGroup.Bullhorn: ImageVector
    get() {
        if (_bullhorn != null) {
            return _bullhorn!!
        }
        _bullhorn = Builder(name = "Bullhorn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(461.2f, 18.9f)
                curveTo(472.7f, 24.0f, 480.0f, 35.4f, 480.0f, 48.0f)
                lineToRelative(0.0f, 416.0f)
                curveToRelative(0.0f, 12.6f, -7.3f, 24.0f, -18.8f, 29.1f)
                reflectiveCurveToRelative(-24.8f, 3.2f, -34.3f, -5.1f)
                lineToRelative(-46.6f, -40.7f)
                curveToRelative(-43.6f, -38.1f, -98.7f, -60.3f, -156.4f, -63.0f)
                lineToRelative(0.0f, 95.7f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                curveTo(57.3f, 384.0f, 0.0f, 326.7f, 0.0f, 256.0f)
                reflectiveCurveTo(57.3f, 128.0f, 128.0f, 128.0f)
                lineToRelative(84.5f, 0.0f)
                curveToRelative(61.8f, -0.2f, 121.4f, -22.7f, 167.9f, -63.3f)
                lineToRelative(46.6f, -40.7f)
                curveToRelative(9.4f, -8.3f, 22.9f, -10.2f, 34.3f, -5.1f)
                close()
                moveTo(224.0f, 320.0f)
                lineToRelative(0.0f, 0.2f)
                curveToRelative(70.3f, 2.7f, 137.8f, 28.5f, 192.0f, 73.4f)
                lineToRelative(0.0f, -275.3f)
                curveToRelative(-54.2f, 44.9f, -121.7f, 70.7f, -192.0f, 73.4f)
                lineTo(224.0f, 320.0f)
                close()
            }
        }
        .build()
        return _bullhorn!!
    }

private var _bullhorn: ImageVector? = null
