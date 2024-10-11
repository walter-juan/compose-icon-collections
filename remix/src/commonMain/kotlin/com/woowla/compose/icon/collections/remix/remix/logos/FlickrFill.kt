package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FlickrFill: ImageVector
    get() {
        if (_flickrFill != null) {
            return _flickrFill!!
        }
        _flickrFill = Builder(name = "FlickrFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                curveTo(11.0f, 14.762f, 8.761f, 17.0f, 6.0f, 17.0f)
                curveTo(3.238f, 17.0f, 1.0f, 14.762f, 1.0f, 12.0f)
                curveTo(1.0f, 9.239f, 3.238f, 7.0f, 6.0f, 7.0f)
                curveTo(8.761f, 7.0f, 11.0f, 9.239f, 11.0f, 12.0f)
                close()
                moveTo(23.0f, 12.0f)
                curveTo(23.0f, 14.762f, 20.761f, 17.0f, 18.0f, 17.0f)
                curveTo(15.238f, 17.0f, 13.0f, 14.762f, 13.0f, 12.0f)
                curveTo(13.0f, 9.239f, 15.238f, 7.0f, 18.0f, 7.0f)
                curveTo(20.761f, 7.0f, 23.0f, 9.239f, 23.0f, 12.0f)
                close()
            }
        }
        .build()
        return _flickrFill!!
    }

private var _flickrFill: ImageVector? = null
