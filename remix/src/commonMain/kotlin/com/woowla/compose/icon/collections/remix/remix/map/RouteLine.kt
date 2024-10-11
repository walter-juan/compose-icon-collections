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

public val MapGroup.RouteLine: ImageVector
    get() {
        if (_routeLine != null) {
            return _routeLine!!
        }
        _routeLine = Builder(name = "RouteLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                verticalLineTo(8.5f)
                curveTo(4.0f, 6.015f, 6.015f, 4.0f, 8.5f, 4.0f)
                curveTo(10.985f, 4.0f, 13.0f, 6.015f, 13.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(13.0f, 16.881f, 14.119f, 18.0f, 15.5f, 18.0f)
                curveTo(16.881f, 18.0f, 18.0f, 16.881f, 18.0f, 15.5f)
                verticalLineTo(8.829f)
                curveTo(16.835f, 8.417f, 16.0f, 7.306f, 16.0f, 6.0f)
                curveTo(16.0f, 4.343f, 17.343f, 3.0f, 19.0f, 3.0f)
                curveTo(20.657f, 3.0f, 22.0f, 4.343f, 22.0f, 6.0f)
                curveTo(22.0f, 7.306f, 21.165f, 8.417f, 20.0f, 8.829f)
                verticalLineTo(15.5f)
                curveTo(20.0f, 17.985f, 17.985f, 20.0f, 15.5f, 20.0f)
                curveTo(13.015f, 20.0f, 11.0f, 17.985f, 11.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(11.0f, 7.119f, 9.881f, 6.0f, 8.5f, 6.0f)
                curveTo(7.119f, 6.0f, 6.0f, 7.119f, 6.0f, 8.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                lineTo(5.0f, 20.0f)
                lineTo(1.0f, 15.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(19.0f, 7.0f)
                curveTo(19.552f, 7.0f, 20.0f, 6.552f, 20.0f, 6.0f)
                curveTo(20.0f, 5.448f, 19.552f, 5.0f, 19.0f, 5.0f)
                curveTo(18.448f, 5.0f, 18.0f, 5.448f, 18.0f, 6.0f)
                curveTo(18.0f, 6.552f, 18.448f, 7.0f, 19.0f, 7.0f)
                close()
            }
        }
        .build()
        return _routeLine!!
    }

private var _routeLine: ImageVector? = null
