package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.SmileyGrin24: ImageVector
    get() {
        if (_smileyGrin24 != null) {
            return _smileyGrin24!!
        }
        _smileyGrin24 = Builder(name = "SmileyGrin24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                reflectiveCurveTo(5.925f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 2.5f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, -9.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(16.5f, 14.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.727f, 0.932f)
                curveToRelative(-0.292f, 1.171f, -1.74f, 3.943f, -5.227f, 3.943f)
                reflectiveCurveToRelative(-4.935f, -2.772f, -5.228f, -3.943f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.728f, -0.932f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(8.637f, 15.75f)
                curveToRelative(0.531f, 0.875f, 1.578f, 1.875f, 3.363f, 1.875f)
                reflectiveCurveToRelative(2.832f, -1.0f, 3.363f, -1.875f)
                lineTo(8.637f, 15.75f)
                close()
                moveTo(8.0f, 8.25f)
                curveToRelative(1.294f, 0.0f, 2.122f, 0.663f, 2.6f, 1.3f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, 0.588f, 1.135f)
                lineToRelative(0.028f, 0.088f)
                lineToRelative(0.008f, 0.029f)
                lineToRelative(0.002f, 0.01f)
                lineToRelative(0.001f, 0.003f)
                verticalLineToRelative(0.002f)
                curveToRelative(0.001f, 0.001f, -0.001f, 0.001f, -0.629f, 0.159f)
                lineToRelative(0.629f, -0.158f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.454f, 0.369f)
                lineToRelative(-0.001f, -0.005f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, false, -0.074f, -0.206f)
                arcToRelative(2.454f, 2.454f, 0.0f, false, false, -0.298f, -0.526f)
                curveToRelative(-0.272f, -0.363f, -0.695f, -0.7f, -1.4f, -0.7f)
                reflectiveCurveToRelative(-1.128f, 0.337f, -1.4f, 0.7f)
                arcToRelative(2.454f, 2.454f, 0.0f, false, false, -0.372f, 0.732f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.455f, -0.364f)
                lineToRelative(0.63f, 0.158f)
                lineToRelative(-0.63f, -0.159f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(0.001f, -0.003f)
                lineToRelative(0.002f, -0.01f)
                lineToRelative(0.008f, -0.029f)
                lineToRelative(0.028f, -0.088f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 5.4f, 9.55f)
                curveToRelative(0.478f, -0.637f, 1.306f, -1.3f, 2.6f, -1.3f)
                close()
                moveTo(16.0f, 8.25f)
                curveToRelative(1.294f, 0.0f, 2.122f, 0.663f, 2.6f, 1.3f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, 0.589f, 1.135f)
                lineToRelative(0.027f, 0.088f)
                lineToRelative(0.008f, 0.029f)
                lineToRelative(0.002f, 0.01f)
                lineToRelative(0.001f, 0.003f)
                verticalLineToRelative(0.002f)
                curveToRelative(0.001f, 0.001f, -0.001f, 0.001f, -0.629f, 0.159f)
                lineToRelative(0.629f, -0.158f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.454f, 0.369f)
                verticalLineToRelative(-0.005f)
                lineToRelative(-0.012f, -0.038f)
                arcToRelative(2.454f, 2.454f, 0.0f, false, false, -0.361f, -0.694f)
                curveToRelative(-0.272f, -0.363f, -0.695f, -0.7f, -1.4f, -0.7f)
                reflectiveCurveToRelative(-1.128f, 0.337f, -1.4f, 0.7f)
                arcToRelative(2.454f, 2.454f, 0.0f, false, false, -0.373f, 0.732f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.454f, -0.364f)
                lineToRelative(0.629f, 0.158f)
                curveToRelative(-0.627f, -0.157f, -0.63f, -0.158f, -0.629f, -0.159f)
                verticalLineToRelative(-0.002f)
                lineToRelative(0.001f, -0.003f)
                lineToRelative(0.002f, -0.01f)
                lineToRelative(0.008f, -0.029f)
                lineToRelative(0.028f, -0.088f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 13.4f, 9.55f)
                curveToRelative(0.478f, -0.637f, 1.306f, -1.3f, 2.6f, -1.3f)
                close()
                moveTo(6.228f, 11.183f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(-0.001f)
                verticalLineToRelative(-0.002f)
                lineToRelative(0.001f, 0.001f)
                close()
            }
        }
        .build()
        return _smileyGrin24!!
    }

private var _smileyGrin24: ImageVector? = null
