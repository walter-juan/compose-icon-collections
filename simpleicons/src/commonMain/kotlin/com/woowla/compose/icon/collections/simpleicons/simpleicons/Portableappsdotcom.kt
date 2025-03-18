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

public val Simpleicons.Portableappsdotcom: ImageVector
    get() {
        if (_portableappsdotcom != null) {
            return _portableappsdotcom!!
        }
        _portableappsdotcom = Builder(name = "Portableappsdotcom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(7.977f, 0.0f, 4.419f, 1.984f, 2.24f, 5.022f)
                curveToRelative(-1.816f, 4.295f, 0.987f, 7.619f, 4.001f, 7.532f)
                curveToRelative(2.925f, -0.084f, 5.264f, -1.365f, 7.04f, -3.4f)
                lineToRelative(-3.02f, -3.015f)
                horizontalLineToRelative(10.635f)
                lineToRelative(-0.037f, 10.577f)
                lineToRelative(-2.788f, -2.782f)
                curveToRelative(-2.739f, 2.974f, -5.493f, 5.443f, -9.741f, 5.208f)
                curveTo(3.168f, 18.855f, 0.553f, 14.7f, 0.09f, 10.558f)
                curveTo(0.033f, 11.032f, 0.0f, 11.512f, 0.0f, 12.0f)
                curveTo(0.0f, 18.63f, 5.37f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -5.371f, 12.0f, -12.0f)
                reflectiveCurveTo(18.625f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _portableappsdotcom!!
    }

private var _portableappsdotcom: ImageVector? = null
