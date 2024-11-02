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

public val OutlineGroup.Battery50: ImageVector
    get() {
        if (_battery50 != null) {
            return _battery50!!
        }
        _battery50 = Builder(name = "Battery50", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 10.5f)
                horizontalLineTo(21.375f)
                curveTo(21.996f, 10.5f, 22.5f, 11.004f, 22.5f, 11.625f)
                verticalLineTo(13.875f)
                curveTo(22.5f, 14.496f, 21.996f, 15.0f, 21.375f, 15.0f)
                horizontalLineTo(21.0f)
                moveTo(4.5f, 10.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(3.75f, 18.0f)
                horizontalLineTo(18.75f)
                curveTo(19.993f, 18.0f, 21.0f, 16.993f, 21.0f, 15.75f)
                verticalLineTo(9.75f)
                curveTo(21.0f, 8.507f, 19.993f, 7.5f, 18.75f, 7.5f)
                horizontalLineTo(3.75f)
                curveTo(2.507f, 7.5f, 1.5f, 8.507f, 1.5f, 9.75f)
                verticalLineTo(15.75f)
                curveTo(1.5f, 16.993f, 2.507f, 18.0f, 3.75f, 18.0f)
                close()
            }
        }
        .build()
        return _battery50!!
    }

private var _battery50: ImageVector? = null
