package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.GgCircle: ImageVector
    get() {
        if (_ggCircle != null) {
            return _ggCircle!!
        }
        _ggCircle = Builder(name = "GgCircle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.5f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(208.0f, 382.8f)
                lineToRelative(-125.7f, -125.7f)
                lineToRelative(125.7f, -125.7f)
                lineToRelative(35.2f, 35.4f)
                lineToRelative(-24.2f, 24.2f)
                lineToRelative(-11.1f, -11.1f)
                lineToRelative(-77.2f, 77.2f)
                lineToRelative(77.2f, 77.2f)
                lineToRelative(26.6f, -26.6f)
                lineToRelative(-53.1f, -52.9f)
                lineToRelative(24.4f, -24.4f)
                lineToRelative(77.2f, 77.2f)
                lineToRelative(-75.0f, 75.2f)
                close()
                moveTo(307.0f, 380.6f)
                lineToRelative(-35.2f, -35.2f)
                lineToRelative(24.1f, -24.4f)
                lineToRelative(11.1f, 11.1f)
                lineToRelative(77.2f, -77.2f)
                lineToRelative(-77.2f, -77.2f)
                lineToRelative(-26.5f, 26.5f)
                lineToRelative(53.1f, 52.9f)
                lineToRelative(-24.4f, 24.4f)
                lineToRelative(-77.2f, -77.2f)
                lineToRelative(75.0f, -75.0f)
                lineToRelative(125.7f, 125.7f)
                lineToRelative(-125.7f, 125.6f)
                close()
            }
        }
        .build()
        return _ggCircle!!
    }

private var _ggCircle: ImageVector? = null
