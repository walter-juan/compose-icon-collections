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

public val MediaGroup.GalleryLine: ImageVector
    get() {
        if (_galleryLine != null) {
            return _galleryLine!!
        }
        _galleryLine = Builder(name = "GalleryLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                curveTo(18.322f, 13.0f, 16.751f, 13.459f, 15.407f, 14.259f)
                curveTo(16.591f, 15.644f, 17.527f, 17.247f, 18.146f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(16.004f, 19.0f)
                curveTo(14.045f, 14.302f, 9.408f, 11.0f, 4.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.004f)
                close()
                moveTo(4.0f, 9.0f)
                curveTo(7.829f, 9.0f, 11.323f, 10.435f, 13.974f, 12.796f)
                curveTo(15.705f, 11.66f, 17.775f, 11.0f, 20.0f, 11.0f)
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
                verticalLineTo(9.0f)
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
        return _galleryLine!!
    }

private var _galleryLine: ImageVector? = null
