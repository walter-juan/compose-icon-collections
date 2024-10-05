package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                lineToRelative(0.018f, 0.001f)
                lineToRelative(0.016f, 0.001f)
                lineToRelative(0.083f, 0.005f)
                lineToRelative(0.011f, 0.002f)
                horizontalLineToRelative(0.011f)
                lineToRelative(0.038f, 0.009f)
                lineToRelative(0.052f, 0.008f)
                lineToRelative(0.016f, 0.006f)
                lineToRelative(0.011f, 0.001f)
                lineToRelative(0.029f, 0.011f)
                lineToRelative(0.052f, 0.014f)
                lineToRelative(0.019f, 0.009f)
                lineToRelative(0.015f, 0.004f)
                lineToRelative(0.028f, 0.014f)
                lineToRelative(0.04f, 0.017f)
                lineToRelative(0.021f, 0.012f)
                lineToRelative(0.022f, 0.01f)
                lineToRelative(0.023f, 0.015f)
                lineToRelative(0.031f, 0.017f)
                lineToRelative(0.034f, 0.024f)
                lineToRelative(0.018f, 0.011f)
                lineToRelative(0.013f, 0.012f)
                lineToRelative(0.024f, 0.017f)
                lineToRelative(0.038f, 0.034f)
                lineToRelative(0.022f, 0.017f)
                lineToRelative(0.008f, 0.01f)
                lineToRelative(0.014f, 0.012f)
                lineToRelative(0.036f, 0.041f)
                lineToRelative(0.026f, 0.027f)
                lineToRelative(0.006f, 0.009f)
                curveToRelative(0.12f, 0.147f, 0.196f, 0.322f, 0.218f, 0.513f)
                lineToRelative(0.001f, 0.012f)
                lineToRelative(0.002f, 0.041f)
                lineToRelative(0.004f, 0.064f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.868f, 1.497f)
                lineToRelative(-0.06f, 0.091f)
                lineToRelative(-8.0f, 11.0f)
                curveToRelative(-0.568f, 0.783f, -1.808f, 0.38f, -1.808f, -0.588f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.868f, -1.497f)
                lineToRelative(0.06f, -0.091f)
                lineToRelative(8.0f, -11.0f)
                lineToRelative(0.01f, -0.013f)
                lineToRelative(0.018f, -0.024f)
                lineToRelative(0.033f, -0.038f)
                lineToRelative(0.018f, -0.022f)
                lineToRelative(0.009f, -0.008f)
                lineToRelative(0.013f, -0.014f)
                lineToRelative(0.04f, -0.036f)
                lineToRelative(0.028f, -0.026f)
                lineToRelative(0.008f, -0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.402f, -0.199f)
                lineToRelative(0.011f, -0.001f)
                lineToRelative(0.027f, -0.005f)
                lineToRelative(0.074f, -0.013f)
                lineToRelative(0.011f, -0.001f)
                lineToRelative(0.041f, -0.002f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
