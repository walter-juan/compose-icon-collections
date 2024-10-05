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

public val FilledGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.207f, 3.793f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, 0.0f, 8.414f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, -8.414f, -8.414f)
                lineToRelative(8.0f, -8.0f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, 8.414f, 0.0f)
                moveToRelative(-7.0f, 1.414f)
                lineToRelative(-4.294f, 4.293f)
                lineToRelative(5.586f, 5.586f)
                lineToRelative(4.294f, -4.292f)
                arcToRelative(3.95f, 3.95f, 0.0f, true, false, -5.586f, -5.586f)
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
