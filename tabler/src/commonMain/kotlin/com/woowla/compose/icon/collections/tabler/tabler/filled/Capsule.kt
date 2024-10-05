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

public val FilledGroup.Capsule: ImageVector
    get() {
        if (_capsule != null) {
            return _capsule!!
        }
        _capsule = Builder(name = "Capsule", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(-0.243f, 0.004f)
                arcToRelative(7.004f, 7.004f, 0.0f, false, false, -6.757f, 6.996f)
                verticalLineToRelative(6.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 7.0f, 7.0f)
                lineToRelative(0.243f, -0.004f)
                arcToRelative(7.004f, 7.004f, 0.0f, false, false, 6.757f, -6.996f)
                verticalLineToRelative(-6.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _capsule!!
    }

private var _capsule: ImageVector? = null
