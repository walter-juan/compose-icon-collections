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

public val SolidGroup.ChartBar: ImageVector
    get() {
        if (_chartBar != null) {
            return _chartBar!!
        }
        _chartBar = Builder(name = "ChartBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.375f, 2.25f)
                curveTo(17.34f, 2.25f, 16.5f, 3.089f, 16.5f, 4.125f)
                verticalLineTo(19.875f)
                curveTo(16.5f, 20.91f, 17.34f, 21.75f, 18.375f, 21.75f)
                horizontalLineTo(19.125f)
                curveTo(20.16f, 21.75f, 21.0f, 20.91f, 21.0f, 19.875f)
                verticalLineTo(4.125f)
                curveTo(21.0f, 3.089f, 20.16f, 2.25f, 19.125f, 2.25f)
                horizontalLineTo(18.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 8.625f)
                curveTo(9.75f, 7.589f, 10.59f, 6.75f, 11.625f, 6.75f)
                horizontalLineTo(12.375f)
                curveTo(13.41f, 6.75f, 14.25f, 7.589f, 14.25f, 8.625f)
                verticalLineTo(19.875f)
                curveTo(14.25f, 20.91f, 13.41f, 21.75f, 12.375f, 21.75f)
                horizontalLineTo(11.625f)
                curveTo(10.59f, 21.75f, 9.75f, 20.91f, 9.75f, 19.875f)
                verticalLineTo(8.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.125f)
                curveTo(3.0f, 12.09f, 3.839f, 11.25f, 4.875f, 11.25f)
                horizontalLineTo(5.625f)
                curveTo(6.661f, 11.25f, 7.5f, 12.09f, 7.5f, 13.125f)
                verticalLineTo(19.875f)
                curveTo(7.5f, 20.91f, 6.661f, 21.75f, 5.625f, 21.75f)
                horizontalLineTo(4.875f)
                curveTo(3.839f, 21.75f, 3.0f, 20.91f, 3.0f, 19.875f)
                verticalLineTo(13.125f)
                close()
            }
        }
        .build()
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
