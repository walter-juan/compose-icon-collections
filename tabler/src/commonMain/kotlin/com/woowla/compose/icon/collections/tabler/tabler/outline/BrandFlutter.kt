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

public val OutlineGroup.BrandFlutter: ImageVector
    get() {
        if (_brandFlutter != null) {
            return _brandFlutter!!
        }
        _brandFlutter = Builder(name = "BrandFlutter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(8.0f, -8.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(5.0f, -5.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _brandFlutter!!
    }

private var _brandFlutter: ImageVector? = null