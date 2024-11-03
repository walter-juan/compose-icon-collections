package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.093f, 3.093f)
                curveToRelative(-0.465f, 4.275f, 0.885f, 7.46f, 2.513f, 9.589f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 2.517f, 2.453f)
                curveToRelative(0.386f, 0.273f, 0.744f, 0.482f, 1.048f, 0.625f)
                curveToRelative(0.28f, 0.132f, 0.581f, 0.24f, 0.829f, 0.24f)
                reflectiveCurveToRelative(0.548f, -0.108f, 0.829f, -0.24f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 1.048f, -0.625f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, 1.733f, -1.525f)
                lineToRelative(-0.745f, -0.745f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, true, -1.578f, 1.392f)
                curveToRelative(-0.346f, 0.244f, -0.652f, 0.42f, -0.893f, 0.533f)
                quadToRelative(-0.18f, 0.085f, -0.293f, 0.118f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.101f, 0.025f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.1f, -0.025f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.294f, -0.118f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.893f, -0.533f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, true, -2.287f, -2.233f)
                curveTo(3.053f, 10.228f, 1.879f, 7.594f, 2.06f, 4.06f)
                close()
                moveTo(3.98f, 1.98f)
                lineToRelative(-0.852f, -0.852f)
                arcTo(59.0f, 59.0f, 0.0f, false, true, 5.072f, 0.559f)
                curveTo(6.157f, 0.266f, 7.31f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(1.843f, 0.265f, 2.928f, 0.56f)
                curveToRelative(1.11f, 0.3f, 2.229f, 0.655f, 2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, 1.044f, 1.262f)
                curveToRelative(0.483f, 3.626f, -0.332f, 6.491f, -1.551f, 8.616f)
                lineToRelative(-0.77f, -0.77f)
                curveToRelative(1.042f, -1.915f, 1.72f, -4.469f, 1.29f, -7.702f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.33f, -0.39f)
                curveToRelative(-0.65f, -0.213f, -1.75f, -0.56f, -2.836f, -0.855f)
                curveTo(9.552f, 1.29f, 8.531f, 1.067f, 8.0f, 1.067f)
                curveToRelative(-0.53f, 0.0f, -1.552f, 0.223f, -2.662f, 0.524f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, -1.357f, 0.39f)
                close()
                moveTo(13.646f, 14.354f)
                lineTo(0.646f, 1.354f)
                lineTo(1.354f, 0.646f)
                lineTo(14.354f, 13.646f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
