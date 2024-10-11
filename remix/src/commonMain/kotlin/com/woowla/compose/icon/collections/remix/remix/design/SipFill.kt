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

public val DesignGroup.SipFill: ImageVector
    get() {
        if (_sipFill != null) {
            return _sipFill!!
        }
        _sipFill = Builder(name = "SipFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.96f, 6.501f)
                lineTo(16.789f, 3.673f)
                curveTo(17.179f, 3.282f, 17.812f, 3.282f, 18.203f, 3.673f)
                lineTo(20.324f, 5.794f)
                curveTo(20.715f, 6.185f, 20.715f, 6.818f, 20.324f, 7.208f)
                lineTo(17.496f, 10.037f)
                lineTo(19.264f, 11.804f)
                lineTo(17.849f, 13.219f)
                lineTo(10.778f, 6.148f)
                lineTo(12.192f, 4.733f)
                lineTo(13.96f, 6.501f)
                close()
                moveTo(10.778f, 8.976f)
                lineTo(15.021f, 13.219f)
                lineTo(7.243f, 20.997f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.754f)
                lineTo(10.778f, 8.976f)
                close()
            }
        }
        .build()
        return _sipFill!!
    }

private var _sipFill: ImageVector? = null
