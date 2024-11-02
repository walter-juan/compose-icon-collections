package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.ListBullet: ImageVector
    get() {
        if (_listBullet != null) {
            return _listBullet!!
        }
        _listBullet = Builder(name = "ListBullet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 6.75f)
                horizontalLineTo(20.25f)
                moveTo(8.25f, 12.0f)
                horizontalLineTo(20.25f)
                moveTo(8.25f, 17.25f)
                horizontalLineTo(20.25f)
                moveTo(3.75f, 6.75f)
                horizontalLineTo(3.757f)
                verticalLineTo(6.758f)
                horizontalLineTo(3.75f)
                verticalLineTo(6.75f)
                close()
                moveTo(4.125f, 6.75f)
                curveTo(4.125f, 6.957f, 3.957f, 7.125f, 3.75f, 7.125f)
                curveTo(3.543f, 7.125f, 3.375f, 6.957f, 3.375f, 6.75f)
                curveTo(3.375f, 6.543f, 3.543f, 6.375f, 3.75f, 6.375f)
                curveTo(3.957f, 6.375f, 4.125f, 6.543f, 4.125f, 6.75f)
                close()
                moveTo(3.75f, 12.0f)
                horizontalLineTo(3.757f)
                verticalLineTo(12.007f)
                horizontalLineTo(3.75f)
                verticalLineTo(12.0f)
                close()
                moveTo(4.125f, 12.0f)
                curveTo(4.125f, 12.207f, 3.957f, 12.375f, 3.75f, 12.375f)
                curveTo(3.543f, 12.375f, 3.375f, 12.207f, 3.375f, 12.0f)
                curveTo(3.375f, 11.793f, 3.543f, 11.625f, 3.75f, 11.625f)
                curveTo(3.957f, 11.625f, 4.125f, 11.793f, 4.125f, 12.0f)
                close()
                moveTo(3.75f, 17.25f)
                horizontalLineTo(3.757f)
                verticalLineTo(17.257f)
                horizontalLineTo(3.75f)
                verticalLineTo(17.25f)
                close()
                moveTo(4.125f, 17.25f)
                curveTo(4.125f, 17.457f, 3.957f, 17.625f, 3.75f, 17.625f)
                curveTo(3.543f, 17.625f, 3.375f, 17.457f, 3.375f, 17.25f)
                curveTo(3.375f, 17.043f, 3.543f, 16.875f, 3.75f, 16.875f)
                curveTo(3.957f, 16.875f, 4.125f, 17.043f, 4.125f, 17.25f)
                close()
            }
        }
        .build()
        return _listBullet!!
    }

private var _listBullet: ImageVector? = null
