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

public val MapGroup.MotorbikeLine: ImageVector
    get() {
        if (_motorbikeLine != null) {
            return _motorbikeLine!!
        }
        _motorbikeLine = Builder(name = "MotorbikeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.256f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.365f)
                lineTo(11.2f, 8.0f)
                horizontalLineTo(14.691f)
                lineTo(13.6f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                lineTo(16.092f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.184f)
                lineTo(18.64f, 13.002f)
                curveTo(21.061f, 13.076f, 23.0f, 15.062f, 23.0f, 17.5f)
                curveTo(23.0f, 19.985f, 20.985f, 22.0f, 18.5f, 22.0f)
                curveTo(16.015f, 22.0f, 14.0f, 19.985f, 14.0f, 17.5f)
                curveTo(14.0f, 15.672f, 15.09f, 14.099f, 16.655f, 13.394f)
                lineTo(15.419f, 10.0f)
                horizontalLineTo(14.472f)
                lineTo(12.89f, 15.87f)
                lineTo(12.888f, 15.869f)
                lineTo(12.89f, 15.875f)
                lineTo(9.965f, 16.939f)
                curveTo(9.988f, 17.123f, 10.0f, 17.31f, 10.0f, 17.5f)
                curveTo(10.0f, 19.985f, 7.985f, 22.0f, 5.5f, 22.0f)
                curveTo(3.015f, 22.0f, 1.0f, 19.985f, 1.0f, 17.5f)
                curveTo(1.0f, 15.541f, 2.252f, 13.874f, 4.0f, 13.256f)
                close()
                moveTo(6.0f, 13.028f)
                curveTo(7.376f, 13.18f, 8.565f, 13.952f, 9.281f, 15.059f)
                lineTo(11.238f, 14.347f)
                lineTo(12.403f, 10.0f)
                horizontalLineTo(11.856f)
                lineTo(9.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.028f)
                close()
                moveTo(5.5f, 20.0f)
                curveTo(6.881f, 20.0f, 8.0f, 18.881f, 8.0f, 17.5f)
                curveTo(8.0f, 16.119f, 6.881f, 15.0f, 5.5f, 15.0f)
                curveTo(4.119f, 15.0f, 3.0f, 16.119f, 3.0f, 17.5f)
                curveTo(3.0f, 18.881f, 4.119f, 20.0f, 5.5f, 20.0f)
                close()
                moveTo(18.5f, 20.0f)
                curveTo(19.881f, 20.0f, 21.0f, 18.881f, 21.0f, 17.5f)
                curveTo(21.0f, 16.119f, 19.881f, 15.0f, 18.5f, 15.0f)
                curveTo(17.119f, 15.0f, 16.0f, 16.119f, 16.0f, 17.5f)
                curveTo(16.0f, 18.881f, 17.119f, 20.0f, 18.5f, 20.0f)
                close()
            }
        }
        .build()
        return _motorbikeLine!!
    }

private var _motorbikeLine: ImageVector? = null
