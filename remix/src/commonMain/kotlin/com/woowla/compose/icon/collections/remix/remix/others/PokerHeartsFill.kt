package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.PokerHeartsFill: ImageVector
    get() {
        if (_pokerHeartsFill != null) {
            return _pokerHeartsFill!!
        }
        _pokerHeartsFill = Builder(name = "PokerHeartsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.5f)
                curveTo(2.0f, 5.462f, 4.462f, 3.0f, 7.5f, 3.0f)
                curveTo(9.36f, 3.0f, 11.005f, 3.923f, 12.0f, 5.337f)
                curveTo(12.995f, 3.923f, 14.64f, 3.0f, 16.5f, 3.0f)
                curveTo(19.538f, 3.0f, 22.0f, 5.462f, 22.0f, 8.5f)
                curveTo(22.0f, 16.0f, 12.0f, 21.485f, 12.0f, 21.485f)
                curveTo(12.0f, 21.485f, 2.0f, 16.0f, 2.0f, 8.5f)
                close()
            }
        }
        .build()
        return _pokerHeartsFill!!
    }

private var _pokerHeartsFill: ImageVector? = null
