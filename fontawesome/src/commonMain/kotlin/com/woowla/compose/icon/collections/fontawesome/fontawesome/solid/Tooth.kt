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

public val SolidGroup.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(145.0f, 5.7f)
                lineTo(224.0f, 32.0f)
                lineTo(303.0f, 5.7f)
                curveTo(314.3f, 1.9f, 326.0f, 0.0f, 337.9f, 0.0f)
                curveTo(398.7f, 0.0f, 448.0f, 49.3f, 448.0f, 110.1f)
                lineToRelative(0.0f, 68.5f)
                curveToRelative(0.0f, 29.4f, -9.5f, 58.1f, -27.2f, 81.6f)
                lineToRelative(-1.1f, 1.5f)
                curveToRelative(-12.9f, 17.2f, -21.3f, 37.4f, -24.3f, 58.7f)
                lineTo(373.7f, 471.9f)
                curveToRelative(-3.3f, 23.0f, -23.0f, 40.1f, -46.2f, 40.1f)
                curveToRelative(-22.8f, 0.0f, -42.3f, -16.5f, -46.0f, -39.0f)
                lineTo(261.3f, 351.6f)
                curveToRelative(-3.0f, -18.2f, -18.8f, -31.6f, -37.3f, -31.6f)
                reflectiveCurveToRelative(-34.2f, 13.4f, -37.3f, 31.6f)
                lineTo(166.5f, 473.0f)
                curveToRelative(-3.8f, 22.5f, -23.2f, 39.0f, -46.0f, 39.0f)
                curveToRelative(-23.2f, 0.0f, -42.9f, -17.1f, -46.2f, -40.1f)
                lineTo(52.6f, 320.5f)
                curveToRelative(-3.0f, -21.3f, -11.4f, -41.5f, -24.3f, -58.7f)
                lineToRelative(-1.1f, -1.5f)
                curveTo(9.5f, 236.7f, 0.0f, 208.1f, 0.0f, 178.7f)
                lineToRelative(0.0f, -68.5f)
                curveTo(0.0f, 49.3f, 49.3f, 0.0f, 110.1f, 0.0f)
                curveTo(122.0f, 0.0f, 133.7f, 1.9f, 145.0f, 5.7f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
