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

public val OutlineGroup.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(name = "Command", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                horizontalLineToRelative(-10.0f)
            }
        }
        .build()
        return _command!!
    }

private var _command: ImageVector? = null
