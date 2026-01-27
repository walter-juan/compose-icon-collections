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

public val SolidGroup.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(335.1f, 160.0f)
                curveToRelative(0.6f, -5.3f, 0.9f, -10.6f, 0.9f, -16.0f)
                curveToRelative(0.0f, -79.5f, -64.5f, -144.0f, -144.0f, -144.0f)
                reflectiveCurveTo(48.0f, 64.5f, 48.0f, 144.0f)
                curveToRelative(0.0f, 5.4f, 0.3f, 10.7f, 0.9f, 16.0f)
                lineToRelative(-0.9f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(288.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-0.9f, 0.0f)
                close()
                moveTo(64.0f, 304.0f)
                lineTo(169.2f, 529.5f)
                curveToRelative(4.1f, 8.8f, 13.0f, 14.5f, 22.8f, 14.5f)
                reflectiveCurveToRelative(18.6f, -5.7f, 22.8f, -14.5f)
                lineTo(320.0f, 304.0f)
                lineTo(64.0f, 304.0f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
