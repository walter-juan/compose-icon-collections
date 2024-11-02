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

public val Simpleicons.Cryptpad: ImageVector
    get() {
        if (_cryptpad != null) {
            return _cryptpad!!
        }
        _cryptpad = Builder(name = "Cryptpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.355f, 0.0f)
                lineToRelative(0.008f, 0.717f)
                lineToRelative(0.153f, 12.23f)
                curveToRelative(0.045f, 3.668f, 1.528f, 6.09f, 3.425f, 7.692f)
                curveToRelative(1.897f, 1.602f, 4.168f, 2.444f, 5.844f, 3.215f)
                lineToRelative(0.317f, 0.146f)
                lineToRelative(0.308f, -0.164f)
                curveToRelative(1.492f, -0.788f, 3.779f, -1.625f, 5.72f, -3.209f)
                curveToRelative(1.943f, -1.584f, 3.515f, -3.997f, 3.515f, -7.69f)
                lineTo(21.645f, 5.97f)
                lineTo(15.22f, 0.0f)
                close()
                moveTo(12.084f, 1.416f)
                horizontalLineToRelative(1.604f)
                verticalLineToRelative(6.016f)
                horizontalLineToRelative(6.542f)
                verticalLineToRelative(3.879f)
                lineTo(15.4f, 11.311f)
                curveToRelative(-0.055f, 1.091f, -0.59f, 1.926f, -1.256f, 2.484f)
                lineToRelative(0.938f, 4.97f)
                horizontalLineToRelative(-2.994f)
                verticalLineToRelative(3.655f)
                lineToRelative(-0.018f, 0.008f)
                curveToRelative(-1.691f, -0.764f, -3.651f, -1.55f, -5.215f, -2.87f)
                curveToRelative(-1.653f, -1.396f, -2.884f, -3.32f, -2.925f, -6.628f)
                lineToRelative(-0.02f, -1.62f)
                horizontalLineToRelative(4.674f)
                curveToRelative(-0.003f, -0.054f, -0.006f, -0.108f, -0.006f, -0.164f)
                arcToRelative(3.424f, 3.424f, 0.0f, false, true, 3.41f, -3.41f)
                lineToRelative(0.096f, 0.002f)
                close()
                moveTo(15.104f, 1.824f)
                lineTo(19.617f, 6.018f)
                horizontalLineToRelative(-4.513f)
                close()
                moveTo(11.992f, 8.734f)
                arcToRelative(2.412f, 2.412f, 0.0f, false, false, -1.043f, 4.586f)
                lineToRelative(-0.844f, 4.448f)
                horizontalLineToRelative(3.772f)
                lineToRelative(-0.842f, -4.448f)
                arcToRelative(2.412f, 2.412f, 0.0f, false, false, -1.043f, -4.586f)
                close()
            }
        }
        .build()
        return _cryptpad!!
    }

private var _cryptpad: ImageVector? = null
