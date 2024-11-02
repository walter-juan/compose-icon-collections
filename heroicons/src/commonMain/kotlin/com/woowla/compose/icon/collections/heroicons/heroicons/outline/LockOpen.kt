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

public val OutlineGroup.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen = Builder(name = "LockOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 10.5f)
                verticalLineTo(6.75f)
                curveTo(13.5f, 4.265f, 15.515f, 2.25f, 18.0f, 2.25f)
                curveTo(20.485f, 2.25f, 22.5f, 4.265f, 22.5f, 6.75f)
                verticalLineTo(10.5f)
                moveTo(3.75f, 21.75f)
                horizontalLineTo(14.25f)
                curveTo(15.493f, 21.75f, 16.5f, 20.743f, 16.5f, 19.5f)
                verticalLineTo(12.75f)
                curveTo(16.5f, 11.507f, 15.493f, 10.5f, 14.25f, 10.5f)
                horizontalLineTo(3.75f)
                curveTo(2.507f, 10.5f, 1.5f, 11.507f, 1.5f, 12.75f)
                verticalLineTo(19.5f)
                curveTo(1.5f, 20.743f, 2.507f, 21.75f, 3.75f, 21.75f)
                close()
            }
        }
        .build()
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
