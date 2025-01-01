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

public val Simpleicons.Youhodler: ImageVector
    get() {
        if (_youhodler != null) {
            return _youhodler!!
        }
        _youhodler = Builder(name = "Youhodler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.727f, 15.273f)
                lineTo(1.091f, 13.091f)
                lineTo(1.091f, 4.364f)
                lineTo(8.364f, 0.0f)
                lineTo(12.0f, 2.182f)
                lineTo(15.636f, 0.0f)
                lineTo(22.909f, 4.364f)
                lineTo(22.909f, 13.091f)
                lineTo(19.273f, 15.273f)
                lineTo(19.273f, 19.636f)
                lineTo(12.0f, 24.0f)
                lineTo(4.727f, 19.636f)
                lineTo(4.727f, 15.273f)
                close()
                moveTo(12.0f, 19.636f)
                lineTo(14.422f, 18.182f)
                lineTo(14.422f, 12.364f)
                lineTo(19.273f, 9.455f)
                lineTo(19.273f, 6.545f)
                lineTo(16.85f, 5.092f)
                lineTo(12.0f, 8.0f)
                lineTo(7.15f, 5.092f)
                lineTo(4.727f, 6.545f)
                lineTo(4.727f, 9.455f)
                lineTo(9.578f, 12.364f)
                lineTo(9.578f, 18.182f)
                lineTo(12.0f, 19.636f)
                close()
            }
        }
        .build()
        return _youhodler!!
    }

private var _youhodler: ImageVector? = null
