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

public val MediaGroup.SkipForwardFill: ImageVector
    get() {
        if (_skipForwardFill != null) {
            return _skipForwardFill!!
        }
        _skipForwardFill = Builder(name = "SkipForwardFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.667f)
                lineTo(5.777f, 19.482f)
                curveTo(5.548f, 19.635f, 5.237f, 19.573f, 5.084f, 19.343f)
                curveTo(5.029f, 19.261f, 5.0f, 19.164f, 5.0f, 19.066f)
                verticalLineTo(4.934f)
                curveTo(5.0f, 4.658f, 5.224f, 4.434f, 5.5f, 4.434f)
                curveTo(5.599f, 4.434f, 5.695f, 4.463f, 5.777f, 4.518f)
                lineTo(16.0f, 11.333f)
                verticalLineTo(5.0f)
                curveTo(16.0f, 4.448f, 16.448f, 4.0f, 17.0f, 4.0f)
                curveTo(17.552f, 4.0f, 18.0f, 4.448f, 18.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 19.552f, 17.552f, 20.0f, 17.0f, 20.0f)
                curveTo(16.448f, 20.0f, 16.0f, 19.552f, 16.0f, 19.0f)
                verticalLineTo(12.667f)
                close()
            }
        }
        .build()
        return _skipForwardFill!!
    }

private var _skipForwardFill: ImageVector? = null
