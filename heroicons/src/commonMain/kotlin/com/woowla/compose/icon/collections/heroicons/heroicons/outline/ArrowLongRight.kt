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

public val OutlineGroup.ArrowLongRight: ImageVector
    get() {
        if (_arrowLongRight != null) {
            return _arrowLongRight!!
        }
        _arrowLongRight = Builder(name = "ArrowLongRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.25f, 8.25f)
                lineTo(21.0f, 12.0f)
                moveTo(21.0f, 12.0f)
                lineTo(17.25f, 15.75f)
                moveTo(21.0f, 12.0f)
                horizontalLineTo(3.0f)
            }
        }
        .build()
        return _arrowLongRight!!
    }

private var _arrowLongRight: ImageVector? = null
