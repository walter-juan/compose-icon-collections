package com.woowla.compose.icon.collections.feather.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.feather.Feather

public val Feather.Battery: ImageVector
    get() {
        if (_battery != null) {
            return _battery!!
        }
        _battery = Builder(name = "Battery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 8.0f)
                lineTo(19.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 16.0f)
                lineTo(1.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                lineTo(23.0f, 11.0f)
            }
        }
        .build()
        return _battery!!
    }

private var _battery: ImageVector? = null
