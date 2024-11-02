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

public val OutlineGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 8.25f)
                curveTo(21.0f, 5.765f, 18.901f, 3.75f, 16.313f, 3.75f)
                curveTo(14.377f, 3.75f, 12.715f, 4.876f, 12.0f, 6.483f)
                curveTo(11.285f, 4.876f, 9.623f, 3.75f, 7.688f, 3.75f)
                curveTo(5.099f, 3.75f, 3.0f, 5.765f, 3.0f, 8.25f)
                curveTo(3.0f, 15.471f, 12.0f, 20.25f, 12.0f, 20.25f)
                curveTo(12.0f, 20.25f, 21.0f, 15.471f, 21.0f, 8.25f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
