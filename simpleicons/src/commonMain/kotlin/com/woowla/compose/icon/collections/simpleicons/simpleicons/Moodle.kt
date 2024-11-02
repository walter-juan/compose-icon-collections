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

public val Simpleicons.Moodle: ImageVector
    get() {
        if (_moodle != null) {
            return _moodle!!
        }
        _moodle = Builder(name = "Moodle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.135f, 5.74f)
                lineTo(13.17f, 5.863f)
                lineTo(10.434f, 7.854f)
                curveToRelative(0.369f, 0.261f, 0.797f, 0.609f, 1.008f, 0.844f)
                lineToRelative(0.076f, 0.104f)
                curveToRelative(-1.288f, 2.257f, -3.737f, 3.056f, -6.316f, 2.182f)
                lineToRelative(0.02f, -0.16f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.078f, -0.568f, -0.096f, -1.052f, -0.058f, -1.463f)
                curveToRelative(-0.751f, -0.003f, -1.53f, -0.04f, -2.283f, -0.066f)
                lineToRelative(-0.516f, 0.018f)
                curveToRelative(-0.099f, 0.845f, -0.035f, 2.135f, -0.025f, 2.322f)
                curveToRelative(0.349f, 1.282f, 0.298f, 2.291f, 0.295f, 3.529f)
                curveToRelative(-0.413f, -1.003f, -0.9f, -2.097f, -0.416f, -3.467f)
                lineToRelative(-0.01f, -0.318f)
                curveToRelative(-0.001f, -0.014f, -0.068f, -1.153f, 0.037f, -2.063f)
                lineToRelative(-0.408f, 0.014f)
                lineToRelative(-0.037f, -0.119f)
                curveTo(5.792f, 6.84f, 8.503f, 6.218f, 13.135f, 5.74f)
                close()
                moveTo(14.758f, 8.254f)
                curveToRelative(1.22f, 0.0f, 2.188f, 0.269f, 2.904f, 0.807f)
                curveToRelative(0.814f, 0.601f, 1.221f, 1.487f, 1.221f, 2.658f)
                verticalLineToRelative(5.686f)
                horizontalLineToRelative(-2.734f)
                verticalLineToRelative(-5.369f)
                curveToRelative(0.0f, -1.122f, -0.463f, -1.684f, -1.391f, -1.684f)
                curveToRelative(-0.928f, 0.0f, -1.391f, 0.561f, -1.391f, 1.684f)
                verticalLineToRelative(5.369f)
                horizontalLineToRelative(-2.734f)
                verticalLineToRelative(-5.369f)
                curveToRelative(0.0f, -0.518f, -0.099f, -0.914f, -0.293f, -1.193f)
                curveToRelative(0.617f, -0.435f, 1.153f, -1.012f, 1.572f, -1.725f)
                curveToRelative(0.03f, 0.029f, 0.06f, 0.057f, 0.088f, 0.088f)
                curveToRelative(0.504f, -0.635f, 1.423f, -0.951f, 2.758f, -0.951f)
                close()
                moveTo(5.148f, 11.488f)
                curveToRelative(0.932f, 0.3f, 1.861f, 0.393f, 2.736f, 0.287f)
                arcToRelative(3.546f, 3.546f, 0.0f, false, false, -0.01f, 0.26f)
                verticalLineToRelative(5.369f)
                lineTo(5.143f, 17.404f)
                verticalLineToRelative(-5.686f)
                curveToRelative(0.0f, -0.079f, 0.002f, -0.154f, 0.006f, -0.23f)
                close()
            }
        }
        .build()
        return _moodle!!
    }

private var _moodle: ImageVector? = null
