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

public val MapGroup.OilLine: ImageVector
    get() {
        if (_oilLine != null) {
            return _oilLine!!
        }
        _oilLine = Builder(name = "OilLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.07f, 7.0f)
                lineTo(6.0f, 11.606f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.07f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 5.0f, 20.0f, 5.448f, 20.0f, 6.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.552f, 19.552f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 22.0f, 4.0f, 21.552f, 4.0f, 21.0f)
                verticalLineTo(11.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(13.0f, 1.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 1.0f, 19.0f, 1.448f, 19.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                curveTo(12.0f, 1.448f, 12.448f, 1.0f, 13.0f, 1.0f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _oilLine!!
    }

private var _oilLine: ImageVector? = null
