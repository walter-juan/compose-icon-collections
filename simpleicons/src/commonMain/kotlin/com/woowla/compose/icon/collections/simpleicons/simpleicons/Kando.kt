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

public val Simpleicons.Kando: ImageVector
    get() {
        if (_kando != null) {
            return _kando!!
        }
        _kando = Builder(name = "Kando", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.953f, 6.435f)
                curveToRelative(-1.45f, 1.529f, -5.679f, 2.311f, -6.702f, 1.291f)
                curveToRelative(-1.022f, -1.019f, -0.298f, -5.006f, 1.154f, -6.535f)
                arcToRelative(3.826f, 3.826f, 0.0f, false, true, 5.402f, -0.146f)
                arcToRelative(3.807f, 3.807f, 0.0f, false, true, 0.146f, 5.39f)
                moveToRelative(-5.27f, 12.74f)
                curveToRelative(-1.906f, -0.904f, -3.96f, -4.674f, -3.303f, -5.96f)
                curveToRelative(0.656f, -1.287f, 4.68f, -1.83f, 6.585f, -0.926f)
                arcToRelative(3.824f, 3.813f, 0.0f, false, true, -3.282f, 6.886f)
                moveToRelative(-10.799f, 0.451f)
                curveToRelative(0.274f, -2.088f, 3.234f, -5.2f, 4.663f, -4.975f)
                reflectiveCurveToRelative(3.188f, 3.878f, 2.914f, 5.965f)
                arcToRelative(3.822f, 3.811f, 0.0f, true, true, -7.578f, -0.99f)
                moveTo(3.117f, 9.532f)
                curveToRelative(2.075f, -0.388f, 5.959f, 1.454f, 6.187f, 2.878f)
                reflectiveCurveTo(6.6f, 16.638f, 4.526f, 17.027f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, true, -4.46f, -3.044f)
                arcToRelative(3.813f, 3.813f, 0.0f, false, true, 3.051f, -4.45f)
                moveToRelative(8.466f, -6.707f)
                curveToRelative(1.01f, 1.849f, 0.453f, 6.103f, -0.835f, 6.759f)
                reflectiveCurveTo(5.883f, 8.324f, 4.873f, 6.474f)
                arcTo(3.824f, 3.813f, 0.0f, false, true, 6.4f, 1.302f)
                arcToRelative(3.82f, 3.81f, 0.0f, false, true, 5.183f, 1.524f)
            }
        }
        .build()
        return _kando!!
    }

private var _kando: ImageVector? = null
