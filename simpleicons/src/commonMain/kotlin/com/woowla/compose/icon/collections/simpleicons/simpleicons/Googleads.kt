package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Googleads: ImageVector
    get() {
        if (_googleads != null) {
            return _googleads!!
        }
        _googleads = Builder(name = "Googleads", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 22.929f)
                curveTo(1.791f, 22.929f, 0.0f, 21.138f, 0.0f, 18.929f)
                reflectiveCurveToRelative(1.791f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.791f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(23.464f, 16.929f)
                lineTo(15.463f, 3.072f)
                curveTo(14.359f, 1.159f, 11.912f, 0.503f, 9.999f, 1.607f)
                reflectiveCurveTo(7.43f, 5.159f, 8.534f, 7.072f)
                lineToRelative(8.001f, 13.857f)
                curveToRelative(1.105f, 1.913f, 3.551f, 2.568f, 5.464f, 1.465f)
                curveToRelative(1.913f, -1.105f, 2.568f, -3.551f, 1.465f, -5.464f)
                close()
                moveTo(7.514f, 4.844f)
                lineTo(1.564f, 15.148f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 4.0f, 14.43f)
                curveToRelative(2.56f, -0.007f, 4.625f, 2.158f, 4.494f, 4.715f)
                lineToRelative(3.217f, -5.572f)
                lineToRelative(-3.609f, -6.25f)
                curveToRelative(-0.45f, -0.779f, -0.632f, -1.639f, -0.588f, -2.478f)
                close()
            }
        }
        .build()
        return _googleads!!
    }

private var _googleads: ImageVector? = null
