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

public val SolidGroup.BxsHelpCircle: ImageVector
    get() {
        if (_bxsHelpCircle != null) {
            return _bxsHelpCircle!!
        }
        _bxsHelpCircle = Builder(name = "BxsHelpCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.976f, 13.115f)
                curveToRelative(-0.196f, 0.158f, -0.385f, 0.309f, -0.535f, 0.459f)
                curveToRelative(-0.408f, 0.407f, -0.44f, 0.777f, -0.441f, 0.793f)
                verticalLineToRelative(0.133f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.167f)
                curveToRelative(0.0f, -0.118f, 0.029f, -1.177f, 1.026f, -2.174f)
                curveToRelative(0.195f, -0.195f, 0.437f, -0.393f, 0.691f, -0.599f)
                curveToRelative(0.734f, -0.595f, 1.216f, -1.029f, 1.216f, -1.627f)
                arcToRelative(1.934f, 1.934f, 0.0f, false, false, -3.867f, 0.001f)
                horizontalLineToRelative(-2.0f)
                curveTo(8.066f, 7.765f, 9.831f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(3.934f, 1.765f, 3.934f, 3.934f)
                curveToRelative(0.0f, 1.597f, -1.179f, 2.55f, -1.958f, 3.181f)
                close()
            }
        }
        .build()
        return _bxsHelpCircle!!
    }

private var _bxsHelpCircle: ImageVector? = null
