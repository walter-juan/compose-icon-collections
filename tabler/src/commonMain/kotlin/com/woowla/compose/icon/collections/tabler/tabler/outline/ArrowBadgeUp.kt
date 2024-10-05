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

public val OutlineGroup.ArrowBadgeUp: ImageVector
    get() {
        if (_arrowBadgeUp != null) {
            return _arrowBadgeUp!!
        }
        _arrowBadgeUp = Builder(name = "ArrowBadgeUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-5.0f, -4.0f)
                lineToRelative(-5.0f, 4.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(5.0f, -4.0f)
                close()
            }
        }
        .build()
        return _arrowBadgeUp!!
    }

private var _arrowBadgeUp: ImageVector? = null
