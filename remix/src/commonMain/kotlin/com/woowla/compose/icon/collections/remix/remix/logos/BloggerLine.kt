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

public val LogosGroup.BloggerLine: ImageVector
    get() {
        if (_bloggerLine != null) {
            return _bloggerLine!!
        }
        _bloggerLine = Builder(name = "BloggerLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.009f)
                curveTo(3.0f, 5.69f, 5.691f, 3.0f, 9.009f, 3.0f)
                horizontalLineTo(12.0f)
                curveTo(15.309f, 3.0f, 17.994f, 5.675f, 18.009f, 8.981f)
                horizontalLineTo(18.953f)
                curveTo(20.104f, 8.981f, 21.0f, 9.877f, 21.0f, 11.028f)
                verticalLineTo(14.99f)
                curveTo(21.0f, 18.309f, 18.309f, 21.0f, 14.991f, 21.0f)
                horizontalLineTo(9.009f)
                curveTo(5.691f, 21.0f, 3.0f, 18.309f, 3.0f, 14.99f)
                verticalLineTo(9.009f)
                close()
                moveTo(9.009f, 5.0f)
                curveTo(6.795f, 5.0f, 5.0f, 6.795f, 5.0f, 9.009f)
                verticalLineTo(14.99f)
                curveTo(5.0f, 17.204f, 6.795f, 19.0f, 9.009f, 19.0f)
                horizontalLineTo(14.991f)
                curveTo(17.205f, 19.0f, 19.0f, 17.204f, 19.0f, 14.99f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                curveTo(16.924f, 11.0f, 16.0f, 10.076f, 16.0f, 9.0f)
                curveTo(16.0f, 6.786f, 14.214f, 5.0f, 12.0f, 5.0f)
                horizontalLineTo(9.009f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(8.0f, 8.448f, 8.448f, 8.0f, 9.0f, 8.0f)
                horizontalLineTo(12.5f)
                curveTo(13.052f, 8.0f, 13.5f, 8.448f, 13.5f, 9.0f)
                curveTo(13.5f, 9.552f, 13.052f, 10.0f, 12.5f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(8.448f, 10.0f, 8.0f, 9.552f, 8.0f, 9.0f)
                close()
                moveTo(9.0f, 14.0f)
                curveTo(8.448f, 14.0f, 8.0f, 14.448f, 8.0f, 15.0f)
                curveTo(8.0f, 15.552f, 8.448f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 16.0f, 16.0f, 15.552f, 16.0f, 15.0f)
                curveTo(16.0f, 14.448f, 15.552f, 14.0f, 15.0f, 14.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _bloggerLine!!
    }

private var _bloggerLine: ImageVector? = null
