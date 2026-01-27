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

public val SolidGroup.S: ImageVector
    get() {
        if (_s != null) {
            return _s!!
        }
        _s = Builder(name = "S", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 157.5f)
                curveTo(0.0f, 88.2f, 56.2f, 32.0f, 125.5f, 32.0f)
                lineTo(272.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(125.5f, 96.0f)
                curveToRelative(-34.0f, 0.0f, -61.5f, 27.5f, -61.5f, 61.5f)
                curveToRelative(0.0f, 31.0f, 23.1f, 57.2f, 53.9f, 61.0f)
                lineTo(210.1f, 230.0f)
                curveTo(272.9f, 237.9f, 320.0f, 291.2f, 320.0f, 354.5f)
                curveTo(320.0f, 423.8f, 263.8f, 480.0f, 194.5f, 480.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(146.5f, 0.0f)
                curveToRelative(34.0f, 0.0f, 61.5f, -27.5f, 61.5f, -61.5f)
                curveToRelative(0.0f, -31.0f, -23.1f, -57.2f, -53.9f, -61.0f)
                lineTo(109.9f, 282.0f)
                curveTo(47.1f, 274.1f, 0.0f, 220.8f, 0.0f, 157.5f)
                close()
            }
        }
        .build()
        return _s!!
    }

private var _s: ImageVector? = null
