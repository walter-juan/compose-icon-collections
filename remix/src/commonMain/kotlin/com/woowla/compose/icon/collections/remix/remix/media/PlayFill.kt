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

public val MediaGroup.PlayFill: ImageVector
    get() {
        if (_playFill != null) {
            return _playFill!!
        }
        _playFill = Builder(name = "PlayFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.376f, 12.416f)
                lineTo(8.777f, 19.482f)
                curveTo(8.548f, 19.635f, 8.237f, 19.573f, 8.084f, 19.343f)
                curveTo(8.029f, 19.261f, 8.0f, 19.164f, 8.0f, 19.066f)
                verticalLineTo(4.934f)
                curveTo(8.0f, 4.658f, 8.224f, 4.434f, 8.5f, 4.434f)
                curveTo(8.599f, 4.434f, 8.695f, 4.464f, 8.777f, 4.518f)
                lineTo(19.376f, 11.584f)
                curveTo(19.606f, 11.737f, 19.668f, 12.048f, 19.515f, 12.277f)
                curveTo(19.478f, 12.332f, 19.431f, 12.38f, 19.376f, 12.416f)
                close()
            }
        }
        .build()
        return _playFill!!
    }

private var _playFill: ImageVector? = null
