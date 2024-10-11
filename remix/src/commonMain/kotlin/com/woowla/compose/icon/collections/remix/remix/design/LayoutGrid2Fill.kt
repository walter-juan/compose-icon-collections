package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.LayoutGrid2Fill: ImageVector
    get() {
        if (_layoutGrid2Fill != null) {
            return _layoutGrid2Fill!!
        }
        _layoutGrid2Fill = Builder(name = "LayoutGrid2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(8.0f)
                lineTo(7.5f, 8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(9.5f, 3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(16.5f, 3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.448f, 21.552f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(14.5f, 21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(7.5f, 21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(7.5f)
                close()
                moveTo(2.0f, 14.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.0f)
                lineTo(2.0f, 10.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(9.5f, 10.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _layoutGrid2Fill!!
    }

private var _layoutGrid2Fill: ImageVector? = null
