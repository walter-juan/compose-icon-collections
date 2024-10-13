package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBookReader: ImageVector
    get() {
        if (_bxBookReader != null) {
            return _bxBookReader!!
        }
        _bxBookReader = Builder(name = "BxBookReader", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                curveToRelative(-0.202f, 0.0f, -4.85f, 0.029f, -9.0f, 2.008f)
                curveTo(7.85f, 8.029f, 3.202f, 8.0f, 3.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.883f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.305f, 0.719f)
                curveToRelative(0.195f, 0.188f, 0.48f, 0.305f, 0.729f, 0.28f)
                lineToRelative(0.127f, -0.001f)
                curveToRelative(0.683f, 0.0f, 4.296f, 0.098f, 8.416f, 2.025f)
                curveToRelative(0.016f, 0.008f, 0.034f, 0.005f, 0.05f, 0.011f)
                curveToRelative(0.119f, 0.049f, 0.244f, 0.083f, 0.373f, 0.083f)
                reflectiveCurveToRelative(0.254f, -0.034f, 0.374f, -0.083f)
                curveToRelative(0.016f, -0.006f, 0.034f, -0.003f, 0.05f, -0.011f)
                curveToRelative(4.12f, -1.928f, 7.733f, -2.025f, 8.416f, -2.025f)
                lineToRelative(0.127f, 0.001f)
                curveToRelative(0.238f, 0.025f, 0.533f, -0.092f, 0.729f, -0.28f)
                curveToRelative(0.194f, -0.189f, 0.304f, -0.449f, 0.304f, -0.719f)
                lineTo(22.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(4.0f, 10.049f)
                curveToRelative(1.485f, 0.111f, 4.381f, 0.48f, 7.0f, 1.692f)
                verticalLineToRelative(7.742f)
                curveToRelative(-3.0f, -1.175f, -5.59f, -1.494f, -7.0f, -1.576f)
                verticalLineToRelative(-7.858f)
                close()
                moveTo(20.0f, 17.907f)
                curveToRelative(-1.41f, 0.082f, -4.0f, 0.401f, -7.0f, 1.576f)
                verticalLineToRelative(-7.742f)
                curveToRelative(2.619f, -1.212f, 5.515f, -1.581f, 7.0f, -1.692f)
                verticalLineToRelative(7.858f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _bxBookReader!!
    }

private var _bxBookReader: ImageVector? = null
