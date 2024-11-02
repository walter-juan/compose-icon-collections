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

public val Simpleicons.Number1Password: ImageVector
    get() {
        if (_number1Password != null) {
            return _number1Password!!
        }
        _number1Password = Builder(name = "Number1Password", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.007f)
                curveTo(5.373f, 0.007f, 0.0f, 5.376f, 0.0f, 11.999f)
                curveToRelative(0.0f, 6.624f, 5.373f, 11.994f, 12.0f, 11.994f)
                reflectiveCurveTo(24.0f, 18.623f, 24.0f, 12.0f)
                curveTo(24.0f, 5.376f, 18.627f, 0.007f, 12.0f, 0.007f)
                close()
                moveTo(11.105f, 4.864f)
                horizontalLineToRelative(1.788f)
                curveToRelative(0.484f, 0.0f, 0.729f, 0.002f, 0.914f, 0.096f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, 0.377f, 0.377f)
                curveToRelative(0.094f, 0.185f, 0.095f, 0.428f, 0.095f, 0.912f)
                verticalLineToRelative(6.016f)
                curveToRelative(0.0f, 0.12f, 0.0f, 0.182f, -0.015f, 0.238f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, true, -0.067f, 0.137f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, true, -0.174f, 0.162f)
                lineToRelative(-0.695f, 0.564f)
                curveToRelative(-0.113f, 0.092f, -0.17f, 0.138f, -0.191f, 0.194f)
                arcToRelative(0.216f, 0.216f, 0.0f, false, false, 0.0f, 0.15f)
                curveToRelative(0.02f, 0.055f, 0.078f, 0.101f, 0.191f, 0.193f)
                lineToRelative(0.695f, 0.565f)
                curveToRelative(0.094f, 0.076f, 0.14f, 0.115f, 0.174f, 0.162f)
                curveToRelative(0.03f, 0.042f, 0.053f, 0.087f, 0.067f, 0.137f)
                arcToRelative(0.936f, 0.936f, 0.0f, false, true, 0.015f, 0.238f)
                verticalLineToRelative(2.746f)
                curveToRelative(0.0f, 0.484f, -0.001f, 0.727f, -0.095f, 0.912f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, -0.377f, 0.377f)
                curveToRelative(-0.185f, 0.094f, -0.43f, 0.096f, -0.914f, 0.096f)
                horizontalLineToRelative(-1.788f)
                curveToRelative(-0.484f, 0.0f, -0.726f, -0.002f, -0.912f, -0.096f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, -0.377f, -0.377f)
                curveToRelative(-0.094f, -0.185f, -0.095f, -0.428f, -0.095f, -0.912f)
                verticalLineToRelative(-6.016f)
                curveToRelative(0.0f, -0.12f, 0.0f, -0.182f, 0.015f, -0.238f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, true, 0.067f, -0.139f)
                curveToRelative(0.034f, -0.047f, 0.08f, -0.083f, 0.174f, -0.16f)
                lineToRelative(0.695f, -0.564f)
                curveToRelative(0.113f, -0.092f, 0.17f, -0.138f, 0.191f, -0.194f)
                arcToRelative(0.216f, 0.216f, 0.0f, false, false, 0.0f, -0.15f)
                curveToRelative(-0.02f, -0.055f, -0.078f, -0.101f, -0.191f, -0.193f)
                lineToRelative(-0.695f, -0.565f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, -0.174f, -0.162f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, true, -0.067f, -0.139f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, -0.015f, -0.236f)
                lineTo(9.721f, 6.25f)
                curveToRelative(0.0f, -0.484f, 0.001f, -0.727f, 0.095f, -0.912f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, 0.377f, -0.377f)
                curveToRelative(0.186f, -0.094f, 0.428f, -0.096f, 0.912f, -0.096f)
                close()
            }
        }
        .build()
        return _number1Password!!
    }

private var _number1Password: ImageVector? = null
