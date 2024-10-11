package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.SpeedFill: ImageVector
    get() {
        if (_speedFill != null) {
            return _speedFill!!
        }
        _speedFill = Builder(name = "SpeedFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.333f)
                lineTo(2.777f, 19.482f)
                curveTo(2.548f, 19.635f, 2.237f, 19.573f, 2.084f, 19.343f)
                curveTo(2.029f, 19.261f, 2.0f, 19.164f, 2.0f, 19.066f)
                verticalLineTo(4.934f)
                curveTo(2.0f, 4.658f, 2.224f, 4.434f, 2.5f, 4.434f)
                curveTo(2.599f, 4.434f, 2.695f, 4.464f, 2.777f, 4.518f)
                lineTo(12.0f, 10.667f)
                verticalLineTo(4.934f)
                curveTo(12.0f, 4.658f, 12.224f, 4.434f, 12.5f, 4.434f)
                curveTo(12.599f, 4.434f, 12.695f, 4.464f, 12.777f, 4.518f)
                lineTo(23.376f, 11.584f)
                curveTo(23.606f, 11.737f, 23.668f, 12.048f, 23.515f, 12.277f)
                curveTo(23.478f, 12.332f, 23.431f, 12.38f, 23.376f, 12.416f)
                lineTo(12.777f, 19.482f)
                curveTo(12.548f, 19.635f, 12.237f, 19.573f, 12.084f, 19.343f)
                curveTo(12.029f, 19.261f, 12.0f, 19.164f, 12.0f, 19.066f)
                verticalLineTo(13.333f)
                close()
            }
        }
        .build()
        return _speedFill!!
    }

private var _speedFill: ImageVector? = null
