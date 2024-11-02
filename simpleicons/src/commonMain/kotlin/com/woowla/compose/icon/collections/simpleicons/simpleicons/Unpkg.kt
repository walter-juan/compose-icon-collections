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

public val Simpleicons.Unpkg: ImageVector
    get() {
        if (_unpkg != null) {
            return _unpkg!!
        }
        _unpkg = Builder(name = "Unpkg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(4.322f, 2.977f)
                lineTo(8.692f, 2.979f)
                arcToRelative(0.043f, 0.043f, 0.0f, false, true, 0.044f, 0.04f)
                arcToRelative(9542.6f, 9542.6f, 0.0f, false, true, 0.0f, 9.165f)
                curveToRelative(0.0f, 0.75f, 0.029f, 1.403f, 0.09f, 1.957f)
                curveToRelative(0.038f, 0.336f, 0.134f, 0.68f, 0.287f, 1.03f)
                curveToRelative(0.336f, 0.769f, 0.907f, 1.237f, 1.715f, 1.405f)
                curveToRelative(0.626f, 0.13f, 1.258f, 0.127f, 1.893f, -0.008f)
                curveToRelative(1.166f, -0.248f, 1.813f, -1.268f, 1.96f, -2.404f)
                curveToRelative(0.067f, -0.513f, 0.1f, -1.186f, 0.1f, -2.018f)
                curveToRelative(-0.001f, -3.15f, -0.001f, -6.188f, 0.002f, -9.119f)
                curveToRelative(0.0f, -0.033f, 0.017f, -0.05f, 0.049f, -0.05f)
                horizontalLineToRelative(4.338f)
                arcToRelative(0.033f, 0.033f, 0.0f, false, true, 0.033f, 0.033f)
                verticalLineToRelative(9.869f)
                curveToRelative(0.0f, 1.465f, -0.17f, 2.918f, -0.746f, 4.234f)
                curveToRelative(-0.777f, 1.775f, -2.323f, 2.836f, -4.195f, 3.211f)
                curveToRelative(-1.7f, 0.341f, -3.39f, 0.338f, -5.07f, -0.013f)
                curveToRelative(-2.226f, -0.465f, -3.808f, -1.828f, -4.46f, -4.03f)
                curveToRelative(-0.249f, -0.846f, -0.389f, -1.708f, -0.416f, -2.586f)
                arcToRelative(65.217f, 65.217f, 0.0f, false, true, -0.029f, -1.88f)
                curveToRelative(-0.002f, -3.037f, -0.002f, -5.97f, 0.0f, -8.801f)
                curveToRelative(0.0f, -0.024f, 0.011f, -0.037f, 0.035f, -0.037f)
                close()
            }
        }
        .build()
        return _unpkg!!
    }

private var _unpkg: ImageVector? = null
