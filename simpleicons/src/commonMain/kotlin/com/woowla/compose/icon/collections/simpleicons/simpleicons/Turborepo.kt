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

public val Simpleicons.Turborepo: ImageVector
    get() {
        if (_turborepo != null) {
            return _turborepo!!
        }
        _turborepo = Builder(name = "Turborepo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.991f, 4.196f)
                curveToRelative(-4.3f, 0.0f, -7.798f, 3.501f, -7.798f, 7.804f)
                reflectiveCurveToRelative(3.498f, 7.804f, 7.798f, 7.804f)
                curveToRelative(4.3f, 0.0f, 7.798f, -3.501f, 7.798f, -7.804f)
                reflectiveCurveToRelative(-3.498f, -7.804f, -7.798f, -7.804f)
                moveToRelative(0.0f, 11.843f)
                curveToRelative(-2.229f, 0.0f, -4.036f, -1.808f, -4.036f, -4.039f)
                reflectiveCurveToRelative(1.806f, -4.039f, 4.036f, -4.039f)
                reflectiveCurveTo(16.026f, 9.769f, 16.026f, 12.0f)
                reflectiveCurveToRelative(-1.806f, 4.039f, -4.036f, 4.039f)
                moveToRelative(0.653f, -13.125f)
                verticalLineTo(0.0f)
                curveTo(18.973f, 0.339f, 24.0f, 5.582f, 24.0f, 12.0f)
                reflectiveCurveToRelative(-5.027f, 11.66f, -11.356f, 12.0f)
                verticalLineToRelative(-2.914f)
                curveToRelative(4.717f, -0.337f, 8.452f, -4.281f, 8.452f, -9.086f)
                reflectiveCurveToRelative(-3.735f, -8.749f, -8.452f, -9.086f)
                moveTo(5.113f, 17.959f)
                curveToRelative(-1.25f, -1.445f, -2.056f, -3.284f, -2.2f, -5.305f)
                horizontalLineTo(0.0f)
                curveToRelative(0.151f, 2.827f, 1.281f, 5.392f, 3.051f, 7.367f)
                lineToRelative(2.061f, -2.062f)
                close()
                moveTo(11.337f, 24.0f)
                verticalLineToRelative(-2.914f)
                curveToRelative(-2.02f, -0.144f, -3.858f, -0.949f, -5.302f, -2.202f)
                lineToRelative(-2.061f, 2.062f)
                curveToRelative(1.975f, 1.773f, 4.538f, 2.902f, 7.361f, 3.053f)
                close()
            }
        }
        .build()
        return _turborepo!!
    }

private var _turborepo: ImageVector? = null
