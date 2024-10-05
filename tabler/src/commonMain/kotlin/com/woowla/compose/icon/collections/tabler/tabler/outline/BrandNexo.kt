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

public val OutlineGroup.BrandNexo: ImageVector
    get() {
        if (_brandNexo != null) {
            return _brandNexo!!
        }
        _brandNexo = Builder(name = "BrandNexo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                lineToRelative(5.0f, 3.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(-5.0f, 3.0f)
                lineToRelative(-10.0f, -6.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(10.0f, 6.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-5.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineToRelative(-5.0f, -3.0f)
                lineToRelative(-5.0f, 3.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(5.0f, 3.0f)
                lineToRelative(4.7f, -3.13f)
            }
        }
        .build()
        return _brandNexo!!
    }

private var _brandNexo: ImageVector? = null
