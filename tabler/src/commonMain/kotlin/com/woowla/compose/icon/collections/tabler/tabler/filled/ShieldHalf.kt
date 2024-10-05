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

public val FilledGroup.ShieldHalf: ImageVector
    get() {
        if (_shieldHalf != null) {
            return _shieldHalf!!
        }
        _shieldHalf = Builder(name = "ShieldHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 2.0f)
                lineToRelative(0.032f, 0.002f)
                lineToRelative(0.086f, 0.005f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.342f, 0.104f)
                lineToRelative(0.105f, 0.062f)
                lineToRelative(0.097f, 0.076f)
                lineToRelative(0.016f, 0.015f)
                lineToRelative(0.247f, 0.21f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 7.189f, 2.537f)
                lineToRelative(0.342f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.005f, 0.717f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -9.208f, 16.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.502f, 0.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -9.209f, -16.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.005f, -0.717f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 7.791f, -2.75f)
                lineToRelative(0.046f, -0.036f)
                lineToRelative(0.053f, -0.041f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.217f, -0.112f)
                lineToRelative(0.075f, -0.023f)
                lineToRelative(0.036f, -0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, -0.022f)
                lineToRelative(0.086f, -0.005f)
                close()
                moveTo(12.0f, 4.296f)
                lineToRelative(-0.176f, 0.135f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -7.288f, 2.572f)
                lineToRelative(-0.264f, 0.006f)
                lineToRelative(-0.064f, 0.31f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 1.064f, 7.175f)
                lineToRelative(0.17f, 0.314f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 6.49f, 5.136f)
                lineToRelative(0.068f, 0.019f)
                close()
            }
        }
        .build()
        return _shieldHalf!!
    }

private var _shieldHalf: ImageVector? = null
