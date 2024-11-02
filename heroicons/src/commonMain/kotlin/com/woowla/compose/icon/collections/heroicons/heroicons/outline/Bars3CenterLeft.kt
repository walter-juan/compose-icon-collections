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

public val OutlineGroup.Bars3CenterLeft: ImageVector
    get() {
        if (_bars3CenterLeft != null) {
            return _bars3CenterLeft!!
        }
        _bars3CenterLeft = Builder(name = "Bars3CenterLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 6.75f)
                horizontalLineTo(20.25f)
                moveTo(3.75f, 12.0f)
                horizontalLineTo(12.0f)
                moveTo(3.75f, 17.25f)
                horizontalLineTo(20.25f)
            }
        }
        .build()
        return _bars3CenterLeft!!
    }

private var _bars3CenterLeft: ImageVector? = null
