package com.woowla.compose.icon.collections.remix.remix.food

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.FoodGroup

public val FoodGroup.BeerLine: ImageVector
    get() {
        if (_beerLine != null) {
            return _beerLine!!
        }
        _beerLine = Builder(name = "BeerLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                curveTo(10.105f, 3.0f, 11.0f, 3.895f, 11.0f, 5.0f)
                curveTo(11.0f, 5.115f, 10.99f, 5.226f, 10.972f, 5.335f)
                lineTo(12.945f, 5.665f)
                curveTo(12.981f, 5.448f, 13.0f, 5.226f, 13.0f, 5.0f)
                curveTo(13.0f, 4.762f, 12.979f, 4.53f, 12.94f, 4.304f)
                curveTo(13.247f, 4.111f, 13.61f, 4.0f, 14.0f, 4.0f)
                curveTo(15.105f, 4.0f, 16.0f, 4.895f, 16.0f, 6.0f)
                curveTo(16.0f, 6.364f, 15.903f, 6.706f, 15.733f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 7.0f, 4.0f, 6.552f, 4.0f, 6.0f)
                curveTo(4.0f, 5.448f, 4.448f, 5.0f, 5.0f, 5.0f)
                curveTo(5.2f, 5.0f, 5.384f, 5.058f, 5.539f, 5.157f)
                curveTo(5.812f, 5.332f, 6.154f, 5.364f, 6.455f, 5.242f)
                curveTo(6.756f, 5.12f, 6.978f, 4.859f, 7.052f, 4.543f)
                curveTo(7.259f, 3.658f, 8.054f, 3.0f, 9.0f, 3.0f)
                close()
                moveTo(10.516f, 1.297f)
                curveTo(10.049f, 1.106f, 9.537f, 1.0f, 9.0f, 1.0f)
                curveTo(7.501f, 1.0f, 6.196f, 1.824f, 5.511f, 3.043f)
                curveTo(5.345f, 3.015f, 5.174f, 3.0f, 5.0f, 3.0f)
                curveTo(3.343f, 3.0f, 2.0f, 4.343f, 2.0f, 6.0f)
                curveTo(2.0f, 6.889f, 2.386f, 7.687f, 3.0f, 8.236f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 21.105f, 3.895f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 22.0f, 17.0f, 21.105f, 17.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 20.0f, 21.0f, 19.105f, 21.0f, 18.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 9.895f, 20.105f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.646f)
                curveTo(17.622f, 7.941f, 18.0f, 7.014f, 18.0f, 6.0f)
                curveTo(18.0f, 3.791f, 16.209f, 2.0f, 14.0f, 2.0f)
                curveTo(13.314f, 2.0f, 12.668f, 2.173f, 12.104f, 2.477f)
                curveTo(11.685f, 1.962f, 11.14f, 1.553f, 10.516f, 1.297f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(15.0f, 9.0f)
                verticalLineTo(10.0f)
                verticalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _beerLine!!
    }

private var _beerLine: ImageVector? = null
