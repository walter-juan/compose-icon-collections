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

public val OutlineGroup.GlobeAlt: ImageVector
    get() {
        if (_globeAlt != null) {
            return _globeAlt!!
        }
        _globeAlt = Builder(name = "GlobeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveTo(16.193f, 21.0f, 19.716f, 18.133f, 20.716f, 14.253f)
                moveTo(12.0f, 21.0f)
                curveTo(7.807f, 21.0f, 4.284f, 18.133f, 3.284f, 14.253f)
                moveTo(12.0f, 21.0f)
                curveTo(14.485f, 21.0f, 16.5f, 16.971f, 16.5f, 12.0f)
                curveTo(16.5f, 7.029f, 14.485f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 21.0f)
                curveTo(9.515f, 21.0f, 7.5f, 16.971f, 7.5f, 12.0f)
                curveTo(7.5f, 7.029f, 9.515f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 3.0f)
                curveTo(15.365f, 3.0f, 18.299f, 4.847f, 19.843f, 7.582f)
                moveTo(12.0f, 3.0f)
                curveTo(8.635f, 3.0f, 5.701f, 4.847f, 4.157f, 7.582f)
                moveTo(19.843f, 7.582f)
                curveTo(17.74f, 9.4f, 14.998f, 10.5f, 12.0f, 10.5f)
                curveTo(9.002f, 10.5f, 6.26f, 9.4f, 4.157f, 7.582f)
                moveTo(19.843f, 7.582f)
                curveTo(20.58f, 8.887f, 21.0f, 10.395f, 21.0f, 12.0f)
                curveTo(21.0f, 12.778f, 20.901f, 13.533f, 20.716f, 14.253f)
                moveTo(20.716f, 14.253f)
                curveTo(18.133f, 15.685f, 15.162f, 16.5f, 12.0f, 16.5f)
                curveTo(8.838f, 16.5f, 5.867f, 15.685f, 3.284f, 14.253f)
                moveTo(3.284f, 14.253f)
                curveTo(3.099f, 13.533f, 3.0f, 12.778f, 3.0f, 12.0f)
                curveTo(3.0f, 10.395f, 3.42f, 8.887f, 4.157f, 7.582f)
            }
        }
        .build()
        return _globeAlt!!
    }

private var _globeAlt: ImageVector? = null
