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

public val FilledGroup.DropCircle: ImageVector
    get() {
        if (_dropCircle != null) {
            return _dropCircle!!
        }
        _dropCircle = Builder(name = "DropCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-4.177f, 4.092f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.646f, 0.0f)
                lineToRelative(-2.602f, 3.764f)
                curveToRelative(-1.022f, 1.67f, -0.634f, 3.736f, 0.875f, 4.929f)
                arcToRelative(4.144f, 4.144f, 0.0f, false, false, 5.095f, 0.0f)
                curveToRelative(1.51f, -1.191f, 1.897f, -3.26f, 0.904f, -4.882f)
                close()
            }
        }
        .build()
        return _dropCircle!!
    }

private var _dropCircle: ImageVector? = null
