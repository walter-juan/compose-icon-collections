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

public val OutlineGroup.Ballpen: ImageVector
    get() {
        if (_ballpen != null) {
            return _ballpen!!
        }
        _ballpen = Builder(name = "Ballpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                lineToRelative(7.0f, 7.0f)
                lineToRelative(-4.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.828f, 18.172f)
                arcToRelative(2.828f, 2.828f, 0.0f, false, false, 4.0f, 0.0f)
                lineToRelative(10.586f, -10.586f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.829f)
                lineToRelative(-1.171f, -1.171f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.829f, 0.0f)
                lineToRelative(-10.586f, 10.586f)
                arcToRelative(2.828f, 2.828f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                lineToRelative(1.768f, -1.768f)
            }
        }
        .build()
        return _ballpen!!
    }

private var _ballpen: ImageVector? = null
