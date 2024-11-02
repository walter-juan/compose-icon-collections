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

public val OutlineGroup.PaperAirplane: ImageVector
    get() {
        if (_paperAirplane != null) {
            return _paperAirplane!!
        }
        _paperAirplane = Builder(name = "PaperAirplane", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                lineTo(3.269f, 3.125f)
                curveTo(9.884f, 5.046f, 16.028f, 8.076f, 21.486f, 12.0f)
                curveTo(16.028f, 15.924f, 9.884f, 18.954f, 3.269f, 20.875f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineTo(13.5f, 12.0f)
            }
        }
        .build()
        return _paperAirplane!!
    }

private var _paperAirplane: ImageVector? = null
