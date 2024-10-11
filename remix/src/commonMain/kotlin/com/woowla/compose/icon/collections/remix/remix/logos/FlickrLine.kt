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

public val LogosGroup.FlickrLine: ImageVector
    get() {
        if (_flickrLine != null) {
            return _flickrLine!!
        }
        _flickrLine = Builder(name = "FlickrLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 17.0f)
                curveTo(8.761f, 17.0f, 11.0f, 14.762f, 11.0f, 12.0f)
                curveTo(11.0f, 9.239f, 8.761f, 7.0f, 6.0f, 7.0f)
                curveTo(3.238f, 7.0f, 1.0f, 9.239f, 1.0f, 12.0f)
                curveTo(1.0f, 14.762f, 3.238f, 17.0f, 6.0f, 17.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 7.657f, 15.0f, 6.0f, 15.0f)
                curveTo(4.343f, 15.0f, 3.0f, 13.657f, 3.0f, 12.0f)
                curveTo(3.0f, 10.343f, 4.343f, 9.0f, 6.0f, 9.0f)
                curveTo(7.657f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveTo(20.761f, 17.0f, 23.0f, 14.762f, 23.0f, 12.0f)
                curveTo(23.0f, 9.239f, 20.761f, 7.0f, 18.0f, 7.0f)
                curveTo(15.238f, 7.0f, 13.0f, 9.239f, 13.0f, 12.0f)
                curveTo(13.0f, 14.762f, 15.238f, 17.0f, 18.0f, 17.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 13.657f, 19.657f, 15.0f, 18.0f, 15.0f)
                curveTo(16.343f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 16.343f, 9.0f, 18.0f, 9.0f)
                curveTo(19.657f, 9.0f, 21.0f, 10.343f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _flickrLine!!
    }

private var _flickrLine: ImageVector? = null
