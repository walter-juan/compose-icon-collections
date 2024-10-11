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

public val MediaGroup.ForwardEndFill: ImageVector
    get() {
        if (_forwardEndFill != null) {
            return _forwardEndFill!!
        }
        _forwardEndFill = Builder(name = "ForwardEndFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                curveTo(21.448f, 4.0f, 21.0f, 4.448f, 21.0f, 5.0f)
                verticalLineTo(10.667f)
                lineTo(11.777f, 4.518f)
                curveTo(11.695f, 4.463f, 11.599f, 4.434f, 11.5f, 4.434f)
                curveTo(11.224f, 4.434f, 11.0f, 4.658f, 11.0f, 4.934f)
                verticalLineTo(10.667f)
                lineTo(1.777f, 4.518f)
                curveTo(1.695f, 4.463f, 1.599f, 4.434f, 1.5f, 4.434f)
                curveTo(1.224f, 4.434f, 1.0f, 4.658f, 1.0f, 4.934f)
                verticalLineTo(19.066f)
                curveTo(1.0f, 19.164f, 1.029f, 19.261f, 1.084f, 19.343f)
                curveTo(1.237f, 19.573f, 1.548f, 19.635f, 1.777f, 19.482f)
                lineTo(11.0f, 13.333f)
                verticalLineTo(19.066f)
                curveTo(11.0f, 19.164f, 11.029f, 19.261f, 11.084f, 19.343f)
                curveTo(11.237f, 19.573f, 11.548f, 19.635f, 11.777f, 19.482f)
                lineTo(21.0f, 13.333f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.552f, 21.448f, 20.0f, 22.0f, 20.0f)
                curveTo(22.552f, 20.0f, 23.0f, 19.552f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 4.448f, 22.552f, 4.0f, 22.0f, 4.0f)
                close()
            }
        }
        .build()
        return _forwardEndFill!!
    }

private var _forwardEndFill: ImageVector? = null
