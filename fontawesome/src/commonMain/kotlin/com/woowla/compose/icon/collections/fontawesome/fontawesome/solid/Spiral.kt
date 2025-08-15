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

public val SolidGroup.Spiral: ImageVector
    get() {
        if (_spiral != null) {
            return _spiral!!
        }
        _spiral = Builder(name = "Spiral", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.5f, 7.4f)
                curveToRelative(13.6f, -11.3f, 33.8f, -9.5f, 45.1f, 4.1f)
                reflectiveCurveToRelative(9.5f, 33.8f, -4.1f, 45.1f)
                curveTo(100.2f, 103.5f, 64.0f, 175.2f, 64.0f, 256.0f)
                curveTo(64.0f, 362.0f, 150.0f, 448.0f, 256.0f, 448.0f)
                reflectiveCurveToRelative(192.0f, -86.0f, 192.0f, -192.0f)
                curveToRelative(0.0f, -75.1f, -60.9f, -136.0f, -136.0f, -136.0f)
                reflectiveCurveTo(176.0f, 180.9f, 176.0f, 256.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                curveToRelative(0.0f, -48.6f, 39.4f, -88.0f, 88.0f, -88.0f)
                reflectiveCurveToRelative(88.0f, 39.4f, 88.0f, 88.0f)
                curveToRelative(0.0f, 79.5f, -64.5f, 144.0f, -144.0f, 144.0f)
                reflectiveCurveTo(112.0f, 335.5f, 112.0f, 256.0f)
                curveToRelative(0.0f, -110.5f, 89.5f, -200.0f, 200.0f, -200.0f)
                reflectiveCurveToRelative(200.0f, 89.5f, 200.0f, 200.0f)
                curveToRelative(0.0f, 141.4f, -114.6f, 256.0f, -256.0f, 256.0f)
                reflectiveCurveTo(0.0f, 397.4f, 0.0f, 256.0f)
                curveTo(0.0f, 155.8f, 45.0f, 66.1f, 115.5f, 7.4f)
                close()
            }
        }
        .build()
        return _spiral!!
    }

private var _spiral: ImageVector? = null
