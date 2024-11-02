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

public val OutlineGroup.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 20.25f)
                horizontalLineTo(18.0f)
                moveTo(10.5f, 17.25f)
                verticalLineTo(20.25f)
                moveTo(13.5f, 17.25f)
                verticalLineTo(20.25f)
                moveTo(3.375f, 17.25f)
                horizontalLineTo(20.625f)
                curveTo(21.246f, 17.25f, 21.75f, 16.746f, 21.75f, 16.125f)
                verticalLineTo(4.875f)
                curveTo(21.75f, 4.254f, 21.246f, 3.75f, 20.625f, 3.75f)
                horizontalLineTo(3.375f)
                curveTo(2.754f, 3.75f, 2.25f, 4.254f, 2.25f, 4.875f)
                verticalLineTo(16.125f)
                curveTo(2.25f, 16.746f, 2.754f, 17.25f, 3.375f, 17.25f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
