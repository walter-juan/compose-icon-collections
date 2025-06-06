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

public val MapGroup.BikeFill: ImageVector
    get() {
        if (_bikeFill != null) {
            return _bikeFill!!
        }
        _bikeFill = Builder(name = "BikeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.795f)
                lineTo(15.813f, 7.166f)
                lineTo(15.233f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.978f)
                curveTo(16.429f, 2.99f, 16.844f, 3.287f, 16.966f, 3.741f)
                lineTo(18.519f, 9.537f)
                lineTo(16.587f, 10.054f)
                lineTo(16.331f, 9.098f)
                lineTo(5.5f, 12.0f)
                close()
                moveTo(5.0f, 21.0f)
                curveTo(2.791f, 21.0f, 1.0f, 19.209f, 1.0f, 17.0f)
                curveTo(1.0f, 14.791f, 2.791f, 13.0f, 5.0f, 13.0f)
                curveTo(7.209f, 13.0f, 9.0f, 14.791f, 9.0f, 17.0f)
                curveTo(9.0f, 19.209f, 7.209f, 21.0f, 5.0f, 21.0f)
                close()
                moveTo(5.0f, 18.0f)
                curveTo(5.552f, 18.0f, 6.0f, 17.552f, 6.0f, 17.0f)
                curveTo(6.0f, 16.448f, 5.552f, 16.0f, 5.0f, 16.0f)
                curveTo(4.448f, 16.0f, 4.0f, 16.448f, 4.0f, 17.0f)
                curveTo(4.0f, 17.552f, 4.448f, 18.0f, 5.0f, 18.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveTo(15.239f, 21.0f, 13.0f, 18.761f, 13.0f, 16.0f)
                curveTo(13.0f, 13.239f, 15.239f, 11.0f, 18.0f, 11.0f)
                curveTo(20.761f, 11.0f, 23.0f, 13.239f, 23.0f, 16.0f)
                curveTo(23.0f, 18.761f, 20.761f, 21.0f, 18.0f, 21.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveTo(18.552f, 17.0f, 19.0f, 16.552f, 19.0f, 16.0f)
                curveTo(19.0f, 15.448f, 18.552f, 15.0f, 18.0f, 15.0f)
                curveTo(17.448f, 15.0f, 17.0f, 15.448f, 17.0f, 16.0f)
                curveTo(17.0f, 16.552f, 17.448f, 17.0f, 18.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bikeFill!!
    }

private var _bikeFill: ImageVector? = null
