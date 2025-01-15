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

public val FilledGroup.Trolley: ImageVector
    get() {
        if (_trolley != null) {
            return _trolley!!
        }
        _trolley = Builder(name = "Trolley", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.555f, 4.168f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.277f, 1.387f)
                lineToRelative(-2.621f, 3.932f)
                lineToRelative(1.236f, 0.619f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.894f, 1.788f)
                lineToRelative(-1.46f, -0.73f)
                lineToRelative(-3.876f, 5.815f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -5.217f, 2.021f)
                lineToRelative(0.005f, -0.176f)
                quadToRelative(0.008f, -0.135f, 0.027f, -0.267f)
                lineToRelative(-2.587f, -1.725f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.11f, -1.664f)
                lineToRelative(2.424f, 1.615f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, 2.464f, -0.75f)
                lineToRelative(7.725f, -11.588f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.387f, -0.277f)
                moveToRelative(-10.567f, -0.399f)
                lineToRelative(0.14f, 0.082f)
                lineToRelative(3.307f, 2.104f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 0.7f, 3.185f)
                lineToRelative(-3.094f, 4.81f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -3.17f, 0.698f)
                lineToRelative(-3.306f, -2.104f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -0.7f, -3.185f)
                lineToRelative(3.094f, -4.81f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 3.029f, -0.78f)
            }
        }
        .build()
        return _trolley!!
    }

private var _trolley: ImageVector? = null
