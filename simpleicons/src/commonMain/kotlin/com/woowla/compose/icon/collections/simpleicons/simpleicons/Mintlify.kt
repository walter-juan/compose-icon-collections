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

public val Simpleicons.Mintlify: ImageVector
    get() {
        if (_mintlify != null) {
            return _mintlify!!
        }
        _mintlify = Builder(name = "Mintlify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.158f, 0.002f)
                arcToRelative(8.807f, 8.807f, 0.0f, false, false, -6.249f, 2.59f)
                lineToRelative(-0.062f, 0.063f)
                horizontalLineToRelative(-0.003f)
                lineTo(2.655f, 8.844f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, -0.062f, 0.058f)
                arcToRelative(8.838f, 8.838f, 0.0f, false, false, -0.83f, 11.55f)
                lineToRelative(6.251f, -6.249f)
                lineToRelative(0.065f, -0.063f)
                arcToRelative(8.778f, 8.778f, 0.0f, false, true, -1.758f, -5.385f)
                arcToRelative(8.784f, 8.784f, 0.0f, false, true, 0.283f, -2.151f)
                arcToRelative(8.993f, 8.993f, 0.0f, false, true, 2.151f, -0.286f)
                arcToRelative(8.802f, 8.802f, 0.0f, false, true, 5.386f, 1.76f)
                arcToRelative(8.81f, 8.81f, 0.0f, false, true, 3.032f, 4.11f)
                arcToRelative(8.879f, 8.879f, 0.0f, false, true, 0.225f, 5.21f)
                arcToRelative(8.784f, 8.784f, 0.0f, false, false, -0.341f, 0.082f)
                arcToRelative(8.846f, 8.846f, 0.0f, false, true, -4.868f, -0.303f)
                arcToRelative(8.679f, 8.679f, 0.0f, false, true, -2.323f, -1.25f)
                lineToRelative(-0.064f, 0.065f)
                lineTo(3.55f, 22.24f)
                arcToRelative(8.85f, 8.85f, 0.0f, false, false, 11.548f, -0.83f)
                lineToRelative(0.06f, -0.062f)
                lineToRelative(6.19f, -6.187f)
                arcToRelative(8.801f, 8.801f, 0.0f, false, true, -0.367f, 0.337f)
                curveToRelative(0.125f, -0.11f, 0.247f, -0.224f, 0.366f, -0.341f)
                lineToRelative(0.063f, -0.058f)
                arcTo(8.817f, 8.817f, 0.0f, false, false, 24.0f, 8.844f)
                lineTo(24.0f, 0.002f)
                close()
                moveTo(8.38f, 3.17f)
                arcToRelative(8.73f, 8.73f, 0.0f, false, true, 0.0f, 0.0f)
                close()
                moveTo(8.055f, 3.583f)
                close()
                moveTo(7.727f, 4.058f)
                close()
                moveTo(7.417f, 4.576f)
                close()
                moveTo(7.182f, 5.031f)
                close()
                moveTo(6.899f, 5.691f)
                close()
                moveTo(6.743f, 6.138f)
                close()
                moveTo(20.89f, 15.578f)
                close()
                moveTo(20.46f, 15.921f)
                close()
                moveTo(19.455f, 16.571f)
                close()
                moveTo(18.922f, 16.845f)
                close()
                moveTo(18.447f, 17.052f)
                close()
            }
        }
        .build()
        return _mintlify!!
    }

private var _mintlify: ImageVector? = null
