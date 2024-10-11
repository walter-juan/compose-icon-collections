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

public val LogosGroup.BilibiliLine: ImageVector
    get() {
        if (_bilibiliLine != null) {
            return _bilibiliLine!!
        }
        _bilibiliLine = Builder(name = "BilibiliLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.172f, 2.757f)
                lineTo(10.414f, 5.999f)
                horizontalLineTo(13.585f)
                lineTo(16.828f, 2.757f)
                curveTo(17.219f, 2.367f, 17.852f, 2.367f, 18.243f, 2.757f)
                curveTo(18.633f, 3.148f, 18.633f, 3.781f, 18.243f, 4.172f)
                lineTo(16.414f, 5.999f)
                lineTo(18.5f, 6.0f)
                curveTo(20.433f, 6.0f, 22.0f, 7.567f, 22.0f, 9.5f)
                verticalLineTo(17.5f)
                curveTo(22.0f, 19.433f, 20.433f, 21.0f, 18.5f, 21.0f)
                horizontalLineTo(5.5f)
                curveTo(3.567f, 21.0f, 2.0f, 19.433f, 2.0f, 17.5f)
                verticalLineTo(9.5f)
                curveTo(2.0f, 7.567f, 3.567f, 6.0f, 5.5f, 6.0f)
                lineTo(7.585f, 5.999f)
                lineTo(5.757f, 4.172f)
                curveTo(5.367f, 3.781f, 5.367f, 3.148f, 5.757f, 2.757f)
                curveTo(6.148f, 2.367f, 6.781f, 2.367f, 7.172f, 2.757f)
                close()
                moveTo(18.5f, 8.0f)
                horizontalLineTo(5.5f)
                curveTo(4.72f, 8.0f, 4.08f, 8.595f, 4.007f, 9.356f)
                lineTo(4.0f, 9.5f)
                verticalLineTo(17.5f)
                curveTo(4.0f, 18.28f, 4.595f, 18.92f, 5.356f, 18.993f)
                lineTo(5.5f, 19.0f)
                horizontalLineTo(18.5f)
                curveTo(19.28f, 19.0f, 19.92f, 18.405f, 19.993f, 17.645f)
                lineTo(20.0f, 17.5f)
                verticalLineTo(9.5f)
                curveTo(20.0f, 8.672f, 19.328f, 8.0f, 18.5f, 8.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(8.552f, 11.0f, 9.0f, 11.448f, 9.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(9.0f, 14.552f, 8.552f, 15.0f, 8.0f, 15.0f)
                curveTo(7.448f, 15.0f, 7.0f, 14.552f, 7.0f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(7.0f, 11.448f, 7.448f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(16.552f, 11.0f, 17.0f, 11.448f, 17.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(17.0f, 14.552f, 16.552f, 15.0f, 16.0f, 15.0f)
                curveTo(15.448f, 15.0f, 15.0f, 14.552f, 15.0f, 14.0f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 11.448f, 15.448f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bilibiliLine!!
    }

private var _bilibiliLine: ImageVector? = null
