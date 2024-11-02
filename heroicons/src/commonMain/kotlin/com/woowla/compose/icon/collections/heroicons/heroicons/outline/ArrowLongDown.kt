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

public val OutlineGroup.ArrowLongDown: ImageVector
    get() {
        if (_arrowLongDown != null) {
            return _arrowLongDown!!
        }
        _arrowLongDown = Builder(name = "ArrowLongDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 17.25f)
                lineTo(12.0f, 21.0f)
                moveTo(12.0f, 21.0f)
                lineTo(8.25f, 17.25f)
                moveTo(12.0f, 21.0f)
                lineTo(12.0f, 3.0f)
            }
        }
        .build()
        return _arrowLongDown!!
    }

private var _arrowLongDown: ImageVector? = null
