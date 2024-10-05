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

public val OutlineGroup.NavigationTop: ImageVector
    get() {
        if (_navigationTop != null) {
            return _navigationTop!!
        }
        _navigationTop = Builder(name = "NavigationTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.54f, 19.977f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.357f, -0.07f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, 0.084f, -0.35f)
                lineToRelative(-4.981f, -10.557f)
                lineToRelative(-4.982f, 10.557f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, 0.084f, 0.35f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, false, 0.357f, 0.07f)
                lineToRelative(4.541f, -1.477f)
                lineToRelative(4.54f, 1.477f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(2.0f)
            }
        }
        .build()
        return _navigationTop!!
    }

private var _navigationTop: ImageVector? = null
