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

public val FilledGroup.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.949f, 3.684f)
                lineToRelative(1.104f, 3.316f)
                horizontalLineToRelative(1.947f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.962f, 3.477f)
                lineToRelative(-1.252f, 7.131f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.954f, 3.392f)
                horizontalLineToRelative(-9.512f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, true, -3.95f, -3.371f)
                lineToRelative(-1.258f, -7.173f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.964f, -3.456f)
                horizontalLineToRelative(1.945f)
                lineToRelative(1.105f, -3.316f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.898f, 0.632f)
                lineToRelative(-0.895f, 2.684f)
                horizontalLineToRelative(5.893f)
                lineToRelative(-0.895f, -2.684f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.898f, -0.632f)
                moveToRelative(-3.949f, 7.316f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, -3.0f)
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
