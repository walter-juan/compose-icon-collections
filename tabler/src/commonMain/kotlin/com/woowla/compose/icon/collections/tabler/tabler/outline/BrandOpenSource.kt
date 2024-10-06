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

public val OutlineGroup.BrandOpenSource: ImageVector
    get() {
        if (_brandOpenSource != null) {
            return _brandOpenSource!!
        }
        _brandOpenSource = Builder(name = "BrandOpenSource", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 3.618f, 17.243f)
                lineToRelative(-2.193f, -5.602f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -2.849f, 0.0f)
                lineToRelative(-2.193f, 5.603f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 3.617f, -17.244f)
                close()
            }
        }
        .build()
        return _brandOpenSource!!
    }

private var _brandOpenSource: ImageVector? = null
