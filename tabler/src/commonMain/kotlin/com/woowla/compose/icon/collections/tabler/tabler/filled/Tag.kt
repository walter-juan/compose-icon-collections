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

public val FilledGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.172f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.121f, 0.879f)
                lineToRelative(7.71f, 7.71f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, true, 0.0f, 4.822f)
                lineToRelative(-5.592f, 5.592f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, true, -4.822f, 0.0f)
                lineToRelative(-7.71f, -7.71f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.879f, -2.121f)
                verticalLineToRelative(-5.172f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(7.5f, 5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
