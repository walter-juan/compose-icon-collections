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

public val Simpleicons.Ltspice: ImageVector
    get() {
        if (_ltspice != null) {
            return _ltspice!!
        }
        _ltspice = Builder(name = "Ltspice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.327f, 3.485f)
                curveToRelative(-0.797f, 0.627f, -0.974f, 1.621f, -1.164f, 3.317f)
                curveToRelative(-0.365f, 3.257f, -0.641f, 5.198f, -1.047f, 8.658f)
                curveToRelative(-0.199f, 1.701f, 0.976f, 1.901f, 2.365f, 1.886f)
                horizontalLineToRelative(2.884f)
                curveToRelative(0.26f, 0.002f, 0.352f, 0.123f, 0.319f, 0.381f)
                curveToRelative(-0.124f, 0.965f, -0.258f, 2.788f, -1.19f, 2.788f)
                lineTo(0.0f, 20.493f)
                reflectiveCurveToRelative(2.83f, -1.032f, 3.165f, -3.372f)
                lineTo(4.505f, 6.234f)
                curveToRelative(0.209f, -1.357f, 1.288f, -2.749f, 2.634f, -2.749f)
                horizontalLineToRelative(2.188f)
                close()
                moveTo(14.883f, 20.515f)
                curveToRelative(1.345f, 0.0f, 2.425f, -1.392f, 2.634f, -2.749f)
                lineTo(18.857f, 6.879f)
                curveToRelative(0.335f, -2.34f, 3.165f, -3.372f, 3.165f, -3.372f)
                lineTo(10.529f, 3.485f)
                curveToRelative(-0.932f, 0.0f, -1.066f, 1.823f, -1.19f, 2.788f)
                curveToRelative(-0.033f, 0.258f, 0.059f, 0.379f, 0.319f, 0.381f)
                horizontalLineToRelative(2.884f)
                curveToRelative(1.389f, -0.015f, 2.564f, 0.185f, 2.365f, 1.886f)
                curveToRelative(-0.406f, 3.46f, -0.682f, 5.401f, -1.047f, 8.658f)
                curveToRelative(-0.19f, 1.696f, -0.368f, 2.69f, -1.164f, 3.317f)
                horizontalLineToRelative(2.188f)
                close()
                moveTo(23.202f, 6.653f)
                curveToRelative(0.259f, 0.001f, 0.496f, -0.209f, 0.528f, -0.466f)
                lineToRelative(0.266f, -2.231f)
                curveToRelative(0.031f, -0.257f, -0.155f, -0.472f, -0.413f, -0.472f)
                horizontalLineToRelative(-0.88f)
                curveToRelative(-1.088f, 0.0f, -2.202f, 1.795f, -2.256f, 2.696f)
                curveToRelative(-0.034f, 0.259f, 0.151f, 0.47f, 0.411f, 0.472f)
                horizontalLineToRelative(2.343f)
                close()
            }
        }
        .build()
        return _ltspice!!
    }

private var _ltspice: ImageVector? = null
