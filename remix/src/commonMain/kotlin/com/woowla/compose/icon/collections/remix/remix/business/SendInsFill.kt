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

public val BusinessGroup.SendInsFill: ImageVector
    get() {
        if (_sendInsFill != null) {
            return _sendInsFill!!
        }
        _sendInsFill = Builder(name = "SendInsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 2.001f)
                curveTo(20.094f, 2.001f, 20.699f, 2.151f, 21.25f, 2.469f)
                curveTo(22.924f, 3.435f, 23.498f, 5.576f, 22.531f, 7.25f)
                lineTo(15.031f, 20.24f)
                curveTo(14.065f, 21.914f, 11.924f, 22.488f, 10.25f, 21.521f)
                curveTo(9.414f, 21.039f, 8.852f, 20.26f, 8.62f, 19.397f)
                lineTo(7.121f, 13.803f)
                lineTo(15.891f, 8.739f)
                curveTo(16.369f, 8.463f, 16.533f, 7.851f, 16.257f, 7.373f)
                curveTo(15.981f, 6.895f, 15.369f, 6.731f, 14.891f, 7.007f)
                lineTo(6.121f, 12.071f)
                lineTo(2.025f, 7.975f)
                curveTo(0.658f, 6.608f, 0.659f, 4.392f, 2.025f, 3.025f)
                curveTo(2.657f, 2.393f, 3.534f, 2.0f, 4.5f, 2.0f)
                lineTo(19.5f, 2.001f)
                close()
            }
        }
        .build()
        return _sendInsFill!!
    }

private var _sendInsFill: ImageVector? = null
