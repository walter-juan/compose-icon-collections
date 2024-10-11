package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) {
            return _toggleLeft!!
        }
        _toggleLeft = Builder(name = "ToggleLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, 3.0f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, -2.824f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 14.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, -14.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 0.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -10.0f)
            }
        }
        .build()
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
