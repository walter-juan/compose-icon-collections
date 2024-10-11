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

public val MediaGroup.GalleryFill: ImageVector
    get() {
        if (_galleryFill != null) {
            return _galleryFill!!
        }
        _galleryFill = Builder(name = "GalleryFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.409f, 19.0f)
                curveTo(16.633f, 16.601f, 15.132f, 15.115f, 13.143f, 13.398f)
                curveTo(15.024f, 11.897f, 17.407f, 11.0f, 20.0f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.445f, 22.0f, 3.993f)
                verticalLineTo(20.007f)
                curveTo(22.0f, 20.555f, 21.545f, 21.0f, 21.008f, 21.0f)
                horizontalLineTo(2.992f)
                curveTo(2.444f, 21.0f, 2.0f, 20.555f, 2.0f, 20.007f)
                verticalLineTo(3.993f)
                curveTo(2.0f, 3.445f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                curveTo(9.22f, 12.0f, 13.662f, 14.462f, 15.313f, 19.0f)
                horizontalLineTo(17.409f)
                close()
                moveTo(18.0f, 1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(16.5f, 10.0f)
                curveTo(15.672f, 10.0f, 15.0f, 9.328f, 15.0f, 8.5f)
                curveTo(15.0f, 7.672f, 15.672f, 7.0f, 16.5f, 7.0f)
                curveTo(17.328f, 7.0f, 18.0f, 7.672f, 18.0f, 8.5f)
                curveTo(18.0f, 9.328f, 17.328f, 10.0f, 16.5f, 10.0f)
                close()
            }
        }
        .build()
        return _galleryFill!!
    }

private var _galleryFill: ImageVector? = null
