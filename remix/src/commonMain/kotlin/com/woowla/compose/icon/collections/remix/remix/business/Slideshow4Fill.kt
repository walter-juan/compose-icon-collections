package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.Slideshow4Fill: ImageVector
    get() {
        if (_slideshow4Fill != null) {
            return _slideshow4Fill!!
        }
        _slideshow4Fill = Builder(name = "Slideshow4Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.171f, 3.0f)
                curveTo(8.583f, 1.835f, 9.694f, 1.0f, 11.0f, 1.0f)
                horizontalLineTo(13.0f)
                curveTo(14.306f, 1.0f, 15.417f, 1.835f, 15.829f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(8.171f)
                close()
                moveTo(10.0f, 9.0f)
                verticalLineTo(15.0f)
                lineTo(15.0f, 12.0f)
                lineTo(10.0f, 9.0f)
                close()
                moveTo(11.0f, 3.0f)
                curveTo(10.448f, 3.0f, 10.0f, 3.448f, 10.0f, 4.0f)
                curveTo(10.0f, 4.552f, 10.448f, 5.0f, 11.0f, 5.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 5.0f, 14.0f, 4.552f, 14.0f, 4.0f)
                curveTo(14.0f, 3.448f, 13.552f, 3.0f, 13.0f, 3.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _slideshow4Fill!!
    }

private var _slideshow4Fill: ImageVector? = null
