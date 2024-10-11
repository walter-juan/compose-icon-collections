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

public val MapGroup.EBike2Fill: ImageVector
    get() {
        if (_eBike2Fill != null) {
            return _eBike2Fill!!
        }
        _eBike2Fill = Builder(name = "EBike2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.0f)
                curveTo(16.552f, 1.0f, 17.0f, 1.448f, 17.0f, 2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.981f)
                lineTo(22.727f, 16.545f)
                curveTo(22.903f, 16.996f, 23.0f, 17.487f, 23.0f, 18.0f)
                curveTo(23.0f, 20.209f, 21.209f, 22.0f, 19.0f, 22.0f)
                curveTo(17.136f, 22.0f, 15.57f, 20.725f, 15.126f, 19.0f)
                horizontalLineTo(10.874f)
                curveTo(10.43f, 20.725f, 8.864f, 22.0f, 7.0f, 22.0f)
                curveTo(5.056f, 22.0f, 3.435f, 20.612f, 3.075f, 18.774f)
                curveTo(2.436f, 18.44f, 2.0f, 17.771f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 6.448f, 2.448f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(10.552f, 6.0f, 11.0f, 6.448f, 11.0f, 7.0f)
                verticalLineTo(12.0f)
                curveTo(11.0f, 12.552f, 11.448f, 13.0f, 12.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 13.0f, 15.0f, 12.552f, 15.0f, 12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(19.0f, 16.0f)
                curveTo(17.895f, 16.0f, 17.0f, 16.895f, 17.0f, 18.0f)
                curveTo(17.0f, 19.105f, 17.895f, 20.0f, 19.0f, 20.0f)
                curveTo(20.105f, 20.0f, 21.0f, 19.105f, 21.0f, 18.0f)
                curveTo(21.0f, 17.76f, 20.958f, 17.529f, 20.88f, 17.316f)
                lineTo(20.864f, 17.272f)
                curveTo(20.573f, 16.528f, 19.848f, 16.0f, 19.0f, 16.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(5.895f, 16.0f, 5.0f, 16.895f, 5.0f, 18.0f)
                curveTo(5.0f, 19.105f, 5.895f, 20.0f, 7.0f, 20.0f)
                curveTo(8.105f, 20.0f, 9.0f, 19.105f, 9.0f, 18.0f)
                curveTo(9.0f, 16.895f, 8.105f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _eBike2Fill!!
    }

private var _eBike2Fill: ImageVector? = null
