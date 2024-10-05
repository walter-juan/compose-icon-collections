package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                lineToRelative(-6.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 3.0f)
                lineToRelative(6.5f, -6.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineToRelative(-6.5f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 9.0f, 9.0f)
                lineToRelative(6.5f, -6.5f)
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
