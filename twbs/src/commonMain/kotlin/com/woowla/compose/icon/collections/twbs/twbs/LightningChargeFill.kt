package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.LightningChargeFill: ImageVector
    get() {
        if (_lightningChargeFill != null) {
            return _lightningChargeFill!!
        }
        _lightningChargeFill = Builder(name = "LightningChargeFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.251f, 0.068f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.227f, 0.58f)
                lineTo(9.677f, 6.5f)
                horizontalLineTo(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.364f, 0.843f)
                lineToRelative(-8.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.842f, -0.49f)
                lineTo(6.323f, 9.5f)
                horizontalLineTo(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.364f, -0.843f)
                lineToRelative(8.0f, -8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.615f, -0.09f)
                close()
            }
        }
        .build()
        return _lightningChargeFill!!
    }

private var _lightningChargeFill: ImageVector? = null
