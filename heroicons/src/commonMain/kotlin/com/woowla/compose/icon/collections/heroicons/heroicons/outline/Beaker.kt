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

public val OutlineGroup.Beaker: ImageVector
    get() {
        if (_beaker != null) {
            return _beaker!!
        }
        _beaker = Builder(name = "Beaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.75f, 3.104f)
                verticalLineTo(8.818f)
                curveTo(9.75f, 9.415f, 9.513f, 9.987f, 9.091f, 10.409f)
                lineTo(5.0f, 14.5f)
                moveTo(9.75f, 3.104f)
                curveTo(9.499f, 3.127f, 9.249f, 3.155f, 9.0f, 3.186f)
                moveTo(9.75f, 3.104f)
                curveTo(10.491f, 3.035f, 11.241f, 3.0f, 12.0f, 3.0f)
                curveTo(12.759f, 3.0f, 13.509f, 3.035f, 14.25f, 3.104f)
                moveTo(14.25f, 3.104f)
                verticalLineTo(8.818f)
                curveTo(14.25f, 9.415f, 14.487f, 9.987f, 14.909f, 10.409f)
                lineTo(19.8f, 15.3f)
                moveTo(14.25f, 3.104f)
                curveTo(14.501f, 3.127f, 14.751f, 3.155f, 15.0f, 3.186f)
                moveTo(19.8f, 15.3f)
                lineTo(18.23f, 15.693f)
                curveTo(16.146f, 16.214f, 13.922f, 15.961f, 12.0f, 15.0f)
                curveTo(10.078f, 14.039f, 7.854f, 13.786f, 5.77f, 14.307f)
                lineTo(5.0f, 14.5f)
                moveTo(19.8f, 15.3f)
                lineTo(21.202f, 16.702f)
                curveTo(22.434f, 17.934f, 21.853f, 20.02f, 20.135f, 20.313f)
                curveTo(17.491f, 20.765f, 14.773f, 21.0f, 12.0f, 21.0f)
                curveTo(9.227f, 21.0f, 6.509f, 20.765f, 3.865f, 20.313f)
                curveTo(2.147f, 20.02f, 1.566f, 17.934f, 2.798f, 16.702f)
                lineTo(5.0f, 14.5f)
            }
        }
        .build()
        return _beaker!!
    }

private var _beaker: ImageVector? = null
