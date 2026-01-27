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

public val LogosGroup.MicrosoftCopilotFill: ImageVector
    get() {
        if (_microsoftCopilotFill != null) {
            return _microsoftCopilotFill!!
        }
        _microsoftCopilotFill = Builder(name = "MicrosoftCopilotFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.865f, 3.063f)
                curveTo(15.722f, 3.063f, 16.483f, 3.607f, 16.761f, 4.418f)
                lineTo(17.363f, 6.176f)
                curveTo(17.632f, 6.961f, 18.356f, 7.496f, 19.18f, 7.528f)
                horizontalLineTo(19.733f)
                curveTo(19.76f, 7.528f, 19.787f, 7.531f, 19.813f, 7.531f)
                horizontalLineTo(19.886f)
                lineTo(19.881f, 7.533f)
                curveTo(23.553f, 7.647f, 22.242f, 12.027f, 21.237f, 15.314f)
                curveTo(20.377f, 18.126f, 19.088f, 20.938f, 16.94f, 20.938f)
                horizontalLineTo(9.361f)
                curveTo(8.5f, 20.938f, 7.735f, 20.389f, 7.46f, 19.573f)
                lineTo(6.874f, 17.834f)
                curveTo(6.602f, 17.025f, 5.848f, 16.479f, 4.997f, 16.47f)
                horizontalLineTo(4.266f)
                curveTo(0.412f, 16.47f, 1.744f, 12.016f, 2.762f, 8.686f)
                curveTo(3.622f, 5.874f, 4.911f, 3.063f, 7.059f, 3.063f)
                horizontalLineTo(14.865f)
                close()
                moveTo(13.246f, 7.531f)
                curveTo(12.433f, 7.531f, 11.71f, 8.021f, 11.4f, 8.756f)
                curveTo(10.729f, 11.028f, 10.009f, 13.502f, 9.571f, 15.019f)
                curveTo(9.325f, 15.871f, 8.55f, 16.458f, 7.665f, 16.469f)
                horizontalLineTo(10.743f)
                curveTo(11.605f, 16.469f, 12.366f, 15.917f, 12.64f, 15.106f)
                curveTo(13.299f, 12.872f, 14.0f, 10.467f, 14.429f, 8.979f)
                curveTo(14.671f, 8.143f, 15.422f, 7.562f, 16.287f, 7.531f)
                horizontalLineTo(13.246f)
                close()
            }
        }
        .build()
        return _microsoftCopilotFill!!
    }

private var _microsoftCopilotFill: ImageVector? = null
