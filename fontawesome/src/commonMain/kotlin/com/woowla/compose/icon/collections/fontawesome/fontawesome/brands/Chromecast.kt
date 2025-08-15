package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Chromecast: ImageVector
    get() {
        if (_chromecast != null) {
            return _chromecast!!
        }
        _chromecast = Builder(name = "Chromecast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 64.0f)
                lineTo(64.2f, 64.0f)
                curveToRelative(-23.6f, 0.0f, -42.7f, 19.1f, -42.7f, 42.7f)
                lineToRelative(0.0f, 63.9f)
                lineToRelative(42.7f, 0.0f)
                lineToRelative(0.0f, -63.9f)
                lineToRelative(383.8f, 0.0f)
                lineToRelative(0.0f, 298.6f)
                lineToRelative(-149.2f, 0.0f)
                lineToRelative(0.0f, 42.7f)
                lineToRelative(149.4f, 0.0f)
                curveToRelative(23.6f, 0.0f, 42.7f, -19.1f, 42.7f, -42.7f)
                lineToRelative(0.0f, -298.6f)
                curveTo(490.9f, 83.1f, 471.6f, 64.0f, 448.0f, 64.0f)
                close()
                moveTo(21.5f, 383.6f)
                lineToRelative(0.0f, 63.9f)
                lineToRelative(63.9f, 0.0f)
                curveToRelative(0.0f, -35.3f, -28.6f, -63.9f, -63.9f, -63.9f)
                close()
                moveTo(21.5f, 298.6f)
                lineToRelative(0.0f, 42.4f)
                curveToRelative(58.9f, 0.0f, 106.6f, 48.1f, 106.6f, 107.0f)
                lineToRelative(42.7f, 0.0f)
                curveToRelative(0.1f, -82.4f, -66.9f, -149.3f, -149.3f, -149.4f)
                close()
                moveTo(213.6f, 448.0f)
                lineToRelative(42.7f, 0.0f)
                curveTo(255.8f, 318.5f, 151.0f, 213.7f, 21.5f, 213.4f)
                lineToRelative(0.0f, 42.4f)
                curveToRelative(106.0f, -0.2f, 192.0f, 86.2f, 192.1f, 192.2f)
                close()
            }
        }
        .build()
        return _chromecast!!
    }

private var _chromecast: ImageVector? = null
