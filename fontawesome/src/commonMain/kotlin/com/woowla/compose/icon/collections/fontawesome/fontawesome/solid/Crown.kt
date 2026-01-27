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

public val SolidGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.0f, 87.2f)
                curveToRelative(9.2f, -7.3f, 15.0f, -18.6f, 15.0f, -31.2f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                curveToRelative(0.0f, 12.6f, 5.9f, 23.9f, 15.0f, 31.2f)
                lineTo(194.6f, 194.8f)
                curveToRelative(-10.0f, 15.7f, -31.3f, 19.6f, -46.2f, 8.4f)
                lineTo(88.9f, 158.7f)
                curveToRelative(4.5f, -6.4f, 7.1f, -14.3f, 7.1f, -22.7f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                curveToRelative(0.0f, 21.8f, 17.5f, 39.6f, 39.2f, 40.0f)
                lineTo(87.8f, 393.5f)
                curveToRelative(4.7f, 31.3f, 31.6f, 54.5f, 63.3f, 54.5f)
                lineToRelative(273.8f, 0.0f)
                curveToRelative(31.7f, 0.0f, 58.6f, -23.2f, 63.3f, -54.5f)
                lineTo(520.8f, 176.0f)
                curveToRelative(21.7f, -0.4f, 39.2f, -18.2f, 39.2f, -40.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                curveToRelative(0.0f, 8.4f, 2.6f, 16.3f, 7.1f, 22.7f)
                lineToRelative(-59.4f, 44.6f)
                curveToRelative(-14.9f, 11.2f, -36.2f, 7.3f, -46.2f, -8.4f)
                lineTo(313.0f, 87.2f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
