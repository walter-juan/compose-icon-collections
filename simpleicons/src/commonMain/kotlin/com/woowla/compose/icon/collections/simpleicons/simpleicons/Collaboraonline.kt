package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Collaboraonline: ImageVector
    get() {
        if (_collaboraonline != null) {
            return _collaboraonline!!
        }
        _collaboraonline = Builder(name = "Collaboraonline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.852f, 0.0f)
                lineTo(3.55f, 5.303f)
                lineTo(10.247f, 12.0f)
                lineTo(3.55f, 18.698f)
                lineTo(8.852f, 24.0f)
                lineToRelative(12.0f, -12.0f)
                close()
                moveTo(3.147f, 5.706f)
                verticalLineToRelative(12.588f)
                lineTo(9.442f, 12.0f)
                close()
            }
        }
        .build()
        return _collaboraonline!!
    }

private var _collaboraonline: ImageVector? = null
