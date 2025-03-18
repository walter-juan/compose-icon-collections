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

public val FilledGroup.Escalator: ImageVector
    get() {
        if (_escalator != null) {
            return _escalator!!
        }
        _escalator = Builder(name = "Escalator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                horizontalLineToRelative(-1.086f)
                lineToRelative(-8.12f, 8.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.924f, 0.872f)
                lineToRelative(-0.198f, 0.007f)
                horizontalLineToRelative(-3.672f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                horizontalLineToRelative(2.084f)
                lineToRelative(8.123f, -8.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.923f, -0.872f)
                lineToRelative(0.198f, -0.007f)
                close()
            }
        }
        .build()
        return _escalator!!
    }

private var _escalator: ImageVector? = null
