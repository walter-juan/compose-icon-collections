package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BadgeSdFill: ImageVector
    get() {
        if (_badgeSdFill != null) {
            return _badgeSdFill!!
        }
        _badgeSdFill = Builder(name = "BadgeSdFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.338f, 5.968f)
                horizontalLineToRelative(-0.844f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(0.844f)
                curveToRelative(1.116f, 0.0f, 1.622f, -0.667f, 1.622f, -2.02f)
                curveToRelative(0.0f, -1.354f, -0.51f, -2.04f, -1.622f, -2.04f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(5.077f, 11.114f)
                curveToRelative(1.521f, 0.0f, 2.378f, -0.764f, 2.378f, -1.88f)
                curveToRelative(0.0f, -1.007f, -0.642f, -1.473f, -1.613f, -1.692f)
                lineToRelative(-0.932f, -0.216f)
                curveToRelative(-0.527f, -0.114f, -0.821f, -0.351f, -0.821f, -0.712f)
                curveToRelative(0.0f, -0.466f, 0.39f, -0.804f, 1.046f, -0.804f)
                curveToRelative(0.637f, 0.0f, 1.028f, 0.33f, 1.103f, 0.76f)
                horizontalLineToRelative(1.125f)
                curveToRelative(-0.058f, -0.923f, -0.849f, -1.692f, -2.22f, -1.692f)
                curveToRelative(-1.322f, 0.0f, -2.24f, 0.717f, -2.24f, 1.815f)
                curveToRelative(0.0f, 0.91f, 0.588f, 1.446f, 1.52f, 1.657f)
                lineToRelative(0.927f, 0.215f)
                curveToRelative(0.624f, 0.145f, 0.923f, 0.36f, 0.923f, 0.778f)
                curveToRelative(0.0f, 0.492f, -0.391f, 0.83f, -1.13f, 0.83f)
                curveToRelative(-0.707f, 0.0f, -1.155f, -0.342f, -1.234f, -0.808f)
                lineTo(2.762f, 9.365f)
                curveToRelative(0.052f, 0.95f, 0.79f, 1.75f, 2.315f, 1.75f)
                close()
                moveTo(8.307f, 11.0f)
                horizontalLineToRelative(2.19f)
                curveToRelative(1.81f, 0.0f, 2.684f, -1.107f, 2.684f, -3.015f)
                curveToRelative(0.0f, -1.894f, -0.861f, -2.984f, -2.685f, -2.984f)
                lineTo(8.308f, 5.001f)
                close()
            }
        }
        .build()
        return _badgeSdFill!!
    }

private var _badgeSdFill: ImageVector? = null
