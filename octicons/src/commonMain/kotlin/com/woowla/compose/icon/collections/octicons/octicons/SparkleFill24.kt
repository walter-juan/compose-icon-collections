package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.SparkleFill24: ImageVector
    get() {
        if (_sparkleFill24 != null) {
            return _sparkleFill24!!
        }
        _sparkleFill24 = Builder(name = "SparkleFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.296f, 1.924f)
                curveToRelative(0.24f, -0.656f, 1.168f, -0.656f, 1.408f, 0.0f)
                lineToRelative(0.717f, 1.958f)
                arcToRelative(11.25f, 11.25f, 0.0f, false, false, 6.697f, 6.697f)
                lineToRelative(1.958f, 0.717f)
                curveToRelative(0.657f, 0.24f, 0.657f, 1.168f, 0.0f, 1.408f)
                lineToRelative(-1.958f, 0.717f)
                arcToRelative(11.25f, 11.25f, 0.0f, false, false, -6.697f, 6.697f)
                lineToRelative(-0.717f, 1.958f)
                curveToRelative(-0.24f, 0.657f, -1.168f, 0.657f, -1.408f, 0.0f)
                lineToRelative(-0.717f, -1.958f)
                arcToRelative(11.25f, 11.25f, 0.0f, false, false, -6.697f, -6.697f)
                lineToRelative(-1.958f, -0.717f)
                curveToRelative(-0.656f, -0.24f, -0.656f, -1.168f, 0.0f, -1.408f)
                lineToRelative(1.958f, -0.717f)
                arcToRelative(11.25f, 11.25f, 0.0f, false, false, 6.697f, -6.697f)
                lineToRelative(0.717f, -1.958f)
                close()
            }
        }
        .build()
        return _sparkleFill24!!
    }

private var _sparkleFill24: ImageVector? = null
