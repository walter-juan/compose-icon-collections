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

public val Twbs.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) {
            return _shieldPlus!!
        }
        _shieldPlus = Builder(name = "ShieldPlus", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.338f, 1.59f)
                arcToRelative(61.0f, 61.0f, 0.0f, false, false, -2.837f, 0.856f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.328f, 0.39f)
                curveToRelative(-0.554f, 4.157f, 0.726f, 7.19f, 2.253f, 9.188f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, false, 2.287f, 2.233f)
                curveToRelative(0.346f, 0.244f, 0.652f, 0.42f, 0.893f, 0.533f)
                quadToRelative(0.18f, 0.085f, 0.293f, 0.118f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.101f, 0.025f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.1f, -0.025f)
                quadToRelative(0.114f, -0.034f, 0.294f, -0.118f)
                curveToRelative(0.24f, -0.113f, 0.547f, -0.29f, 0.893f, -0.533f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, false, 2.287f, -2.233f)
                curveToRelative(1.527f, -1.997f, 2.807f, -5.031f, 2.253f, -9.188f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.328f, -0.39f)
                curveToRelative(-0.651f, -0.213f, -1.75f, -0.56f, -2.837f, -0.855f)
                curveTo(9.552f, 1.29f, 8.531f, 1.067f, 8.0f, 1.067f)
                curveToRelative(-0.53f, 0.0f, -1.552f, 0.223f, -2.662f, 0.524f)
                close()
                moveTo(5.072f, 0.56f)
                curveTo(6.157f, 0.265f, 7.31f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(1.843f, 0.265f, 2.928f, 0.56f)
                curveToRelative(1.11f, 0.3f, 2.229f, 0.655f, 2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, 1.044f, 1.262f)
                curveToRelative(0.596f, 4.477f, -0.787f, 7.795f, -2.465f, 9.99f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -2.517f, 2.453f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.048f, 0.625f)
                curveToRelative(-0.28f, 0.132f, -0.581f, 0.24f, -0.829f, 0.24f)
                reflectiveCurveToRelative(-0.548f, -0.108f, -0.829f, -0.24f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.048f, -0.625f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -2.517f, -2.453f)
                curveTo(1.928f, 10.487f, 0.545f, 7.169f, 1.141f, 2.692f)
                arcTo(1.54f, 1.54f, 0.0f, false, true, 2.185f, 1.43f)
                arcTo(63.0f, 63.0f, 0.0f, false, true, 5.072f, 0.56f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
