package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsGhost: ImageVector
    get() {
        if (_bxsGhost != null) {
            return _bxsGhost!!
        }
        _bxsGhost = Builder(name = "BxsGhost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(0.051f)
                curveToRelative(0.245f, 1.692f, 1.69f, 3.0f, 3.449f, 3.0f)
                curveToRelative(1.174f, 0.0f, 2.074f, -0.417f, 2.672f, -1.174f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, 5.668f, -0.014f)
                curveToRelative(0.601f, 0.762f, 1.504f, 1.188f, 2.66f, 1.188f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(21.0f, 11.0f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveToRelative(-9.0f, 4.038f, -9.0f, 9.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(15.0f, 8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxsGhost!!
    }

private var _bxsGhost: ImageVector? = null
