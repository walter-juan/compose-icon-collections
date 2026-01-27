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

public val BrandsGroup.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(359.4f, 103.5f)
                lineToRelative(-38.6f, 0.0f)
                lineToRelative(0.0f, 109.7f)
                lineToRelative(38.6f, 0.0f)
                lineToRelative(0.0f, -109.7f)
                close()
                moveTo(253.2f, 103.0f)
                lineToRelative(-38.6f, 0.0f)
                lineToRelative(0.0f, 109.8f)
                lineToRelative(38.6f, 0.0f)
                lineToRelative(0.0f, -109.8f)
                close()
                moveTo(89.0f, 0.0f)
                lineToRelative(-96.5f, 91.4f)
                lineToRelative(0.0f, 329.2f)
                lineToRelative(115.8f, 0.0f)
                lineToRelative(0.0f, 91.4f)
                lineToRelative(96.5f, -91.4f)
                lineToRelative(77.3f, 0.0f)
                lineToRelative(173.8f, -164.6f)
                lineToRelative(0.0f, -256.0f)
                lineToRelative(-366.9f, 0.0f)
                close()
                moveTo(417.3f, 237.8f)
                lineToRelative(-77.2f, 73.1f)
                lineToRelative(-77.2f, 0.0f)
                lineToRelative(-67.6f, 64.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-86.9f, 0.0f)
                lineToRelative(0.0f, -274.3f)
                lineToRelative(308.9f, 0.0f)
                lineToRelative(0.0f, 201.2f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
