package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.LocationPin: ImageVector
    get() {
        if (_locationPin != null) {
            return _locationPin!!
        }
        _locationPin = Builder(name = "LocationPin", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                curveTo(86.0f, 0.0f, 0.0f, 84.4f, 0.0f, 188.6f)
                curveTo(0.0f, 307.9f, 120.2f, 450.9f, 170.4f, 505.4f)
                curveTo(182.2f, 518.2f, 201.8f, 518.2f, 213.6f, 505.4f)
                curveTo(263.8f, 450.9f, 384.0f, 307.9f, 384.0f, 188.6f)
                curveTo(384.0f, 84.4f, 298.0f, 0.0f, 192.0f, 0.0f)
                close()
            }
        }
        .build()
        return _locationPin!!
    }

private var _locationPin: ImageVector? = null
