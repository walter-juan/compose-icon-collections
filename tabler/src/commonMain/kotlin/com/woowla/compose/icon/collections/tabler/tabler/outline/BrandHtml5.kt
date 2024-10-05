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

public val OutlineGroup.BrandHtml5: ImageVector
    get() {
        if (_brandHtml5 != null) {
            return _brandHtml5!!
        }
        _brandHtml5 = Builder(name = "BrandHtml5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineToRelative(-2.0f, 14.5f)
                lineToRelative(-6.0f, 2.0f)
                lineToRelative(-6.0f, -2.0f)
                lineToRelative(-2.0f, -14.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 8.0f)
                horizontalLineToRelative(-7.0f)
                lineToRelative(0.5f, 4.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-0.5f, 3.5f)
                lineToRelative(-2.5f, 0.75f)
                lineToRelative(-2.5f, -0.75f)
                lineToRelative(-0.1f, -0.5f)
            }
        }
        .build()
        return _brandHtml5!!
    }

private var _brandHtml5: ImageVector? = null
