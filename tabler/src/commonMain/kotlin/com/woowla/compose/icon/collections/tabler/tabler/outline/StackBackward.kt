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

public val OutlineGroup.StackBackward: ImageVector
    get() {
        if (_stackBackward != null) {
            return _stackBackward!!
        }
        _stackBackward = Builder(name = "StackBackward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                lineToRelative(6.0f, -3.0f)
                lineToRelative(-8.0f, -4.0f)
                lineToRelative(-8.0f, 4.0f)
                lineToRelative(6.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                lineToRelative(-6.0f, 3.0f)
                lineToRelative(8.0f, 4.0f)
                lineToRelative(8.0f, -4.0f)
                lineToRelative(-6.0f, -3.0f)
                lineToRelative(-2.0f, 1.0f)
                close()
            }
        }
        .build()
        return _stackBackward!!
    }

private var _stackBackward: ImageVector? = null
