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

public val FilledGroup.Ironing: ImageVector
    get() {
        if (_ironing != null) {
            return _ironing!!
        }
        _ironing = Builder(name = "Ironing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.459f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.945f, 3.343f)
                lineToRelative(0.577f, 3.464f)
                lineToRelative(0.81f, 4.865f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.971f, 2.328f)
                horizontalLineToRelative(-16.82f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.652f)
                lineToRelative(-0.22f, -1.329f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.811f, -1.665f)
                lineToRelative(-0.162f, -0.006f)
                horizontalLineToRelative(-7.459f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _ironing!!
    }

private var _ironing: ImageVector? = null
