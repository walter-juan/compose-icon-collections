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

public val OutlineGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 7.5f)
                curveTo(5.25f, 6.257f, 6.257f, 5.25f, 7.5f, 5.25f)
                horizontalLineTo(16.5f)
                curveTo(17.743f, 5.25f, 18.75f, 6.257f, 18.75f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(18.75f, 17.743f, 17.743f, 18.75f, 16.5f, 18.75f)
                horizontalLineTo(7.5f)
                curveTo(6.257f, 18.75f, 5.25f, 17.743f, 5.25f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
