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

public val OutlineGroup.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                lineToRelative(14.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 6.5f)
                arcToRelative(4.0f, 2.0f, 0.0f, false, false, -4.0f, -1.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4.0f, 2.0f, 0.0f, false, true, -4.0f, -1.5f)
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
