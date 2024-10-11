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

public val OthersGroup.BookShelfFill: ImageVector
    get() {
        if (_bookShelfFill != null) {
            return _bookShelfFill!!
        }
        _bookShelfFill = Builder(name = "BookShelfFill", defaultWidth = 24.0.dp, defaultHeight =
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
                verticalLineTo(10.697f)
                lineTo(17.021f, 20.208f)
                curveTo(17.136f, 20.748f, 17.667f, 21.093f, 18.208f, 20.978f)
                lineTo(21.142f, 20.354f)
                curveTo(21.682f, 20.239f, 22.027f, 19.708f, 21.912f, 19.168f)
                lineTo(19.001f, 5.474f)
                curveTo(18.887f, 4.934f, 18.356f, 4.589f, 17.815f, 4.704f)
                lineTo(15.0f, 5.302f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 4.448f, 14.552f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 3.448f, 8.552f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(13.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(7.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(18.77f, 18.814f)
                lineTo(18.354f, 16.858f)
                lineTo(19.332f, 16.65f)
                lineTo(19.748f, 18.606f)
                lineTo(18.77f, 18.814f)
                close()
            }
        }
        .build()
        return _bookShelfFill!!
    }

private var _bookShelfFill: ImageVector? = null
