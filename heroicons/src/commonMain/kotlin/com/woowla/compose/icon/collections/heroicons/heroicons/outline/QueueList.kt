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

public val OutlineGroup.QueueList: ImageVector
    get() {
        if (_queueList != null) {
            return _queueList!!
        }
        _queueList = Builder(name = "QueueList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 12.0f)
                horizontalLineTo(20.25f)
                moveTo(3.75f, 15.75f)
                horizontalLineTo(20.25f)
                moveTo(3.75f, 19.5f)
                horizontalLineTo(20.25f)
                moveTo(5.625f, 4.5f)
                horizontalLineTo(18.375f)
                curveTo(19.41f, 4.5f, 20.25f, 5.339f, 20.25f, 6.375f)
                curveTo(20.25f, 7.411f, 19.41f, 8.25f, 18.375f, 8.25f)
                horizontalLineTo(5.625f)
                curveTo(4.589f, 8.25f, 3.75f, 7.411f, 3.75f, 6.375f)
                curveTo(3.75f, 5.339f, 4.589f, 4.5f, 5.625f, 4.5f)
                close()
            }
        }
        .build()
        return _queueList!!
    }

private var _queueList: ImageVector? = null
