package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.Tool: ImageVector
    get() {
        if (_tool != null) {
            return _tool!!
        }
        _tool = Builder(name = "Tool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.0f, 8.0f)
                lineToRelative(6.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineToRelative(-6.0f, -6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineToRelative(3.5f, 3.5f)
            }
        }
        .build()
        return _tool!!
    }

private var _tool: ImageVector? = null
