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

public val Simpleicons.Trueup: ImageVector
    get() {
        if (_trueup != null) {
            return _trueup!!
        }
        _trueup = Builder(name = "Trueup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.17f, 4.8f)
                arcToRelative(1.2f, 1.2f, 0.0f, true, false, 0.06f, 2.4f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.06f, -2.4f)
                close()
                moveTo(7.77f, 4.8f)
                arcToRelative(1.2f, 1.2f, 0.0f, true, false, 0.06f, 2.4f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, -0.06f, -2.4f)
                close()
                moveTo(10.2f, 0.0f)
                arcToRelative(6.608f, 6.608f, 0.0f, false, false, -6.6f, 6.6f)
                verticalLineToRelative(4.8f)
                arcTo(12.614f, 12.614f, 0.0f, false, false, 16.2f, 24.0f)
                horizontalLineToRelative(3.6f)
                arcToRelative(0.599f, 0.599f, 0.0f, false, false, 0.6f, -0.6f)
                lineTo(20.4f, 6.6f)
                arcTo(6.608f, 6.608f, 0.0f, false, false, 13.8f, 0.0f)
                close()
                moveTo(10.2f, 1.2f)
                horizontalLineToRelative(3.6f)
                arcToRelative(5.33f, 5.33f, 0.0f, false, true, 2.525f, 0.656f)
                arcTo(6.146f, 6.146f, 0.0f, false, false, 12.0f, 5.631f)
                arcToRelative(6.146f, 6.146f, 0.0f, false, false, -4.325f, -3.775f)
                arcTo(5.33f, 5.33f, 0.0f, false, true, 10.2f, 1.2f)
                close()
                moveTo(6.333f, 2.844f)
                curveTo(9.505f, 3.13f, 11.4f, 5.403f, 11.4f, 9.0f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 1.2f, 0.0f)
                curveToRelative(0.0f, -3.597f, 1.895f, -5.87f, 5.067f, -6.156f)
                arcTo(5.375f, 5.375f, 0.0f, false, true, 19.2f, 6.6f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.0f, 3.905f, -4.423f, 7.2f, -7.2f, 7.2f)
                reflectiveCurveToRelative(-7.2f, -3.295f, -7.2f, -7.2f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0.0f, -1.404f, 0.551f, -2.752f, 1.533f, -3.756f)
                close()
                moveTo(4.8f, 11.068f)
                curveTo(6.505f, 13.758f, 9.681f, 15.6f, 12.0f, 15.6f)
                curveToRelative(1.09f, 0.0f, 2.371f, -0.413f, 3.6f, -1.124f)
                lineTo(15.6f, 16.2f)
                curveToRelative(0.0f, 2.932f, 0.782f, 5.138f, 2.316f, 6.6f)
                lineTo(16.2f, 22.8f)
                arcTo(11.413f, 11.413f, 0.0f, false, true, 4.8f, 11.4f)
                close()
                moveTo(19.2f, 11.068f)
                verticalLineToRelative(11.25f)
                curveToRelative(-1.609f, -1.21f, -2.4f, -3.218f, -2.4f, -6.118f)
                verticalLineToRelative(-2.523f)
                arcToRelative(10.32f, 10.32f, 0.0f, false, false, 2.4f, -2.61f)
                close()
            }
        }
        .build()
        return _trueup!!
    }

private var _trueup: ImageVector? = null
