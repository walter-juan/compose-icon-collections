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

public val OutlineGroup.CpuChip: ImageVector
    get() {
        if (_cpuChip != null) {
            return _cpuChip!!
        }
        _cpuChip = Builder(name = "CpuChip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 3.0f)
                verticalLineTo(4.5f)
                moveTo(4.5f, 8.25f)
                horizontalLineTo(3.0f)
                moveTo(21.0f, 8.25f)
                horizontalLineTo(19.5f)
                moveTo(4.5f, 12.0f)
                horizontalLineTo(3.0f)
                moveTo(21.0f, 12.0f)
                horizontalLineTo(19.5f)
                moveTo(4.5f, 15.75f)
                horizontalLineTo(3.0f)
                moveTo(21.0f, 15.75f)
                horizontalLineTo(19.5f)
                moveTo(8.25f, 19.5f)
                verticalLineTo(21.0f)
                moveTo(12.0f, 3.0f)
                verticalLineTo(4.5f)
                moveTo(12.0f, 19.5f)
                verticalLineTo(21.0f)
                moveTo(15.75f, 3.0f)
                verticalLineTo(4.5f)
                moveTo(15.75f, 19.5f)
                verticalLineTo(21.0f)
                moveTo(6.75f, 19.5f)
                horizontalLineTo(17.25f)
                curveTo(18.493f, 19.5f, 19.5f, 18.493f, 19.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(19.5f, 5.507f, 18.493f, 4.5f, 17.25f, 4.5f)
                horizontalLineTo(6.75f)
                curveTo(5.507f, 4.5f, 4.5f, 5.507f, 4.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(4.5f, 18.493f, 5.507f, 19.5f, 6.75f, 19.5f)
                close()
                moveTo(7.5f, 7.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _cpuChip!!
    }

private var _cpuChip: ImageVector? = null
