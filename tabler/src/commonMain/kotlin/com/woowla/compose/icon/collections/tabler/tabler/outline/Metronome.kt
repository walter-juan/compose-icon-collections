package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.Metronome: ImageVector
    get() {
        if (_metronome != null) {
            return _metronome!!
        }
        _metronome = Builder(name = "Metronome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.153f, 8.188f)
                lineToRelative(-0.72f, -3.236f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, false, -4.867f, 0.0f)
                lineToRelative(-3.025f, 13.614f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.952f, 2.434f)
                horizontalLineToRelative(7.014f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.952f, -2.434f)
                lineToRelative(-0.524f, -2.357f)
                moveToRelative(-4.935f, 1.791f)
                lineToRelative(9.0f, -13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
        }
        .build()
        return _metronome!!
    }

private var _metronome: ImageVector? = null
