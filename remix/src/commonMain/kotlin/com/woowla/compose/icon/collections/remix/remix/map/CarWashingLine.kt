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

public val MapGroup.CarWashingLine: ImageVector
    get() {
        if (_carWashingLine != null) {
            return _carWashingLine!!
        }
        _carWashingLine = Builder(name = "CarWashingLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                curveTo(5.0f, 22.552f, 4.552f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 23.0f, 2.0f, 22.552f, 2.0f, 22.0f)
                verticalLineTo(12.0f)
                lineTo(4.417f, 7.971f)
                curveTo(4.779f, 7.369f, 5.43f, 7.0f, 6.132f, 7.0f)
                horizontalLineTo(17.868f)
                curveTo(18.57f, 7.0f, 19.221f, 7.369f, 19.583f, 7.971f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(22.0f)
                curveTo(22.0f, 22.552f, 21.552f, 23.0f, 21.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(19.448f, 23.0f, 19.0f, 22.552f, 19.0f, 22.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(4.332f, 12.0f)
                horizontalLineTo(19.668f)
                lineTo(17.868f, 9.0f)
                horizontalLineTo(6.132f)
                lineTo(4.332f, 12.0f)
                close()
                moveTo(5.439f, 3.439f)
                lineTo(6.5f, 2.379f)
                lineTo(7.561f, 3.439f)
                curveTo(7.832f, 3.711f, 8.0f, 4.086f, 8.0f, 4.5f)
                curveTo(8.0f, 5.328f, 7.328f, 6.0f, 6.5f, 6.0f)
                curveTo(5.672f, 6.0f, 5.0f, 5.328f, 5.0f, 4.5f)
                curveTo(5.0f, 4.086f, 5.168f, 3.711f, 5.439f, 3.439f)
                close()
                moveTo(10.939f, 3.439f)
                lineTo(12.0f, 2.379f)
                lineTo(13.061f, 3.439f)
                curveTo(13.332f, 3.711f, 13.5f, 4.086f, 13.5f, 4.5f)
                curveTo(13.5f, 5.328f, 12.828f, 6.0f, 12.0f, 6.0f)
                curveTo(11.172f, 6.0f, 10.5f, 5.328f, 10.5f, 4.5f)
                curveTo(10.5f, 4.086f, 10.668f, 3.711f, 10.939f, 3.439f)
                close()
                moveTo(16.439f, 3.439f)
                lineTo(17.5f, 2.379f)
                lineTo(18.561f, 3.439f)
                curveTo(18.832f, 3.711f, 19.0f, 4.086f, 19.0f, 4.5f)
                curveTo(19.0f, 5.328f, 18.328f, 6.0f, 17.5f, 6.0f)
                curveTo(16.672f, 6.0f, 16.0f, 5.328f, 16.0f, 4.5f)
                curveTo(16.0f, 4.086f, 16.168f, 3.711f, 16.439f, 3.439f)
                close()
                moveTo(6.5f, 18.0f)
                curveTo(5.672f, 18.0f, 5.0f, 17.328f, 5.0f, 16.5f)
                curveTo(5.0f, 15.672f, 5.672f, 15.0f, 6.5f, 15.0f)
                curveTo(7.328f, 15.0f, 8.0f, 15.672f, 8.0f, 16.5f)
                curveTo(8.0f, 17.328f, 7.328f, 18.0f, 6.5f, 18.0f)
                close()
                moveTo(17.5f, 18.0f)
                curveTo(16.672f, 18.0f, 16.0f, 17.328f, 16.0f, 16.5f)
                curveTo(16.0f, 15.672f, 16.672f, 15.0f, 17.5f, 15.0f)
                curveTo(18.328f, 15.0f, 19.0f, 15.672f, 19.0f, 16.5f)
                curveTo(19.0f, 17.328f, 18.328f, 18.0f, 17.5f, 18.0f)
                close()
            }
        }
        .build()
        return _carWashingLine!!
    }

private var _carWashingLine: ImageVector? = null
