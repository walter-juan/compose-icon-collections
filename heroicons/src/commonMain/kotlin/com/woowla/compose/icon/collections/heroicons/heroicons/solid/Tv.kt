package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 6.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.375f, 3.0f)
                curveTo(2.339f, 3.0f, 1.5f, 3.839f, 1.5f, 4.875f)
                verticalLineTo(16.125f)
                curveTo(1.5f, 17.16f, 2.339f, 18.0f, 3.375f, 18.0f)
                horizontalLineTo(9.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.0f)
                curveTo(5.586f, 19.5f, 5.25f, 19.836f, 5.25f, 20.25f)
                curveTo(5.25f, 20.664f, 5.586f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(18.414f, 21.0f, 18.75f, 20.664f, 18.75f, 20.25f)
                curveTo(18.75f, 19.836f, 18.414f, 19.5f, 18.0f, 19.5f)
                horizontalLineTo(14.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.625f)
                curveTo(21.66f, 18.0f, 22.5f, 17.16f, 22.5f, 16.125f)
                verticalLineTo(4.875f)
                curveTo(22.5f, 3.839f, 21.66f, 3.0f, 20.625f, 3.0f)
                horizontalLineTo(3.375f)
                close()
                moveTo(3.375f, 16.5f)
                horizontalLineTo(20.625f)
                curveTo(20.832f, 16.5f, 21.0f, 16.332f, 21.0f, 16.125f)
                verticalLineTo(4.875f)
                curveTo(21.0f, 4.668f, 20.832f, 4.5f, 20.625f, 4.5f)
                horizontalLineTo(3.375f)
                curveTo(3.168f, 4.5f, 3.0f, 4.668f, 3.0f, 4.875f)
                verticalLineTo(16.125f)
                curveTo(3.0f, 16.332f, 3.168f, 16.5f, 3.375f, 16.5f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
