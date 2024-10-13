package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlPython: ImageVector
    get() {
        if (_bxlPython != null) {
            return _bxlPython!!
        }
        _bxlPython = Builder(name = "BxlPython", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.585f, 11.692f)
                horizontalLineToRelative(4.328f)
                reflectiveCurveToRelative(2.432f, 0.039f, 2.432f, -2.35f)
                lineTo(16.345f, 5.391f)
                reflectiveCurveTo(16.714f, 3.0f, 11.936f, 3.0f)
                curveTo(7.362f, 3.0f, 7.647f, 4.983f, 7.647f, 4.983f)
                lineToRelative(0.006f, 2.055f)
                horizontalLineToRelative(4.363f)
                verticalLineToRelative(0.617f)
                lineTo(5.92f, 7.655f)
                reflectiveCurveToRelative(-2.927f, -0.332f, -2.927f, 4.282f)
                reflectiveCurveToRelative(2.555f, 4.45f, 2.555f, 4.45f)
                horizontalLineToRelative(1.524f)
                verticalLineToRelative(-2.141f)
                reflectiveCurveToRelative(-0.083f, -2.554f, 2.513f, -2.554f)
                close()
                moveTo(9.529f, 5.952f)
                arcToRelative(0.784f, 0.784f, 0.0f, true, true, 0.0f, -1.57f)
                arcToRelative(0.784f, 0.784f, 0.0f, true, true, 0.0f, 1.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.452f, 7.532f)
                horizontalLineToRelative(-1.524f)
                verticalLineToRelative(2.141f)
                reflectiveCurveToRelative(0.083f, 2.554f, -2.513f, 2.554f)
                horizontalLineToRelative(-4.328f)
                reflectiveCurveToRelative(-2.432f, -0.04f, -2.432f, 2.35f)
                verticalLineToRelative(3.951f)
                reflectiveCurveToRelative(-0.369f, 2.391f, 4.409f, 2.391f)
                curveToRelative(4.573f, 0.0f, 4.288f, -1.983f, 4.288f, -1.983f)
                lineToRelative(-0.006f, -2.054f)
                horizontalLineToRelative(-4.363f)
                verticalLineToRelative(-0.617f)
                horizontalLineToRelative(6.097f)
                reflectiveCurveToRelative(2.927f, 0.332f, 2.927f, -4.282f)
                reflectiveCurveToRelative(-2.555f, -4.451f, -2.555f, -4.451f)
                close()
                moveTo(14.471f, 17.968f)
                arcToRelative(0.784f, 0.784f, 0.0f, true, true, 0.0f, 1.57f)
                arcToRelative(0.784f, 0.784f, 0.0f, true, true, 0.0f, -1.57f)
                close()
            }
        }
        .build()
        return _bxlPython!!
    }

private var _bxlPython: ImageVector? = null
