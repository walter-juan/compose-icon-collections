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

public val MediaGroup.ImageEditLine: ImageVector
    get() {
        if (_imageEditLine != null) {
            return _imageEditLine!!
        }
        _imageEditLine = Builder(name = "ImageEditLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(5.757f)
                lineTo(19.0f, 7.757f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.1f)
                lineTo(9.0f, 9.101f)
                lineTo(13.328f, 13.429f)
                lineTo(11.913f, 14.842f)
                lineTo(9.0f, 11.929f)
                lineTo(5.0f, 15.928f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.533f)
                lineTo(16.241f, 19.001f)
                lineTo(17.57f, 17.671f)
                lineTo(18.899f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.242f)
                lineTo(21.0f, 14.242f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 21.0f, 3.0f, 20.55f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(21.778f, 7.808f)
                lineTo(23.192f, 9.222f)
                lineTo(15.414f, 17.0f)
                lineTo(13.998f, 16.998f)
                lineTo(14.0f, 15.586f)
                lineTo(21.778f, 7.808f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(16.328f, 7.0f, 17.0f, 7.672f, 17.0f, 8.5f)
                curveTo(17.0f, 9.328f, 16.328f, 10.0f, 15.5f, 10.0f)
                curveTo(14.672f, 10.0f, 14.0f, 9.328f, 14.0f, 8.5f)
                curveTo(14.0f, 7.672f, 14.672f, 7.0f, 15.5f, 7.0f)
                close()
            }
        }
        .build()
        return _imageEditLine!!
    }

private var _imageEditLine: ImageVector? = null
