package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.BardFill: ImageVector
    get() {
        if (_bardFill != null) {
            return _bardFill!!
        }
        _bardFill = Builder(name = "BardFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.614f, 17.796f)
                lineTo(11.492f, 15.785f)
                curveTo(12.273f, 13.997f, 13.679f, 12.573f, 15.432f, 11.794f)
                lineTo(17.848f, 10.722f)
                curveTo(18.616f, 10.381f, 18.616f, 9.264f, 17.848f, 8.923f)
                lineTo(15.508f, 7.884f)
                curveTo(13.709f, 7.086f, 12.278f, 5.609f, 11.51f, 3.759f)
                lineTo(10.622f, 1.617f)
                curveTo(10.292f, 0.822f, 9.193f, 0.822f, 8.863f, 1.617f)
                lineTo(7.974f, 3.759f)
                curveTo(7.207f, 5.609f, 5.776f, 7.086f, 3.977f, 7.884f)
                lineTo(1.637f, 8.923f)
                curveTo(0.869f, 9.264f, 0.869f, 10.381f, 1.637f, 10.722f)
                lineTo(4.052f, 11.794f)
                curveTo(5.806f, 12.573f, 7.212f, 13.997f, 7.993f, 15.785f)
                lineTo(8.87f, 17.796f)
                curveTo(9.208f, 18.568f, 10.277f, 18.568f, 10.614f, 17.796f)
                close()
                moveTo(19.401f, 22.69f)
                lineTo(19.648f, 22.124f)
                curveTo(20.088f, 21.116f, 20.881f, 20.313f, 21.869f, 19.873f)
                lineTo(22.63f, 19.535f)
                curveTo(23.041f, 19.353f, 23.041f, 18.755f, 22.63f, 18.572f)
                lineTo(21.912f, 18.253f)
                curveTo(20.898f, 17.803f, 20.091f, 16.97f, 19.659f, 15.927f)
                lineTo(19.405f, 15.316f)
                curveTo(19.229f, 14.89f, 18.639f, 14.89f, 18.463f, 15.316f)
                lineTo(18.209f, 15.927f)
                curveTo(17.777f, 16.97f, 16.97f, 17.803f, 15.956f, 18.253f)
                lineTo(15.238f, 18.572f)
                curveTo(14.827f, 18.755f, 14.827f, 19.353f, 15.238f, 19.535f)
                lineTo(15.998f, 19.873f)
                curveTo(16.987f, 20.313f, 17.78f, 21.116f, 18.22f, 22.124f)
                lineTo(18.467f, 22.69f)
                curveTo(18.647f, 23.104f, 19.221f, 23.104f, 19.401f, 22.69f)
                close()
            }
        }
        .build()
        return _bardFill!!
    }

private var _bardFill: ImageVector? = null
