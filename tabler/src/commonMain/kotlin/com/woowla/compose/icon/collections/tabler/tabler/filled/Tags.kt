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

public val FilledGroup.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.172f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.121f, 0.879f)
                lineToRelative(5.71f, 5.71f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, true, 0.0f, 4.822f)
                lineToRelative(-3.592f, 3.592f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, true, -4.822f, 0.0f)
                lineToRelative(-5.71f, -5.71f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.879f, -2.121f)
                verticalLineToRelative(-4.172f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.01f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.293f, 5.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(4.593f, 4.592f)
                arcToRelative(5.82f, 5.82f, 0.0f, false, true, 0.0f, 8.23f)
                lineToRelative(-1.592f, 1.592f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.592f, -1.592f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, false, 0.0f, -5.402f)
                lineToRelative(-4.592f, -4.592f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
