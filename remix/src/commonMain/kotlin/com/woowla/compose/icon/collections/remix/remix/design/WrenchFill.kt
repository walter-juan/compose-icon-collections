package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.WrenchFill: ImageVector
    get() {
        if (_wrenchFill != null) {
            return _wrenchFill!!
        }
        _wrenchFill = Builder(name = "WrenchFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.249f, 6.872f)
                curveTo(19.489f, 6.631f, 19.836f, 6.53f, 20.169f, 6.602f)
                curveTo(20.502f, 6.675f, 20.775f, 6.912f, 20.893f, 7.231f)
                curveTo(21.818f, 9.716f, 21.282f, 12.625f, 19.282f, 14.625f)
                curveTo(17.307f, 16.6f, 14.447f, 17.146f, 11.981f, 16.269f)
                lineTo(7.969f, 20.282f)
                curveTo(6.797f, 21.453f, 4.898f, 21.453f, 3.726f, 20.282f)
                curveTo(2.555f, 19.11f, 2.555f, 17.211f, 3.726f, 16.039f)
                lineTo(7.739f, 12.026f)
                curveTo(6.862f, 9.561f, 7.408f, 6.701f, 9.383f, 4.725f)
                curveTo(11.38f, 2.729f, 14.281f, 2.192f, 16.763f, 3.109f)
                curveTo(17.083f, 3.228f, 17.321f, 3.501f, 17.394f, 3.834f)
                curveTo(17.467f, 4.167f, 17.365f, 4.513f, 17.124f, 4.754f)
                lineTo(14.768f, 7.11f)
                curveTo(14.182f, 7.696f, 14.182f, 8.646f, 14.768f, 9.232f)
                curveTo(15.353f, 9.817f, 16.303f, 9.817f, 16.889f, 9.232f)
                lineTo(19.249f, 6.872f)
                close()
            }
        }
        .build()
        return _wrenchFill!!
    }

private var _wrenchFill: ImageVector? = null
