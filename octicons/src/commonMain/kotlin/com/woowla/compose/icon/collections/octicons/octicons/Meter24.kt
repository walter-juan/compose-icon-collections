package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Meter24: ImageVector
    get() {
        if (_meter24 != null) {
            return _meter24!!
        }
        _meter24 = Builder(name = "Meter24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, false, 9.5f, 9.5f)
                curveToRelative(0.0f, -1.406f, -0.305f, -2.74f, -0.852f, -3.939f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.364f, -0.622f)
                curveTo(22.648f, 8.829f, 23.0f, 10.374f, 23.0f, 12.0f)
                curveToRelative(0.0f, 6.075f, -4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                reflectiveCurveTo(5.925f, 1.0f, 12.0f, 1.0f)
                curveToRelative(1.626f, 0.0f, 3.17f, 0.353f, 4.561f, 0.988f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.622f, 1.364f)
                arcTo(9.463f, 9.463f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(21.03f, 2.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-6.445f, 6.446f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(19.97f, 2.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
                moveTo(12.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _meter24!!
    }

private var _meter24: ImageVector? = null
