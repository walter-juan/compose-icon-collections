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

public val MapGroup.EBike2Line: ImageVector
    get() {
        if (_eBike2Line != null) {
            return _eBike2Line!!
        }
        _eBike2Line = Builder(name = "EBike2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                lineTo(22.727f, 16.544f)
                curveTo(22.903f, 16.995f, 23.0f, 17.486f, 23.0f, 17.999f)
                curveTo(23.0f, 20.208f, 21.209f, 21.999f, 19.0f, 21.999f)
                curveTo(17.136f, 21.999f, 15.571f, 20.725f, 15.126f, 19.0f)
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
                moveTo(7.0f, 16.0f)
                curveTo(5.895f, 16.0f, 5.0f, 16.895f, 5.0f, 18.0f)
                curveTo(5.0f, 19.105f, 5.895f, 20.0f, 7.0f, 20.0f)
                curveTo(8.105f, 20.0f, 9.0f, 19.105f, 9.0f, 18.0f)
                curveTo(9.0f, 16.895f, 8.105f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(19.0f, 15.999f)
                curveTo(17.895f, 15.999f, 17.0f, 16.894f, 17.0f, 17.999f)
                curveTo(17.0f, 19.104f, 17.895f, 19.999f, 19.0f, 19.999f)
                curveTo(20.105f, 19.999f, 21.0f, 19.104f, 21.0f, 17.999f)
                curveTo(21.0f, 17.759f, 20.958f, 17.528f, 20.88f, 17.315f)
                lineTo(20.864f, 17.271f)
                curveTo(20.573f, 16.527f, 19.848f, 15.999f, 19.0f, 15.999f)
                close()
                moveTo(17.853f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 13.657f, 15.657f, 15.0f, 14.0f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.354f)
                curveTo(4.733f, 14.524f, 5.805f, 14.0f, 7.0f, 14.0f)
                curveTo(8.864f, 14.0f, 10.43f, 15.275f, 10.874f, 17.0f)
                horizontalLineTo(15.126f)
                curveTo(15.569f, 15.274f, 17.136f, 13.999f, 19.0f, 13.999f)
                curveTo(19.237f, 13.999f, 19.469f, 14.02f, 19.694f, 14.059f)
                lineTo(17.853f, 9.0f)
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
        return _eBike2Line!!
    }

private var _eBike2Line: ImageVector? = null
