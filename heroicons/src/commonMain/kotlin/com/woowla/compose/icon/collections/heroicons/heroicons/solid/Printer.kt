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

public val SolidGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.875f, 1.5f)
                curveTo(6.839f, 1.5f, 6.0f, 2.339f, 6.0f, 3.375f)
                verticalLineTo(6.366f)
                curveTo(5.574f, 6.418f, 5.149f, 6.476f, 4.726f, 6.539f)
                curveTo(3.272f, 6.757f, 2.25f, 8.022f, 2.25f, 9.456f)
                verticalLineTo(15.75f)
                curveTo(2.25f, 17.407f, 3.593f, 18.75f, 5.25f, 18.75f)
                horizontalLineTo(5.52f)
                lineTo(5.365f, 20.455f)
                curveTo(5.265f, 21.553f, 6.129f, 22.5f, 7.232f, 22.5f)
                horizontalLineTo(16.768f)
                curveTo(17.871f, 22.5f, 18.735f, 21.553f, 18.635f, 20.455f)
                lineTo(18.48f, 18.75f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 18.75f, 21.75f, 17.407f, 21.75f, 15.75f)
                verticalLineTo(9.456f)
                curveTo(21.75f, 8.022f, 20.728f, 6.757f, 19.274f, 6.539f)
                curveTo(18.851f, 6.476f, 18.426f, 6.418f, 18.0f, 6.366f)
                verticalLineTo(3.375f)
                curveTo(18.0f, 2.339f, 17.16f, 1.5f, 16.125f, 1.5f)
                horizontalLineTo(7.875f)
                close()
                moveTo(16.5f, 6.205f)
                verticalLineTo(3.375f)
                curveTo(16.5f, 3.168f, 16.332f, 3.0f, 16.125f, 3.0f)
                horizontalLineTo(7.875f)
                curveTo(7.668f, 3.0f, 7.5f, 3.168f, 7.5f, 3.375f)
                verticalLineTo(6.205f)
                curveTo(8.982f, 6.069f, 10.483f, 6.0f, 12.0f, 6.0f)
                curveTo(13.517f, 6.0f, 15.018f, 6.069f, 16.5f, 6.205f)
                close()
                moveTo(16.283f, 14.47f)
                curveTo(16.461f, 14.488f, 16.6f, 14.63f, 16.616f, 14.807f)
                lineTo(17.142f, 20.591f)
                curveTo(17.162f, 20.811f, 16.989f, 21.0f, 16.768f, 21.0f)
                horizontalLineTo(7.232f)
                curveTo(7.011f, 21.0f, 6.838f, 20.811f, 6.858f, 20.591f)
                lineTo(7.384f, 14.807f)
                curveTo(7.4f, 14.63f, 7.539f, 14.488f, 7.717f, 14.47f)
                curveTo(9.124f, 14.324f, 10.553f, 14.25f, 12.0f, 14.25f)
                curveTo(13.447f, 14.25f, 14.876f, 14.324f, 16.283f, 14.47f)
                close()
                moveTo(17.25f, 10.5f)
                curveTo(17.25f, 10.086f, 17.586f, 9.75f, 18.0f, 9.75f)
                horizontalLineTo(18.007f)
                curveTo(18.422f, 9.75f, 18.757f, 10.086f, 18.757f, 10.5f)
                verticalLineTo(10.507f)
                curveTo(18.757f, 10.922f, 18.422f, 11.257f, 18.007f, 11.257f)
                horizontalLineTo(18.0f)
                curveTo(17.586f, 11.257f, 17.25f, 10.922f, 17.25f, 10.507f)
                verticalLineTo(10.5f)
                close()
                moveTo(15.0f, 9.75f)
                curveTo(14.586f, 9.75f, 14.25f, 10.086f, 14.25f, 10.5f)
                verticalLineTo(10.507f)
                curveTo(14.25f, 10.922f, 14.586f, 11.257f, 15.0f, 11.257f)
                horizontalLineTo(15.007f)
                curveTo(15.422f, 11.257f, 15.757f, 10.922f, 15.757f, 10.507f)
                verticalLineTo(10.5f)
                curveTo(15.757f, 10.086f, 15.422f, 9.75f, 15.007f, 9.75f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
