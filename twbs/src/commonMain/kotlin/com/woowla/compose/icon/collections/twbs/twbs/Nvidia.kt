package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Nvidia: ImageVector
    get() {
        if (_nvidia != null) {
            return _nvidia!!
        }
        _nvidia = Builder(name = "Nvidia", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.635f, 7.146f)
                reflectiveCurveTo(3.08f, 5.012f, 5.97f, 4.791f)
                verticalLineToRelative(-0.774f)
                curveTo(2.77f, 4.273f, 0.0f, 6.983f, 0.0f, 6.983f)
                reflectiveCurveToRelative(1.57f, 4.536f, 5.97f, 4.952f)
                verticalLineToRelative(-0.824f)
                curveToRelative(-3.23f, -0.406f, -4.335f, -3.965f, -4.335f, -3.965f)
                moveTo(5.97f, 9.475f)
                verticalLineToRelative(0.753f)
                curveToRelative(-2.44f, -0.435f, -3.118f, -2.972f, -3.118f, -2.972f)
                reflectiveCurveTo(4.023f, 5.958f, 5.97f, 5.747f)
                verticalLineToRelative(0.828f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(-1.021f, -0.123f, -1.82f, 0.83f, -1.82f, 0.83f)
                reflectiveCurveToRelative(0.448f, 1.607f, 1.824f, 2.07f)
                moveTo(6.0f, 2.0f)
                lineToRelative(-0.03f, 2.017f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 6.252f, 4.0f)
                curveToRelative(3.637f, -0.123f, 6.007f, 2.983f, 6.007f, 2.983f)
                reflectiveCurveToRelative(-2.722f, 3.31f, -5.557f, 3.31f)
                quadToRelative(-0.39f, -0.002f, -0.732f, -0.065f)
                verticalLineToRelative(0.883f)
                quadToRelative(0.292f, 0.039f, 0.61f, 0.04f)
                curveToRelative(2.638f, 0.0f, 4.546f, -1.348f, 6.394f, -2.943f)
                curveToRelative(0.307f, 0.246f, 1.561f, 0.842f, 1.819f, 1.104f)
                curveToRelative(-1.757f, 1.47f, -5.852f, 2.657f, -8.173f, 2.657f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.65f, -0.034f)
                lineTo(5.97f, 14.0f)
                lineTo(16.0f, 14.0f)
                lineToRelative(0.03f, -12.0f)
                close()
                moveTo(5.97f, 5.747f)
                verticalLineToRelative(-0.956f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.282f, -0.015f)
                curveToRelative(2.616f, -0.082f, 4.332f, 2.248f, 4.332f, 2.248f)
                reflectiveCurveTo(8.73f, 9.598f, 6.743f, 9.598f)
                curveToRelative(-0.286f, 0.0f, -0.542f, -0.046f, -0.773f, -0.123f)
                verticalLineToRelative(-2.9f)
                curveToRelative(1.018f, 0.123f, 1.223f, 0.572f, 1.835f, 1.593f)
                lineTo(9.167f, 7.02f)
                reflectiveCurveToRelative(-0.994f, -1.304f, -2.67f, -1.304f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.527f, 0.031f)
            }
        }
        .build()
        return _nvidia!!
    }

private var _nvidia: ImageVector? = null
