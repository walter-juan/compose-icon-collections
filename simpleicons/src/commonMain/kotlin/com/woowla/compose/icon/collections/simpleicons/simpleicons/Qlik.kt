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

public val Simpleicons.Qlik: ImageVector
    get() {
        if (_qlik != null) {
            return _qlik!!
        }
        _qlik = Builder(name = "Qlik", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.751f, 20.137f)
                lineToRelative(-3.13f, -2.633f)
                curveToRelative(1.086f, -1.731f, 1.73f, -3.774f, 1.73f, -5.965f)
                curveToRelative(0.0f, -6.168f, -5.008f, -11.176f, -11.176f, -11.176f)
                reflectiveCurveTo(0.0f, 5.37f, 0.0f, 11.539f)
                curveToRelative(0.0f, 6.168f, 5.008f, 11.176f, 11.176f, 11.176f)
                curveToRelative(2.393f, 0.0f, 4.622f, -0.755f, 6.444f, -2.044f)
                lineToRelative(3.332f, 2.799f)
                reflectiveCurveToRelative(0.497f, 0.424f, 0.921f, -0.074f)
                lineToRelative(1.988f, -2.357f)
                curveToRelative(-0.019f, 0.0f, 0.386f, -0.497f, -0.111f, -0.902f)
                close()
                moveTo(18.044f, 11.539f)
                curveToRelative(0.0f, 3.793f, -3.075f, 6.867f, -6.868f, 6.867f)
                curveToRelative(-3.793f, 0.0f, -6.868f, -3.075f, -6.868f, -6.867f)
                curveToRelative(0.0f, -3.793f, 3.075f, -6.868f, 6.868f, -6.868f)
                curveToRelative(3.793f, 0.0f, 6.868f, 3.075f, 6.868f, 6.868f)
                close()
                moveTo(6.757f, 11.539f)
                curveToRelative(0.0f, -2.43f, 1.97f, -4.401f, 4.401f, -4.401f)
                curveToRelative(2.43f, 0.0f, 4.4f, 1.97f, 4.4f, 4.4f)
                curveToRelative(0.0f, 2.43f, -1.97f, 4.401f, -4.4f, 4.401f)
                curveToRelative(-2.43f, 0.0f, -4.4f, -1.97f, -4.4f, -4.401f)
                close()
            }
        }
        .build()
        return _qlik!!
    }

private var _qlik: ImageVector? = null
