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

public val OutlineGroup.ArrowSmallRight: ImageVector
    get() {
        if (_arrowSmallRight != null) {
            return _arrowSmallRight!!
        }
        _arrowSmallRight = Builder(name = "ArrowSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 12.0f)
                lineTo(19.5f, 12.0f)
                moveTo(19.5f, 12.0f)
                lineTo(12.75f, 5.25f)
                moveTo(19.5f, 12.0f)
                lineTo(12.75f, 18.75f)
            }
        }
        .build()
        return _arrowSmallRight!!
    }

private var _arrowSmallRight: ImageVector? = null
