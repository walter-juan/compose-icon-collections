package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.3f, 48.7f)
                curveToRelative(-107.1f, 8.5f, -191.3f, 98.1f, -191.3f, 207.3f)
                curveToRelative(0.0f, 114.9f, 93.1f, 208.0f, 208.0f, 208.0f)
                curveToRelative(33.3f, 0.0f, 64.7f, -7.8f, 92.6f, -21.7f)
                curveToRelative(-103.4f, -23.4f, -180.6f, -115.8f, -180.6f, -226.3f)
                curveToRelative(0.0f, -65.8f, 27.4f, -125.1f, 71.3f, -167.3f)
                close()
                moveTo(0.0f, 256.0f)
                curveToRelative(0.0f, -141.4f, 114.6f, -256.0f, 256.0f, -256.0f)
                curveToRelative(19.4f, 0.0f, 38.4f, 2.2f, 56.7f, 6.3f)
                curveToRelative(9.9f, 2.2f, 17.3f, 10.5f, 18.5f, 20.5f)
                reflectiveCurveToRelative(-4.0f, 19.8f, -13.1f, 24.4f)
                curveToRelative(-60.6f, 30.2f, -102.1f, 92.7f, -102.1f, 164.8f)
                curveToRelative(0.0f, 101.6f, 82.4f, 184.0f, 184.0f, 184.0f)
                curveToRelative(5.0f, 0.0f, 9.9f, -0.2f, 14.8f, -0.6f)
                curveToRelative(10.1f, -0.8f, 19.6f, 4.8f, 23.8f, 14.1f)
                reflectiveCurveToRelative(2.0f, 20.1f, -5.3f, 27.1f)
                curveTo(387.3f, 484.8f, 324.8f, 512.0f, 256.0f, 512.0f)
                curveTo(114.6f, 512.0f, 0.0f, 397.4f, 0.0f, 256.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
