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

public val OutlineGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineTo(5.25f)
                moveTo(18.364f, 5.636f)
                lineTo(16.773f, 7.227f)
                moveTo(21.0f, 12.0f)
                horizontalLineTo(18.75f)
                moveTo(18.364f, 18.364f)
                lineTo(16.773f, 16.773f)
                moveTo(12.0f, 18.75f)
                verticalLineTo(21.0f)
                moveTo(7.227f, 16.773f)
                lineTo(5.636f, 18.364f)
                moveTo(5.25f, 12.0f)
                horizontalLineTo(3.0f)
                moveTo(7.227f, 7.227f)
                lineTo(5.636f, 5.636f)
                moveTo(15.75f, 12.0f)
                curveTo(15.75f, 14.071f, 14.071f, 15.75f, 12.0f, 15.75f)
                curveTo(9.929f, 15.75f, 8.25f, 14.071f, 8.25f, 12.0f)
                curveTo(8.25f, 9.929f, 9.929f, 8.25f, 12.0f, 8.25f)
                curveTo(14.071f, 8.25f, 15.75f, 9.929f, 15.75f, 12.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
