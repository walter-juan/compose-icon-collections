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

public val MediaGroup.Image2Line: ImageVector
    get() {
        if (_image2Line != null) {
            return _image2Line!!
        }
        _image2Line = Builder(name = "Image2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.101f)
                lineTo(7.0f, 9.101f)
                lineTo(12.5f, 14.601f)
                lineTo(16.0f, 11.101f)
                lineTo(19.0f, 14.101f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.101f)
                close()
                moveTo(5.0f, 13.929f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.101f)
                lineTo(11.086f, 16.015f)
                lineTo(7.0f, 11.929f)
                lineTo(5.0f, 13.929f)
                close()
                moveTo(10.929f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.929f)
                lineTo(16.0f, 13.929f)
                lineTo(10.929f, 19.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveTo(14.672f, 10.0f, 14.0f, 9.328f, 14.0f, 8.5f)
                curveTo(14.0f, 7.672f, 14.672f, 7.0f, 15.5f, 7.0f)
                curveTo(16.328f, 7.0f, 17.0f, 7.672f, 17.0f, 8.5f)
                curveTo(17.0f, 9.328f, 16.328f, 10.0f, 15.5f, 10.0f)
                close()
            }
        }
        .build()
        return _image2Line!!
    }

private var _image2Line: ImageVector? = null
