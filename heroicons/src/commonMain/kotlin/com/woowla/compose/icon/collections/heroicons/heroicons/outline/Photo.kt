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

public val OutlineGroup.Photo: ImageVector
    get() {
        if (_photo != null) {
            return _photo!!
        }
        _photo = Builder(name = "Photo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.25f, 15.75f)
                lineTo(7.409f, 10.591f)
                curveTo(8.288f, 9.712f, 9.712f, 9.712f, 10.591f, 10.591f)
                lineTo(15.75f, 15.75f)
                moveTo(14.25f, 14.25f)
                lineTo(15.659f, 12.841f)
                curveTo(16.538f, 11.962f, 17.962f, 11.962f, 18.841f, 12.841f)
                lineTo(21.75f, 15.75f)
                moveTo(3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(21.078f, 19.5f, 21.75f, 18.828f, 21.75f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.75f, 5.172f, 21.078f, 4.5f, 20.25f, 4.5f)
                horizontalLineTo(3.75f)
                curveTo(2.922f, 4.5f, 2.25f, 5.172f, 2.25f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.25f, 18.828f, 2.922f, 19.5f, 3.75f, 19.5f)
                close()
                moveTo(14.25f, 8.25f)
                horizontalLineTo(14.257f)
                verticalLineTo(8.257f)
                horizontalLineTo(14.25f)
                verticalLineTo(8.25f)
                close()
                moveTo(14.625f, 8.25f)
                curveTo(14.625f, 8.457f, 14.457f, 8.625f, 14.25f, 8.625f)
                curveTo(14.043f, 8.625f, 13.875f, 8.457f, 13.875f, 8.25f)
                curveTo(13.875f, 8.043f, 14.043f, 7.875f, 14.25f, 7.875f)
                curveTo(14.457f, 7.875f, 14.625f, 8.043f, 14.625f, 8.25f)
                close()
            }
        }
        .build()
        return _photo!!
    }

private var _photo: ImageVector? = null
