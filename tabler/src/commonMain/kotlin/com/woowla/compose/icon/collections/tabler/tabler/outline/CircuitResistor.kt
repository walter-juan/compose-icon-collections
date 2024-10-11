package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.CircuitResistor: ImageVector
    get() {
        if (_circuitResistor != null) {
            return _circuitResistor!!
        }
        _circuitResistor = Builder(name = "CircuitResistor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(2.0f, -5.0f)
                lineToRelative(3.0f, 10.0f)
                lineToRelative(3.0f, -10.0f)
                lineToRelative(3.0f, 10.0f)
                lineToRelative(3.0f, -10.0f)
                lineToRelative(1.5f, 5.0f)
                horizontalLineToRelative(2.5f)
            }
        }
        .build()
        return _circuitResistor!!
    }

private var _circuitResistor: ImageVector? = null
