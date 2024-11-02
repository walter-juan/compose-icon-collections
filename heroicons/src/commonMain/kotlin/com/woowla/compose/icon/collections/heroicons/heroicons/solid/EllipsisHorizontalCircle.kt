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

public val SolidGroup.EllipsisHorizontalCircle: ImageVector
    get() {
        if (_ellipsisHorizontalCircle != null) {
            return _ellipsisHorizontalCircle!!
        }
        _ellipsisHorizontalCircle = Builder(name = "EllipsisHorizontalCircle", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(12.0f, 10.875f)
                curveTo(11.379f, 10.875f, 10.875f, 11.379f, 10.875f, 12.0f)
                curveTo(10.875f, 12.621f, 11.379f, 13.125f, 12.0f, 13.125f)
                curveTo(12.621f, 13.125f, 13.125f, 12.621f, 13.125f, 12.0f)
                curveTo(13.125f, 11.379f, 12.621f, 10.875f, 12.0f, 10.875f)
                close()
                moveTo(15.375f, 12.0f)
                curveTo(15.375f, 11.379f, 15.879f, 10.875f, 16.5f, 10.875f)
                curveTo(17.121f, 10.875f, 17.625f, 11.379f, 17.625f, 12.0f)
                curveTo(17.625f, 12.621f, 17.121f, 13.125f, 16.5f, 13.125f)
                curveTo(15.879f, 13.125f, 15.375f, 12.621f, 15.375f, 12.0f)
                close()
                moveTo(7.5f, 10.875f)
                curveTo(6.879f, 10.875f, 6.375f, 11.379f, 6.375f, 12.0f)
                curveTo(6.375f, 12.621f, 6.879f, 13.125f, 7.5f, 13.125f)
                curveTo(8.121f, 13.125f, 8.625f, 12.621f, 8.625f, 12.0f)
                curveTo(8.625f, 11.379f, 8.121f, 10.875f, 7.5f, 10.875f)
                close()
            }
        }
        .build()
        return _ellipsisHorizontalCircle!!
    }

private var _ellipsisHorizontalCircle: ImageVector? = null
