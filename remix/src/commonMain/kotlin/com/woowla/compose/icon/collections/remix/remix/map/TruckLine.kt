package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.TruckLine: ImageVector
    get() {
        if (_truckLine != null) {
            return _truckLine!!
        }
        _truckLine = Builder(name = "TruckLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.965f, 18.0f)
                curveTo(8.722f, 19.696f, 7.263f, 21.0f, 5.5f, 21.0f)
                curveTo(3.737f, 21.0f, 2.278f, 19.696f, 2.035f, 18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 5.448f, 1.448f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 5.0f, 17.0f, 5.448f, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                lineTo(23.0f, 12.056f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.965f)
                curveTo(20.722f, 19.696f, 19.263f, 21.0f, 17.5f, 21.0f)
                curveTo(15.737f, 21.0f, 14.278f, 19.696f, 14.035f, 18.0f)
                horizontalLineTo(8.965f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.05f)
                curveTo(3.635f, 14.402f, 4.521f, 14.0f, 5.5f, 14.0f)
                curveTo(6.896f, 14.0f, 8.101f, 14.818f, 8.663f, 16.0f)
                horizontalLineTo(14.337f)
                curveTo(14.505f, 15.647f, 14.73f, 15.326f, 15.0f, 15.05f)
                verticalLineTo(7.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.715f)
                lineTo(18.992f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(18.153f, 19.0f, 18.709f, 18.583f, 18.915f, 18.0f)
                curveTo(18.97f, 17.844f, 19.0f, 17.675f, 19.0f, 17.5f)
                curveTo(19.0f, 16.672f, 18.328f, 16.0f, 17.5f, 16.0f)
                curveTo(16.672f, 16.0f, 16.0f, 16.672f, 16.0f, 17.5f)
                curveTo(16.0f, 17.675f, 16.03f, 17.844f, 16.085f, 18.0f)
                curveTo(16.291f, 18.583f, 16.847f, 19.0f, 17.5f, 19.0f)
                close()
                moveTo(7.0f, 17.5f)
                curveTo(7.0f, 16.672f, 6.328f, 16.0f, 5.5f, 16.0f)
                curveTo(4.672f, 16.0f, 4.0f, 16.672f, 4.0f, 17.5f)
                curveTo(4.0f, 17.675f, 4.03f, 17.844f, 4.085f, 18.0f)
                curveTo(4.291f, 18.583f, 4.847f, 19.0f, 5.5f, 19.0f)
                curveTo(6.153f, 19.0f, 6.709f, 18.583f, 6.915f, 18.0f)
                curveTo(6.97f, 17.844f, 7.0f, 17.675f, 7.0f, 17.5f)
                close()
            }
        }
        .build()
        return _truckLine!!
    }

private var _truckLine: ImageVector? = null
