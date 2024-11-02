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

public val Simpleicons.Insomnia: ImageVector
    get() {
        if (_insomnia != null) {
            return _insomnia!!
        }
        _insomnia = Builder(name = "Insomnia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.136f, 3.458f)
                curveToRelative(4.718f, 0.0f, 8.542f, 3.825f, 8.542f, 8.542f)
                curveToRelative(0.0f, 4.718f, -3.825f, 8.542f, -8.542f, 8.542f)
                curveToRelative(-4.718f, 0.0f, -8.542f, -3.825f, -8.542f, -8.542f)
                curveToRelative(0.0f, -1.153f, 0.228f, -2.253f, 0.642f, -3.256f)
                curveToRelative(0.605f, 0.823f, 1.58f, 1.358f, 2.68f, 1.358f)
                curveToRelative(1.835f, 0.0f, 3.322f, -1.487f, 3.322f, -3.322f)
                curveToRelative(0.0f, -1.1f, -0.535f, -2.075f, -1.358f, -2.68f)
                curveToRelative(1.004f, -0.414f, 2.103f, -0.642f, 3.256f, -0.642f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.22f)
                curveToRelative(5.953f, 0.0f, 10.78f, 4.826f, 10.78f, 10.78f)
                reflectiveCurveTo(17.953f, 22.78f, 12.0f, 22.78f)
                reflectiveCurveTo(1.22f, 17.953f, 1.22f, 12.0f)
                reflectiveCurveTo(6.047f, 1.22f, 12.0f, 1.22f)
                close()
            }
        }
        .build()
        return _insomnia!!
    }

private var _insomnia: ImageVector? = null
