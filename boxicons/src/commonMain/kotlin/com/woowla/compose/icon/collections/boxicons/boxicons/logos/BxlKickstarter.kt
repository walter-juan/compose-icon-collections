package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlKickstarter: ImageVector
    get() {
        if (_bxlKickstarter != null) {
            return _bxlKickstarter!!
        }
        _bxlKickstarter = Builder(name = "BxlKickstarter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.198f, 9.127f)
                lineToRelative(3.309f, -4.799f)
                curveToRelative(0.628f, -0.902f, 1.434f, -1.354f, 2.427f, -1.354f)
                curveToRelative(0.806f, 0.0f, 1.506f, 0.287f, 2.097f, 0.861f)
                curveToRelative(0.59f, 0.574f, 0.885f, 1.26f, 0.885f, 2.059f)
                curveToRelative(0.0f, 0.59f, -0.155f, 1.113f, -0.469f, 1.563f)
                lineToRelative(-2.983f, 4.34f)
                lineToRelative(3.649f, 4.627f)
                curveToRelative(0.363f, 0.461f, 0.547f, 1.0f, 0.547f, 1.617f)
                curveToRelative(0.0f, 0.816f, -0.286f, 1.518f, -0.86f, 2.105f)
                arcToRelative(2.81f, 2.81f, 0.0f, false, true, -2.084f, 0.879f)
                curveToRelative(-0.895f, 0.0f, -1.577f, -0.291f, -2.047f, -0.873f)
                lineTo(10.2f, 14.574f)
                verticalLineToRelative(3.074f)
                curveToRelative(0.0f, 0.879f, -0.152f, 1.561f, -0.457f, 2.049f)
                curveToRelative(-0.555f, 0.885f, -1.356f, 1.328f, -2.417f, 1.328f)
                curveToRelative(-0.963f, 0.0f, -1.711f, -0.328f, -2.24f, -0.977f)
                curveToRelative(-0.496f, -0.602f, -0.744f, -1.396f, -0.744f, -2.387f)
                verticalLineTo(6.258f)
                curveToRelative(0.0f, -0.936f, 0.253f, -1.709f, 0.755f, -2.318f)
                curveToRelative(0.525f, -0.643f, 1.255f, -0.965f, 2.186f, -0.965f)
                curveToRelative(0.887f, 0.0f, 1.624f, 0.322f, 2.216f, 0.965f)
                curveToRelative(0.329f, 0.357f, 0.537f, 0.717f, 0.625f, 1.082f)
                curveToRelative(0.053f, 0.227f, 0.079f, 0.646f, 0.079f, 1.266f)
                verticalLineToRelative(2.84f)
                horizontalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _bxlKickstarter!!
    }

private var _bxlKickstarter: ImageVector? = null
