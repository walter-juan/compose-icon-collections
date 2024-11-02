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

public val SolidGroup.Number1: ImageVector
    get() {
        if (_number1 != null) {
            return _number1!!
        }
        _number1 = Builder(name = "Number1", defaultWidth = 256.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 256.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 64.0f)
                curveToRelative(0.0f, -11.8f, -6.5f, -22.6f, -16.9f, -28.2f)
                reflectiveCurveToRelative(-23.0f, -5.0f, -32.8f, 1.6f)
                lineToRelative(-96.0f, 64.0f)
                curveTo(-0.5f, 111.2f, -4.4f, 131.0f, 5.4f, 145.8f)
                reflectiveCurveToRelative(29.7f, 18.7f, 44.4f, 8.9f)
                lineTo(96.0f, 123.8f)
                lineTo(96.0f, 416.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -352.0f)
                close()
            }
        }
        .build()
        return _number1!!
    }

private var _number1: ImageVector? = null
