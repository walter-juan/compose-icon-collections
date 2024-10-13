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

public val RegularGroup.BxHelpCircle: ImageVector
    get() {
        if (_bxHelpCircle != null) {
            return _bxHelpCircle!!
        }
        _bxHelpCircle = Builder(name = "BxHelpCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(3.939f, 3.939f, 0.0f, false, false, -3.934f, 3.934f)
                horizontalLineToRelative(2.0f)
                curveTo(10.066f, 8.867f, 10.934f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(1.934f, 0.867f, 1.934f, 1.934f)
                curveToRelative(0.0f, 0.598f, -0.481f, 1.032f, -1.216f, 1.626f)
                arcToRelative(9.208f, 9.208f, 0.0f, false, false, -0.691f, 0.599f)
                curveToRelative(-0.998f, 0.997f, -1.027f, 2.056f, -1.027f, 2.174f)
                lineTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.001f, -0.633f)
                curveToRelative(0.001f, -0.016f, 0.033f, -0.386f, 0.441f, -0.793f)
                curveToRelative(0.15f, -0.15f, 0.339f, -0.3f, 0.535f, -0.458f)
                curveToRelative(0.779f, -0.631f, 1.958f, -1.584f, 1.958f, -3.182f)
                arcTo(3.937f, 3.937f, 0.0f, false, false, 12.0f, 6.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _bxHelpCircle!!
    }

private var _bxHelpCircle: ImageVector? = null
