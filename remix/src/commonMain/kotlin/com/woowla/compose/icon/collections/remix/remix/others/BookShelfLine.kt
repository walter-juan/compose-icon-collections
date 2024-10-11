package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.BookShelfLine: ImageVector
    get() {
        if (_bookShelfLine != null) {
            return _bookShelfLine!!
        }
        _bookShelfLine = Builder(name = "BookShelfLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                curveTo(3.448f, 3.0f, 3.0f, 3.448f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.552f, 3.448f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 21.0f, 15.0f, 20.552f, 15.0f, 20.0f)
                verticalLineTo(15.297f)
                lineTo(16.0f, 20.0f)
                curveTo(16.114f, 20.54f, 16.645f, 20.885f, 17.186f, 20.77f)
                lineTo(21.098f, 19.938f)
                curveTo(21.638f, 19.823f, 21.983f, 19.292f, 21.868f, 18.752f)
                lineTo(18.958f, 5.058f)
                curveTo(18.843f, 4.518f, 18.312f, 4.173f, 17.772f, 4.288f)
                lineTo(14.993f, 4.879f)
                curveTo(14.933f, 4.384f, 14.511f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 3.448f, 9.552f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(10.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(10.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(8.0f, 5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(17.332f, 16.65f)
                lineTo(19.288f, 16.234f)
                lineTo(19.704f, 18.19f)
                lineTo(17.748f, 18.606f)
                lineTo(17.332f, 16.65f)
                close()
                moveTo(16.916f, 14.693f)
                lineTo(15.253f, 6.868f)
                lineTo(17.209f, 6.452f)
                lineTo(18.873f, 14.278f)
                lineTo(16.916f, 14.693f)
                close()
            }
        }
        .build()
        return _bookShelfLine!!
    }

private var _bookShelfLine: ImageVector? = null
