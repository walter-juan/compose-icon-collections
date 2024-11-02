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

public val Simpleicons.Migadu: ImageVector
    get() {
        if (_migadu != null) {
            return _migadu!!
        }
        _migadu = Builder(name = "Migadu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.082f, 1.898f)
                curveToRelative(-3.853f, 0.0f, -6.991f, 3.083f, -7.08f, 6.914f)
                curveToRelative(0.002f, 7.003f, -0.004f, 3.868f, 0.0f, 5.922f)
                curveToRelative(-0.064f, 3.518f, 2.407f, 7.254f, 7.082f, 7.367f)
                horizontalLineToRelative(0.006f)
                lineToRelative(0.018f, -4.311f)
                curveToRelative(-0.009f, -0.007f, -0.033f, 0.006f, -0.023f, -0.018f)
                arcToRelative(3.216f, 3.216f, 0.0f, false, true, -0.178f, -0.008f)
                curveToRelative(-0.472f, -0.068f, -0.883f, -0.189f, -1.229f, -0.363f)
                curveToRelative(-0.713f, -0.414f, -1.219f, -1.234f, -1.35f, -2.016f)
                curveToRelative(-0.075f, -2.297f, 1.671f, -3.178f, 2.754f, -3.135f)
                curveToRelative(1.789f, 0.071f, 2.855f, 1.473f, 2.754f, 3.254f)
                verticalLineToRelative(6.596f)
                horizontalLineToRelative(4.328f)
                verticalLineToRelative(-7.082f)
                arcToRelative(2.816f, 2.816f, 0.0f, false, true, 0.109f, -0.772f)
                curveToRelative(0.299f, -1.039f, 1.205f, -1.863f, 2.445f, -1.982f)
                horizontalLineToRelative(0.383f)
                curveToRelative(1.432f, 0.118f, 2.53f, 1.269f, 2.57f, 2.719f)
                verticalLineToRelative(7.117f)
                lineTo(24.0f, 22.102f)
                curveToRelative(-0.006f, -2.361f, 0.0f, -4.721f, 0.0f, -7.082f)
                curveToRelative(0.0f, -3.893f, -3.148f, -7.057f, -7.035f, -7.082f)
                curveToRelative(-0.893f, -0.003f, -1.844f, 0.152f, -2.801f, 0.557f)
                lineToRelative(-0.018f, -0.01f)
                curveToRelative(-0.255f, -3.678f, -3.323f, -6.586f, -7.064f, -6.586f)
                close()
                moveTo(4.32f, 10.219f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, 1.023f, 1.023f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.023f, 1.023f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.023f, -1.023f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, 1.023f, -1.023f)
                close()
            }
        }
        .build()
        return _migadu!!
    }

private var _migadu: ImageVector? = null
