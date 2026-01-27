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

public val Simpleicons.Unstop: ImageVector
    get() {
        if (_unstop != null) {
            return _unstop!!
        }
        _unstop = Builder(name = "Unstop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.394f, 0.0f, 0.0f, 5.394f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.394f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.394f, 12.0f, -12.0f)
                reflectiveCurveTo(18.606f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.8f, 16.86f)
                lineTo(8.303f, 16.86f)
                verticalLineToRelative(-1.127f)
                curveToRelative(-0.715f, 1.091f, -1.588f, 1.552f, -2.897f, 1.552f)
                curveToRelative(-2.085f, 0.0f, -3.248f, -1.2f, -3.248f, -3.333f)
                lineTo(2.158f, 7.248f)
                horizontalLineToRelative(2.509f)
                verticalLineToRelative(6.182f)
                curveToRelative(0.0f, 1.164f, 0.533f, 1.722f, 1.6f, 1.722f)
                curveToRelative(1.224f, 0.0f, 2.012f, -0.752f, 2.012f, -1.891f)
                lineTo(8.279f, 7.236f)
                horizontalLineToRelative(2.509f)
                verticalLineToRelative(9.625f)
                close()
                moveTo(19.333f, 16.86f)
                verticalLineToRelative(-5.939f)
                curveToRelative(0.0f, -1.14f, -0.533f, -1.721f, -1.6f, -1.721f)
                curveToRelative(-1.224f, 0.0f, -2.012f, 0.752f, -2.012f, 1.89f)
                verticalLineToRelative(5.77f)
                horizontalLineToRelative(-2.509f)
                lineTo(13.212f, 7.237f)
                horizontalLineToRelative(2.497f)
                lineTo(15.709f, 8.63f)
                curveToRelative(0.715f, -1.09f, 1.588f, -1.551f, 2.897f, -1.551f)
                curveToRelative(2.085f, 0.0f, 3.249f, 1.2f, 3.249f, 3.333f)
                verticalLineToRelative(6.449f)
                close()
            }
        }
        .build()
        return _unstop!!
    }

private var _unstop: ImageVector? = null
