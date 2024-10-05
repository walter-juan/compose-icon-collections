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

public val OutlineGroup.BrandZulip: ImageVector
    get() {
        if (_brandZulip != null) {
            return _brandZulip!!
        }
        _brandZulip = Builder(name = "BrandZulip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 3.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.325f, 0.0f, 2.5f, 1.0f, 2.5f, 2.5f)
                curveToRelative(0.0f, 2.0f, -1.705f, 3.264f, -2.0f, 3.5f)
                lineToRelative(-4.5f, 4.0f)
                lineToRelative(2.0f, -5.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 21.0f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-1.325f, 0.0f, -2.5f, -1.0f, -2.5f, -2.5f)
                curveToRelative(0.0f, -2.0f, 1.705f, -3.264f, 2.0f, -3.5f)
                lineToRelative(4.5f, -4.0f)
                lineToRelative(-2.0f, 5.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _brandZulip!!
    }

private var _brandZulip: ImageVector? = null