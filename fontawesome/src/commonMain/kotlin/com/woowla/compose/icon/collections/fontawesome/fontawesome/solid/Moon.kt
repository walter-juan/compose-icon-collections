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

public val SolidGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveTo(114.6f, 512.0f, 256.0f, 512.0f)
                curveToRelative(68.8f, 0.0f, 131.3f, -27.2f, 177.3f, -71.4f)
                curveToRelative(7.3f, -7.0f, 9.4f, -17.9f, 5.3f, -27.1f)
                reflectiveCurveToRelative(-13.7f, -14.9f, -23.8f, -14.1f)
                curveToRelative(-4.9f, 0.4f, -9.8f, 0.6f, -14.8f, 0.6f)
                curveToRelative(-101.6f, 0.0f, -184.0f, -82.4f, -184.0f, -184.0f)
                curveToRelative(0.0f, -72.1f, 41.5f, -134.6f, 102.1f, -164.8f)
                curveToRelative(9.1f, -4.5f, 14.3f, -14.3f, 13.1f, -24.4f)
                reflectiveCurveTo(322.6f, 8.5f, 312.7f, 6.3f)
                curveTo(294.4f, 2.2f, 275.4f, 0.0f, 256.0f, 0.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
