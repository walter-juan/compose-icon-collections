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

public val SolidGroup.PersonFalling: ImageVector
    get() {
        if (_personFalling != null) {
            return _personFalling!!
        }
        _personFalling = Builder(name = "PersonFalling", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 5.4f)
                curveToRelative(0.0f, 45.0f, -23.6f, 86.6f, -62.1f, 109.8f)
                lineToRelative(-4.6f, 2.8f)
                curveTo(131.4f, 184.7f, 96.0f, 247.1f, 96.0f, 314.6f)
                lineTo(96.0f, 384.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -69.4f)
                curveToRelative(0.0f, -16.7f, 3.3f, -33.0f, 9.4f, -48.0f)
                lineTo(359.2f, 500.2f)
                curveToRelative(11.1f, 13.7f, 31.3f, 15.8f, 45.0f, 4.7f)
                reflectiveCurveToRelative(15.8f, -31.3f, 4.7f, -45.0f)
                lineTo(295.2f, 320.0f)
                lineTo(400.0f, 320.0f)
                lineTo(438.4f, 371.2f)
                curveToRelative(10.6f, 14.1f, 30.7f, 17.0f, 44.8f, 6.4f)
                reflectiveCurveToRelative(17.0f, -30.7f, 6.4f, -44.8f)
                lineToRelative(-43.2f, -57.6f)
                curveTo(437.3f, 263.1f, 423.1f, 256.0f, 408.0f, 256.0f)
                lineToRelative(-89.0f, 0.0f)
                lineToRelative(-62.9f, -75.5f)
                curveToRelative(40.3f, -36.0f, 63.9f, -87.9f, 63.9f, -143.1f)
                lineToRelative(0.0f, -5.4f)
                close()
                moveTo(104.0f, 144.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, -112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, 112.0f)
                close()
            }
        }
        .build()
        return _personFalling!!
    }

private var _personFalling: ImageVector? = null
