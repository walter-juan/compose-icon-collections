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

public val Simpleicons.Qlty: ImageVector
    get() {
        if (_qlty != null) {
            return _qlty!!
        }
        _qlty = Builder(name = "Qlty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.453f, 20.437f)
                horizontalLineToRelative(10.204f)
                lineTo(22.657f, 24.0f)
                lineTo(12.453f, 24.0f)
                close()
                moveTo(14.909f, 19.637f)
                lineTo(23.777f, 9.825f)
                lineTo(14.897f, 0.0f)
                lineToRelative(-2.444f, 2.7f)
                lineToRelative(6.437f, 7.125f)
                lineToRelative(-6.437f, 7.124f)
                close()
                moveTo(9.102f, 0.0f)
                lineTo(0.223f, 9.825f)
                lineToRelative(8.868f, 9.814f)
                lineToRelative(2.456f, -2.69f)
                lineTo(5.11f, 9.825f)
                lineTo(11.55f, 2.7f)
                close()
            }
        }
        .build()
        return _qlty!!
    }

private var _qlty: ImageVector? = null
