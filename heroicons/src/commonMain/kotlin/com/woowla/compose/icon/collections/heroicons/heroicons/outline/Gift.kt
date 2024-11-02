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

public val OutlineGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 11.25f)
                verticalLineTo(19.5f)
                curveTo(21.0f, 20.328f, 20.328f, 21.0f, 19.5f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(4.422f, 21.0f, 3.75f, 20.328f, 3.75f, 19.5f)
                verticalLineTo(11.25f)
                moveTo(12.0f, 4.875f)
                curveTo(12.0f, 3.425f, 10.825f, 2.25f, 9.375f, 2.25f)
                curveTo(7.925f, 2.25f, 6.75f, 3.425f, 6.75f, 4.875f)
                curveTo(6.75f, 6.325f, 7.925f, 7.5f, 9.375f, 7.5f)
                curveTo(10.109f, 7.5f, 12.0f, 7.5f, 12.0f, 7.5f)
                moveTo(12.0f, 4.875f)
                curveTo(12.0f, 5.59f, 12.0f, 7.5f, 12.0f, 7.5f)
                moveTo(12.0f, 4.875f)
                curveTo(12.0f, 3.425f, 13.175f, 2.25f, 14.625f, 2.25f)
                curveTo(16.075f, 2.25f, 17.25f, 3.425f, 17.25f, 4.875f)
                curveTo(17.25f, 6.325f, 16.075f, 7.5f, 14.625f, 7.5f)
                curveTo(13.891f, 7.5f, 12.0f, 7.5f, 12.0f, 7.5f)
                moveTo(12.0f, 7.5f)
                verticalLineTo(21.0f)
                moveTo(3.375f, 11.25f)
                horizontalLineTo(21.375f)
                curveTo(21.996f, 11.25f, 22.5f, 10.746f, 22.5f, 10.125f)
                verticalLineTo(8.625f)
                curveTo(22.5f, 8.004f, 21.996f, 7.5f, 21.375f, 7.5f)
                horizontalLineTo(3.375f)
                curveTo(2.754f, 7.5f, 2.25f, 8.004f, 2.25f, 8.625f)
                verticalLineTo(10.125f)
                curveTo(2.25f, 10.746f, 2.754f, 11.25f, 3.375f, 11.25f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
