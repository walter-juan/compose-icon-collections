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

public val OutlineGroup.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }
        _award = Builder(name = "Award", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                moveToRelative(-6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -12.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                lineToRelative(3.4f, 5.89f)
                lineToRelative(1.598f, -3.233f)
                lineToRelative(3.598f, 0.232f)
                lineToRelative(-3.4f, -5.889f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.802f, 12.0f)
                lineToRelative(-3.4f, 5.89f)
                lineToRelative(3.598f, -0.233f)
                lineToRelative(1.598f, 3.232f)
                lineToRelative(3.4f, -5.889f)
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null