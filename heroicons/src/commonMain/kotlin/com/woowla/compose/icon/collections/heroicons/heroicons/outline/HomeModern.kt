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

public val OutlineGroup.HomeModern: ImageVector
    get() {
        if (_homeModern != null) {
            return _homeModern!!
        }
        _homeModern = Builder(name = "HomeModern", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 21.0f)
                verticalLineTo(16.125f)
                curveTo(8.25f, 15.504f, 8.754f, 15.0f, 9.375f, 15.0f)
                horizontalLineTo(11.625f)
                curveTo(12.246f, 15.0f, 12.75f, 15.504f, 12.75f, 16.125f)
                verticalLineTo(21.0f)
                moveTo(12.75f, 21.0f)
                horizontalLineTo(17.25f)
                verticalLineTo(3.545f)
                moveTo(12.75f, 21.0f)
                horizontalLineTo(20.25f)
                verticalLineTo(10.75f)
                moveTo(2.25f, 21.0f)
                horizontalLineTo(3.75f)
                moveTo(21.75f, 21.0f)
                horizontalLineTo(3.75f)
                moveTo(2.25f, 9.0f)
                lineTo(6.75f, 7.364f)
                moveTo(18.75f, 3.0f)
                lineTo(17.25f, 3.545f)
                moveTo(17.25f, 9.75f)
                lineTo(20.25f, 10.75f)
                moveTo(21.75f, 11.25f)
                lineTo(20.25f, 10.75f)
                moveTo(6.75f, 7.364f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.75f)
                verticalLineTo(21.0f)
                moveTo(6.75f, 7.364f)
                lineTo(17.25f, 3.545f)
            }
        }
        .build()
        return _homeModern!!
    }

private var _homeModern: ImageVector? = null
