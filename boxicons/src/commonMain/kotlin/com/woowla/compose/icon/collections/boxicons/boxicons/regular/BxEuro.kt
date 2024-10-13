package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxEuro: ImageVector
    get() {
        if (_bxEuro != null) {
            return _bxEuro!!
        }
        _bxEuro = Builder(name = "BxEuro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.464f, 6.0f)
                curveToRelative(1.43f, 0.0f, 2.779f, 0.613f, 3.799f, 1.726f)
                lineToRelative(1.475f, -1.352f)
                curveTo(17.334f, 4.843f, 15.461f, 4.0f, 13.464f, 4.0f)
                curveToRelative(-1.998f, 0.0f, -3.87f, 0.843f, -5.272f, 2.375f)
                arcTo(8.034f, 8.034f, 0.0f, false, false, 6.589f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.114f)
                curveToRelative(-0.038f, 0.33f, -0.064f, 0.663f, -0.064f, 1.0f)
                reflectiveCurveToRelative(0.026f, 0.67f, 0.064f, 1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.589f)
                curveToRelative(0.362f, 0.97f, 0.901f, 1.861f, 1.603f, 2.626f)
                curveTo(9.594f, 19.157f, 11.466f, 20.0f, 13.464f, 20.0f)
                curveToRelative(1.997f, 0.0f, 3.87f, -0.843f, 5.273f, -2.374f)
                lineToRelative(-1.475f, -1.352f)
                curveTo(16.243f, 17.387f, 14.894f, 18.0f, 13.464f, 18.0f)
                reflectiveCurveToRelative(-2.778f, -0.612f, -3.798f, -1.726f)
                arcTo(5.937f, 5.937f, 0.0f, false, true, 8.801f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.139f)
                curveToRelative(-0.05f, -0.328f, -0.089f, -0.66f, -0.089f, -1.0f)
                reflectiveCurveToRelative(0.039f, -0.672f, 0.089f, -1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.801f)
                curveToRelative(0.24f, -0.457f, 0.516f, -0.893f, 0.865f, -1.274f)
                curveTo(10.686f, 6.613f, 12.034f, 6.0f, 13.464f, 6.0f)
                close()
            }
        }
        .build()
        return _bxEuro!!
    }

private var _bxEuro: ImageVector? = null
