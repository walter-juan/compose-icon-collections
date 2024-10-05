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

public val FilledGroup.Mug: ImageVector
    get() {
        if (_mug != null) {
            return _mug!!
        }
        _mug = Builder(name = "Mug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.903f, 4.008f)
                lineToRelative(0.183f, -0.008f)
                horizontalLineToRelative(10.828f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, 2.086f, 2.077f)
                verticalLineToRelative(0.923f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.917f, 0.0f, 3.5f, 1.477f, 3.5f, 3.333f)
                verticalLineToRelative(2.334f)
                curveToRelative(0.0f, 1.856f, -1.583f, 3.333f, -3.5f, 3.333f)
                horizontalLineToRelative(-1.663f)
                arcToRelative(5.33f, 5.33f, 0.0f, false, true, -5.17f, 4.0f)
                horizontalLineToRelative(-4.334f)
                curveToRelative(-2.944f, 0.0f, -5.333f, -2.375f, -5.333f, -5.308f)
                verticalLineToRelative(-8.618f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, 1.903f, -2.066f)
                moveToRelative(13.097f, 9.992f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.843f, 0.0f, 1.5f, -0.613f, 1.5f, -1.333f)
                verticalLineToRelative(-2.334f)
                curveToRelative(0.0f, -0.72f, -0.657f, -1.333f, -1.5f, -1.333f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _mug!!
    }

private var _mug: ImageVector? = null
