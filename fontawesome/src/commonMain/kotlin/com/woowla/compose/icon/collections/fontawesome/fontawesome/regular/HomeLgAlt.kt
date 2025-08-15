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

public val RegularGroup.HomeLgAlt: ImageVector
    get() {
        if (_homeLgAlt != null) {
            return _homeLgAlt!!
        }
        _homeLgAlt = Builder(name = "HomeLgAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 6.1f)
                curveToRelative(9.1f, -8.2f, 22.9f, -8.2f, 32.0f, 0.0f)
                lineToRelative(232.0f, 208.0f)
                curveToRelative(9.9f, 8.8f, 10.7f, 24.0f, 1.8f, 33.9f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -33.9f, 1.8f)
                lineToRelative(-8.0f, -7.2f)
                lineToRelative(0.0f, 205.3f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-288.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -205.3f)
                lineToRelative(-8.0f, 7.2f)
                curveToRelative(-9.9f, 8.8f, -25.0f, 8.0f, -33.9f, -1.8f)
                reflectiveCurveToRelative(-8.0f, -25.0f, 1.8f, -33.9f)
                lineTo(240.0f, 6.1f)
                close()
                moveTo(256.0f, 56.2f)
                lineTo(96.0f, 199.7f)
                lineTo(96.0f, 448.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -104.0f)
                curveToRelative(0.0f, -39.8f, 32.2f, -72.0f, 72.0f, -72.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                lineToRelative(0.0f, 104.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -248.3f)
                lineToRelative(-160.0f, -143.4f)
                close()
                moveTo(208.0f, 464.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(0.0f, -104.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 104.0f)
                close()
            }
        }
        .build()
        return _homeLgAlt!!
    }

private var _homeLgAlt: ImageVector? = null
