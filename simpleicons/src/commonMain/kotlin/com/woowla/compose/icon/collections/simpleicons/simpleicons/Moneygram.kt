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

public val Simpleicons.Moneygram: ImageVector
    get() {
        if (_moneygram != null) {
            return _moneygram!!
        }
        _moneygram = Builder(name = "Moneygram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.826f, 0.407f, -3.555f, 1.137f, -5.105f)
                curveTo(0.651f, 8.126f, 0.433f, 9.345f, 0.433f, 10.486f)
                curveToRelative(0.0f, 5.433f, 4.387f, 6.22f, 6.254f, 6.202f)
                curveToRelative(2.837f, -0.026f, 6.154f, -1.416f, 8.948f, -3.991f)
                lineToRelative(-0.471f, 2.649f)
                curveToRelative(-0.105f, 0.606f, 0.291f, 1.139f, 0.896f, 1.143f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.627f, 0.0f, 1.073f, -0.511f, 1.186f, -1.143f)
                lineToRelative(1.006f, -5.662f)
                curveToRelative(0.12f, -0.628f, -0.293f, -1.14f, -0.921f, -1.14f)
                horizontalLineToRelative(-5.673f)
                curveToRelative(-0.631f, 0.0f, -1.208f, 0.334f, -1.32f, 0.968f)
                lineToRelative(-0.045f, 0.255f)
                curveToRelative(-0.09f, 0.603f, 0.33f, 1.057f, 0.932f, 1.057f)
                horizontalLineToRelative(2.959f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, false, -0.141f, 0.139f)
                curveToRelative(-2.04f, 1.931f, -4.556f, 2.988f, -6.64f, 2.988f)
                curveToRelative(-2.08f, 0.0f, -4.41f, -1.312f, -4.41f, -4.269f)
                curveTo(3.243f, 3.555f, 8.991f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.614f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
            }
        }
        .build()
        return _moneygram!!
    }

private var _moneygram: ImageVector? = null
