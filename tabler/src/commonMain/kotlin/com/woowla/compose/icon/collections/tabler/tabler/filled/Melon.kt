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

public val FilledGroup.Melon: ImageVector
    get() {
        if (_melon != null) {
            return _melon!!
        }
        _melon = Builder(name = "Melon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.77f, 2.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.436f, 0.055f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 2.794f, 7.326f)
                curveToRelative(0.0f, 6.074f, -4.925f, 10.999f, -10.999f, 10.999f)
                arcToRelative(10.97f, 10.97f, 0.0f, false, true, -7.684f, -3.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.008f, -1.438f)
                lineToRelative(4.343f, -4.153f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.352f, -0.027f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.32f, -4.133f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.088f, -1.35f)
                close()
            }
        }
        .build()
        return _melon!!
    }

private var _melon: ImageVector? = null
