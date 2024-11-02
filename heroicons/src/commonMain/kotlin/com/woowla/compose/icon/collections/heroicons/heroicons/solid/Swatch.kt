package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val SolidGroup.Swatch: ImageVector
    get() {
        if (_swatch != null) {
            return _swatch!!
        }
        _swatch = Builder(name = "Swatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 4.125f)
                curveTo(2.25f, 3.089f, 3.089f, 2.25f, 4.125f, 2.25f)
                horizontalLineTo(9.375f)
                curveTo(10.41f, 2.25f, 11.25f, 3.089f, 11.25f, 4.125f)
                verticalLineTo(17.25f)
                curveTo(11.25f, 19.735f, 9.235f, 21.75f, 6.75f, 21.75f)
                curveTo(4.265f, 21.75f, 2.25f, 19.735f, 2.25f, 17.25f)
                verticalLineTo(4.125f)
                close()
                moveTo(6.75f, 18.375f)
                curveTo(7.371f, 18.375f, 7.875f, 17.871f, 7.875f, 17.25f)
                curveTo(7.875f, 16.629f, 7.371f, 16.125f, 6.75f, 16.125f)
                curveTo(6.129f, 16.125f, 5.625f, 16.629f, 5.625f, 17.25f)
                curveTo(5.625f, 17.871f, 6.129f, 18.375f, 6.75f, 18.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.719f, 21.75f)
                horizontalLineTo(19.875f)
                curveTo(20.911f, 21.75f, 21.75f, 20.91f, 21.75f, 19.875f)
                verticalLineTo(14.625f)
                curveTo(21.75f, 13.59f, 20.911f, 12.75f, 19.875f, 12.75f)
                horizontalLineTo(19.735f)
                lineTo(10.993f, 21.493f)
                curveTo(10.903f, 21.582f, 10.812f, 21.668f, 10.719f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.738f, 17.625f)
                lineTo(19.212f, 11.151f)
                curveTo(19.945f, 10.419f, 19.945f, 9.232f, 19.212f, 8.5f)
                lineTo(15.5f, 4.787f)
                curveTo(14.768f, 4.055f, 13.581f, 4.055f, 12.849f, 4.787f)
                lineTo(12.75f, 4.886f)
                verticalLineTo(17.25f)
                curveTo(12.75f, 17.376f, 12.746f, 17.501f, 12.738f, 17.625f)
                close()
            }
        }
        .build()
        return _swatch!!
    }

private var _swatch: ImageVector? = null
