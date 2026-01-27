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

public val OthersGroup.Plug3Fill: ImageVector
    get() {
        if (_plug3Fill != null) {
            return _plug3Fill!!
        }
        _plug3Fill = Builder(name = "Plug3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 5.0f, 21.0f, 5.448f, 21.0f, 6.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 17.209f, 19.209f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(4.791f, 19.0f, 3.0f, 17.209f, 3.0f, 15.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.448f, 3.448f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _plug3Fill!!
    }

private var _plug3Fill: ImageVector? = null
