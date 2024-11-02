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

public val Simpleicons.Ecosia: ImageVector
    get() {
        if (_ecosia != null) {
            return _ecosia!!
        }
        _ecosia = Builder(name = "Ecosia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.198f, 6.818f)
                horizontalLineTo(8.786f)
                verticalLineToRelative(10.48f)
                horizontalLineToRelative(6.412f)
                verticalLineToRelative(-3.342f)
                horizontalLineToRelative(-3.98f)
                verticalLineToRelative(-1.262f)
                horizontalLineTo(13.8f)
                verticalLineTo(11.42f)
                horizontalLineToRelative(-2.584f)
                verticalLineToRelative(-1.261f)
                horizontalLineToRelative(3.981f)
                close()
                moveTo(11.972f, 0.06f)
                arcTo(12.003f, 12.003f, 0.0f, false, false, 0.0f, 12.064f)
                arcToRelative(12.003f, 12.003f, 0.0f, false, false, 10.083f, 11.848f)
                curveToRelative(0.068f, -1.277f, 0.196f, -2.723f, 0.434f, -3.652f)
                verticalLineToRelative(-0.014f)
                curveToRelative(0.0f, -0.005f, 0.0f, -0.007f, -0.01f, -0.012f)
                curveToRelative(0.0f, -0.005f, -0.01f, -0.007f, -0.012f, -0.009f)
                curveToRelative(0.0f, -0.002f, -0.01f, -0.002f, -0.014f, -0.002f)
                horizontalLineToRelative(-0.356f)
                curveToRelative(-2.307f, 0.0f, -5.943f, -0.333f, -6.916f, -3.45f)
                curveToRelative(-1.458f, -4.642f, 2.025f, -6.314f, 3.484f, -4.97f)
                curveToRelative(0.0f, 0.004f, 0.012f, 0.008f, 0.019f, 0.008f)
                curveToRelative(0.01f, 0.0f, 0.014f, 0.0f, 0.02f, -0.005f)
                curveToRelative(0.01f, -0.005f, 0.013f, -0.009f, 0.015f, -0.016f)
                verticalLineToRelative(-0.021f)
                curveToRelative(-0.322f, -0.945f, -2.148f, -6.867f, 2.64f, -8.496f)
                curveToRelative(4.08f, -1.369f, 8.07f, 1.491f, 7.461f, 5.265f)
                verticalLineToRelative(0.017f)
                curveToRelative(0.0f, 0.007f, 0.01f, 0.012f, 0.012f, 0.014f)
                curveToRelative(0.0f, 0.002f, 0.012f, 0.005f, 0.016f, 0.005f)
                curveToRelative(0.0f, 0.0f, 0.012f, -0.002f, 0.016f, -0.005f)
                curveToRelative(0.298f, -0.246f, 1.603f, -1.186f, 2.919f, -0.148f)
                curveToRelative(1.247f, 0.982f, 0.844f, 3.73f, -1.627f, 5.003f)
                curveToRelative(-0.01f, 0.002f, -0.014f, 0.007f, -0.02f, 0.014f)
                verticalLineToRelative(0.023f)
                curveToRelative(0.0f, 0.01f, 0.01f, 0.014f, 0.015f, 0.02f)
                curveToRelative(0.01f, 0.004f, 0.016f, 0.004f, 0.023f, 0.001f)
                curveToRelative(1.596f, -0.239f, 4.316f, 1.193f, 2.11f, 4.375f)
                curveToRelative(-1.447f, 2.1f, -4.71f, 2.365f, -6.168f, 2.365f)
                horizontalLineToRelative(-1.071f)
                reflectiveCurveToRelative(-0.01f, 0.0f, -0.012f, 0.002f)
                curveToRelative(0.0f, 0.002f, -0.01f, 0.005f, -0.012f, 0.007f)
                curveToRelative(0.0f, 0.002f, 0.0f, 0.005f, -0.01f, 0.009f)
                verticalLineToRelative(0.012f)
                curveToRelative(-0.021f, 0.751f, 0.331f, 2.304f, 0.693f, 3.688f)
                arcTo(12.003f, 12.003f, 0.0f, false, false, 24.0f, 12.063f)
                arcTo(12.003f, 12.003f, 0.0f, false, false, 11.997f, 0.06f)
                arcToRelative(12.003f, 12.003f, 0.0f, false, false, -0.03f, 0.0f)
                close()
            }
        }
        .build()
        return _ecosia!!
    }

private var _ecosia: ImageVector? = null
