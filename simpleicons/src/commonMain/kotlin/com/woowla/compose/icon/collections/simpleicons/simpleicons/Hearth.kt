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

public val Simpleicons.Hearth: ImageVector
    get() {
        if (_hearth != null) {
            return _hearth!!
        }
        _hearth = Builder(name = "Hearth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.196f, 10.318f)
                verticalLineToRelative(9.576f)
                lineTo(0.453f, 24.0f)
                verticalLineToRelative(-9.33f)
                close()
                moveTo(15.855f, 6.156f)
                lineTo(23.547f, 10.318f)
                verticalLineToRelative(9.574f)
                lineTo(15.853f, 24.0f)
                verticalLineToRelative(-9.33f)
                lineToRelative(-7.658f, -4.352f)
                close()
                moveTo(8.196f, 0.0f)
                verticalLineToRelative(9.576f)
                lineTo(0.453f, 13.803f)
                verticalLineToRelative(-9.648f)
                close()
            }
        }
        .build()
        return _hearth!!
    }

private var _hearth: ImageVector? = null
