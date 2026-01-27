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

public val SolidGroup.ToiletPaperBlank: ImageVector
    get() {
        if (_toiletPaperBlank != null) {
            return _toiletPaperBlank!!
        }
        _toiletPaperBlank = Builder(name = "ToiletPaperBlank", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(327.1f, 32.0f)
                curveToRelative(-8.8f, 11.1f, -16.0f, 23.1f, -21.9f, 34.8f)
                curveToRelative(-21.4f, 42.7f, -33.2f, 98.4f, -33.2f, 157.2f)
                lineToRelative(0.0f, 264.0f)
                curveToRelative(0.0f, 30.9f, -25.1f, 56.0f, -56.0f, 56.0f)
                lineTo(56.0f, 544.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                lineTo(0.0f, 224.0f)
                curveTo(0.0f, 118.0f, 43.0f, 32.0f, 96.0f, 32.0f)
                lineToRelative(231.1f, 0.0f)
                close()
                moveTo(416.0f, 416.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -86.0f, -96.0f, -192.0f)
                reflectiveCurveToRelative(43.0f, -192.0f, 96.0f, -192.0f)
                reflectiveCurveToRelative(96.0f, 86.0f, 96.0f, 192.0f)
                reflectiveCurveToRelative(-43.0f, 192.0f, -96.0f, 192.0f)
                close()
                moveTo(416.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -28.7f, 32.0f, -64.0f)
                reflectiveCurveToRelative(-14.3f, -64.0f, -32.0f, -64.0f)
                reflectiveCurveToRelative(-32.0f, 28.7f, -32.0f, 64.0f)
                reflectiveCurveToRelative(14.3f, 64.0f, 32.0f, 64.0f)
                close()
            }
        }
        .build()
        return _toiletPaperBlank!!
    }

private var _toiletPaperBlank: ImageVector? = null
