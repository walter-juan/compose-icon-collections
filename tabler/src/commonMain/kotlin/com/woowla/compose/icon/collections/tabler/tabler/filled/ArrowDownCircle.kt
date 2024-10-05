package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) {
            return _arrowDownCircle!!
        }
        _arrowDownCircle = Builder(name = "ArrowDownCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.0f, 5.829f)
                verticalLineToRelative(10.755f)
                lineToRelative(1.293f, -1.291f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.083f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.112f, 0.097f)
                lineToRelative(-0.11f, 0.071f)
                lineToRelative(-0.114f, 0.054f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.149f, 0.03f)
                lineToRelative(-0.117f, 0.006f)
                lineToRelative(-0.075f, -0.003f)
                lineToRelative(-0.126f, -0.017f)
                lineToRelative(-0.111f, -0.03f)
                lineToRelative(-0.111f, -0.044f)
                lineToRelative(-0.098f, -0.052f)
                lineToRelative(-0.096f, -0.067f)
                lineToRelative(-0.09f, -0.08f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.293f, 1.293f)
                verticalLineToRelative(-10.757f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, true, 1.0f, -5.829f)
            }
        }
        .build()
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null