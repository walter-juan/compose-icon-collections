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

public val OthersGroup.GameFill: ImageVector
    get() {
        if (_gameFill != null) {
            return _gameFill!!
        }
        _gameFill = Builder(name = "GameFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.122f, 2.0f, 17.909f, 3.43f, 19.743f, 5.671f)
                lineTo(13.414f, 12.0f)
                lineTo(19.743f, 18.329f)
                curveTo(17.909f, 20.57f, 15.122f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(11.172f, 5.0f, 10.5f, 5.672f, 10.5f, 6.5f)
                curveTo(10.5f, 7.328f, 11.172f, 8.0f, 12.0f, 8.0f)
                curveTo(12.828f, 8.0f, 13.5f, 7.328f, 13.5f, 6.5f)
                curveTo(13.5f, 5.672f, 12.828f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _gameFill!!
    }

private var _gameFill: ImageVector? = null
