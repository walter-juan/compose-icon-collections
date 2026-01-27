package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.SendInsLine: ImageVector
    get() {
        if (_sendInsLine != null) {
            return _sendInsLine!!
        }
        _sendInsLine = Builder(name = "SendInsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 2.0f)
                curveTo(20.094f, 2.0f, 20.699f, 2.151f, 21.25f, 2.469f)
                curveTo(22.924f, 3.435f, 23.498f, 5.576f, 22.531f, 7.25f)
                lineTo(15.031f, 20.24f)
                curveTo(14.065f, 21.914f, 11.924f, 22.488f, 10.25f, 21.521f)
                curveTo(9.414f, 21.039f, 8.852f, 20.261f, 8.62f, 19.397f)
                lineTo(6.853f, 12.804f)
                lineTo(2.025f, 7.975f)
                curveTo(0.658f, 6.608f, 0.659f, 4.392f, 2.025f, 3.025f)
                curveTo(2.658f, 2.393f, 3.534f, 2.0f, 4.5f, 2.0f)
                horizontalLineTo(19.5f)
                close()
                moveTo(4.5f, 4.0f)
                curveTo(4.086f, 4.0f, 3.712f, 4.167f, 3.439f, 4.439f)
                curveTo(2.854f, 5.025f, 2.854f, 5.975f, 3.439f, 6.561f)
                lineTo(7.914f, 11.035f)
                lineTo(14.891f, 7.007f)
                curveTo(15.369f, 6.731f, 15.981f, 6.895f, 16.257f, 7.373f)
                curveTo(16.533f, 7.851f, 16.369f, 8.463f, 15.891f, 8.739f)
                lineTo(8.914f, 12.768f)
                lineTo(10.552f, 18.879f)
                curveTo(10.651f, 19.251f, 10.891f, 19.582f, 11.25f, 19.789f)
                curveTo(11.967f, 20.203f, 12.884f, 19.958f, 13.299f, 19.24f)
                lineTo(20.799f, 6.25f)
                curveTo(21.213f, 5.533f, 20.967f, 4.615f, 20.25f, 4.201f)
                curveTo(20.013f, 4.064f, 19.756f, 4.0f, 19.501f, 4.0f)
                horizontalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _sendInsLine!!
    }

private var _sendInsLine: ImageVector? = null
