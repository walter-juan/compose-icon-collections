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

public val OutlineGroup.BrandPolymer: ImageVector
    get() {
        if (_brandPolymer != null) {
            return _brandPolymer!!
        }
        _brandPolymer = Builder(name = "BrandPolymer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.706f, 6.0f)
                lineToRelative(-3.706f, 6.0f)
                lineToRelative(3.706f, 6.0f)
                horizontalLineToRelative(1.059f)
                lineToRelative(8.47f, -12.0f)
                horizontalLineToRelative(1.06f)
                lineToRelative(3.705f, 6.0f)
                lineToRelative(-3.706f, 6.0f)
            }
        }
        .build()
        return _brandPolymer!!
    }

private var _brandPolymer: ImageVector? = null
