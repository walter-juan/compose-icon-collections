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

public val MediaGroup.PictureInPictureFill: ImageVector
    get() {
        if (_pictureInPictureFill != null) {
            return _pictureInPictureFill!!
        }
        _pictureInPictureFill = Builder(name = "PictureInPictureFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 13.0f)
                curveTo(21.552f, 13.0f, 22.0f, 13.448f, 22.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(13.0f)
                curveTo(12.448f, 21.0f, 12.0f, 20.552f, 12.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(12.0f, 13.448f, 12.448f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _pictureInPictureFill!!
    }

private var _pictureInPictureFill: ImageVector? = null
