package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val SolidGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.375f, 3.0f)
                curveTo(8.339f, 3.0f, 7.5f, 3.839f, 7.5f, 4.875f)
                curveTo(7.5f, 5.911f, 8.339f, 6.75f, 9.375f, 6.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(3.375f)
                curveTo(2.339f, 11.25f, 1.5f, 10.41f, 1.5f, 9.375f)
                verticalLineTo(8.625f)
                curveTo(1.5f, 7.589f, 2.339f, 6.75f, 3.375f, 6.75f)
                horizontalLineTo(6.568f)
                curveTo(6.209f, 6.214f, 6.0f, 5.569f, 6.0f, 4.875f)
                curveTo(6.0f, 3.011f, 7.511f, 1.5f, 9.375f, 1.5f)
                curveTo(10.435f, 1.5f, 11.381f, 1.989f, 12.0f, 2.753f)
                curveTo(12.619f, 1.989f, 13.565f, 1.5f, 14.625f, 1.5f)
                curveTo(16.489f, 1.5f, 18.0f, 3.011f, 18.0f, 4.875f)
                curveTo(18.0f, 5.569f, 17.791f, 6.214f, 17.432f, 6.75f)
                horizontalLineTo(21.375f)
                curveTo(22.41f, 6.75f, 23.25f, 7.589f, 23.25f, 8.625f)
                verticalLineTo(9.375f)
                curveTo(23.25f, 10.41f, 22.41f, 11.25f, 21.375f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.75f)
                horizontalLineTo(14.625f)
                curveTo(15.66f, 6.75f, 16.5f, 5.911f, 16.5f, 4.875f)
                curveTo(16.5f, 3.839f, 15.66f, 3.0f, 14.625f, 3.0f)
                curveTo(13.59f, 3.0f, 12.75f, 3.839f, 12.75f, 4.875f)
                verticalLineTo(6.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(4.875f)
                curveTo(11.25f, 3.839f, 10.41f, 3.0f, 9.375f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 12.75f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.5f)
                curveTo(3.0f, 20.743f, 4.007f, 21.75f, 5.25f, 21.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 12.75f)
                verticalLineTo(21.75f)
                horizontalLineTo(19.5f)
                curveTo(20.743f, 21.75f, 21.75f, 20.743f, 21.75f, 19.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
