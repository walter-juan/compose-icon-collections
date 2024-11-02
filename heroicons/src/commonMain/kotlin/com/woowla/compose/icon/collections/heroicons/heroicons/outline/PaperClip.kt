package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.PaperClip: ImageVector
    get() {
        if (_paperClip != null) {
            return _paperClip!!
        }
        _paperClip = Builder(name = "PaperClip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.375f, 12.739f)
                lineTo(10.682f, 20.432f)
                curveTo(8.925f, 22.189f, 6.075f, 22.189f, 4.318f, 20.432f)
                curveTo(2.561f, 18.675f, 2.561f, 15.825f, 4.318f, 14.068f)
                lineTo(15.257f, 3.129f)
                curveTo(16.429f, 1.957f, 18.328f, 1.957f, 19.5f, 3.129f)
                curveTo(20.671f, 4.3f, 20.671f, 6.2f, 19.5f, 7.371f)
                lineTo(8.552f, 18.32f)
                moveTo(8.561f, 18.311f)
                curveTo(8.558f, 18.314f, 8.555f, 18.317f, 8.552f, 18.32f)
                moveTo(14.25f, 8.379f)
                lineTo(6.439f, 16.189f)
                curveTo(5.854f, 16.775f, 5.854f, 17.725f, 6.439f, 18.311f)
                curveTo(7.022f, 18.893f, 7.965f, 18.896f, 8.552f, 18.32f)
            }
        }
        .build()
        return _paperClip!!
    }

private var _paperClip: ImageVector? = null
