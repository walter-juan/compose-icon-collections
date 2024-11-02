package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.RectangleGroup: ImageVector
    get() {
        if (_rectangleGroup != null) {
            return _rectangleGroup!!
        }
        _rectangleGroup = Builder(name = "RectangleGroup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 7.125f)
                curveTo(1.5f, 6.089f, 2.339f, 5.25f, 3.375f, 5.25f)
                horizontalLineTo(9.375f)
                curveTo(10.41f, 5.25f, 11.25f, 6.089f, 11.25f, 7.125f)
                verticalLineTo(10.875f)
                curveTo(11.25f, 11.91f, 10.41f, 12.75f, 9.375f, 12.75f)
                horizontalLineTo(3.375f)
                curveTo(2.339f, 12.75f, 1.5f, 11.91f, 1.5f, 10.875f)
                verticalLineTo(7.125f)
                close()
                moveTo(13.5f, 8.625f)
                curveTo(13.5f, 7.589f, 14.34f, 6.75f, 15.375f, 6.75f)
                horizontalLineTo(20.625f)
                curveTo(21.66f, 6.75f, 22.5f, 7.589f, 22.5f, 8.625f)
                verticalLineTo(16.875f)
                curveTo(22.5f, 17.91f, 21.66f, 18.75f, 20.625f, 18.75f)
                horizontalLineTo(15.375f)
                curveTo(14.34f, 18.75f, 13.5f, 17.91f, 13.5f, 16.875f)
                verticalLineTo(8.625f)
                close()
                moveTo(3.0f, 16.125f)
                curveTo(3.0f, 15.09f, 3.839f, 14.25f, 4.875f, 14.25f)
                horizontalLineTo(10.125f)
                curveTo(11.16f, 14.25f, 12.0f, 15.09f, 12.0f, 16.125f)
                verticalLineTo(18.375f)
                curveTo(12.0f, 19.41f, 11.16f, 20.25f, 10.125f, 20.25f)
                horizontalLineTo(4.875f)
                curveTo(3.839f, 20.25f, 3.0f, 19.41f, 3.0f, 18.375f)
                verticalLineTo(16.125f)
                close()
            }
        }
        .build()
        return _rectangleGroup!!
    }

private var _rectangleGroup: ImageVector? = null
