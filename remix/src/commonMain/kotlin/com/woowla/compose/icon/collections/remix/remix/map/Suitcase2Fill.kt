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

public val MapGroup.Suitcase2Fill: ImageVector
    get() {
        if (_suitcase2Fill != null) {
            return _suitcase2Fill!!
        }
        _suitcase2Fill = Builder(name = "Suitcase2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 23.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 22.0f, 3.0f, 21.105f, 3.0f, 20.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 5.895f, 3.895f, 5.0f, 5.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                curveTo(8.0f, 2.448f, 8.448f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(15.552f, 2.0f, 16.0f, 2.448f, 16.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 5.0f, 21.0f, 5.895f, 21.0f, 7.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.105f, 20.105f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _suitcase2Fill!!
    }

private var _suitcase2Fill: ImageVector? = null
