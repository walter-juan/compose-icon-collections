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

public val OutlineGroup.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineToRelative(-6.5f, 18.0f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -1.0f, 0.0f)
                lineToRelative(-3.5f, -7.0f)
                lineToRelative(-7.0f, -3.5f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(18.0f, -6.5f)
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
