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

public val Simpleicons.Nextbike: ImageVector
    get() {
        if (_nextbike != null) {
            return _nextbike!!
        }
        _nextbike = Builder(name = "Nextbike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.329f, 11.097f)
                curveTo(10.465f, 7.857f, 7.725f, 5.5f, 4.489f, 5.5f)
                lineTo(0.754f, 5.5f)
                curveTo(0.197f, 5.5f, 0.0f, 5.662f, 0.0f, 6.326f)
                curveToRelative(0.0f, 1.546f, 0.43f, 2.981f, 1.15f, 4.182f)
                arcTo(5.648f, 5.648f, 0.0f, false, false, 0.0f, 13.92f)
                curveToRelative(0.0f, 3.16f, 2.603f, 5.728f, 5.818f, 5.728f)
                curveToRelative(2.86f, 0.0f, 5.236f, -2.031f, 5.725f, -4.706f)
                curveToRelative(0.24f, -1.325f, 0.13f, -2.564f, -0.214f, -3.845f)
                close()
                moveTo(2.314f, 13.923f)
                curveToRelative(0.0f, -0.575f, 0.144f, -1.112f, 0.395f, -1.58f)
                curveToRelative(1.167f, 0.988f, 2.637f, 1.58f, 4.238f, 1.58f)
                horizontalLineToRelative(2.351f)
                curveToRelative(0.0f, 1.904f, -1.56f, 3.446f, -3.49f, 3.446f)
                reflectiveCurveToRelative(-3.494f, -1.546f, -3.494f, -3.446f)
                close()
                moveTo(14.09f, 7.871f)
                arcToRelative(7.56f, 7.56f, 0.0f, false, true, 3.859f, -1.222f)
                arcToRelative(0.239f, 0.239f, 0.0f, false, false, 0.234f, -0.234f)
                verticalLineToRelative(-1.83f)
                curveToRelative(0.0f, -0.128f, -0.107f, -0.252f, -0.252f, -0.235f)
                arcToRelative(9.858f, 9.858f, 0.0f, false, false, -5.136f, 1.597f)
                curveToRelative(-0.196f, 0.128f, -0.378f, 0.269f, -0.574f, 0.396f)
                curveToRelative(-0.107f, 0.09f, -0.128f, 0.234f, -0.038f, 0.34f)
                lineToRelative(1.167f, 1.402f)
                curveToRelative(0.09f, 0.107f, 0.234f, 0.107f, 0.34f, 0.034f)
                curveToRelative(-0.058f, 0.094f, 0.182f, -0.138f, 0.4f, -0.248f)
                close()
                moveTo(18.183f, 8.195f)
                curveToRelative(-3.215f, 0.0f, -5.818f, 2.568f, -5.818f, 5.728f)
                reflectiveCurveToRelative(2.603f, 5.728f, 5.818f, 5.728f)
                reflectiveCurveTo(24.0f, 17.083f, 24.0f, 13.923f)
                reflectiveCurveToRelative(-2.602f, -5.728f, -5.817f, -5.728f)
                close()
                moveTo(18.183f, 17.369f)
                curveToRelative(-1.921f, 0.0f, -3.484f, -1.546f, -3.484f, -3.446f)
                reflectiveCurveToRelative(1.56f, -3.446f, 3.484f, -3.446f)
                reflectiveCurveToRelative(3.483f, 1.546f, 3.483f, 3.446f)
                reflectiveCurveToRelative(-1.56f, 3.446f, -3.483f, 3.446f)
                close()
            }
        }
        .build()
        return _nextbike!!
    }

private var _nextbike: ImageVector? = null
