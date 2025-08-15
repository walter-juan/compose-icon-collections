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

public val SolidGroup.PenFancy: ImageVector
    get() {
        if (_penFancy != null) {
            return _penFancy!!
        }
        _penFancy = Builder(name = "PenFancy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(373.5f, 27.1f)
                curveToRelative(15.0f, -17.2f, 36.7f, -27.1f, 59.6f, -27.1f)
                curveToRelative(43.6f, 0.0f, 79.0f, 35.4f, 79.0f, 79.0f)
                curveToRelative(0.0f, 22.8f, -9.9f, 44.6f, -27.1f, 59.6f)
                lineTo(283.7f, 313.8f)
                lineTo(273.0f, 303.0f)
                lineTo(209.0f, 239.0f)
                lineTo(198.2f, 228.3f)
                lineTo(373.5f, 27.1f)
                close()
                moveTo(161.1f, 259.0f)
                curveTo(162.0f, 260.0f, 188.0f, 286.0f, 239.0f, 337.0f)
                lineToRelative(13.9f, 13.9f)
                lineToRelative(-17.1f, 74.2f)
                curveToRelative(-3.9f, 17.1f, -16.9f, 30.7f, -33.8f, 35.4f)
                lineToRelative(-169.8f, 47.5f)
                lineToRelative(92.3f, -92.3f)
                curveToRelative(1.2f, 0.1f, 2.3f, 0.2f, 3.5f, 0.2f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                curveToRelative(0.0f, 1.2f, 0.1f, 2.4f, 0.2f, 3.5f)
                lineTo(3.9f, 479.8f)
                lineTo(51.5f, 310.0f)
                curveToRelative(4.7f, -16.9f, 18.3f, -29.9f, 35.4f, -33.8f)
                lineTo(161.1f, 259.0f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
