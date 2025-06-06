package com.woowla.compose.icon.collections.ionicons.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.BatteryDead: ImageVector
    get() {
        if (_batteryDead != null) {
            return _batteryDead!!
        }
        _batteryDead = Builder(name = "BatteryDead", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Square, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(76.7f, 144.0f)
                lineTo(385.3f, 144.0f)
                arcTo(45.7f, 45.7f, 0.0f, false, true, 431.0f, 189.7f)
                lineTo(431.0f, 322.3f)
                arcTo(45.7f, 45.7f, 0.0f, false, true, 385.3f, 368.0f)
                lineTo(76.7f, 368.0f)
                arcTo(45.7f, 45.7f, 0.0f, false, true, 31.0f, 322.3f)
                lineTo(31.0f, 189.7f)
                arcTo(45.7f, 45.7f, 0.0f, false, true, 76.7f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(479.0f, 218.67f)
                lineTo(479.0f, 293.33f)
            }
        }
        .build()
        return _batteryDead!!
    }

private var _batteryDead: ImageVector? = null
