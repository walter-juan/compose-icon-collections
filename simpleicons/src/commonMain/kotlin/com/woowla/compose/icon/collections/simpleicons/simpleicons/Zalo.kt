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

public val Simpleicons.Zalo: ImageVector
    get() {
        if (_zalo != null) {
            return _zalo!!
        }
        _zalo = Builder(name = "Zalo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.49f, 10.272f)
                verticalLineToRelative(-0.45f)
                horizontalLineToRelative(1.347f)
                verticalLineToRelative(6.322f)
                horizontalLineToRelative(-0.77f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.576f, -0.573f)
                lineToRelative(-0.001f, 0.001f)
                arcToRelative(3.273f, 3.273f, 0.0f, false, true, -1.937f, 0.632f)
                curveToRelative(-1.814f, 0.0f, -3.284f, -1.47f, -3.284f, -3.282f)
                curveToRelative(0.0f, -1.813f, 1.471f, -3.282f, 3.284f, -3.282f)
                arcToRelative(3.273f, 3.273f, 0.0f, false, true, 1.937f, 0.632f)
                lineToRelative(0.001f, 0.001f)
                close()
                moveTo(6.919f, 7.79f)
                verticalLineToRelative(0.205f)
                curveToRelative(0.0f, 0.382f, -0.051f, 0.694f, -0.299f, 1.061f)
                lineToRelative(-0.03f, 0.034f)
                curveToRelative(-0.054f, 0.062f, -0.182f, 0.206f, -0.242f, 0.284f)
                lineTo(2.024f, 14.8f)
                horizontalLineToRelative(4.895f)
                verticalLineToRelative(0.768f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.577f, 0.576f)
                lineTo(0.0f, 16.144f)
                verticalLineToRelative(-0.362f)
                curveToRelative(0.0f, -0.444f, 0.11f, -0.641f, 0.25f, -0.848f)
                lineTo(4.858f, 9.23f)
                lineTo(0.192f, 9.23f)
                lineTo(0.192f, 7.79f)
                horizontalLineToRelative(6.727f)
                close()
                moveTo(15.47f, 16.144f)
                arcToRelative(0.481f, 0.481f, 0.0f, false, true, -0.48f, -0.48f)
                verticalLineToRelative(-7.875f)
                horizontalLineToRelative(1.442f)
                verticalLineToRelative(8.355f)
                lineTo(15.47f, 16.144f)
                close()
                moveTo(20.693f, 9.6f)
                curveTo(22.52f, 9.6f, 24.0f, 11.081f, 24.0f, 12.904f)
                curveToRelative(0.0f, 1.825f, -1.48f, 3.306f, -3.307f, 3.306f)
                curveToRelative(-1.826f, 0.0f, -3.307f, -1.481f, -3.307f, -3.306f)
                curveToRelative(0.0f, -1.824f, 1.48f, -3.304f, 3.307f, -3.304f)
                close()
                moveTo(10.552f, 14.853f)
                curveToRelative(1.067f, 0.0f, 1.932f, -0.864f, 1.932f, -1.931f)
                curveToRelative(0.0f, -1.065f, -0.865f, -1.929f, -1.932f, -1.929f)
                reflectiveCurveToRelative(-1.932f, 0.864f, -1.932f, 1.929f)
                curveToRelative(0.0f, 1.067f, 0.865f, 1.931f, 1.932f, 1.931f)
                close()
                moveTo(20.693f, 14.85f)
                curveToRelative(1.074f, 0.0f, 1.945f, -0.871f, 1.945f, -1.945f)
                curveToRelative(0.0f, -1.073f, -0.871f, -1.944f, -1.945f, -1.944f)
                curveToRelative(-1.075f, 0.0f, -1.945f, 0.871f, -1.945f, 1.944f)
                curveToRelative(0.0f, 1.075f, 0.87f, 1.945f, 1.945f, 1.945f)
                close()
            }
        }
        .build()
        return _zalo!!
    }

private var _zalo: ImageVector? = null
