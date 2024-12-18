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

public val FilledGroup.Flare: ImageVector
    get() {
        if (_flare != null) {
            return _flare!!
        }
        _flare = Builder(name = "Flare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.106f, 2.553f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.788f, 0.0f)
                lineToRelative(2.851f, 5.701f)
                lineToRelative(5.702f, 2.852f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.11f, 1.725f)
                lineToRelative(-0.11f, 0.063f)
                lineToRelative(-5.702f, 2.851f)
                lineToRelative(-2.85f, 5.702f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.726f, 0.11f)
                lineToRelative(-0.063f, -0.11f)
                lineToRelative(-2.852f, -5.702f)
                lineToRelative(-5.701f, -2.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.11f, -1.726f)
                lineToRelative(0.11f, -0.063f)
                lineToRelative(5.701f, -2.852f)
                close()
            }
        }
        .build()
        return _flare!!
    }

private var _flare: ImageVector? = null
