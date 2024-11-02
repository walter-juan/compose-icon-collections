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

public val Simpleicons.Grammarly: ImageVector
    get() {
        if (_grammarly != null) {
            return _grammarly!!
        }
        _grammarly = Builder(name = "Grammarly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                horizontalLineTo(0.032f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -3.314f, 1.341f, -6.314f, 3.504f, -8.486f)
                curveTo(5.703f, 1.344f, 8.694f, 0.0f, 12.0f, 0.0f)
                curveToRelative(3.305f, 0.0f, 6.297f, 1.344f, 8.463f, 3.514f)
                curveToRelative(2.164f, 2.172f, 3.505f, 5.172f, 3.505f, 8.486f)
                reflectiveCurveToRelative(-1.338f, 6.314f, -3.505f, 8.486f)
                curveTo(18.297f, 22.656f, 15.305f, 24.0f, 12.0f, 24.0f)
                moveToRelative(2.889f, -13.137f)
                lineToRelative(-1.271f, 2.205f)
                horizontalLineToRelative(4.418f)
                curveToRelative(-0.505f, 2.882f, -3.018f, 5.078f, -6.036f, 5.078f)
                curveToRelative(-3.38f, 0.0f, -6.132f, -2.757f, -6.132f, -6.146f)
                reflectiveCurveTo(8.618f, 5.854f, 12.0f, 5.854f)
                curveToRelative(1.821f, 0.0f, 3.458f, 0.801f, 4.584f, 2.069f)
                lineToRelative(1.143f, -1.988f)
                curveToRelative(-1.493f, -1.418f, -3.506f, -2.29f, -5.725f, -2.29f)
                curveToRelative(-4.6f, 0.0f, -8.332f, 3.74f, -8.332f, 8.355f)
                reflectiveCurveToRelative(3.73f, 8.354f, 8.332f, 8.354f)
                curveToRelative(4.603f, 0.0f, 8.332f, -3.739f, 8.332f, -8.354f)
                curveToRelative(0.0f, -0.387f, -0.029f, -0.765f, -0.079f, -1.137f)
                close()
            }
        }
        .build()
        return _grammarly!!
    }

private var _grammarly: ImageVector? = null
