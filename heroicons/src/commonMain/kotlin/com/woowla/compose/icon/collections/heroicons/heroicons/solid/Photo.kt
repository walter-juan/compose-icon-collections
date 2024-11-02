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

public val SolidGroup.Photo: ImageVector
    get() {
        if (_photo != null) {
            return _photo!!
        }
        _photo = Builder(name = "Photo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 6.0f)
                curveTo(1.5f, 4.757f, 2.507f, 3.75f, 3.75f, 3.75f)
                horizontalLineTo(20.25f)
                curveTo(21.493f, 3.75f, 22.5f, 4.757f, 22.5f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.5f, 19.243f, 21.493f, 20.25f, 20.25f, 20.25f)
                horizontalLineTo(3.75f)
                curveTo(2.507f, 20.25f, 1.5f, 19.243f, 1.5f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(3.0f, 16.061f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 18.414f, 3.336f, 18.75f, 3.75f, 18.75f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 18.75f, 21.0f, 18.414f, 21.0f, 18.0f)
                verticalLineTo(16.061f)
                lineTo(18.311f, 13.371f)
                curveTo(17.725f, 12.785f, 16.775f, 12.785f, 16.189f, 13.371f)
                lineTo(15.311f, 14.25f)
                lineTo(16.28f, 15.22f)
                curveTo(16.573f, 15.513f, 16.573f, 15.987f, 16.28f, 16.28f)
                curveTo(15.987f, 16.573f, 15.513f, 16.573f, 15.22f, 16.28f)
                lineTo(10.061f, 11.121f)
                curveTo(9.475f, 10.535f, 8.525f, 10.535f, 7.939f, 11.121f)
                lineTo(3.0f, 16.061f)
                close()
                moveTo(13.125f, 8.25f)
                curveTo(13.125f, 7.629f, 13.629f, 7.125f, 14.25f, 7.125f)
                curveTo(14.871f, 7.125f, 15.375f, 7.629f, 15.375f, 8.25f)
                curveTo(15.375f, 8.871f, 14.871f, 9.375f, 14.25f, 9.375f)
                curveTo(13.629f, 9.375f, 13.125f, 8.871f, 13.125f, 8.25f)
                close()
            }
        }
        .build()
        return _photo!!
    }

private var _photo: ImageVector? = null
