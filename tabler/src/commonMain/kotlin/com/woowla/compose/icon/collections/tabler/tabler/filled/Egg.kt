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

public val FilledGroup.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 2.0f)
                curveToRelative(-4.173f, -0.008f, -8.002f, 6.058f, -8.002f, 12.083f)
                curveToRelative(0.0f, 4.708f, 3.25f, 7.917f, 8.0f, 7.917f)
                curveToRelative(4.727f, -0.206f, 8.0f, -3.328f, 8.0f, -7.917f)
                curveToRelative(0.0f, -6.02f, -3.825f, -12.075f, -7.998f, -12.083f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
