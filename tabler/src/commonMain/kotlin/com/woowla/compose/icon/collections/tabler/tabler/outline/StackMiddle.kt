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

public val OutlineGroup.StackMiddle: ImageVector
    get() {
        if (_stackMiddle != null) {
            return _stackMiddle!!
        }
        _stackMiddle = Builder(name = "StackMiddle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                lineToRelative(4.0f, -2.0f)
                lineToRelative(-8.0f, -4.0f)
                lineToRelative(-8.0f, 4.0f)
                lineToRelative(4.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineToRelative(-4.0f, -2.0f)
                lineToRelative(-4.0f, 2.0f)
                lineToRelative(8.0f, 4.0f)
                lineToRelative(8.0f, -4.0f)
                lineToRelative(-4.0f, -2.0f)
                lineToRelative(-4.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                lineToRelative(-4.0f, 2.0f)
                lineToRelative(8.0f, 4.0f)
                lineToRelative(8.0f, -4.0f)
                lineToRelative(-4.0f, -2.0f)
            }
        }
        .build()
        return _stackMiddle!!
    }

private var _stackMiddle: ImageVector? = null
